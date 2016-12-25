/**
 * Define a grammar called Hello
 */
grammar Hello;

@parser::header{
	package editorTexto;
	import java.util.Map;
	import java.util.HashMap;
}

@lexer::header{
	package editorTexto;
}

@parser::members{
	Tablas t= new Tablas();
	String menos="";
	String numero="0";
	Map<String, Object> dataType= new HashMap<String, Object>();
	Map<String, Object> symbolTable= new HashMap<String, Object>();
	Map<String, Object> funcion= new HashMap<String, Object>();
	
	List<String> listaFuncion = new ArrayList<String>();
	int contadorParametros=0;
	boolean hayFuncion=false;
	boolean hayNeg= false;
	boolean imprimeCadena=false;
	int msg=0;
	int cIf=0;
	int done=0;
	int ciclo=0;
	
	/*
	 * 
	 * agregar las variables a la lista
	 * activar las banderas despues borrarlas
	 * contador de parametros
	 * 
	 */
	
	public boolean isInteger(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException nfe) {
        return false;
    }
    
	}
	
	public boolean isFloat(String str) {
    try {
        Float.parseFloat(str);
        return true;
    } catch (NumberFormatException nfe) {
        return false;
    }
    
	}
	
	public void verificaIncrementoDecremento(String text,int linea){
		if(symbolTable.containsKey(text)){
			if(!dataType.get(text).equals("entero")){
			  t.agregarErrores("Error variable "+text+" tipo de dato no valido "+Integer.toString(linea));
			}
		}
		else{
			t.agregarErrores("Error variable "+text+" no fue declarada "+Integer.toString(linea));
		}
		
	}
	
	public void seEncuentra(String text,int lin){
		if(!symbolTable.containsKey(text)){
			t.agregarErrores("Error variable "+text+" no fue declarada "+Integer.toString(lin));
		}
	}
	
	public void seEncuentraFuncion(String text,int lin){
		if(!funcion.containsKey(text)){
			t.agregarErrores("Error variable "+text+" no fue declarada "+Integer.toString(lin));
		}
	}
	
	public void fueDeclarada(String text, int lin){
		if(symbolTable.containsKey(text)){
			t.agregarErrores("Error variable "+text+" ya fue declarada "+Integer.toString(lin));
			symbolTable.remove(text);
		}
		
	}
	
	public void fueDeclaradaFuncion(String text, int lin){
		if(symbolTable.containsKey(text) || funcion.containsKey(text)){
			t.agregarErrores("Error funcion "+text+" ya fue declarada "+Integer.toString(lin));
			//symbolTable.remove(text);
		}else{
			funcion.put(text,contadorParametros);
			symbolTable.put(text,0);
		}
		
	}
	
	
	public void verificaAsignacion(String text, String value,int lin){
		if(symbolTable.containsKey(text)){
			
			if(dataType.get(text).equals("entero") || dataType.get(text).equals("largo")){
				if(!isInteger(value)){
					t.agregarErrores("Error tipo de dato"+value+" no valido "+Integer.toString(lin));
				}
				else{
					symbolTable.put(text,value);
				}
			}
			else if(dataType.get(text).equals("flotante") || dataType.get(text).equals("doble")){
				if(!isFloat(value)){
					t.agregarErrores("Error tipo de dato"+value+" no valido "+Integer.toString(lin));
				}
				else{
					symbolTable.put(text,value);
				}
			}
			else if(dataType.get(text).equals("booleano")){
			
				if(value.equals("verdad")){
					symbolTable.put(text,value);
					
				}
				else if(value.equals("falso")){
					symbolTable.put(text,value);
				}
				else{
					t.agregarErrores("Error tipo de dato"+value+" no valido "+Integer.toString(lin));
				}
			}
			else{
				if(isInteger(value) || isFloat(value) || value.equals("verdad") || value.equals("falso")){
					t.agregarErrores("Error tipo de dato"+value+" no valido "+Integer.toString(lin));
				}
				else{
					symbolTable.put(text,value);
				}
			}

			
			
		}else{
			t.agregarErrores("Error variable "+text+" no fue declarada "+Integer.toString(lin));
		}
		
	}
	
	public Object retornaValor(String token,int lin){
		if(symbolTable.containsKey(token)){
			return symbolTable.get(token);
		}
		else{
			t.agregarErrores("Error variable "+token+" no fue declarada "+Integer.toString(lin));
			return 0;
		}
	}
	
	public int retornaNumero(String valor, int lin){
		if(isFloat(valor)){
			return Integer.parseInt(valor);
		}
		else{
			t.agregarErrores("Error variable tipo de dato no valido "+Integer.toString(lin));
			return 0;
		}
	}
	
	
	public void agregarAlaTabla(String token, Object valor){
		if(symbolTable.containsKey(token)){
			symbolTable.put(token,valor);
		}

	}
	
	public void limpiarVariablesFuncion(){
		for(int i=0; i<listaFuncion.size();i++){
			
			symbolTable.remove(listaFuncion.get(i));
		}
		
	}
	
	public void seDeclaroPara(String token, int lin){
		if(symbolTable.containsKey(token)){
			t.agregarErrores("Error variable"+token+" ya fue declarada "+Integer.toString(lin));
		}
	}

	
	
	
	
}


programa :clase;

clase: 

		lib_const*
		
		CLASE ID {fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,"0"); 
			
			t.crearTabla($CLASE.line,$CLASE.text,"palabra reservada","clase","",0,"");
			t.crearTabla($ID.line,$ID.text,"Identificador","clase","",0,"");
		}
		
		var_decl*
		seccion*
		
		
		PRINCIPAL {t.crearTabla($PRINCIPAL.line,$PRINCIPAL.text,"palabra reservada","principal","",0,"");}
		bloque*
		TERMINA_PRINCIPAL PUNTO_COMA {
			
			t.crearTabla($TERMINA_PRINCIPAL.line,$TERMINA_PRINCIPAL.text,"palabra reservada","principal","",0,"");
			t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"terminacion","principal","",0,"");
			
		}
		
		
		TERMINA_CLASE PUNTO_COMA{
			
	t.programa.append("mov esp,ebp\n");
	t.programa.append("pop ebp\n");
	t.programa.append("mov eax,0\n");
	t.programa.append("ret\n");
	
		t.crearTabla($TERMINA_CLASE.line,$TERMINA_CLASE.text,"palabra reservada","clase","",0,"");
		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"terminacion","clase","",0,"");
	
			
		}
		;
		
bloque:
	escribir
   |leer
   |var_declB
   |var_assign
   |llamarFuncion
   |incremento_decremento
   |decl_clase
   |llamar_objecto
   |si {t.programa.append(".done"+Integer.toString(done)+": \n"); done++; cIf++;}
   |sistand {t.programa.append(".done"+Integer.toString(done)+": \n"); done++; cIf++; }
   |encaso
   |repite
   |mientras
   |para{ciclo++;} 
	;
	
	
para:
	PARA PAR_OP ENTERO t1=ID{seDeclaroPara($t1.text,$t1.line);} ASSIGN t2=NUMBER PUNTO_COMA ID 
	{
		t.crearTabla($PARA.line,$PARA.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($PAR_OP.line,$PAR_OP.text,"Separador","Bloque","",0,"");
		t.crearTabla($ENTERO.line,$ENTERO.text,"Numero entero","Bloque","",0,"");
		t.crearTabla($t1.line,$t1.text,"Identificador","Bloque","0",Integer.parseInt($t2.text),"4 bytes");
		t.crearTabla($ASSIGN.line,$ASSIGN.text,"asignacion","Bloque","",0,"");
		t.crearTabla($t2.line,$t2.text,"Numero entero","Bloque","",0,"");
		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
		t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
		
		
		if(!$t1.text.equals ($ID.text)){
			t.agregarErrores("Error variable "+$ID.text+" no coincide "+Integer.toString($ID.line));
		}
	
	
	} 
	 compFor t3=NUMBER PUNTO_COMA ID {
	 	
	 	t.crearTabla($t3.line,$t3.text,"Numero entero","Bloque","",0,"");
	 	t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
	 	t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
		
	   if(!$t1.text.equals ($ID.text)){
			t.agregarErrores("Error variable "+$ID.text+" no coincide "+Integer.toString($ID.line));
		}
		
		//t3-t2
		int valor=0;
		if($compFor.text.equals("<")){
		valor=Integer.parseInt($t3.text)-Integer.parseInt($t2.text)-1;
		}
		else{
		valor=Integer.parseInt($t3.text)-Integer.parseInt($t2.text);
		}
		
		t.programa.append("mov ecx , "+Integer.toString(valor)+"\n");
		t.programa.append(".loop"+Integer.toString(ciclo)+": \n");
		t.programa.append("push ecx\n");
		
		
	}SUMA SUMA PAR_CLOSE{
		t.crearTabla($SUMA.line,$SUMA.text,"Operador","Bloque","",0,"");
		t.crearTabla($SUMA.line,$SUMA.text,"Operador","Bloque","",0,"");
		t.crearTabla($PAR_CLOSE.line,$PAR_CLOSE.text,"Separador","Bloque","",0,"");
	}
	bloque*
	TERMINAPARA PUNTO_COMA {
		t.programa.append("pop ecx\n");
		t.programa.append("loop .loop"+Integer.toString(ciclo)+"\n");
		
		t.crearTabla($TERMINAPARA.line,$TERMINAPARA.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
		
	}
	

;

compFor:
	LT {t.crearTabla($LT.line,$LT.text,"Comparadores","Bloque","",0,"");}
	|LEQ  {t.crearTabla($LEQ.line,$LEQ.text,"Comparadores","Bloque","",0,"");}
	;



mientras:

	MIENTRAS  {t.crearTabla($MIENTRAS.line,$MIENTRAS.text,"Palabra reservada","Bloque","",0,"");} condicion
	bloque*
	TERMINA_MIENTRAS PUNTO_COMA{
		t.crearTabla($TERMINA_MIENTRAS.line,$TERMINA_MIENTRAS.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
	}
	
;


repite: 

	REPITE {t.crearTabla($REPITE.line,$REPITE.text,"Palabra reservada","Bloque","",0,"");}
	bloque*
	HASTAQUE {t.crearTabla($HASTAQUE.line,$HASTAQUE.text,"Palabra reservada","Bloque","",0,"");} condicion PUNTO_COMA{
		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
	}
;

no: NO {t.crearTabla($NO.line,$NO.text,"Palabra reservada","Bloque","",0,"");};

condicion:

		no? comparadores(operadoresComp comparadores)? 
	(Y {t.crearTabla($Y.line,$Y.text,"Palabra reservada","Bloque","",0,"");} neg? comparadores (operadoresComp comparadores)?)*
    |
    
    
    no?  comparadores (operadoresComp comparadores)? 
	(O {t.crearTabla($O.line,$O.text,"Palabra reservada","Bloque","",0,"");} neg? comparadores (operadoresComp comparadores  )?)*

     |
    
	no? comparadores (operadoresComp comparadores)? 
	((Y {t.crearTabla($Y.line,$Y.text,"Palabra reservada","Bloque","",0,"");} | O{t.crearTabla($O.line,$O.text,"Palabra reservada","Bloque","",0,"");} ) no? comparadores (operadoresComp comparadores)?)*
	|
	
		
	no? comparadores (operadoresComp comparadores)? 
	 ((O {t.crearTabla($O.line,$O.text,"Palabra reservada","Bloque","",0,"");} |Y {t.crearTabla($Y.line,$Y.text,"Palabra reservada","Bloque","",0,"");}) no? comparadores (operadoresComp comparadores)?)*
		
;

comparadores:
	ID {seEncuentra($ID.text,$ID.line); t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");}
	| PAR_OP condicion PAR_CLOSE {t.crearTabla($PAR_OP.line,$PAR_OP.text,"Separador","Bloque","",0,"");
			t.crearTabla($PAR_CLOSE.line,$PAR_CLOSE.text,"Separador","Bloque","",0,"");
	}
	| NUMBER {
		t.crearTabla($NUMBER.line,$NUMBER.text,"Numero entero","Bloque","",0,"");
	}
;
	
	
	
encaso:

	EN_CASO ID{seEncuentra($ID.text,$ID.line);} DOS_PUNTOS
	CASO compCase DOS_PUNTOS
	bloque*
	ROMPE PUNTO_COMA{
		
		t.crearTabla($EN_CASO.line,$EN_CASO.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
		t.crearTabla($DOS_PUNTOS.line,$DOS_PUNTOS.text,"Asignador","Bloque","",0,"");
		t.crearTabla($CASO.line,$CASO.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($DOS_PUNTOS.line,$DOS_PUNTOS.text,"Asignador","Bloque","",0,"");
		t.crearTabla($ROMPE.line,$ROMPE.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
		
		
		
	}
	
	(CASO compCase DOS_PUNTOS
		bloque*
		ROMPE PUNTO_COMA{
			t.crearTabla($CASO.line,$CASO.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($DOS_PUNTOS.line,$DOS_PUNTOS.text,"Asignador","Bloque","",0,"");
		t.crearTabla($ROMPE.line,$ROMPE.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
			
			
		}
	)*
	
	DEFECTO DOS_PUNTOS
	bloque*
	ROMPE PUNTO_COMA
	
	TERMINA_CASO PUNTO_COMA{
		
		
		t.crearTabla($DEFECTO.line,$DEFECTO.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($DOS_PUNTOS.line,$DOS_PUNTOS.text,"Asignador","Bloque","",0,"");
		t.crearTabla($ROMPE.line,$ROMPE.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
		t.crearTabla($TERMINA_CASO.line,$TERMINA_CASO.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
		
	}


;

compCase:
	ID {seEncuentra($ID.text,$ID.line);
		t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
		
	}
	|CAR{
		t.crearTabla($CAR.line,$CAR.text,"Caracter","Bloque","",0,"");
	}
	|NUMBER{
		t.crearTabla($NUMBER.line,$NUMBER.text,"Numero entero","Bloque","",0,"");
	}


;
	
	
si:
	SI PAR_OP {
		t.crearTabla($SI.line,$SI.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($PAR_OP.line,$PAR_OP.text,"Separador","Bloque","",0,"");	
		
	} compSi PAR_CLOSE ENTONCES{
			t.crearTabla($PAR_CLOSE.line,$PAR_CLOSE.text,"Separador","Bloque","",0,"");
		t.crearTabla($ENTONCES.line,$ENTONCES.text,"Palabra reservada","Bloque","",0,"");	
	}
	
	bloque*
	
	SINO{
				t.programa.append("jmp .done"+Integer.toString(done)+"\n");
				t.programa.append(".else"+Integer.toString(cIf)+": \n");
				t.crearTabla($SINO.line,$SINO.text,"Palabra reservada","Bloque","",0,"");
		
	} bloque*
	
	TERMINA_SI PUNTO_COMA{
		
		
	
		
		t.crearTabla($TERMINA_SI.line,$TERMINA_SI.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Palabra reservada","Bloque","",0,"");
		
		
	}
;

sistand:

	SI PAR_OP {
		
			t.crearTabla($SI.line,$SI.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($PAR_OP.line,$PAR_OP.text,"Separador","Bloque","",0,"");
		
	} compSi2 PAR_CLOSE ENTONCES{
		
		t.crearTabla($PAR_CLOSE.line,$PAR_CLOSE.text,"Separador","Bloque","",0,"");
		t.crearTabla($ENTONCES.line,$ENTONCES.text,"Palabra reservada","Bloque","",0,"");	
	}
	
	bloque*
		
	TERMINA_SI PUNTO_COMA{
	
		
		t.crearTabla($TERMINA_SI.line,$TERMINA_SI.text,"Palabra reservada","Bloque","",0,"");
		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Palabra reservada","Bloque","",0,"");
	}


	;
	
neg:
	NO {hayNeg=true;
		t.crearTabla($NO.line,$NO.text,"Palabra reservada","Bloque","",0,"");
		
		
	}
;

compSi:

	neg? valor(operadoresComp valor{
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		
		if(hayNeg){
			
			if($operadoresComp.value.toString().equals("<")){
			t.programa.append("jl .else"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .else"+Integer.toString(cIf)+"\n");
			}
			
			
			
			
			
			hayNeg=false;
		}else{
						if($operadoresComp.value.toString().equals("<")){
				t.programa.append("jnl .else"+Integer.toString(cIf)+"\n");		
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .else"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .else"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .else"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .else"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .else"+Integer.toString(cIf)+"\n");	
			}
			
			
		}
		
		
	} )? 
	(Y {t.crearTabla($Y.line,$Y.text,"Palabra reservada","Bloque","",0,"");} neg? valor (operadoresComp valor {		
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		
		if(hayNeg){
						if($operadoresComp.value.toString().equals("<")){
				t.programa.append("jl .else"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .else"+Integer.toString(cIf)+"\n");
			}
			
			
			hayNeg=false;
		
		}else{
						if($operadoresComp.value.toString().equals("<")){
				t.programa.append("jnl .else"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .else"+Integer.toString(cIf)+"\n");
			}
			
			
		
		}
			
		
		
		
		
		}  )?)*


    |
    
    
    neg?  valor(operadoresComp valor{
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		
		if(hayNeg){
						if($operadoresComp.value.toString().equals("<")){
			t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
			}
			
			
			hayNeg=false;
		}else{
						if($operadoresComp.value.toString().equals("<")){
				t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
			}
			
		
		}
		
		
	} )? 
	(O {t.crearTabla($O.line,$O.text,"Palabra reservada","Bloque","",0,"");}neg? valor (operadoresComp valor {		
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		
		if(hayNeg){
			
						if($operadoresComp.value.toString().equals("<")){
			t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");			
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");	
			}
			
			
		
		hayNeg=false;
		}
		else{
						if($operadoresComp.value.toString().equals("<")){
			t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");		
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
			}
			
			
			
			
		
		}
		
		
		
		}  )?)*
		
		{	t.programa.append("jmp .else"+Integer.toString(cIf)+"\n");
			t.programa.append(".elseIF"+Integer.toString(cIf)+":\n");
			}
    
    
     |
    
	neg? valor(operadoresComp valor{
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		if(hayNeg){
			
						if($operadoresComp.value.toString().equals("<")){
			t.programa.append("jl .else"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .else"+Integer.toString(cIf)+"\n");
			}
			
			
			
			hayNeg=false;
		}else{
			
						if($operadoresComp.value.toString().equals("<")){
			t.programa.append("jnl .else"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .else"+Integer.toString(cIf)+"\n");
			}
			
			
			
		}
	
		
	} )? 
	((Y {t.crearTabla($Y.line,$Y.text,"Palabra reservada","Bloque","",0,"");}| O {t.crearTabla($O.line,$O.text,"Palabra reservada","Bloque","",0,"");}) neg? valor (operadoresComp valor {		
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		
		if(hayNeg){
			
						if($operadoresComp.value.toString().equals("<")){
				t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
			}
			
			
			
			
			hayNeg=false;
		}else{
			
						if($operadoresComp.value.toString().equals("<")){
				t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
			}
			
			
			
			
				
		}
		
		
		
		
		
		}  )?)*{
			t.programa.append("jmp .else"+Integer.toString(cIf)+"\n");
			t.programa.append(".elseIF"+Integer.toString(cIf)+":\n");
		}
		
		
	|
	
		
	neg? valor(operadoresComp valor{
		
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		if(hayNeg){
			
						if($operadoresComp.value.toString().equals("<")){
			t.programa.append("jnl .else"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .else"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .else"+Integer.toString(cIf)+"\n");
			}
			
			
			
			
			
			hayNeg=false;
		}else{
			
						if($operadoresComp.value.toString().equals("<")){
			t.programa.append("jl .else"+Integer.toString(cIf)+"\n");		
			}
			else if($operadoresComp.value.toString().equals(">")){
			t.programa.append("jg .else"+Integer.toString(cIf)+"\n");		
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .else"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .else"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .else"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .else"+Integer.toString(cIf)+"\n");	
			}
			
			
			
		}
		
		
		
	} )? 
	 ((O {t.crearTabla($O.line,$O.text,"Palabra reservada","Bloque","",0,"");}|Y{t.crearTabla($Y.line,$Y.text,"Palabra reservada","Bloque","",0,"");}) neg? valor (operadoresComp valor {	
			
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		if(hayNeg){
			
						if($operadoresComp.value.toString().equals("<")){
				t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
			}
			
			
			
			
			hayNeg=false;
			
		}else{
						if($operadoresComp.value.toString().equals("<")){
			t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");			
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");	
			}
			
			
			
		
		}

		
		
		
		}  )?)*{
			t.programa.append("jmp .else"+Integer.toString(cIf)+"\n");
			t.programa.append(".elseIF"+Integer.toString(cIf)+":\n");
		}
		
		
	
	
	;
	
	
compSi2:

	neg? valor(operadoresComp valor{
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		if(hayNeg){
			
						if($operadoresComp.value.toString().equals("<")){
			t.programa.append("jl .done"+Integer.toString(done)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .done"+Integer.toString(done)+"\n");
			}
			
			
			
			hayNeg=false;
		}
		else{
			
						if($operadoresComp.value.toString().equals("<")){
			t.programa.append("jnl .done"+Integer.toString(done)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .done"+Integer.toString(done)+"\n");
			}
			
			
				
		}
		
		
	} )? 
	(Y {t.crearTabla($Y.line,$Y.text,"Palabra reservada","Bloque","",0,"");} neg? valor (operadoresComp valor {		
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		if(hayNeg){
			
						if($operadoresComp.value.toString().equals("<")){
			t.programa.append("jl .done"+Integer.toString(done)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .done"+Integer.toString(done)+"\n");
			}
			
			
			
			hayNeg=false;
		}
		else{
			
			
						if($operadoresComp.value.toString().equals("<")){
							
			t.programa.append("jnl .done"+Integer.toString(done)+"\n");
				
			}
			else if($operadoresComp.value.toString().equals(">")){
				
			t.programa.append("jng .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				
			t.programa.append("jnle .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				
			t.programa.append("jnge .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				
			t.programa.append("jne .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				
			t.programa.append("je .done"+Integer.toString(done)+"\n");
			}
			
			
					
		}

	
		
		
		
		
		}  )?)*


    |
    
    
    	neg? valor(operadoresComp valor{
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		if(hayNeg){
			
						if($operadoresComp.value.toString().equals("<")){
			t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
			}
			
			
			
			
			hayNeg=false;
		}
		else{
			
						if($operadoresComp.value.toString().equals("<")){
			
			t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");		
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");	
			}
			
			
			
		}
		
		
		
	} )? 
	(O {t.crearTabla($O.line,$O.text,"Palabra reservada","Bloque","",0,"");}neg? valor (operadoresComp valor {		
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		if(hayNeg){
			
			
						if($operadoresComp.value.toString().equals("<")){
				t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
			}
			
			
			
			hayNeg=false;
		}
		else{
			
						if($operadoresComp.value.toString().equals("<")){
			
				t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");		
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");	
				
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");	
			}
			
			
			
		}
		
		
		
		
		
		
		}  )?)*
		
		{	t.programa.append("jmp .done"+Integer.toString(done)+"\n");
			t.programa.append(".elseIF"+Integer.toString(cIf)+":\n");
			}
    
    
     |
    
	neg? valor(operadoresComp valor{
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		if(hayNeg){
			
						if($operadoresComp.value.toString().equals("<")){
				t.programa.append("jl .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .done"+Integer.toString(done)+"\n");
				
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .done"+Integer.toString(done)+"\n");
			}
			
			
			
			
			hayNeg=false;
		}
		else{
			
			if($operadoresComp.value.toString().equals("<")){
				t.programa.append("jnl .done"+Integer.toString(done)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .done"+Integer.toString(done)+"\n");
			}
			
			
				
		}
		
		
		
	} )? 
	((Y {t.crearTabla($Y.line,$Y.text,"Palabra reservada","Bloque","",0,"");}| O{t.crearTabla($O.line,$O.text,"Palabra reservada","Bloque","",0,"");} ) neg? valor (operadoresComp valor {		
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		
		if(hayNeg){
			
			if($operadoresComp.value.toString().equals("<")){
				t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
			}
			
			
			
			
			hayNeg=false;
		}
		else{
			
						if($operadoresComp.value.toString().equals("<")){
			
				t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");		
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");	
			}
			
			
			
		}
		
		
		
		
		
		}  )?)*{
			t.programa.append("jmp .done"+Integer.toString(done)+"\n");
			t.programa.append(".elseIF"+Integer.toString(cIf)+":");
		}
		
		
	|
	
		
	neg? valor(operadoresComp valor{
		
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		if(hayNeg){
			
			if($operadoresComp.value.toString().equals("<")){
			t.programa.append("jnl .done"+Integer.toString(done)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .done"+Integer.toString(done)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .done"+Integer.toString(done)+"\n");
			}
			
			
			
			
			hayNeg=false;
		}
		else{
			
			if($operadoresComp.value.toString().equals("<")){
				t.programa.append("jl .done"+Integer.toString(done)+"\n");		
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .done"+Integer.toString(done)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .done"+Integer.toString(done)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .done"+Integer.toString(done)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .done"+Integer.toString(done)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .done"+Integer.toString(done)+"\n");	
			}
			
			
			
			
		}
		
		
	} )? 
	 ((O {t.crearTabla($O.line,$O.text,"Palabra reservada","Bloque","",0,"");}|Y {t.crearTabla($Y.line,$Y.text,"Palabra reservada","Bloque","",0,"");}) neg? valor (operadoresComp valor {	
			
		t.programa.append("pop eax\n");
		t.programa.append("pop ebx\n");
		t.programa.append("cmp ebx,eax\n");
		
		if(hayNeg){
			
			if($operadoresComp.value.toString().equals("<")){
				t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");	
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");	
			}
			
			
			
			hayNeg=false;
		}
		else{
			
			if($operadoresComp.value.toString().equals("<")){
				t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");		
			}
			else if($operadoresComp.value.toString().equals(">")){
				t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("<=")){
				t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals(">=")){
				t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("==")){
				t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
			}
			else if($operadoresComp.value.toString().equals("!=")){
				t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
			}
			
			
			
		}
		
		
		
		}  )?)*{
			t.programa.append("jmp .done"+Integer.toString(done)+"\n");
			t.programa.append(".elseIF"+Integer.toString(cIf)+":\n");
		}
		
		
	
	
	;
	
operadoresComp returns [Object value]:

	GT {$value=$GT.text; t.crearTabla($GT.line,$GT.text,"Comparador","Bloque","",0,"");} //>
	|LT {$value=$LT.text; t.crearTabla($LT.line,$LT.text,"Comparador","Bloque","",0,"");}//<
	|GEQ {$value=$GEQ.text; t.crearTabla($GEQ.line,$GEQ.text,"Comparador","Bloque","",0,"");}//>=
	|LEQ {$value=$LEQ.text; t.crearTabla($LEQ.line,$LEQ.text,"Comparador","Bloque","",0,"");}//<
	|EQ {$value=$EQ.text; t.crearTabla($EQ.line,$EQ.text,"Comparador","Bloque","",0,"");}
	|NEQ {$value=$NEQ.text; t.crearTabla($NEQ.line,$NEQ.text,"Comparador","Bloque","",0,"");}


;
	
	
valor:
	NUMBER {t.programa.append("push "+$NUMBER.text+"\n"); t.crearTabla($NUMBER.line,$NUMBER.text,"Numero entero","Bloque","",0,"");}
	|PAR_OP compSi PAR_CLOSE{
		
		t.crearTabla($PAR_OP.line,$PAR_OP.text,"Separador","Bloque","",0,"");
		t.crearTabla($PAR_CLOSE.line,$PAR_CLOSE.text,"Separador","Bloque","",0,"");
		
		
	}
	|ID {
		
		if(!symbolTable.containsKey($ID.text)){
			t.agregarErrores("Error variable "+$ID.text+" no fue declarada "+Integer.toString($ID.line));
		}else{
			if(dataType.containsKey($ID.text)){
				
				if(!dataType.get($ID.text).equals("entero")){
					t.agregarErrores("Error variable "+$ID.text+" no apta para comparacion "+Integer.toString($ID.line));
				}
				
				
			}
			else{
				t.agregarErrores("Error variable "+$ID.text+" no tiene tipo de dato "+Integer.toString($ID.line));
			}
		}
		
		
		
		t.programa.append("mov ecx, ["+$ID.text+"]\n");   
		t.programa.append("push ecx\n");
		
		t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
	}
;

	


	
decl_clase:
 t1=ID t2=ID PUNTO_COMA { seEncuentra($t1.text,$t1.line);
 	fueDeclarada($t2.text,$t2.line);symbolTable.put($t2.text,new Object()); dataType.put($t2.text,"objeto");
 	if(hayFuncion){listaFuncion.add($t2.text);}
 	
 	t.crearTabla($t1.line,$t1.text,"Identificador","Bloque","",0,"");
 	t.crearTabla($t2.line,$t2.text,"Identificador","Bloque","",0,"");
 	t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
 }

;

llamar_objecto:
	ID PUNTO llamarFuncion  {seEncuentra($ID.text,$ID.line);
		
		t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
		t.crearTabla($PUNTO.line,$PUNTO.text,"Separador","Bloque","",0,"");
		
	}
	|t1=ID PUNTO t2=ID PUNTO_COMA {seEncuentra($t1.text,$t1.line);seEncuentra($t2.text,$t2.line);
		
		t.crearTabla($t1.line,$t1.text,"Identificador","Bloque","",0,"");
		t.crearTabla($PUNTO.line,$PUNTO.text,"Separador","Bloque","",0,"");
		t.crearTabla($t2.line,$t2.text,"Identificador","Bloque","",0,"");
		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
		
		
	}
;
	
incremento_decremento:
	ID SUMA SUMA PUNTO_COMA {verificaIncrementoDecremento($ID.text,$ID.line);
		
		t.programa.append("mov eax , ["+$ID.text+"]\n");
	    t.programa.append("inc eax\n");
	    t.programa.append("mov ["+$ID.text+"],eax\n");
	    
	    t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
	    t.crearTabla($SUMA.line,$SUMA.text,"Operadores","Bloque","",0,"");
	    t.crearTabla($SUMA.line,$SUMA.text,"Operadores","Bloque","",0,"");
	    t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
		
		
	}
	|ID MENOS MENOS PUNTO_COMA {verificaIncrementoDecremento($ID.text,$ID.line);
		
		t.programa.append("mov eax , ["+$ID.text+"]\n");
	    t.programa.append("dec eax\n");
	    t.programa.append("mov ["+$ID.text+"],eax\n");
	    
	    t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
	    t.crearTabla($MENOS.line,$MENOS.text,"Operadores","Bloque","",0,"");
	    t.crearTabla($MENOS.line,$MENOS.text,"Operadores","Bloque","",0,"");
	    t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
		
		
	}
	|llamarFuncion SUMA SUMA PUNTO_COMA{
			  
	    t.crearTabla($SUMA.line,$SUMA.text,"Operadores","Bloque","",0,"");
	    t.crearTabla($SUMA.line,$SUMA.text,"Operadores","Bloque","",0,"");
	    t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
	}
	|llamarFuncion MENOS MENOS PUNTO_COMA{
	    t.crearTabla($MENOS.line,$MENOS.text,"Operadores","Bloque","",0,"");
	    t.crearTabla($MENOS.line,$MENOS.text,"Operadores","Bloque","",0,"");
	    t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
	}
	
	;
	
seccion:
	procedimiento | funcion
	;



		
var_decl: restriccion? ENTERO ID {
			t.crearTabla($ENTERO.line,$ENTERO.text,"Palabra reservada","Clase","",0,"");
			t.crearTabla($ID.line,$ID.text,"Identificador","Variable global","0",0,"4 bytes");
	
			}(ASSIGN NUMBER{
				t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Clase","",0,"");
				t.crearTabla($NUMBER.line,$NUMBER.text,"Numero entero","Clase","",0,"");
				
				numero=$NUMBER.text; t.programa.append("mov eax,"+menos+$NUMBER.text+"\n"); t.programa.append("mov ["+$ID.text+"],eax\n");
			})? PUNTO_COMA 
			{	
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
				t.mapaDeclaraciones.put($ID.text,$ID.text+": resd 1");
				fueDeclarada($ID.text,$ID.line);
				symbolTable.put($ID.text,menos+numero); dataType.put($ID.text,"entero"); numero="0"; menos="";
				
			}
			
			| restriccion? LARGO ID {
			t.crearTabla($LARGO.line,$LARGO.text,"Palabra reservada","Clase","",0,"");
			t.crearTabla($ID.line,$ID.text,"Identificador","Variable global","0",0,"8 bytes");
				
				
				
			}(ASSIGN NUMBER{
				t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Clase","",0,"");
				t.crearTabla($NUMBER.line,$NUMBER.text,"Numero largo","Clase","",0,"");
				numero=$NUMBER.text; t.programa.append("mov eax,"+menos+$NUMBER.text+"\n"); t.programa.append("mov ["+$ID.text+"],eax\n");
			})? PUNTO_COMA
			{
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
				t.mapaDeclaraciones.put($ID.text,$ID.text+": resd 1");
				fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,menos+numero); dataType.put($ID.text,"largo");  numero="0"; menos="";
				
			}
			
			| restriccion? FLOT ID {
			t.crearTabla($FLOT.line,$FLOT.text,"Palabra reservada","Clase","",0,"");
			t.crearTabla($ID.line,$ID.text,"Identificador","Variable global","0",0,"4 bytes");
				
				
			}(ASSIGN  NUMBER_FLOAT{
				
				t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Clase","",0,"");
				t.crearTabla($NUMBER_FLOAT.line,$NUMBER_FLOAT.text,"Numero flotante","Clase","",0,"");
				
				numero=$NUMBER_FLOAT.text;
			})? PUNTO_COMA
			
			{
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
				fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,menos+numero); dataType.put($ID.text,"flotante");  numero="0"; menos="";
				
			}
			
			
			| restriccion? DOBLE ID {
				
			t.crearTabla($DOBLE.line,$DOBLE.text,"Palabra reservada","Clase","",0,"");
			t.crearTabla($ID.line,$ID.text,"Identificador","Variable global","0",0,"8 bytes");
				
			}(ASSIGN  NUMBER_FLOAT{
				
				t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Clase","",0,"");
				t.crearTabla($NUMBER_FLOAT.line,$NUMBER_FLOAT.text,"Numero flotante","Clase","",0,"");
				
				numero=$NUMBER_FLOAT.text;
			})? PUNTO_COMA
			{
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
				fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,menos+numero); dataType.put($ID.text,"doble");  numero="0"; menos="";
				
			}
			
			| restriccion? BOOL ID{
				
			t.crearTabla($BOOL.line,$BOOL.text,"Palabra reservada","Clase","",0,"");
			t.crearTabla($ID.line,$ID.text,"Identificador","Variable global","0",0,"1 byte");
				
				
			} (ASSIGN BOOLEAN{numero=$BOOLEAN.text;
				
				t.constantes.append("msg"+Integer.toString(msg)+": dd \""+$BOOLEAN.text+"\" \n");
			    t.programa.append("mov eax,msg"+Integer.toString(msg)+"\n");
				t.programa.append("mov ["+$ID.text+"] , eax\n");
				msg++;
				
				t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Clase","",0,"");
				t.crearTabla($BOOLEAN.line,$BOOLEAN.text,"Booleano","Clase","",0,"");
				
				
			})? PUNTO_COMA
			{
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
				t.mapaDeclaraciones.put($ID.text,$ID.text+": resd 1");
				fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,numero); dataType.put($ID.text,"booleano");  numero="0"; menos="";
				
			}
			
			
			| restriccion? CARACTER ID {
				
			t.crearTabla($CARACTER.line,$CARACTER.text,"Palabra reservada","Clase","",0,"");
			t.crearTabla($ID.line,$ID.text,"Identificador","Variable global","0",0,"1 byte");
				
			}(ASSIGN CAR{numero=$CAR.text;
				
				t.constantes.append("msg"+Integer.toString(msg)+": dd "+$CAR.text+"\n");
			    t.programa.append("mov eax,msg"+Integer.toString(msg)+"\n");
				t.programa.append("mov ["+$ID.text+"] , eax\n");
				msg++;
				
				t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Clase","",0,"");
				t.crearTabla($CAR.line,$CAR.text,"Caracter","Clase","",0,"");
				
				
				
			})? PUNTO_COMA
			{
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
				t.mapaDeclaraciones.put($ID.text,$ID.text+": resd 1");
				fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,numero); dataType.put($ID.text,"caracter");  numero="0"; menos="";
				
			}
			
			| restriccion? STRING ID{
				
			t.crearTabla($STRING.line,$STRING.text,"Palabra reservada","Clase","",0,"");
			t.crearTabla($ID.line,$ID.text,"Identificador","Variable global","0",0,"255 byte");
				
			} (ASSIGN CAR{numero=$CAR.text;
				t.constantes.append("msg"+Integer.toString(msg)+": dd "+$CAR.text+"\n");
			    t.programa.append("mov eax,msg"+Integer.toString(msg)+"\n");
				t.programa.append("mov ["+$ID.text+"] , eax\n");
				msg++;
				
								t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Clase","",0,"");
				t.crearTabla($CAR.line,$CAR.text,"Caracter","Clase","",0,"");
				
				
			})? PUNTO_COMA
			{
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
				t.mapaDeclaraciones.put($ID.text,$ID.text+": resd 1");
				fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,numero); dataType.put($ID.text,"string");  numero="0"; menos="";
				
			}
			
			
			| restriccion? ENTERO ID  COR_OP NUMBER COR_CLOSE PUNTO_COMA
			{
				
				
				fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,"0"); dataType.put($ID.text,"entero");  numero="0"; menos="";
				
				
				t.crearTabla($ENTERO.line,$ENTERO.text,"Palabra reservada","Clase","",0,"");
				t.crearTabla($ID.line,$ID.text,"Variable global","Clase","0",0,Integer.toString(Integer.parseInt($NUMBER.text)*4)+" bytes");
				t.crearTabla($COR_OP.line,$COR_OP.text,"Separador","Clase","",0,"");
				t.crearTabla($NUMBER.line,$NUMBER.text,"Numero entero","Clase","",0,"");
				t.crearTabla($COR_CLOSE.line,$COR_CLOSE.text,"Separador","Clase","",0,"");
				
				
				
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
				
			}

;



restriccion:
	PUBLICO {t.crearTabla($PUBLICO.line,$PUBLICO.text,"Palabra reservada","Clase","",0,"");}
	| PRIVADO {t.crearTabla($PRIVADO.line,$PRIVADO.text,"Palabra reservada","Clase","",0,"");}
	; 

var_declB: 

	       ENTERO ID {
	       	
	       				t.crearTabla($ENTERO.line,$ENTERO.text,"Palabra reservada","Clase","",0,"");
			t.crearTabla($ID.line,$ID.text,"Identificador","Variable local","0",0,"4 bytes");
	       	
	       	
	       }(ASSIGN NUMBER{
	       	
	       					t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Clase","",0,"");
				t.crearTabla($NUMBER.line,$NUMBER.text,"Numero entero","Clase","",0,"");
	       	numero=$NUMBER.text; t.programa.append("mov eax,"+menos+$NUMBER.text+"\n"); t.programa.append("mov ["+$ID.text+"],eax\n");
	       	
	       })? PUNTO_COMA 
			{
			t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
			t.mapaDeclaraciones.put($ID.text,$ID.text+": resd 1");
			fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,menos+numero); dataType.put($ID.text,"entero"); numero="0"; menos="";
			if(hayFuncion){listaFuncion.add($ID.text);}
			
			}
			
			| LARGO ID {
				
				t.crearTabla($LARGO.line,$LARGO.text,"Palabra reservada","Clase","",0,"");
			t.crearTabla($ID.line,$ID.text,"Identificador","Variable local","0",0,"8 bytes");
				
				
				
				
			}(ASSIGN NUMBER{
				
				t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Clase","",0,"");
				t.crearTabla($NUMBER.line,$NUMBER.text,"Numero largo","Clase","",0,"");
				
				
				numero=$NUMBER.text;t.programa.append("mov eax,"+menos+$NUMBER.text+"\n"); t.programa.append("mov ["+$ID.text+"],eax\n");
			} )? PUNTO_COMA
			{
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
				t.mapaDeclaraciones.put($ID.text,$ID.text+": resd 1");
				fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,menos+numero); dataType.put($ID.text,"largo");  numero="0"; menos="";
				if(hayFuncion){listaFuncion.add($ID.text);}
			}
			
			| FLOT ID {
				
			t.crearTabla($FLOT.line,$FLOT.text,"Palabra reservada","Clase","",0,"");
			t.crearTabla($ID.line,$ID.text,"Identificador","Variable local","0",0,"4 bytes");
				
				
			}(ASSIGN NUMBER_FLOAT{
				
				t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Clase","",0,"");
				t.crearTabla($NUMBER_FLOAT.line,$NUMBER_FLOAT.text,"Numero flotante","Clase","",0,"");
				
				numero=$NUMBER_FLOAT.text;
			})? PUNTO_COMA
			{
				
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
				fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,menos+numero); dataType.put($ID.text,"flotante");  numero="0"; menos="";
				if(hayFuncion){listaFuncion.add($ID.text);}
			}
			
			
			| DOBLE ID {
				
				
			t.crearTabla($DOBLE.line,$DOBLE.text,"Palabra reservada","Clase","",0,"");
			t.crearTabla($ID.line,$ID.text,"Identificador","Variable local","0",0,"8 bytes");
				
				
			}(ASSIGN NUMBER_FLOAT{
				
				
				t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Clase","",0,"");
				t.crearTabla($NUMBER_FLOAT.line,$NUMBER_FLOAT.text,"Numero doble","Clase","",0,"");
				numero=$NUMBER_FLOAT.text;
				
			})? PUNTO_COMA
			{
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
				
				fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,menos+numero); dataType.put($ID.text,"doble");  numero="0"; menos="";
				if(hayFuncion){listaFuncion.add($ID.text);}
			}
			
			|BOOL ID{
				
				
			t.crearTabla($BOOL.line,$BOOL.text,"Palabra reservada","Clase","",0,"");
			t.crearTabla($ID.line,$ID.text,"Identificador","Variable local","0",0,"1 byte");
				
				
			} (ASSIGN BOOLEAN{
				
				
				t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Clase","",0,"");
				t.crearTabla($BOOLEAN.line,$BOOLEAN.text,"Booleano","Clase","",0,"");
				
				numero=$BOOLEAN.text;  t.constantes.append("msg"+Integer.toString(msg)+": dd \""+$BOOLEAN.text+"\" \n");
				t.programa.append("mov eax,msg"+Integer.toString(msg)+"\n");
				t.programa.append("mov ["+$ID.text+"] , eax\n");
				msg++;
			})? PUNTO_COMA
			{
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
				t.mapaDeclaraciones.put($ID.text,$ID.text+": resd 1");
				fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,numero); dataType.put($ID.text,"booleano");  numero="0"; menos="";
				if(hayFuncion){listaFuncion.add($ID.text);}
			}
			
			
			|  CARACTER ID {
				
						
			t.crearTabla($CARACTER.line,$CARACTER.text,"Palabra reservada","Clase","",0,"");
			t.crearTabla($ID.line,$ID.text,"Identificador","Variable local","0",0,"1 byte");
				
				
			}(ASSIGN CAR{numero=$CAR.text; 
				
				t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Clase","",0,"");
				t.crearTabla($CAR.line,$CAR.text,"Caracter","Clase","",0,"");
				
				t.constantes.append("msg"+Integer.toString(msg)+": dd "+$CAR.text+"\n");
			    t.programa.append("mov eax,msg"+Integer.toString(msg)+"\n");
				t.programa.append("mov ["+$ID.text+"] , eax\n");
				msg++;
				
			})? PUNTO_COMA
			{
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
				t.mapaDeclaraciones.put($ID.text,$ID.text+": resd 1");
				fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,numero); dataType.put($ID.text,"caracter");  numero="0"; menos="";
				if(hayFuncion){listaFuncion.add($ID.text);}
			}
			
			|  STRING ID {
				
				t.crearTabla($STRING.line,$STRING.text,"Palabra reservada","Clase","",0,"");
			    t.crearTabla($ID.line,$ID.text,"Identificador","Cadena","0",0,"255 bytes");
				
				
			}(ASSIGN CAR{numero=$CAR.text;
				
				t.constantes.append("msg"+Integer.toString(msg)+": dd "+$CAR.text+"\n");
			    t.programa.append("mov eax,msg"+Integer.toString(msg)+"\n");
				t.programa.append("mov ["+$ID.text+"] , eax\n");
				msg++;
				
				t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Clase","",0,"");
				t.crearTabla($CAR.line,$CAR.text,"Caracter","Clase","",0,"");
				
			})? PUNTO_COMA
			{
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
				t.mapaDeclaraciones.put($ID.text,$ID.text+": resd 1");
				fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,numero); dataType.put($ID.text,"string");  numero="0"; menos="";
				if(hayFuncion){listaFuncion.add($ID.text);}
			}
			
			
			| ENTERO ID  COR_OP NUMBER COR_CLOSE PUNTO_COMA
			{fueDeclarada($ID.text,$ID.line);symbolTable.put($ID.text,"0"); dataType.put($ID.text,"entero");  numero="0"; menos="";
				if(hayFuncion){listaFuncion.add($ID.text);}
			
			
			
				t.crearTabla($ENTERO.line,$ENTERO.text,"Palabra reservada","Clase","",0,"");
				t.crearTabla($ID.line,$ID.text,"Variable local","Clase","0",0,Integer.toString(Integer.parseInt($NUMBER.text)*4)+" bytes");
				t.crearTabla($COR_OP.line,$COR_OP.text,"Separador","Clase","",0,"");
				t.crearTabla($NUMBER.line,$NUMBER.text,"Numero entero","Clase","",0,"");
				t.crearTabla($COR_CLOSE.line,$COR_CLOSE.text,"Separador","Clase","",0,"");
				t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Clase","",0,"");
			
			
			
			
			}
	
		

;

//faltaLLamarFuncin

var_assign:

 	ID ASSIGN term PUNTO_COMA {
 		//System.out.println("valor "+$term.value);
 		verificaAsignacion($ID.text,(String)$term.value,$ID.line);
 		t.programa.append("mov ["+$ID.text+"] ,eax\n");
 		
 		t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",$term.value.toString(),"");
 		t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Bloque","",0,"");
 		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
 		
 		 	
    }
    |
    
     	ID ASSIGN llamarFuncion PUNTO_COMA {
     		seEncuentra($ID.text,$ID.line);
     		
     	t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
 		t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Bloque","",0,"");
 		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");

    }
    
    | 
    ID ASSIGN expresion PUNTO_COMA {
    	
 		//System.out.println("Valor de "+$ID.text+" valor "+$expresion.value);
 		seEncuentra($ID.text,$ID.line);
 		agregarAlaTabla($ID.text,$expresion.value);
 		
 		//guardar expresion
 		
 		t.programa.append("mov ["+$ID.text+"] ,eax\n");
 		t.programa.append("add esp,4\n");
 		
 		
 		
 		t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",$expresion.value.toString(),"");	
 		t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Bloque","",0,"");
 		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
 		
 	
    }
    | ID COR_OP NUMBER COR_CLOSE ASSIGN t5=NUMBER PUNTO_COMA {seEncuentra($ID.text,$ID.line);
    	
    	t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",$t5.text,"");
    	t.crearTabla($COR_OP.line,$COR_OP.text,"Separador","Bloque","",0,"");
 		t.crearTabla($NUMBER.line,$NUMBER.text,"Numero entero","Bloque","",0,"");
 		t.crearTabla($COR_CLOSE.line,$COR_CLOSE.text,"Separador","Bloque","",0,"");
 		t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Bloque","",0,"");
 		t.crearTabla($t5.line,$t5.text,"Numero entero","Bloque","",0,"");
 		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
    	
    	
    }
    | ID ASSIGN inc_dec PUNTO_COMA{
    	
    
    	seEncuentra($ID.text,$ID.line);
    	agregarAlaTabla($ID.text,$inc_dec.value);
    	t.programa.append("mov ["+$ID.text+"],eax\n");
    	
    	t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",$inc_dec.value.toString(),"");
 		t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Bloque","",0,"");
 		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
    }
    

    
;

inc_dec returns [Object value]:

	    ID SUMA SUMA  {$value=retornaNumero(retornaValor($ID.text,$ID.line).toString(),$ID.line)+1; 
	    	
	    	if(!dataType.get($ID.text).toString().equals("entero")){
	    		t.agregarErrores("Error tipo de dato no aceptado "+$ID.text+" linea "+$ID.line);
	    	}
	    	
	    	t.programa.append("mov eax , ["+$ID.text+"]\n");
	    	t.programa.append("inc eax\n");
	    	
	    	t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
	    	t.crearTabla($SUMA.line,$SUMA.text,"Operadores","Bloque","",0,"");
	    	t.crearTabla($SUMA.line,$SUMA.text,"Operadores","Bloque","",0,"");
	    	
	    	
	    }
		| ID MENOS MENOS {$value=retornaNumero(retornaValor($ID.text,$ID.line).toString(),$ID.line)-1;
			
			t.programa.append("mov eax , ["+$ID.text+"]\n");
	    	t.programa.append("dec eax\n");
	    	
	    	t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
	    	t.crearTabla($MENOS.line,$MENOS.text,"Operadores","Bloque","",0,"");
	    	t.crearTabla($MENOS.line,$MENOS.text,"Operadores","Bloque","",0,"");
			
		}

; 


expresion returns [Object value]: 

	t1=factor{$value = (int)$t1.value;} 
		(opMat t2=factor {
			
			t.programa.append("pop ecx\n");
			t.programa.append("pop eax\n");
			if($opMat.text.equals("+")){
				t.programa.append("add eax,ecx\n");
				$value= (int)$value + (int)$t2.value;	
			}
			else{
				t.programa.append("sub eax,ecx\n");
				$value= (int)$value - (int)$t2.value;
			}
			
			t.programa.append("push eax\n");			

				
			}
		)*
		
		

				
		
		;
		


		
factor returns [Object value]:
 
	t1=term2 {$value = (int)$t1.value; }
	(opMayor t2=term2 {
		 
			t.programa.append("pop ecx\n");
			t.programa.append("pop eax\n");
			
			if($opMayor.text.equals("*")){
				t.programa.append("mul ecx\n");
				$value = (int)$value * (int)$t2.value ;	
			}
			else{
				t.programa.append("div ecx\n");
				$value = (int)$value / (int)$t2.value ;	
			}
			
			
			t.programa.append("push eax\n");
		
	})*
	
	;
	
opMat:

	SUMA {
			    	
	    	t.crearTabla($SUMA.line,$SUMA.text,"Operadores","Bloque","",0,"");
	    	
	}
	|MENOS{
		t.crearTabla($MENOS.line,$MENOS.text,"Operadores","Bloque","",0,"");
	}

;

opMayor:
	DIV{
		
		t.crearTabla($DIV.line,$DIV.text,"Operadores","Bloque","",0,"");
		
		
	}
	|MULT{
		t.crearTabla($MULT.line,$MULT.text,"Operadores","Bloque","",0,"");
		
	}
;
	
	
	
term returns [Object value]: 
	  NUMBER {$value = menos+$NUMBER.text;
		t.programa.append("mov eax ,"+menos+$NUMBER.text+"\n");
		menos="";
		t.crearTabla($NUMBER.line,$NUMBER.text,"Numero entero","Bloque","",0,"");
	}
	|BOOLEAN {$value= $BOOLEAN.text;
		
		t.constantes.append("msg"+Integer.toString(msg)+":  dd \""+$BOOLEAN.text+"\" \n");
		t.programa.append("mov eax, msg"+Integer.toString(msg)+"\n");
		msg++;
		
		
		
		t.crearTabla($BOOLEAN.line,$BOOLEAN.text,"Booleano","Bloque","",0,"");
		
	}
	
	|ID {$value= retornaValor($ID.text,$ID.line);
		
		t.programa.append("mov eax ,["+$ID.text+"]\n");
		
		t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
	}
	|CAR {$value= $CAR.text; 
		
		t.constantes.append("msg"+Integer.toString(msg)+":  dd "+$CAR.text+"\n");
		t.programa.append("mov eax, msg"+Integer.toString(msg)+"\n");
		msg++;
		
		t.crearTabla($CAR.line,$CAR.text,"Caracter","Bloque","",0,"");
		
	} 
	
	|NUMBER_FLOAT {$value= menos+$NUMBER_FLOAT.text; menos=""; t.programa.append("mov eax ,0\n");
		
		t.crearTabla($NUMBER_FLOAT.line,$NUMBER_FLOAT.text,"Numero flotante","Bloque","",0,"");
		
	}
	;
	
	
llamarFuncion:
		t1=ID {seEncuentraFuncion($t1.text,$ID.line);
			
			t.crearTabla($t1.line,$t1.text,"Identificador","Bloque","",0,"");
		}
		
		PAR_OP {t.crearTabla($PAR_OP.line,$PAR_OP.text,"Separador","Bloque","",0,"");}(ID{
			
			seEncuentra($ID.text,$ID.line); contadorParametros++;
			t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
		} 
			(COMA ID{
				
				seEncuentra($ID.text,$ID.line); contadorParametros++;
				
				t.crearTabla($COMA.line,$COMA.text,"Separador","Bloque","",0,"");
				t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
				
			})*
		)? PAR_CLOSE PUNTO_COMA {
			
			String com=funcion.get($t1.text).toString();
	
			if(!com.equals(Integer.toString(contadorParametros))){
				t.agregarErrores("Error parametros no coinciden con la funcion "+Integer.toString($t1.line));
			}
			
			contadorParametros=0;
			
			t.crearTabla($PAR_CLOSE.line,$PAR_CLOSE.text,"Separador","Bloque","",0,"");
			t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Bloque","",0,"");
			
		}
;
	
	
term2 returns [Object value]: 
	NUMBER {$value = Integer.parseInt($NUMBER.text); ;  
		
		t.programa.append("mov ecx , "+$NUMBER.text+"\n");
		t.programa.append("push ecx \n");
		t.crearTabla($NUMBER.line,$NUMBER.text,"Numero entero","Bloque","",0,""); 
	}
	|PAR_OP expresion{ $value=$expresion.value;} PAR_CLOSE {
		
		
		t.crearTabla($PAR_OP.line,$PAR_OP.text,"Separador","Bloque","",0,"");
		t.crearTabla($PAR_CLOSE.line,$PAR_CLOSE.text,"Separador","Bloque","",0,"");
		
		
	}
	|ID {$value=retornaNumero(retornaValor($ID.text,$ID.line).toString(),$ID.line);
			
		if(symbolTable.containsKey($ID.text)){
			if(dataType.get($ID.text).toString().equals("entero") || dataType.get($ID.text).toString().equals("largo")){
				
			}else{
				t.agregarErrores("Error tipo de dato no aceptado "+Integer.toString($ID.line));
			}
		}
		
	  if(symbolTable.get($ID.text).toString().equals("0")){
			t.programa.append("mov ecx, 0\n");
			
		}else{
		//	System.out.print("push dword  ["+$ID.text+"]\n");	
		t.programa.append("mov ecx , ["+$ID.text+"]\n");
		}
		
		
		
		
		t.programa.append("push ecx \n");
		t.crearTabla($ID.line,$ID.text,"Identificador","Bloque","",0,"");
		
		 

	}
	//|NUMBER_FLOAT {$value= Float.parseFloat($NUMBER_FLOAT.text);} 
	
	
	;


constantes: 
			DEFINE ID ASSIGN NUMBER PUNTO_COMA 
		    {fueDeclarada($ID.text,$ID.line); symbolTable.put($ID.text,menos+$NUMBER.text); dataType.put($ID.text,"entero");
		    	 
		    	t.constantes.append($ID.text+": dd "+menos+$NUMBER.text+"\n");
		    	menos="";
		    	
		    	t.crearTabla($DEFINE.line,$DEFINE.text,"Palabra reservada","Constantes","",0,"");
		    	t.crearTabla($ID.line,$ID.text,"Identificador","Constantes",$NUMBER.text,0,"");
		    	t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Constantes","",0,"");
		    	t.crearTabla($NUMBER.line,$NUMBER.text,"Numero entero","Constantes","",0,"");
		    	t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Constantes","",0,"");
		    	
		    	
		    }
		    
		    
			|DEFINE ID ASSIGN  NUMBER_FLOAT PUNTO_COMA {
				
				t.constantes.append($ID.text+": dq "+menos+$NUMBER_FLOAT.text+"\n");
				fueDeclarada($ID.text,$ID.line); symbolTable.put($ID.text,menos+$NUMBER_FLOAT.text);menos="";
				dataType.put($ID.text,"flotante");
				
				t.crearTabla($DEFINE.line,$DEFINE.text,"Palabra reservada","Constantes","",0,"");
		    	t.crearTabla($ID.line,$ID.text,"Identificador","Constantes",$NUMBER_FLOAT.text,0,"");
		    	t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Constantes","",0,"");
		    	t.crearTabla($NUMBER_FLOAT.line,$NUMBER_FLOAT.text,"Numero flotante","Constantes","",0,"");
		    	t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Constantes","",0,"");
				
			}
			|DEFINE ID ASSIGN BOOLEAN PUNTO_COMA {
				
				fueDeclarada($ID.text,$ID.line); symbolTable.put($ID.text,$BOOLEAN.text);
				dataType.put($ID.text,"booleano");
				t.constantes.append($ID.text+": db \""+$BOOLEAN.text+"\" ,10,0"+"\n");
				
				t.crearTabla($DEFINE.line,$DEFINE.text,"Palabra reservada","Constantes","",0,"");
		    	t.crearTabla($ID.line,$ID.text,"Identificador","Constantes",$BOOLEAN.text,0,"");
		    	t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Constantes","",0,"");
		    	t.crearTabla($BOOLEAN.line,$BOOLEAN.text,"Booleano","Constantes","",0,"");
		    	t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Constantes","",0,"");
				
			}
			|DEFINE ID ASSIGN CAR PUNTO_COMA {
				
				
				fueDeclarada($ID.text,$ID.line); symbolTable.put($ID.text,$CAR.text);
				dataType.put($ID.text,"string");
				t.constantes.append($ID.text+": db "+$CAR.text+" ,10,0"+"\n");
				
				t.crearTabla($DEFINE.line,$DEFINE.text,"Palabra reservada","Constantes","",0,"");
		    	t.crearTabla($ID.line,$ID.text,"Identificador","Constantes",$CAR.text,0,"");
		    	t.crearTabla($ASSIGN.line,$ASSIGN.text,"Asignacion","Constantes","",0,"");
		    	t.crearTabla($CAR.line,$CAR.text,"Booleano","Constantes","",0,"");
		    	t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Constantes","",0,"");
			}
			
			;
			
libreria: 
		IMPORTA ID PUNTO_COMA{
			
			t.crearTabla($IMPORTA.line,$IMPORTA.text,"Palabra reservada","Biblioteca","",0,"");
		    t.crearTabla($ID.line,$ID.text,"Identificador","Biblioteca","",0,"");
		    t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Biblioteca","",0,"");

			
			
			
		};
		
lib_const: 
			constantes
			|libreria
			;
			
procedimiento: 

	restriccion? FUNCION ID PAR_OP{
			t.crearTabla($FUNCION.line,$FUNCION.text,"Palabra reservada","Funcion","",0,"");
		    t.crearTabla($ID.line,$ID.text,"Identificador","Funcion","",0,"");
		    t.crearTabla($PAR_OP.line,$PAR_OP.text,"Separador","Funcion","",0,"");
	} parametros_funcion* PAR_CLOSE {
		 t.crearTabla($PAR_CLOSE.line,$PAR_CLOSE.text,"Separador","Funcion","",0,"");
		hayFuncion=true;fueDeclaradaFuncion($ID.text,$ID.line); listaFuncion.add($ID.text);
	} 
	bloque*
	TERMINAFUNCION PUNTO_COMA {
		

		   
		    t.crearTabla($TERMINAFUNCION.line,$TERMINAFUNCION.text,"Palabra reservada","Funcion","",0,"");
		    t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Funcion","",0,"");
		
		
		hayFuncion=false; limpiarVariablesFuncion(); contadorParametros=0; listaFuncion.clear();
	}
	
;


funcion: 

	restriccion? tipoDedato ID PAR_OP{
				    t.crearTabla($ID.line,$ID.text,"Identificador","Funcion","",0,"");
		    t.crearTabla($PAR_OP.line,$PAR_OP.text,"Separador","Funcion","",0,"");
	} parametros_funcion* PAR_CLOSE {
		 t.crearTabla($PAR_CLOSE.line,$PAR_CLOSE.text,"Separador","Funcion","",0,"");
		hayFuncion=true;fueDeclaradaFuncion($ID.text,$ID.line); listaFuncion.add($ID.text);
	} 
	bloque*

	REGRESA { t.crearTabla($REGRESA.line,$REGRESA.text,"Palabra reservada","Funcion","",0,"");}
	regresaParametros PUNTO_COMA
	TERMINAFUNCION PUNTO_COMA {
		
		
			

		   
		   
		    t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Funcion","",0,"");
		    t.crearTabla($TERMINAFUNCION.line,$TERMINAFUNCION.text,"Palabra reservada","Funcion","",0,"");
		    t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","Funcion","",0,"");
		
		
		
		hayFuncion=false; limpiarVariablesFuncion(); contadorParametros=0; listaFuncion.clear();
		
		
	}
	
;

regresaParametros:
		NUMBER { t.crearTabla($NUMBER.line,$NUMBER.text,"Numero entero","Funcion","",0,"");}
		|NUMBER_FLOAT { t.crearTabla($NUMBER_FLOAT.line,$NUMBER_FLOAT.text,"Numero flotante","Funcion","",0,"");}
		|BOOLEAN { t.crearTabla($BOOLEAN.line,$BOOLEAN.text,"Booleano","Funcion","",0,"");}
		|ID {fueDeclarada($ID.text,$ID.line); t.crearTabla($ID.line,$ID.text,"Variable local","Funcion","",0,"");}
		|CAR{t.crearTabla($CAR.line,$CAR.text,"Caracter","Funcion","",0,"");};

parametros_funcion: 

	tipoDedato ID {
		fueDeclarada($ID.text,$ID.line); symbolTable.put($ID.text,0); dataType.put($ID.text,$tipoDedato.value);contadorParametros++;listaFuncion.add($ID.text);
		t.crearTabla($ID.line,$ID.text,"Identificador","Variable local","",0,"");
	} 
	(COMA {
		t.crearTabla($COMA.line,$COMA.text,"Separador","Funcion","",0,"");
	}tipoDedato ID {
		fueDeclarada($ID.text,$ID.line); symbolTable.put($ID.text,0); dataType.put($ID.text,$tipoDedato.value);contadorParametros++;listaFuncion.add($ID.text);
		t.crearTabla($ID.line,$ID.text,"Identificador","Variable local","",0,"");
	})*


;

tipoDedato returns [Object value]: 
	ENTERO {$value=$ENTERO.text; t.crearTabla($ENTERO.line,$ENTERO.text,"Palabra reservada","Funcion","",0,"");}
	|FLOT {$value=$FLOT.text; t.crearTabla($FLOT.line,$FLOT.text,"Palabra reservada","Funcion","",0,"");}
	|BOOL {$value=$BOOL.text; t.crearTabla($BOOL.line,$BOOL.text,"Palabra reservada","Funcion","",0,"");}
	|CARACTER {$value=$CARACTER.text; t.crearTabla($CARACTER.line,$CARACTER.text,"Palabra reservada","Funcion","",0,"");}
	|LARGO {$value=$LARGO.text; t.crearTabla($LARGO.line,$LARGO.text,"Palabra reservada","Funcion","",0,"");}
	|DOBLE {$value=$DOBLE.text; t.crearTabla($DOBLE.line,$DOBLE.text,"Palabra reservada","Funcion","",0,"");}
	|STRING {$value=$STRING.text; t.crearTabla($STRING.line,$STRING.text,"Palabra reservada","Funcion","",0,"");}
	;
	
	
	
leer:
	LEER ID PUNTO_COMA {
		
		
		if(symbolTable.containsKey($ID.text)){
			
			
			if(!symbolTable.get($ID.text).toString().equals("0")){
				t.agregarErrores("Error variable "+$ID.text+" fue inicializada "+Integer.toString($ID.line));
			}
			
			
			if(dataType.containsKey($ID.text)){
				
				if(dataType.get($ID.text).equals("entero")){
					t.constantes.append("msg"+Integer.toString(msg)+": dd  \"%d\"   \n");
					
				}
				else if(dataType.get($ID.text).equals("largo")){
					t.constantes.append("msg"+Integer.toString(msg)+": dd  \"%d\"   \n");
				}
				//else if(dataType.get($ID.text).equals("doble")){
					
				//}
				//else if(dataType.get($ID.text).equals("flotante")){
					
				//}
				else if(dataType.get($ID.text).equals("caracter")){
					t.constantes.append("msg"+Integer.toString(msg)+": db  \"%s\"   \n");
				}
				else if(dataType.get($ID.text).equals("string")){
					t.constantes.append("msg"+Integer.toString(msg)+": db  \"%s\"   \n");
				}
				else{
					t.agregarErrores("Error variable "+$ID.text+" tipo de dato no valido "+Integer.toString($ID.line));
				}
				
			}else{
				t.agregarErrores("Error variable "+$ID.text+" no contiene tipo de dato "+Integer.toString($ID.line));
			}
		}else{
			t.agregarErrores("Error variable "+$ID.text+" no fue declarada "+Integer.toString($ID.line));
		}
		
		t.programa.append("push dword "+$ID.text+"\n");
		t.programa.append("push dword msg"+Integer.toString(msg)+"\n");
		t.programa.append("call scanf\n");
		t.programa.append("add esp,8\n");
		msg++;
		
		t.crearTabla($LEER.line,$LEER.text,"Palabra reservada","bloque","",0,"");
		t.crearTabla($ID.line,$ID.text,"Identificador","bloque","",0,"");
		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","bloque","",0,"");
		
	};
	
termPri: 
	NUMBERPRI {t.programa.append("push "+$NUMBERPRI.text+"\n"); 
							      //System.out.print("msg"+Integer.toString(contadorMsg)+": db \"%d\",10,0\n");
						          
						          t.constantes.append("msg"+Integer.toString(msg)+": db \"%d\" ,10,0 \n");
						          t.programa.append("push dword msg"+Integer.toString(msg)+"\n");
								  msg++;	
								  t.crearTabla($NUMBERPRI.line,$NUMBERPRI.text,"Numero entero","bloque","",0,"");							  //contadorMsg++;	
	}
	|BOOLEAN {
		imprimeCadena=true;
		t.constantes.append("msg"+Integer.toString(msg)+":  db \"+$BOOLEAN.text+\",10,0 \n ");
		t.programa.append("push dword msg"+Integer.toString(msg)+"\n");
		msg++;
		 t.crearTabla($BOOLEAN.line,$BOOLEAN.text,"Booleano","bloque","",0,"");
		
	}
	|ID {
		
		if(symbolTable.containsKey($ID.text)){
			
			if(dataType.containsKey($ID.text)){
				
				if(dataType.get($ID.text).equals("entero")){
					t.constantes.append("msg"+Integer.toString(msg)+": db \"%d\" ,10,0\n");
					
							if(symbolTable.get($ID.text).toString().equals("0")){
								
								//t.programa.append("push dword 0\n");
								t.programa.append("push dword  ["+$ID.text+"]\n");
								}else{
									t.programa.append("push dword  ["+$ID.text+"]\n");	
								}
		
					
				}
				else if(dataType.get($ID.text).equals("largo")){
					t.constantes.append("msg"+Integer.toString(msg)+": db \"%d\" ,10,0\n");
												if(symbolTable.get($ID.text).toString().equals("0")){
								//t.programa.append("push dword 0\n");
								t.programa.append("push dword  ["+$ID.text+"]\n");
								}else{
									t.programa.append("push dword  ["+$ID.text+"]\n");	
								}
				}
				/*else if(dataType.get($ID.text).equals("doble")){
					
				}
				else if(dataType.get($ID.text).equals("flotante")){
					
				}*/
				else if(dataType.get($ID.text).equals("caracter")){
					t.constantes.append("msg"+Integer.toString(msg)+": db \"%s\" ,10,0\n");
					
					if(symbolTable.get($ID.text).toString().equals("0")){
					
					t.agregarErrores("Error variable "+$ID.text+" tipo ha sido inicializada "+Integer.toString($ID.line));
					
					}else{
							t.programa.append("push dword  ["+$ID.text+"] \n");	
					}
				}
				else if(dataType.get($ID.text).equals("string")){
					t.constantes.append("msg"+Integer.toString(msg)+": db \"%s\" ,10,0\n");
					
					
				    if(symbolTable.get($ID.text).toString().equals("0")){
					
					t.agregarErrores("Error variable "+$ID.text+" tipo ha sido inicializada "+Integer.toString($ID.line));
					
					}else{
							t.programa.append("push dword  ["+$ID.text+"]\n");	
					} 
					 
					
				}
			   else if(dataType.get($ID.text).equals("booleano")){
					t.constantes.append("msg"+Integer.toString(msg)+": db \"%s\" ,10,0\n");
					
					
				    if(symbolTable.get($ID.text).toString().equals("0")){
					
					t.agregarErrores("Error variable "+$ID.text+" tipo ha sido inicializada "+Integer.toString($ID.line));
					
					}else{
							t.programa.append("push dword  ["+$ID.text+"]\n");	
					} 
					 
					
				} 
				
				else{
					t.agregarErrores("Error variable "+$ID.text+" tipo de dato no valido "+Integer.toString($ID.line));
				}
				
			}else{
				t.agregarErrores("Error variable "+$ID.text+" no contiene tipo de dato "+Integer.toString($ID.line));
			}
		}else{
			t.agregarErrores("Error variable "+$ID.text+" no fue declarada "+Integer.toString($ID.line));
		}
		

		 
		// h.st.append("msg"+Integer.toString(contadorMsg)+": db \"%d\",10,0\n");	  
         //System.out.print("push dword msg"+Integer.toString(contadorMsg)+"\n");
         t.programa.append("push dword msg"+Integer.toString(msg)+"\n");
         msg++;	
         //contadorMsg++;
         t.crearTabla($ID.line,$ID.text,"Identificador","bloque","",0,""); 
         
	}
	|CAR {
		imprimeCadena=true;
		 
		t.constantes.append("msg"+Integer.toString(msg)+": db "+$CAR.text+" ,10,0\n");
		t.programa.append("push dword msg"+Integer.toString(msg)+"\n");
		msg++; 
		
		
		t.crearTabla($CAR.line,$CAR.text,"Caracter","bloque","",0,"");
		
	}
	;

escribir:
	ESCRIBIR{
			t.crearTabla($ESCRIBIR.line,$ESCRIBIR.text,"Palabra reservada","bloque","",0,"");
	} termPri PUNTO_COMA {
		
		t.programa.append("call printf\n");
		
		if(imprimeCadena){
			t.programa.append("add esp,4\n");
			imprimeCadena=false;
		}
		else{
		t.programa.append("add esp,8\n");
		}
	 
		
		t.crearTabla($PUNTO_COMA.line,$PUNTO_COMA.text,"Terminacion","bloque","",0,"");	 
		 
		
	};
	
	



CLASE:  'clase';
TERMINA_CLASE: 'terminaclase';
PRINCIPAL: 'principal';
TERMINA_PRINCIPAL: 'terminaprincipal';
PUBLICO: 'publico';
PRIVADO: 'privado';
DEFINE: 'define';
IMPORTA: 'importa';
FUNCION: 'funcion';
TERMINAFUNCION: 'terminafuncion';
REGRESA: 'regresa';
LEER: 'leer';
ESCRIBIR: 'escribir';
SI: 'si';
SINO: 'sino';
TERMINA_SI: 'terminasi';
ENTERO: 'entero';
FLOT: 'flotante';
BOOL: 'booleano';
CARACTER: 'caracter';
LARGO: 'largo';
DOBLE: 'doble'; //flotante
STRING: 'string';
ENTONCES: 'entonces';

EN_CASO: 'encaso';
CASO: 'caso';
ROMPE: 'rompe';
DEFECTO: 'defecto';
TERMINA_CASO:'terminacaso';

REPITE: 'repite';
HASTAQUE: 'hastaque';

MIENTRAS: 'mientras';
TERMINA_MIENTRAS: 'terminamientras';

PARA: 'para';
TERMINAPARA: 'terminapara';

HASTA:'hasta';


SUMA: '+';
MENOS: '-';
MULT: '*';
DIV: '/';

Y: 'y';
O: 'o';
NO: 'neg';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';
ASSIGN: '=';

PAR_OP: '(';
PAR_CLOSE: ')';
COR_OP:'[';
COR_CLOSE: ']';
COMA: ',';
PUNTO_COMA: ';';
PUNTO: '.';
DOS_PUNTOS: ':';

BOOLEAN: 'verdad'|'falso';
ID: [a-zA-Z_][a-zA-Z0-9_]*;

NUMBER: '-'?[0-9]+;
NUMBERPRI: '-'?[0-9]+;

NUMBER_FLOAT: '-'?'0'..'9'+ '.' '0'..'9'*;
NUMBEROP: [0-9]+;
CAR: '"'.+?'"';
CHAR: '"'[A-Za-z0-9]?'"';

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

