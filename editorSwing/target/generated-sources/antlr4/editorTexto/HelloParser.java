// Generated from Hello.g4 by ANTLR 4.4

	package editorTexto;
	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASE=1, TERMINA_CLASE=2, PRINCIPAL=3, TERMINA_PRINCIPAL=4, PUBLICO=5, 
		PRIVADO=6, DEFINE=7, IMPORTA=8, FUNCION=9, TERMINAFUNCION=10, REGRESA=11, 
		LEER=12, ESCRIBIR=13, SI=14, SINO=15, TERMINA_SI=16, ENTERO=17, FLOT=18, 
		BOOL=19, CARACTER=20, LARGO=21, DOBLE=22, STRING=23, ENTONCES=24, EN_CASO=25, 
		CASO=26, ROMPE=27, DEFECTO=28, TERMINA_CASO=29, REPITE=30, HASTAQUE=31, 
		MIENTRAS=32, TERMINA_MIENTRAS=33, PARA=34, TERMINAPARA=35, HASTA=36, SUMA=37, 
		MENOS=38, MULT=39, DIV=40, Y=41, O=42, NO=43, GT=44, LT=45, GEQ=46, LEQ=47, 
		EQ=48, NEQ=49, ASSIGN=50, PAR_OP=51, PAR_CLOSE=52, COR_OP=53, COR_CLOSE=54, 
		COMA=55, PUNTO_COMA=56, PUNTO=57, DOS_PUNTOS=58, BOOLEAN=59, ID=60, NUMBER=61, 
		NUMBERPRI=62, NUMBER_FLOAT=63, NUMBEROP=64, CAR=65, CHAR=66, WS=67;
	public static final String[] tokenNames = {
		"<INVALID>", "'clase'", "'terminaclase'", "'principal'", "'terminaprincipal'", 
		"'publico'", "'privado'", "'define'", "'importa'", "'funcion'", "'terminafuncion'", 
		"'regresa'", "'leer'", "'escribir'", "'si'", "'sino'", "'terminasi'", 
		"'entero'", "'flotante'", "'booleano'", "'caracter'", "'largo'", "'doble'", 
		"'string'", "'entonces'", "'encaso'", "'caso'", "'rompe'", "'defecto'", 
		"'terminacaso'", "'repite'", "'hastaque'", "'mientras'", "'terminamientras'", 
		"'para'", "'terminapara'", "'hasta'", "'+'", "'-'", "'*'", "'/'", "'y'", 
		"'o'", "'neg'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", "'('", 
		"')'", "'['", "']'", "','", "';'", "'.'", "':'", "BOOLEAN", "ID", "NUMBER", 
		"NUMBERPRI", "NUMBER_FLOAT", "NUMBEROP", "CAR", "CHAR", "WS"
	};
	public static final int
		RULE_programa = 0, RULE_clase = 1, RULE_bloque = 2, RULE_para = 3, RULE_compFor = 4, 
		RULE_mientras = 5, RULE_repite = 6, RULE_no = 7, RULE_condicion = 8, RULE_comparadores = 9, 
		RULE_encaso = 10, RULE_compCase = 11, RULE_si = 12, RULE_sistand = 13, 
		RULE_neg = 14, RULE_compSi = 15, RULE_compSi2 = 16, RULE_operadoresComp = 17, 
		RULE_valor = 18, RULE_decl_clase = 19, RULE_llamar_objecto = 20, RULE_incremento_decremento = 21, 
		RULE_seccion = 22, RULE_var_decl = 23, RULE_restriccion = 24, RULE_var_declB = 25, 
		RULE_var_assign = 26, RULE_inc_dec = 27, RULE_expresion = 28, RULE_factor = 29, 
		RULE_opMat = 30, RULE_opMayor = 31, RULE_term = 32, RULE_llamarFuncion = 33, 
		RULE_term2 = 34, RULE_constantes = 35, RULE_libreria = 36, RULE_lib_const = 37, 
		RULE_procedimiento = 38, RULE_funcion = 39, RULE_regresaParametros = 40, 
		RULE_parametros_funcion = 41, RULE_tipoDedato = 42, RULE_leer = 43, RULE_termPri = 44, 
		RULE_escribir = 45;
	public static final String[] ruleNames = {
		"programa", "clase", "bloque", "para", "compFor", "mientras", "repite", 
		"no", "condicion", "comparadores", "encaso", "compCase", "si", "sistand", 
		"neg", "compSi", "compSi2", "operadoresComp", "valor", "decl_clase", "llamar_objecto", 
		"incremento_decremento", "seccion", "var_decl", "restriccion", "var_declB", 
		"var_assign", "inc_dec", "expresion", "factor", "opMat", "opMayor", "term", 
		"llamarFuncion", "term2", "constantes", "libreria", "lib_const", "procedimiento", 
		"funcion", "regresaParametros", "parametros_funcion", "tipoDedato", "leer", 
		"termPri", "escribir"
	};

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

		
		
		
		

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public ClaseContext clase() {
			return getRuleContext(ClaseContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); clase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClaseContext extends ParserRuleContext {
		public Token CLASE;
		public Token ID;
		public Token PRINCIPAL;
		public Token TERMINA_PRINCIPAL;
		public Token PUNTO_COMA;
		public Token TERMINA_CLASE;
		public TerminalNode PRINCIPAL() { return getToken(HelloParser.PRINCIPAL, 0); }
		public List<Lib_constContext> lib_const() {
			return getRuleContexts(Lib_constContext.class);
		}
		public Lib_constContext lib_const(int i) {
			return getRuleContext(Lib_constContext.class,i);
		}
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(HelloParser.PUNTO_COMA, i);
		}
		public TerminalNode TERMINA_PRINCIPAL() { return getToken(HelloParser.TERMINA_PRINCIPAL, 0); }
		public List<TerminalNode> PUNTO_COMA() { return getTokens(HelloParser.PUNTO_COMA); }
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public TerminalNode TERMINA_CLASE() { return getToken(HelloParser.TERMINA_CLASE, 0); }
		public SeccionContext seccion(int i) {
			return getRuleContext(SeccionContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public List<SeccionContext> seccion() {
			return getRuleContexts(SeccionContext.class);
		}
		public TerminalNode CLASE() { return getToken(HelloParser.CLASE, 0); }
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public ClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterClase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitClase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitClase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClaseContext clase() throws RecognitionException {
		ClaseContext _localctx = new ClaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_clase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFINE || _la==IMPORTA) {
				{
				{
				setState(94); lib_const();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100); ((ClaseContext)_localctx).CLASE = match(CLASE);
			setState(101); ((ClaseContext)_localctx).ID = match(ID);
			fueDeclarada((((ClaseContext)_localctx).ID!=null?((ClaseContext)_localctx).ID.getText():null),(((ClaseContext)_localctx).ID!=null?((ClaseContext)_localctx).ID.getLine():0));symbolTable.put((((ClaseContext)_localctx).ID!=null?((ClaseContext)_localctx).ID.getText():null),"0"); 
						
						t.crearTabla((((ClaseContext)_localctx).CLASE!=null?((ClaseContext)_localctx).CLASE.getLine():0),(((ClaseContext)_localctx).CLASE!=null?((ClaseContext)_localctx).CLASE.getText():null),"palabra reservada","clase","",0,"");
						t.crearTabla((((ClaseContext)_localctx).ID!=null?((ClaseContext)_localctx).ID.getLine():0),(((ClaseContext)_localctx).ID!=null?((ClaseContext)_localctx).ID.getText():null),"Identificador","clase","",0,"");
					
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103); var_decl();
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLICO) | (1L << PRIVADO) | (1L << FUNCION) | (1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(109); seccion();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115); ((ClaseContext)_localctx).PRINCIPAL = match(PRINCIPAL);
			t.crearTabla((((ClaseContext)_localctx).PRINCIPAL!=null?((ClaseContext)_localctx).PRINCIPAL.getLine():0),(((ClaseContext)_localctx).PRINCIPAL!=null?((ClaseContext)_localctx).PRINCIPAL.getText():null),"palabra reservada","principal","",0,"");
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING) | (1L << EN_CASO) | (1L << REPITE) | (1L << MIENTRAS) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(117); bloque();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123); ((ClaseContext)_localctx).TERMINA_PRINCIPAL = match(TERMINA_PRINCIPAL);
			setState(124); ((ClaseContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

						
						t.crearTabla((((ClaseContext)_localctx).TERMINA_PRINCIPAL!=null?((ClaseContext)_localctx).TERMINA_PRINCIPAL.getLine():0),(((ClaseContext)_localctx).TERMINA_PRINCIPAL!=null?((ClaseContext)_localctx).TERMINA_PRINCIPAL.getText():null),"palabra reservada","principal","",0,"");
						t.crearTabla((((ClaseContext)_localctx).PUNTO_COMA!=null?((ClaseContext)_localctx).PUNTO_COMA.getLine():0),(((ClaseContext)_localctx).PUNTO_COMA!=null?((ClaseContext)_localctx).PUNTO_COMA.getText():null),"terminacion","principal","",0,"");
						
					
			setState(126); ((ClaseContext)_localctx).TERMINA_CLASE = match(TERMINA_CLASE);
			setState(127); ((ClaseContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

						
				t.programa.append("mov esp,ebp\n");
				t.programa.append("pop ebp\n");
				t.programa.append("mov eax,0\n");
				t.programa.append("ret\n");
				
					t.crearTabla((((ClaseContext)_localctx).TERMINA_CLASE!=null?((ClaseContext)_localctx).TERMINA_CLASE.getLine():0),(((ClaseContext)_localctx).TERMINA_CLASE!=null?((ClaseContext)_localctx).TERMINA_CLASE.getText():null),"palabra reservada","clase","",0,"");
					t.crearTabla((((ClaseContext)_localctx).PUNTO_COMA!=null?((ClaseContext)_localctx).PUNTO_COMA.getLine():0),(((ClaseContext)_localctx).PUNTO_COMA!=null?((ClaseContext)_localctx).PUNTO_COMA.getText():null),"terminacion","clase","",0,"");
				
						
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueContext extends ParserRuleContext {
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public RepiteContext repite() {
			return getRuleContext(RepiteContext.class,0);
		}
		public Var_declBContext var_declB() {
			return getRuleContext(Var_declBContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public LlamarFuncionContext llamarFuncion() {
			return getRuleContext(LlamarFuncionContext.class,0);
		}
		public EncasoContext encaso() {
			return getRuleContext(EncasoContext.class,0);
		}
		public EscribirContext escribir() {
			return getRuleContext(EscribirContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public Incremento_decrementoContext incremento_decremento() {
			return getRuleContext(Incremento_decrementoContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public SistandContext sistand() {
			return getRuleContext(SistandContext.class,0);
		}
		public Llamar_objectoContext llamar_objecto() {
			return getRuleContext(Llamar_objectoContext.class,0);
		}
		public Decl_claseContext decl_clase() {
			return getRuleContext(Decl_claseContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque);
		try {
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); escribir();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); leer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132); var_declB();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133); var_assign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134); llamarFuncion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135); incremento_decremento();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136); decl_clase();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(137); llamar_objecto();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(138); si();
				t.programa.append(".done"+Integer.toString(done)+": \n"); done++; cIf++;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(141); sistand();
				t.programa.append(".done"+Integer.toString(done)+": \n"); done++; cIf++; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(144); encaso();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(145); repite();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(146); mientras();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(147); para();
				ciclo++;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParaContext extends ParserRuleContext {
		public Token PARA;
		public Token PAR_OP;
		public Token ENTERO;
		public Token t1;
		public Token ASSIGN;
		public Token t2;
		public Token PUNTO_COMA;
		public Token ID;
		public CompForContext compFor;
		public Token t3;
		public Token SUMA;
		public Token PAR_CLOSE;
		public Token TERMINAPARA;
		public TerminalNode SUMA(int i) {
			return getToken(HelloParser.SUMA, i);
		}
		public TerminalNode NUMBER(int i) {
			return getToken(HelloParser.NUMBER, i);
		}
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(HelloParser.PUNTO_COMA, i);
		}
		public TerminalNode PARA() { return getToken(HelloParser.PARA, 0); }
		public TerminalNode ID(int i) {
			return getToken(HelloParser.ID, i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(HelloParser.PUNTO_COMA); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public TerminalNode ASSIGN() { return getToken(HelloParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(HelloParser.ID); }
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
		public List<TerminalNode> SUMA() { return getTokens(HelloParser.SUMA); }
		public CompForContext compFor() {
			return getRuleContext(CompForContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(HelloParser.NUMBER); }
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode TERMINAPARA() { return getToken(HelloParser.TERMINAPARA, 0); }
		public TerminalNode ENTERO() { return getToken(HelloParser.ENTERO, 0); }
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); ((ParaContext)_localctx).PARA = match(PARA);
			setState(153); ((ParaContext)_localctx).PAR_OP = match(PAR_OP);
			setState(154); ((ParaContext)_localctx).ENTERO = match(ENTERO);
			setState(155); ((ParaContext)_localctx).t1 = match(ID);
			seDeclaroPara((((ParaContext)_localctx).t1!=null?((ParaContext)_localctx).t1.getText():null),(((ParaContext)_localctx).t1!=null?((ParaContext)_localctx).t1.getLine():0));
			setState(157); ((ParaContext)_localctx).ASSIGN = match(ASSIGN);
			setState(158); ((ParaContext)_localctx).t2 = match(NUMBER);
			setState(159); ((ParaContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);
			setState(160); ((ParaContext)_localctx).ID = match(ID);

					t.crearTabla((((ParaContext)_localctx).PARA!=null?((ParaContext)_localctx).PARA.getLine():0),(((ParaContext)_localctx).PARA!=null?((ParaContext)_localctx).PARA.getText():null),"Palabra reservada","Bloque","",0,"");
					t.crearTabla((((ParaContext)_localctx).PAR_OP!=null?((ParaContext)_localctx).PAR_OP.getLine():0),(((ParaContext)_localctx).PAR_OP!=null?((ParaContext)_localctx).PAR_OP.getText():null),"Separador","Bloque","",0,"");
					t.crearTabla((((ParaContext)_localctx).ENTERO!=null?((ParaContext)_localctx).ENTERO.getLine():0),(((ParaContext)_localctx).ENTERO!=null?((ParaContext)_localctx).ENTERO.getText():null),"Numero entero","Bloque","",0,"");
					t.crearTabla((((ParaContext)_localctx).t1!=null?((ParaContext)_localctx).t1.getLine():0),(((ParaContext)_localctx).t1!=null?((ParaContext)_localctx).t1.getText():null),"Identificador","Bloque","0",Integer.parseInt((((ParaContext)_localctx).t2!=null?((ParaContext)_localctx).t2.getText():null)),"4 bytes");
					t.crearTabla((((ParaContext)_localctx).ASSIGN!=null?((ParaContext)_localctx).ASSIGN.getLine():0),(((ParaContext)_localctx).ASSIGN!=null?((ParaContext)_localctx).ASSIGN.getText():null),"asignacion","Bloque","",0,"");
					t.crearTabla((((ParaContext)_localctx).t2!=null?((ParaContext)_localctx).t2.getLine():0),(((ParaContext)_localctx).t2!=null?((ParaContext)_localctx).t2.getText():null),"Numero entero","Bloque","",0,"");
					t.crearTabla((((ParaContext)_localctx).PUNTO_COMA!=null?((ParaContext)_localctx).PUNTO_COMA.getLine():0),(((ParaContext)_localctx).PUNTO_COMA!=null?((ParaContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
					t.crearTabla((((ParaContext)_localctx).ID!=null?((ParaContext)_localctx).ID.getLine():0),(((ParaContext)_localctx).ID!=null?((ParaContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
					
					
					if(!(((ParaContext)_localctx).t1!=null?((ParaContext)_localctx).t1.getText():null).equals ((((ParaContext)_localctx).ID!=null?((ParaContext)_localctx).ID.getText():null))){
						t.agregarErrores("Error variable "+(((ParaContext)_localctx).ID!=null?((ParaContext)_localctx).ID.getText():null)+" no coincide "+Integer.toString((((ParaContext)_localctx).ID!=null?((ParaContext)_localctx).ID.getLine():0)));
					}
				
				
				
			setState(162); ((ParaContext)_localctx).compFor = compFor();
			setState(163); ((ParaContext)_localctx).t3 = match(NUMBER);
			setState(164); ((ParaContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);
			setState(165); ((ParaContext)_localctx).ID = match(ID);

				 	
				 	t.crearTabla((((ParaContext)_localctx).t3!=null?((ParaContext)_localctx).t3.getLine():0),(((ParaContext)_localctx).t3!=null?((ParaContext)_localctx).t3.getText():null),"Numero entero","Bloque","",0,"");
				 	t.crearTabla((((ParaContext)_localctx).PUNTO_COMA!=null?((ParaContext)_localctx).PUNTO_COMA.getLine():0),(((ParaContext)_localctx).PUNTO_COMA!=null?((ParaContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
				 	t.crearTabla((((ParaContext)_localctx).ID!=null?((ParaContext)_localctx).ID.getLine():0),(((ParaContext)_localctx).ID!=null?((ParaContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
					
				   if(!(((ParaContext)_localctx).t1!=null?((ParaContext)_localctx).t1.getText():null).equals ((((ParaContext)_localctx).ID!=null?((ParaContext)_localctx).ID.getText():null))){
						t.agregarErrores("Error variable "+(((ParaContext)_localctx).ID!=null?((ParaContext)_localctx).ID.getText():null)+" no coincide "+Integer.toString((((ParaContext)_localctx).ID!=null?((ParaContext)_localctx).ID.getLine():0)));
					}
					
					//t3-t2
					int valor=0;
					if((((ParaContext)_localctx).compFor!=null?_input.getText(((ParaContext)_localctx).compFor.start,((ParaContext)_localctx).compFor.stop):null).equals("<")){
					valor=Integer.parseInt((((ParaContext)_localctx).t3!=null?((ParaContext)_localctx).t3.getText():null))-Integer.parseInt((((ParaContext)_localctx).t2!=null?((ParaContext)_localctx).t2.getText():null))-1;
					}
					else{
					valor=Integer.parseInt((((ParaContext)_localctx).t3!=null?((ParaContext)_localctx).t3.getText():null))-Integer.parseInt((((ParaContext)_localctx).t2!=null?((ParaContext)_localctx).t2.getText():null));
					}
					
					t.programa.append("mov ecx , "+Integer.toString(valor)+"\n");
					t.programa.append(".loop"+Integer.toString(ciclo)+": \n");
					t.programa.append("push ecx\n");
					
					
				
			setState(167); ((ParaContext)_localctx).SUMA = match(SUMA);
			setState(168); ((ParaContext)_localctx).SUMA = match(SUMA);
			setState(169); ((ParaContext)_localctx).PAR_CLOSE = match(PAR_CLOSE);

					t.crearTabla((((ParaContext)_localctx).SUMA!=null?((ParaContext)_localctx).SUMA.getLine():0),(((ParaContext)_localctx).SUMA!=null?((ParaContext)_localctx).SUMA.getText():null),"Operador","Bloque","",0,"");
					t.crearTabla((((ParaContext)_localctx).SUMA!=null?((ParaContext)_localctx).SUMA.getLine():0),(((ParaContext)_localctx).SUMA!=null?((ParaContext)_localctx).SUMA.getText():null),"Operador","Bloque","",0,"");
					t.crearTabla((((ParaContext)_localctx).PAR_CLOSE!=null?((ParaContext)_localctx).PAR_CLOSE.getLine():0),(((ParaContext)_localctx).PAR_CLOSE!=null?((ParaContext)_localctx).PAR_CLOSE.getText():null),"Separador","Bloque","",0,"");
				
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING) | (1L << EN_CASO) | (1L << REPITE) | (1L << MIENTRAS) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(171); bloque();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177); ((ParaContext)_localctx).TERMINAPARA = match(TERMINAPARA);
			setState(178); ((ParaContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

					t.programa.append("pop ecx\n");
					t.programa.append("loop .loop"+Integer.toString(ciclo)+"\n");
					
					t.crearTabla((((ParaContext)_localctx).TERMINAPARA!=null?((ParaContext)_localctx).TERMINAPARA.getLine():0),(((ParaContext)_localctx).TERMINAPARA!=null?((ParaContext)_localctx).TERMINAPARA.getText():null),"Palabra reservada","Bloque","",0,"");
					t.crearTabla((((ParaContext)_localctx).PUNTO_COMA!=null?((ParaContext)_localctx).PUNTO_COMA.getLine():0),(((ParaContext)_localctx).PUNTO_COMA!=null?((ParaContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
					
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompForContext extends ParserRuleContext {
		public Token LT;
		public Token LEQ;
		public TerminalNode LEQ() { return getToken(HelloParser.LEQ, 0); }
		public TerminalNode LT() { return getToken(HelloParser.LT, 0); }
		public CompForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCompFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCompFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCompFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompForContext compFor() throws RecognitionException {
		CompForContext _localctx = new CompForContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compFor);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); ((CompForContext)_localctx).LT = match(LT);
				t.crearTabla((((CompForContext)_localctx).LT!=null?((CompForContext)_localctx).LT.getLine():0),(((CompForContext)_localctx).LT!=null?((CompForContext)_localctx).LT.getText():null),"Comparadores","Bloque","",0,"");
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); ((CompForContext)_localctx).LEQ = match(LEQ);
				t.crearTabla((((CompForContext)_localctx).LEQ!=null?((CompForContext)_localctx).LEQ.getLine():0),(((CompForContext)_localctx).LEQ!=null?((CompForContext)_localctx).LEQ.getText():null),"Comparadores","Bloque","",0,"");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MientrasContext extends ParserRuleContext {
		public Token MIENTRAS;
		public Token TERMINA_MIENTRAS;
		public Token PUNTO_COMA;
		public TerminalNode TERMINA_MIENTRAS() { return getToken(HelloParser.TERMINA_MIENTRAS, 0); }
		public TerminalNode MIENTRAS() { return getToken(HelloParser.MIENTRAS, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); ((MientrasContext)_localctx).MIENTRAS = match(MIENTRAS);
			t.crearTabla((((MientrasContext)_localctx).MIENTRAS!=null?((MientrasContext)_localctx).MIENTRAS.getLine():0),(((MientrasContext)_localctx).MIENTRAS!=null?((MientrasContext)_localctx).MIENTRAS.getText():null),"Palabra reservada","Bloque","",0,"");
			setState(189); condicion();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING) | (1L << EN_CASO) | (1L << REPITE) | (1L << MIENTRAS) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(190); bloque();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196); ((MientrasContext)_localctx).TERMINA_MIENTRAS = match(TERMINA_MIENTRAS);
			setState(197); ((MientrasContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

					t.crearTabla((((MientrasContext)_localctx).TERMINA_MIENTRAS!=null?((MientrasContext)_localctx).TERMINA_MIENTRAS.getLine():0),(((MientrasContext)_localctx).TERMINA_MIENTRAS!=null?((MientrasContext)_localctx).TERMINA_MIENTRAS.getText():null),"Palabra reservada","Bloque","",0,"");
					t.crearTabla((((MientrasContext)_localctx).PUNTO_COMA!=null?((MientrasContext)_localctx).PUNTO_COMA.getLine():0),(((MientrasContext)_localctx).PUNTO_COMA!=null?((MientrasContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepiteContext extends ParserRuleContext {
		public Token REPITE;
		public Token HASTAQUE;
		public Token PUNTO_COMA;
		public TerminalNode REPITE() { return getToken(HelloParser.REPITE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode HASTAQUE() { return getToken(HelloParser.HASTAQUE, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public RepiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterRepite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitRepite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitRepite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepiteContext repite() throws RecognitionException {
		RepiteContext _localctx = new RepiteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); ((RepiteContext)_localctx).REPITE = match(REPITE);
			t.crearTabla((((RepiteContext)_localctx).REPITE!=null?((RepiteContext)_localctx).REPITE.getLine():0),(((RepiteContext)_localctx).REPITE!=null?((RepiteContext)_localctx).REPITE.getText():null),"Palabra reservada","Bloque","",0,"");
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING) | (1L << EN_CASO) | (1L << REPITE) | (1L << MIENTRAS) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(202); bloque();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208); ((RepiteContext)_localctx).HASTAQUE = match(HASTAQUE);
			t.crearTabla((((RepiteContext)_localctx).HASTAQUE!=null?((RepiteContext)_localctx).HASTAQUE.getLine():0),(((RepiteContext)_localctx).HASTAQUE!=null?((RepiteContext)_localctx).HASTAQUE.getText():null),"Palabra reservada","Bloque","",0,"");
			setState(210); condicion();
			setState(211); ((RepiteContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

					t.crearTabla((((RepiteContext)_localctx).PUNTO_COMA!=null?((RepiteContext)_localctx).PUNTO_COMA.getLine():0),(((RepiteContext)_localctx).PUNTO_COMA!=null?((RepiteContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoContext extends ParserRuleContext {
		public Token NO;
		public TerminalNode NO() { return getToken(HelloParser.NO, 0); }
		public NoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoContext no() throws RecognitionException {
		NoContext _localctx = new NoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_no);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); ((NoContext)_localctx).NO = match(NO);
			t.crearTabla((((NoContext)_localctx).NO!=null?((NoContext)_localctx).NO.getLine():0),(((NoContext)_localctx).NO!=null?((NoContext)_localctx).NO.getText():null),"Palabra reservada","Bloque","",0,"");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public Token Y;
		public Token O;
		public ComparadoresContext comparadores(int i) {
			return getRuleContext(ComparadoresContext.class,i);
		}
		public NegContext neg(int i) {
			return getRuleContext(NegContext.class,i);
		}
		public TerminalNode O(int i) {
			return getToken(HelloParser.O, i);
		}
		public List<ComparadoresContext> comparadores() {
			return getRuleContexts(ComparadoresContext.class);
		}
		public List<TerminalNode> Y() { return getTokens(HelloParser.Y); }
		public List<NoContext> no() {
			return getRuleContexts(NoContext.class);
		}
		public OperadoresCompContext operadoresComp(int i) {
			return getRuleContext(OperadoresCompContext.class,i);
		}
		public TerminalNode Y(int i) {
			return getToken(HelloParser.Y, i);
		}
		public List<TerminalNode> O() { return getTokens(HelloParser.O); }
		public List<OperadoresCompContext> operadoresComp() {
			return getRuleContexts(OperadoresCompContext.class);
		}
		public NoContext no(int i) {
			return getRuleContext(NoContext.class,i);
		}
		public List<NegContext> neg() {
			return getRuleContexts(NegContext.class);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicion);
		int _la;
		try {
			setState(325);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(217); no();
					}
				}

				setState(220); comparadores();
				setState(224);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(221); operadoresComp();
					setState(222); comparadores();
					}
				}

				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Y) {
					{
					{
					setState(226); ((CondicionContext)_localctx).Y = match(Y);
					t.crearTabla((((CondicionContext)_localctx).Y!=null?((CondicionContext)_localctx).Y.getLine():0),(((CondicionContext)_localctx).Y!=null?((CondicionContext)_localctx).Y.getText():null),"Palabra reservada","Bloque","",0,"");
					setState(229);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(228); neg();
						}
					}

					setState(231); comparadores();
					setState(235);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
						{
						setState(232); operadoresComp();
						setState(233); comparadores();
						}
					}

					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(242); no();
					}
				}

				setState(245); comparadores();
				setState(249);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(246); operadoresComp();
					setState(247); comparadores();
					}
				}

				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==O) {
					{
					{
					setState(251); ((CondicionContext)_localctx).O = match(O);
					t.crearTabla((((CondicionContext)_localctx).O!=null?((CondicionContext)_localctx).O.getLine():0),(((CondicionContext)_localctx).O!=null?((CondicionContext)_localctx).O.getText():null),"Palabra reservada","Bloque","",0,"");
					setState(254);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(253); neg();
						}
					}

					setState(256); comparadores();
					setState(260);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
						{
						setState(257); operadoresComp();
						setState(258); comparadores();
						}
					}

					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(267); no();
					}
				}

				setState(270); comparadores();
				setState(274);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(271); operadoresComp();
					setState(272); comparadores();
					}
				}

				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Y || _la==O) {
					{
					{
					setState(280);
					switch (_input.LA(1)) {
					case Y:
						{
						setState(276); ((CondicionContext)_localctx).Y = match(Y);
						t.crearTabla((((CondicionContext)_localctx).Y!=null?((CondicionContext)_localctx).Y.getLine():0),(((CondicionContext)_localctx).Y!=null?((CondicionContext)_localctx).Y.getText():null),"Palabra reservada","Bloque","",0,"");
						}
						break;
					case O:
						{
						setState(278); ((CondicionContext)_localctx).O = match(O);
						t.crearTabla((((CondicionContext)_localctx).O!=null?((CondicionContext)_localctx).O.getLine():0),(((CondicionContext)_localctx).O!=null?((CondicionContext)_localctx).O.getText():null),"Palabra reservada","Bloque","",0,"");
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(283);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(282); no();
						}
					}

					setState(285); comparadores();
					setState(289);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
						{
						setState(286); operadoresComp();
						setState(287); comparadores();
						}
					}

					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(296); no();
					}
				}

				setState(299); comparadores();
				setState(303);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(300); operadoresComp();
					setState(301); comparadores();
					}
				}

				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Y || _la==O) {
					{
					{
					setState(309);
					switch (_input.LA(1)) {
					case O:
						{
						setState(305); ((CondicionContext)_localctx).O = match(O);
						t.crearTabla((((CondicionContext)_localctx).O!=null?((CondicionContext)_localctx).O.getLine():0),(((CondicionContext)_localctx).O!=null?((CondicionContext)_localctx).O.getText():null),"Palabra reservada","Bloque","",0,"");
						}
						break;
					case Y:
						{
						setState(307); ((CondicionContext)_localctx).Y = match(Y);
						t.crearTabla((((CondicionContext)_localctx).Y!=null?((CondicionContext)_localctx).Y.getLine():0),(((CondicionContext)_localctx).Y!=null?((CondicionContext)_localctx).Y.getText():null),"Palabra reservada","Bloque","",0,"");
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(312);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(311); no();
						}
					}

					setState(314); comparadores();
					setState(318);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
						{
						setState(315); operadoresComp();
						setState(316); comparadores();
						}
					}

					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparadoresContext extends ParserRuleContext {
		public Token ID;
		public Token PAR_OP;
		public Token PAR_CLOSE;
		public Token NUMBER;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public ComparadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterComparadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitComparadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitComparadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparadoresContext comparadores() throws RecognitionException {
		ComparadoresContext _localctx = new ComparadoresContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparadores);
		try {
			setState(336);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(327); ((ComparadoresContext)_localctx).ID = match(ID);
				seEncuentra((((ComparadoresContext)_localctx).ID!=null?((ComparadoresContext)_localctx).ID.getText():null),(((ComparadoresContext)_localctx).ID!=null?((ComparadoresContext)_localctx).ID.getLine():0)); t.crearTabla((((ComparadoresContext)_localctx).ID!=null?((ComparadoresContext)_localctx).ID.getLine():0),(((ComparadoresContext)_localctx).ID!=null?((ComparadoresContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(329); ((ComparadoresContext)_localctx).PAR_OP = match(PAR_OP);
				setState(330); condicion();
				setState(331); ((ComparadoresContext)_localctx).PAR_CLOSE = match(PAR_CLOSE);
				t.crearTabla((((ComparadoresContext)_localctx).PAR_OP!=null?((ComparadoresContext)_localctx).PAR_OP.getLine():0),(((ComparadoresContext)_localctx).PAR_OP!=null?((ComparadoresContext)_localctx).PAR_OP.getText():null),"Separador","Bloque","",0,"");
							t.crearTabla((((ComparadoresContext)_localctx).PAR_CLOSE!=null?((ComparadoresContext)_localctx).PAR_CLOSE.getLine():0),(((ComparadoresContext)_localctx).PAR_CLOSE!=null?((ComparadoresContext)_localctx).PAR_CLOSE.getText():null),"Separador","Bloque","",0,"");
					
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(334); ((ComparadoresContext)_localctx).NUMBER = match(NUMBER);

						t.crearTabla((((ComparadoresContext)_localctx).NUMBER!=null?((ComparadoresContext)_localctx).NUMBER.getLine():0),(((ComparadoresContext)_localctx).NUMBER!=null?((ComparadoresContext)_localctx).NUMBER.getText():null),"Numero entero","Bloque","",0,"");
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EncasoContext extends ParserRuleContext {
		public Token EN_CASO;
		public Token ID;
		public Token DOS_PUNTOS;
		public Token CASO;
		public Token ROMPE;
		public Token PUNTO_COMA;
		public Token DEFECTO;
		public Token TERMINA_CASO;
		public TerminalNode DEFECTO() { return getToken(HelloParser.DEFECTO, 0); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(HelloParser.PUNTO_COMA, i);
		}
		public TerminalNode ROMPE(int i) {
			return getToken(HelloParser.ROMPE, i);
		}
		public TerminalNode TERMINA_CASO() { return getToken(HelloParser.TERMINA_CASO, 0); }
		public List<TerminalNode> DOS_PUNTOS() { return getTokens(HelloParser.DOS_PUNTOS); }
		public List<TerminalNode> PUNTO_COMA() { return getTokens(HelloParser.PUNTO_COMA); }
		public TerminalNode DOS_PUNTOS(int i) {
			return getToken(HelloParser.DOS_PUNTOS, i);
		}
		public CompCaseContext compCase(int i) {
			return getRuleContext(CompCaseContext.class,i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public List<CompCaseContext> compCase() {
			return getRuleContexts(CompCaseContext.class);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode EN_CASO() { return getToken(HelloParser.EN_CASO, 0); }
		public TerminalNode CASO(int i) {
			return getToken(HelloParser.CASO, i);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<TerminalNode> ROMPE() { return getTokens(HelloParser.ROMPE); }
		public List<TerminalNode> CASO() { return getTokens(HelloParser.CASO); }
		public EncasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterEncaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitEncaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitEncaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncasoContext encaso() throws RecognitionException {
		EncasoContext _localctx = new EncasoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_encaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); ((EncasoContext)_localctx).EN_CASO = match(EN_CASO);
			setState(339); ((EncasoContext)_localctx).ID = match(ID);
			seEncuentra((((EncasoContext)_localctx).ID!=null?((EncasoContext)_localctx).ID.getText():null),(((EncasoContext)_localctx).ID!=null?((EncasoContext)_localctx).ID.getLine():0));
			setState(341); ((EncasoContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
			setState(342); ((EncasoContext)_localctx).CASO = match(CASO);
			setState(343); compCase();
			setState(344); ((EncasoContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING) | (1L << EN_CASO) | (1L << REPITE) | (1L << MIENTRAS) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(345); bloque();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351); ((EncasoContext)_localctx).ROMPE = match(ROMPE);
			setState(352); ((EncasoContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

					
					t.crearTabla((((EncasoContext)_localctx).EN_CASO!=null?((EncasoContext)_localctx).EN_CASO.getLine():0),(((EncasoContext)_localctx).EN_CASO!=null?((EncasoContext)_localctx).EN_CASO.getText():null),"Palabra reservada","Bloque","",0,"");
					t.crearTabla((((EncasoContext)_localctx).ID!=null?((EncasoContext)_localctx).ID.getLine():0),(((EncasoContext)_localctx).ID!=null?((EncasoContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
					t.crearTabla((((EncasoContext)_localctx).DOS_PUNTOS!=null?((EncasoContext)_localctx).DOS_PUNTOS.getLine():0),(((EncasoContext)_localctx).DOS_PUNTOS!=null?((EncasoContext)_localctx).DOS_PUNTOS.getText():null),"Asignador","Bloque","",0,"");
					t.crearTabla((((EncasoContext)_localctx).CASO!=null?((EncasoContext)_localctx).CASO.getLine():0),(((EncasoContext)_localctx).CASO!=null?((EncasoContext)_localctx).CASO.getText():null),"Palabra reservada","Bloque","",0,"");
					t.crearTabla((((EncasoContext)_localctx).DOS_PUNTOS!=null?((EncasoContext)_localctx).DOS_PUNTOS.getLine():0),(((EncasoContext)_localctx).DOS_PUNTOS!=null?((EncasoContext)_localctx).DOS_PUNTOS.getText():null),"Asignador","Bloque","",0,"");
					t.crearTabla((((EncasoContext)_localctx).ROMPE!=null?((EncasoContext)_localctx).ROMPE.getLine():0),(((EncasoContext)_localctx).ROMPE!=null?((EncasoContext)_localctx).ROMPE.getText():null),"Palabra reservada","Bloque","",0,"");
					t.crearTabla((((EncasoContext)_localctx).PUNTO_COMA!=null?((EncasoContext)_localctx).PUNTO_COMA.getLine():0),(((EncasoContext)_localctx).PUNTO_COMA!=null?((EncasoContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
					
					
					
				
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASO) {
				{
				{
				setState(354); ((EncasoContext)_localctx).CASO = match(CASO);
				setState(355); compCase();
				setState(356); ((EncasoContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING) | (1L << EN_CASO) | (1L << REPITE) | (1L << MIENTRAS) | (1L << PARA) | (1L << ID))) != 0)) {
					{
					{
					setState(357); bloque();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363); ((EncasoContext)_localctx).ROMPE = match(ROMPE);
				setState(364); ((EncasoContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

							t.crearTabla((((EncasoContext)_localctx).CASO!=null?((EncasoContext)_localctx).CASO.getLine():0),(((EncasoContext)_localctx).CASO!=null?((EncasoContext)_localctx).CASO.getText():null),"Palabra reservada","Bloque","",0,"");
						t.crearTabla((((EncasoContext)_localctx).DOS_PUNTOS!=null?((EncasoContext)_localctx).DOS_PUNTOS.getLine():0),(((EncasoContext)_localctx).DOS_PUNTOS!=null?((EncasoContext)_localctx).DOS_PUNTOS.getText():null),"Asignador","Bloque","",0,"");
						t.crearTabla((((EncasoContext)_localctx).ROMPE!=null?((EncasoContext)_localctx).ROMPE.getLine():0),(((EncasoContext)_localctx).ROMPE!=null?((EncasoContext)_localctx).ROMPE.getText():null),"Palabra reservada","Bloque","",0,"");
						t.crearTabla((((EncasoContext)_localctx).PUNTO_COMA!=null?((EncasoContext)_localctx).PUNTO_COMA.getLine():0),(((EncasoContext)_localctx).PUNTO_COMA!=null?((EncasoContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
							
							
						
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372); ((EncasoContext)_localctx).DEFECTO = match(DEFECTO);
			setState(373); ((EncasoContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING) | (1L << EN_CASO) | (1L << REPITE) | (1L << MIENTRAS) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(374); bloque();
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380); ((EncasoContext)_localctx).ROMPE = match(ROMPE);
			setState(381); ((EncasoContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);
			setState(382); ((EncasoContext)_localctx).TERMINA_CASO = match(TERMINA_CASO);
			setState(383); ((EncasoContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

					
					
					t.crearTabla((((EncasoContext)_localctx).DEFECTO!=null?((EncasoContext)_localctx).DEFECTO.getLine():0),(((EncasoContext)_localctx).DEFECTO!=null?((EncasoContext)_localctx).DEFECTO.getText():null),"Palabra reservada","Bloque","",0,"");
					t.crearTabla((((EncasoContext)_localctx).DOS_PUNTOS!=null?((EncasoContext)_localctx).DOS_PUNTOS.getLine():0),(((EncasoContext)_localctx).DOS_PUNTOS!=null?((EncasoContext)_localctx).DOS_PUNTOS.getText():null),"Asignador","Bloque","",0,"");
					t.crearTabla((((EncasoContext)_localctx).ROMPE!=null?((EncasoContext)_localctx).ROMPE.getLine():0),(((EncasoContext)_localctx).ROMPE!=null?((EncasoContext)_localctx).ROMPE.getText():null),"Palabra reservada","Bloque","",0,"");
					t.crearTabla((((EncasoContext)_localctx).PUNTO_COMA!=null?((EncasoContext)_localctx).PUNTO_COMA.getLine():0),(((EncasoContext)_localctx).PUNTO_COMA!=null?((EncasoContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
					t.crearTabla((((EncasoContext)_localctx).TERMINA_CASO!=null?((EncasoContext)_localctx).TERMINA_CASO.getLine():0),(((EncasoContext)_localctx).TERMINA_CASO!=null?((EncasoContext)_localctx).TERMINA_CASO.getText():null),"Palabra reservada","Bloque","",0,"");
					t.crearTabla((((EncasoContext)_localctx).PUNTO_COMA!=null?((EncasoContext)_localctx).PUNTO_COMA.getLine():0),(((EncasoContext)_localctx).PUNTO_COMA!=null?((EncasoContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
					
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompCaseContext extends ParserRuleContext {
		public Token ID;
		public Token CAR;
		public Token NUMBER;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode CAR() { return getToken(HelloParser.CAR, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public CompCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCompCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCompCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCompCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompCaseContext compCase() throws RecognitionException {
		CompCaseContext _localctx = new CompCaseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compCase);
		try {
			setState(392);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(386); ((CompCaseContext)_localctx).ID = match(ID);
				seEncuentra((((CompCaseContext)_localctx).ID!=null?((CompCaseContext)_localctx).ID.getText():null),(((CompCaseContext)_localctx).ID!=null?((CompCaseContext)_localctx).ID.getLine():0));
						t.crearTabla((((CompCaseContext)_localctx).ID!=null?((CompCaseContext)_localctx).ID.getLine():0),(((CompCaseContext)_localctx).ID!=null?((CompCaseContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
						
					
				}
				break;
			case CAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(388); ((CompCaseContext)_localctx).CAR = match(CAR);

						t.crearTabla((((CompCaseContext)_localctx).CAR!=null?((CompCaseContext)_localctx).CAR.getLine():0),(((CompCaseContext)_localctx).CAR!=null?((CompCaseContext)_localctx).CAR.getText():null),"Caracter","Bloque","",0,"");
					
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(390); ((CompCaseContext)_localctx).NUMBER = match(NUMBER);

						t.crearTabla((((CompCaseContext)_localctx).NUMBER!=null?((CompCaseContext)_localctx).NUMBER.getLine():0),(((CompCaseContext)_localctx).NUMBER!=null?((CompCaseContext)_localctx).NUMBER.getText():null),"Numero entero","Bloque","",0,"");
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SiContext extends ParserRuleContext {
		public Token SI;
		public Token PAR_OP;
		public Token PAR_CLOSE;
		public Token ENTONCES;
		public Token SINO;
		public Token TERMINA_SI;
		public Token PUNTO_COMA;
		public TerminalNode TERMINA_SI() { return getToken(HelloParser.TERMINA_SI, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public CompSiContext compSi() {
			return getRuleContext(CompSiContext.class,0);
		}
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
		public TerminalNode SI() { return getToken(HelloParser.SI, 0); }
		public TerminalNode ENTONCES() { return getToken(HelloParser.ENTONCES, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode SINO() { return getToken(HelloParser.SINO, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); ((SiContext)_localctx).SI = match(SI);
			setState(395); ((SiContext)_localctx).PAR_OP = match(PAR_OP);

					t.crearTabla((((SiContext)_localctx).SI!=null?((SiContext)_localctx).SI.getLine():0),(((SiContext)_localctx).SI!=null?((SiContext)_localctx).SI.getText():null),"Palabra reservada","Bloque","",0,"");
					t.crearTabla((((SiContext)_localctx).PAR_OP!=null?((SiContext)_localctx).PAR_OP.getLine():0),(((SiContext)_localctx).PAR_OP!=null?((SiContext)_localctx).PAR_OP.getText():null),"Separador","Bloque","",0,"");	
					
				
			setState(397); compSi();
			setState(398); ((SiContext)_localctx).PAR_CLOSE = match(PAR_CLOSE);
			setState(399); ((SiContext)_localctx).ENTONCES = match(ENTONCES);

						t.crearTabla((((SiContext)_localctx).PAR_CLOSE!=null?((SiContext)_localctx).PAR_CLOSE.getLine():0),(((SiContext)_localctx).PAR_CLOSE!=null?((SiContext)_localctx).PAR_CLOSE.getText():null),"Separador","Bloque","",0,"");
					t.crearTabla((((SiContext)_localctx).ENTONCES!=null?((SiContext)_localctx).ENTONCES.getLine():0),(((SiContext)_localctx).ENTONCES!=null?((SiContext)_localctx).ENTONCES.getText():null),"Palabra reservada","Bloque","",0,"");	
				
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING) | (1L << EN_CASO) | (1L << REPITE) | (1L << MIENTRAS) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(401); bloque();
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407); ((SiContext)_localctx).SINO = match(SINO);

							t.programa.append("jmp .done"+Integer.toString(done)+"\n");
							t.programa.append(".else"+Integer.toString(cIf)+": \n");
							t.crearTabla((((SiContext)_localctx).SINO!=null?((SiContext)_localctx).SINO.getLine():0),(((SiContext)_localctx).SINO!=null?((SiContext)_localctx).SINO.getText():null),"Palabra reservada","Bloque","",0,"");
					
				
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING) | (1L << EN_CASO) | (1L << REPITE) | (1L << MIENTRAS) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(409); bloque();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415); ((SiContext)_localctx).TERMINA_SI = match(TERMINA_SI);
			setState(416); ((SiContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

					
					
				
					
					t.crearTabla((((SiContext)_localctx).TERMINA_SI!=null?((SiContext)_localctx).TERMINA_SI.getLine():0),(((SiContext)_localctx).TERMINA_SI!=null?((SiContext)_localctx).TERMINA_SI.getText():null),"Palabra reservada","Bloque","",0,"");
					t.crearTabla((((SiContext)_localctx).PUNTO_COMA!=null?((SiContext)_localctx).PUNTO_COMA.getLine():0),(((SiContext)_localctx).PUNTO_COMA!=null?((SiContext)_localctx).PUNTO_COMA.getText():null),"Palabra reservada","Bloque","",0,"");
					
					
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SistandContext extends ParserRuleContext {
		public Token SI;
		public Token PAR_OP;
		public Token PAR_CLOSE;
		public Token ENTONCES;
		public Token TERMINA_SI;
		public Token PUNTO_COMA;
		public TerminalNode TERMINA_SI() { return getToken(HelloParser.TERMINA_SI, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
		public TerminalNode SI() { return getToken(HelloParser.SI, 0); }
		public CompSi2Context compSi2() {
			return getRuleContext(CompSi2Context.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(HelloParser.ENTONCES, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public SistandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sistand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSistand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSistand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSistand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SistandContext sistand() throws RecognitionException {
		SistandContext _localctx = new SistandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sistand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); ((SistandContext)_localctx).SI = match(SI);
			setState(420); ((SistandContext)_localctx).PAR_OP = match(PAR_OP);

					
						t.crearTabla((((SistandContext)_localctx).SI!=null?((SistandContext)_localctx).SI.getLine():0),(((SistandContext)_localctx).SI!=null?((SistandContext)_localctx).SI.getText():null),"Palabra reservada","Bloque","",0,"");
					t.crearTabla((((SistandContext)_localctx).PAR_OP!=null?((SistandContext)_localctx).PAR_OP.getLine():0),(((SistandContext)_localctx).PAR_OP!=null?((SistandContext)_localctx).PAR_OP.getText():null),"Separador","Bloque","",0,"");
					
				
			setState(422); compSi2();
			setState(423); ((SistandContext)_localctx).PAR_CLOSE = match(PAR_CLOSE);
			setState(424); ((SistandContext)_localctx).ENTONCES = match(ENTONCES);

					
					t.crearTabla((((SistandContext)_localctx).PAR_CLOSE!=null?((SistandContext)_localctx).PAR_CLOSE.getLine():0),(((SistandContext)_localctx).PAR_CLOSE!=null?((SistandContext)_localctx).PAR_CLOSE.getText():null),"Separador","Bloque","",0,"");
					t.crearTabla((((SistandContext)_localctx).ENTONCES!=null?((SistandContext)_localctx).ENTONCES.getLine():0),(((SistandContext)_localctx).ENTONCES!=null?((SistandContext)_localctx).ENTONCES.getText():null),"Palabra reservada","Bloque","",0,"");	
				
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING) | (1L << EN_CASO) | (1L << REPITE) | (1L << MIENTRAS) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(426); bloque();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432); ((SistandContext)_localctx).TERMINA_SI = match(TERMINA_SI);
			setState(433); ((SistandContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

				
					
					t.crearTabla((((SistandContext)_localctx).TERMINA_SI!=null?((SistandContext)_localctx).TERMINA_SI.getLine():0),(((SistandContext)_localctx).TERMINA_SI!=null?((SistandContext)_localctx).TERMINA_SI.getText():null),"Palabra reservada","Bloque","",0,"");
					t.crearTabla((((SistandContext)_localctx).PUNTO_COMA!=null?((SistandContext)_localctx).PUNTO_COMA.getLine():0),(((SistandContext)_localctx).PUNTO_COMA!=null?((SistandContext)_localctx).PUNTO_COMA.getText():null),"Palabra reservada","Bloque","",0,"");
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegContext extends ParserRuleContext {
		public Token NO;
		public TerminalNode NO() { return getToken(HelloParser.NO, 0); }
		public NegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegContext neg() throws RecognitionException {
		NegContext _localctx = new NegContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_neg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436); ((NegContext)_localctx).NO = match(NO);
			hayNeg=true;
					t.crearTabla((((NegContext)_localctx).NO!=null?((NegContext)_localctx).NO.getLine():0),(((NegContext)_localctx).NO!=null?((NegContext)_localctx).NO.getText():null),"Palabra reservada","Bloque","",0,"");
					
					
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompSiContext extends ParserRuleContext {
		public OperadoresCompContext operadoresComp;
		public Token Y;
		public Token O;
		public NegContext neg(int i) {
			return getRuleContext(NegContext.class,i);
		}
		public TerminalNode O(int i) {
			return getToken(HelloParser.O, i);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public List<TerminalNode> Y() { return getTokens(HelloParser.Y); }
		public OperadoresCompContext operadoresComp(int i) {
			return getRuleContext(OperadoresCompContext.class,i);
		}
		public TerminalNode Y(int i) {
			return getToken(HelloParser.Y, i);
		}
		public List<TerminalNode> O() { return getTokens(HelloParser.O); }
		public List<OperadoresCompContext> operadoresComp() {
			return getRuleContexts(OperadoresCompContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<NegContext> neg() {
			return getRuleContexts(NegContext.class);
		}
		public CompSiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compSi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCompSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCompSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCompSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompSiContext compSi() throws RecognitionException {
		CompSiContext _localctx = new CompSiContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compSi);
		int _la;
		try {
			setState(561);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(439); neg();
					}
				}

				setState(442); valor();
				setState(447);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(443); ((CompSiContext)_localctx).operadoresComp = operadoresComp();
					setState(444); valor();

							t.programa.append("pop eax\n");
							t.programa.append("pop ebx\n");
							t.programa.append("cmp ebx,eax\n");
							
							
							if(hayNeg){
								
								if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
								t.programa.append("jl .else"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jg .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jle .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jge .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("je .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("jne .else"+Integer.toString(cIf)+"\n");
								}
								
								
								
								
								
								hayNeg=false;
							}else{
											if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
									t.programa.append("jnl .else"+Integer.toString(cIf)+"\n");		
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jng .else"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jnle .else"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jnge .else"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("jne .else"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("je .else"+Integer.toString(cIf)+"\n");	
								}
								
								
							}
							
							
						
					}
				}

				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Y) {
					{
					{
					setState(449); ((CompSiContext)_localctx).Y = match(Y);
					t.crearTabla((((CompSiContext)_localctx).Y!=null?((CompSiContext)_localctx).Y.getLine():0),(((CompSiContext)_localctx).Y!=null?((CompSiContext)_localctx).Y.getText():null),"Palabra reservada","Bloque","",0,"");
					setState(452);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(451); neg();
						}
					}

					setState(454); valor();
					setState(459);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
						{
						setState(455); ((CompSiContext)_localctx).operadoresComp = operadoresComp();
						setState(456); valor();
								
								t.programa.append("pop eax\n");
								t.programa.append("pop ebx\n");
								t.programa.append("cmp ebx,eax\n");
								
								
								if(hayNeg){
												if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
										t.programa.append("jl .else"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jg .else"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jle .else"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jge .else"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("je .else"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("jne .else"+Integer.toString(cIf)+"\n");
									}
									
									
									hayNeg=false;
								
								}else{
												if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
										t.programa.append("jnl .else"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jng .else"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jnle .else"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jnge .else"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("jne .else"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("je .else"+Integer.toString(cIf)+"\n");
									}
									
									
								
								}
									
								
								
								
								
								
						}
					}

					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(466); neg();
					}
				}

				setState(469); valor();
				setState(474);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(470); ((CompSiContext)_localctx).operadoresComp = operadoresComp();
					setState(471); valor();

							t.programa.append("pop eax\n");
							t.programa.append("pop ebx\n");
							t.programa.append("cmp ebx,eax\n");
							
							
							if(hayNeg){
											if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
								t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
								}
								
								
								hayNeg=false;
							}else{
											if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
									t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
								}
								
							
							}
							
							
						
					}
				}

				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==O) {
					{
					{
					setState(476); ((CompSiContext)_localctx).O = match(O);
					t.crearTabla((((CompSiContext)_localctx).O!=null?((CompSiContext)_localctx).O.getLine():0),(((CompSiContext)_localctx).O!=null?((CompSiContext)_localctx).O.getText():null),"Palabra reservada","Bloque","",0,"");
					setState(479);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(478); neg();
						}
					}

					setState(481); valor();
					setState(486);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
						{
						setState(482); ((CompSiContext)_localctx).operadoresComp = operadoresComp();
						setState(483); valor();
								
								t.programa.append("pop eax\n");
								t.programa.append("pop ebx\n");
								t.programa.append("cmp ebx,eax\n");
								
								
								if(hayNeg){
									
												if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
									t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");			
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");	
									}
									
									
								
								hayNeg=false;
								}
								else{
												if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
									t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");		
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
									}
									
									
									
									
								
								}
								
								
								
								
						}
					}

					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
					t.programa.append("jmp .else"+Integer.toString(cIf)+"\n");
							t.programa.append(".elseIF"+Integer.toString(cIf)+":\n");
							
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(495); neg();
					}
				}

				setState(498); valor();
				setState(503);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(499); ((CompSiContext)_localctx).operadoresComp = operadoresComp();
					setState(500); valor();

							t.programa.append("pop eax\n");
							t.programa.append("pop ebx\n");
							t.programa.append("cmp ebx,eax\n");
							
							if(hayNeg){
								
											if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
								t.programa.append("jl .else"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jg .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jle .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jge .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("je .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("jne .else"+Integer.toString(cIf)+"\n");
								}
								
								
								
								hayNeg=false;
							}else{
								
											if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
								t.programa.append("jnl .else"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jng .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jnle .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jnge .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("jne .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("je .else"+Integer.toString(cIf)+"\n");
								}
								
								
								
							}
						
							
						
					}
				}

				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Y || _la==O) {
					{
					{
					setState(509);
					switch (_input.LA(1)) {
					case Y:
						{
						setState(505); ((CompSiContext)_localctx).Y = match(Y);
						t.crearTabla((((CompSiContext)_localctx).Y!=null?((CompSiContext)_localctx).Y.getLine():0),(((CompSiContext)_localctx).Y!=null?((CompSiContext)_localctx).Y.getText():null),"Palabra reservada","Bloque","",0,"");
						}
						break;
					case O:
						{
						setState(507); ((CompSiContext)_localctx).O = match(O);
						t.crearTabla((((CompSiContext)_localctx).O!=null?((CompSiContext)_localctx).O.getLine():0),(((CompSiContext)_localctx).O!=null?((CompSiContext)_localctx).O.getText():null),"Palabra reservada","Bloque","",0,"");
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(512);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(511); neg();
						}
					}

					setState(514); valor();
					setState(519);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
						{
						setState(515); ((CompSiContext)_localctx).operadoresComp = operadoresComp();
						setState(516); valor();
								
								t.programa.append("pop eax\n");
								t.programa.append("pop ebx\n");
								t.programa.append("cmp ebx,eax\n");
								
								
								if(hayNeg){
									
												if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
										t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
									}
									
									
									
									
									hayNeg=false;
								}else{
									
												if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
										t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
									}
									
									
									
									
										
								}
								
								
								
								
								
								
						}
					}

					}
					}
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							t.programa.append("jmp .else"+Integer.toString(cIf)+"\n");
							t.programa.append(".elseIF"+Integer.toString(cIf)+":\n");
						
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(528); neg();
					}
				}

				setState(531); valor();
				setState(536);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(532); ((CompSiContext)_localctx).operadoresComp = operadoresComp();
					setState(533); valor();

							
							t.programa.append("pop eax\n");
							t.programa.append("pop ebx\n");
							t.programa.append("cmp ebx,eax\n");
							
							if(hayNeg){
								
											if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
								t.programa.append("jnl .else"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jng .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jnle .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jnge .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("jne .else"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("je .else"+Integer.toString(cIf)+"\n");
								}
								
								
								
								
								
								hayNeg=false;
							}else{
								
											if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
								t.programa.append("jl .else"+Integer.toString(cIf)+"\n");		
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
								t.programa.append("jg .else"+Integer.toString(cIf)+"\n");		
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jle .else"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jge .else"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("je .else"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("jne .else"+Integer.toString(cIf)+"\n");	
								}
								
								
								
							}
							
							
							
						
					}
				}

				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Y || _la==O) {
					{
					{
					setState(542);
					switch (_input.LA(1)) {
					case O:
						{
						setState(538); ((CompSiContext)_localctx).O = match(O);
						t.crearTabla((((CompSiContext)_localctx).O!=null?((CompSiContext)_localctx).O.getLine():0),(((CompSiContext)_localctx).O!=null?((CompSiContext)_localctx).O.getText():null),"Palabra reservada","Bloque","",0,"");
						}
						break;
					case Y:
						{
						setState(540); ((CompSiContext)_localctx).Y = match(Y);
						t.crearTabla((((CompSiContext)_localctx).Y!=null?((CompSiContext)_localctx).Y.getLine():0),(((CompSiContext)_localctx).Y!=null?((CompSiContext)_localctx).Y.getText():null),"Palabra reservada","Bloque","",0,"");
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(545);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(544); neg();
						}
					}

					setState(547); valor();
					setState(552);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
						{
						setState(548); ((CompSiContext)_localctx).operadoresComp = operadoresComp();
						setState(549); valor();
							
									
								t.programa.append("pop eax\n");
								t.programa.append("pop ebx\n");
								t.programa.append("cmp ebx,eax\n");
								
								if(hayNeg){
									
												if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
										t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
									}
									
									
									
									
									hayNeg=false;
									
								}else{
												if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<")){
									t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");			
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSiContext)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");	
									}
									
									
									
								
								}

								
								
								
								
						}
					}

					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							t.programa.append("jmp .else"+Integer.toString(cIf)+"\n");
							t.programa.append(".elseIF"+Integer.toString(cIf)+":\n");
						
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompSi2Context extends ParserRuleContext {
		public OperadoresCompContext operadoresComp;
		public Token Y;
		public Token O;
		public NegContext neg(int i) {
			return getRuleContext(NegContext.class,i);
		}
		public TerminalNode O(int i) {
			return getToken(HelloParser.O, i);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public List<TerminalNode> Y() { return getTokens(HelloParser.Y); }
		public OperadoresCompContext operadoresComp(int i) {
			return getRuleContext(OperadoresCompContext.class,i);
		}
		public TerminalNode Y(int i) {
			return getToken(HelloParser.Y, i);
		}
		public List<TerminalNode> O() { return getTokens(HelloParser.O); }
		public List<OperadoresCompContext> operadoresComp() {
			return getRuleContexts(OperadoresCompContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<NegContext> neg() {
			return getRuleContexts(NegContext.class);
		}
		public CompSi2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compSi2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCompSi2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCompSi2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCompSi2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompSi2Context compSi2() throws RecognitionException {
		CompSi2Context _localctx = new CompSi2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_compSi2);
		int _la;
		try {
			setState(685);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(563); neg();
					}
				}

				setState(566); valor();
				setState(571);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(567); ((CompSi2Context)_localctx).operadoresComp = operadoresComp();
					setState(568); valor();

							t.programa.append("pop eax\n");
							t.programa.append("pop ebx\n");
							t.programa.append("cmp ebx,eax\n");
							
							if(hayNeg){
								
											if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
								t.programa.append("jl .done"+Integer.toString(done)+"\n");	
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jg .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jle .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jge .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("je .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("jne .done"+Integer.toString(done)+"\n");
								}
								
								
								
								hayNeg=false;
							}
							else{
								
											if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
								t.programa.append("jnl .done"+Integer.toString(done)+"\n");	
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jng .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jnle .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jnge .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("jne .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("je .done"+Integer.toString(done)+"\n");
								}
								
								
									
							}
							
							
						
					}
				}

				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Y) {
					{
					{
					setState(573); ((CompSi2Context)_localctx).Y = match(Y);
					t.crearTabla((((CompSi2Context)_localctx).Y!=null?((CompSi2Context)_localctx).Y.getLine():0),(((CompSi2Context)_localctx).Y!=null?((CompSi2Context)_localctx).Y.getText():null),"Palabra reservada","Bloque","",0,"");
					setState(576);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(575); neg();
						}
					}

					setState(578); valor();
					setState(583);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
						{
						setState(579); ((CompSi2Context)_localctx).operadoresComp = operadoresComp();
						setState(580); valor();
								
								t.programa.append("pop eax\n");
								t.programa.append("pop ebx\n");
								t.programa.append("cmp ebx,eax\n");
								
								if(hayNeg){
									
												if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
									t.programa.append("jl .done"+Integer.toString(done)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jg .done"+Integer.toString(done)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jle .done"+Integer.toString(done)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jge .done"+Integer.toString(done)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("je .done"+Integer.toString(done)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("jne .done"+Integer.toString(done)+"\n");
									}
									
									
									
									hayNeg=false;
								}
								else{
									
									
												if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
													
									t.programa.append("jnl .done"+Integer.toString(done)+"\n");
										
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
										
									t.programa.append("jng .done"+Integer.toString(done)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
										
									t.programa.append("jnle .done"+Integer.toString(done)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
										
									t.programa.append("jnge .done"+Integer.toString(done)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
										
									t.programa.append("jne .done"+Integer.toString(done)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
										
									t.programa.append("je .done"+Integer.toString(done)+"\n");
									}
									
									
											
								}

							
								
								
								
								
								
						}
					}

					}
					}
					setState(589);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(590); neg();
					}
				}

				setState(593); valor();
				setState(598);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(594); ((CompSi2Context)_localctx).operadoresComp = operadoresComp();
					setState(595); valor();

							t.programa.append("pop eax\n");
							t.programa.append("pop ebx\n");
							t.programa.append("cmp ebx,eax\n");
							
							if(hayNeg){
								
											if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
								t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
								}
								
								
								
								
								hayNeg=false;
							}
							else{
								
											if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
								
								t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");		
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");	
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");	
								}
								
								
								
							}
							
							
							
						
					}
				}

				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==O) {
					{
					{
					setState(600); ((CompSi2Context)_localctx).O = match(O);
					t.crearTabla((((CompSi2Context)_localctx).O!=null?((CompSi2Context)_localctx).O.getLine():0),(((CompSi2Context)_localctx).O!=null?((CompSi2Context)_localctx).O.getText():null),"Palabra reservada","Bloque","",0,"");
					setState(603);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(602); neg();
						}
					}

					setState(605); valor();
					setState(610);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
						{
						setState(606); ((CompSi2Context)_localctx).operadoresComp = operadoresComp();
						setState(607); valor();
								
								t.programa.append("pop eax\n");
								t.programa.append("pop ebx\n");
								t.programa.append("cmp ebx,eax\n");
								
								if(hayNeg){
									
									
												if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
										t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
									}
									
									
									
									hayNeg=false;
								}
								else{
									
												if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
									
										t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");		
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");	
										
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");	
									}
									
									
									
								}
								
								
								
								
								
								
								
						}
					}

					}
					}
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
					t.programa.append("jmp .done"+Integer.toString(done)+"\n");
							t.programa.append(".elseIF"+Integer.toString(cIf)+":\n");
							
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(620);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(619); neg();
					}
				}

				setState(622); valor();
				setState(627);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(623); ((CompSi2Context)_localctx).operadoresComp = operadoresComp();
					setState(624); valor();

							t.programa.append("pop eax\n");
							t.programa.append("pop ebx\n");
							t.programa.append("cmp ebx,eax\n");
							
							if(hayNeg){
								
											if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
									t.programa.append("jl .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jg .done"+Integer.toString(done)+"\n");
									
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jle .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jge .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("je .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("jne .done"+Integer.toString(done)+"\n");
								}
								
								
								
								
								hayNeg=false;
							}
							else{
								
								if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
									t.programa.append("jnl .done"+Integer.toString(done)+"\n");	
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jng .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jnle .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jnge .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("jne .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("je .done"+Integer.toString(done)+"\n");
								}
								
								
									
							}
							
							
							
						
					}
				}

				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Y || _la==O) {
					{
					{
					setState(633);
					switch (_input.LA(1)) {
					case Y:
						{
						setState(629); ((CompSi2Context)_localctx).Y = match(Y);
						t.crearTabla((((CompSi2Context)_localctx).Y!=null?((CompSi2Context)_localctx).Y.getLine():0),(((CompSi2Context)_localctx).Y!=null?((CompSi2Context)_localctx).Y.getText():null),"Palabra reservada","Bloque","",0,"");
						}
						break;
					case O:
						{
						setState(631); ((CompSi2Context)_localctx).O = match(O);
						t.crearTabla((((CompSi2Context)_localctx).O!=null?((CompSi2Context)_localctx).O.getLine():0),(((CompSi2Context)_localctx).O!=null?((CompSi2Context)_localctx).O.getText():null),"Palabra reservada","Bloque","",0,"");
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(636);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(635); neg();
						}
					}

					setState(638); valor();
					setState(643);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
						{
						setState(639); ((CompSi2Context)_localctx).operadoresComp = operadoresComp();
						setState(640); valor();
								
								t.programa.append("pop eax\n");
								t.programa.append("pop ebx\n");
								t.programa.append("cmp ebx,eax\n");
								
								
								if(hayNeg){
									
									if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
										t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
									}
									
									
									
									
									hayNeg=false;
								}
								else{
									
												if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
									
										t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");		
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");	
									}
									
									
									
								}
								
								
								
								
								
								
						}
					}

					}
					}
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							t.programa.append("jmp .done"+Integer.toString(done)+"\n");
							t.programa.append(".elseIF"+Integer.toString(cIf)+":");
						
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(653);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(652); neg();
					}
				}

				setState(655); valor();
				setState(660);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(656); ((CompSi2Context)_localctx).operadoresComp = operadoresComp();
					setState(657); valor();

							
							t.programa.append("pop eax\n");
							t.programa.append("pop ebx\n");
							t.programa.append("cmp ebx,eax\n");
							
							if(hayNeg){
								
								if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
								t.programa.append("jnl .done"+Integer.toString(done)+"\n");	
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jng .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jnle .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jnge .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("jne .done"+Integer.toString(done)+"\n");
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("je .done"+Integer.toString(done)+"\n");
								}
								
								
								
								
								hayNeg=false;
							}
							else{
								
								if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
									t.programa.append("jl .done"+Integer.toString(done)+"\n");		
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
									t.programa.append("jg .done"+Integer.toString(done)+"\n");	
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
									t.programa.append("jle .done"+Integer.toString(done)+"\n");	
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
									t.programa.append("jge .done"+Integer.toString(done)+"\n");	
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
									t.programa.append("je .done"+Integer.toString(done)+"\n");	
								}
								else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
									t.programa.append("jne .done"+Integer.toString(done)+"\n");	
								}
								
								
								
								
							}
							
							
						
					}
				}

				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Y || _la==O) {
					{
					{
					setState(666);
					switch (_input.LA(1)) {
					case O:
						{
						setState(662); ((CompSi2Context)_localctx).O = match(O);
						t.crearTabla((((CompSi2Context)_localctx).O!=null?((CompSi2Context)_localctx).O.getLine():0),(((CompSi2Context)_localctx).O!=null?((CompSi2Context)_localctx).O.getText():null),"Palabra reservada","Bloque","",0,"");
						}
						break;
					case Y:
						{
						setState(664); ((CompSi2Context)_localctx).Y = match(Y);
						t.crearTabla((((CompSi2Context)_localctx).Y!=null?((CompSi2Context)_localctx).Y.getLine():0),(((CompSi2Context)_localctx).Y!=null?((CompSi2Context)_localctx).Y.getText():null),"Palabra reservada","Bloque","",0,"");
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(669);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(668); neg();
						}
					}

					setState(671); valor();
					setState(676);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
						{
						setState(672); ((CompSi2Context)_localctx).operadoresComp = operadoresComp();
						setState(673); valor();
							
									
								t.programa.append("pop eax\n");
								t.programa.append("pop ebx\n");
								t.programa.append("cmp ebx,eax\n");
								
								if(hayNeg){
									
									if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
										t.programa.append("jnl .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jng .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jnle .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jnge .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");	
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");	
									}
									
									
									
									hayNeg=false;
								}
								else{
									
									if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<")){
										t.programa.append("jl .elseIF"+Integer.toString(cIf)+"\n");		
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">")){
										t.programa.append("jg .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("<=")){
										t.programa.append("jle .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals(">=")){
										t.programa.append("jge .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("==")){
										t.programa.append("je .elseIF"+Integer.toString(cIf)+"\n");
									}
									else if(((CompSi2Context)_localctx).operadoresComp.value.toString().equals("!=")){
										t.programa.append("jne .elseIF"+Integer.toString(cIf)+"\n");
									}
									
									
									
								}
								
								
								
								
						}
					}

					}
					}
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							t.programa.append("jmp .done"+Integer.toString(done)+"\n");
							t.programa.append(".elseIF"+Integer.toString(cIf)+":\n");
						
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadoresCompContext extends ParserRuleContext {
		public Object value;
		public Token GT;
		public Token LT;
		public Token GEQ;
		public Token LEQ;
		public Token EQ;
		public Token NEQ;
		public TerminalNode GEQ() { return getToken(HelloParser.GEQ, 0); }
		public TerminalNode NEQ() { return getToken(HelloParser.NEQ, 0); }
		public TerminalNode LEQ() { return getToken(HelloParser.LEQ, 0); }
		public TerminalNode LT() { return getToken(HelloParser.LT, 0); }
		public TerminalNode GT() { return getToken(HelloParser.GT, 0); }
		public TerminalNode EQ() { return getToken(HelloParser.EQ, 0); }
		public OperadoresCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoresComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOperadoresComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOperadoresComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitOperadoresComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoresCompContext operadoresComp() throws RecognitionException {
		OperadoresCompContext _localctx = new OperadoresCompContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operadoresComp);
		try {
			setState(699);
			switch (_input.LA(1)) {
			case GT:
				enterOuterAlt(_localctx, 1);
				{
				setState(687); ((OperadoresCompContext)_localctx).GT = match(GT);
				((OperadoresCompContext)_localctx).value = (((OperadoresCompContext)_localctx).GT!=null?((OperadoresCompContext)_localctx).GT.getText():null); t.crearTabla((((OperadoresCompContext)_localctx).GT!=null?((OperadoresCompContext)_localctx).GT.getLine():0),(((OperadoresCompContext)_localctx).GT!=null?((OperadoresCompContext)_localctx).GT.getText():null),"Comparador","Bloque","",0,"");
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(689); ((OperadoresCompContext)_localctx).LT = match(LT);
				((OperadoresCompContext)_localctx).value = (((OperadoresCompContext)_localctx).LT!=null?((OperadoresCompContext)_localctx).LT.getText():null); t.crearTabla((((OperadoresCompContext)_localctx).LT!=null?((OperadoresCompContext)_localctx).LT.getLine():0),(((OperadoresCompContext)_localctx).LT!=null?((OperadoresCompContext)_localctx).LT.getText():null),"Comparador","Bloque","",0,"");
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(691); ((OperadoresCompContext)_localctx).GEQ = match(GEQ);
				((OperadoresCompContext)_localctx).value = (((OperadoresCompContext)_localctx).GEQ!=null?((OperadoresCompContext)_localctx).GEQ.getText():null); t.crearTabla((((OperadoresCompContext)_localctx).GEQ!=null?((OperadoresCompContext)_localctx).GEQ.getLine():0),(((OperadoresCompContext)_localctx).GEQ!=null?((OperadoresCompContext)_localctx).GEQ.getText():null),"Comparador","Bloque","",0,"");
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(693); ((OperadoresCompContext)_localctx).LEQ = match(LEQ);
				((OperadoresCompContext)_localctx).value = (((OperadoresCompContext)_localctx).LEQ!=null?((OperadoresCompContext)_localctx).LEQ.getText():null); t.crearTabla((((OperadoresCompContext)_localctx).LEQ!=null?((OperadoresCompContext)_localctx).LEQ.getLine():0),(((OperadoresCompContext)_localctx).LEQ!=null?((OperadoresCompContext)_localctx).LEQ.getText():null),"Comparador","Bloque","",0,"");
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(695); ((OperadoresCompContext)_localctx).EQ = match(EQ);
				((OperadoresCompContext)_localctx).value = (((OperadoresCompContext)_localctx).EQ!=null?((OperadoresCompContext)_localctx).EQ.getText():null); t.crearTabla((((OperadoresCompContext)_localctx).EQ!=null?((OperadoresCompContext)_localctx).EQ.getLine():0),(((OperadoresCompContext)_localctx).EQ!=null?((OperadoresCompContext)_localctx).EQ.getText():null),"Comparador","Bloque","",0,"");
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(697); ((OperadoresCompContext)_localctx).NEQ = match(NEQ);
				((OperadoresCompContext)_localctx).value = (((OperadoresCompContext)_localctx).NEQ!=null?((OperadoresCompContext)_localctx).NEQ.getText():null); t.crearTabla((((OperadoresCompContext)_localctx).NEQ!=null?((OperadoresCompContext)_localctx).NEQ.getLine():0),(((OperadoresCompContext)_localctx).NEQ!=null?((OperadoresCompContext)_localctx).NEQ.getText():null),"Comparador","Bloque","",0,"");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public Token NUMBER;
		public Token PAR_OP;
		public Token PAR_CLOSE;
		public Token ID;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public CompSiContext compSi() {
			return getRuleContext(CompSiContext.class,0);
		}
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_valor);
		try {
			setState(710);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(701); ((ValorContext)_localctx).NUMBER = match(NUMBER);
				t.programa.append("push "+(((ValorContext)_localctx).NUMBER!=null?((ValorContext)_localctx).NUMBER.getText():null)+"\n"); t.crearTabla((((ValorContext)_localctx).NUMBER!=null?((ValorContext)_localctx).NUMBER.getLine():0),(((ValorContext)_localctx).NUMBER!=null?((ValorContext)_localctx).NUMBER.getText():null),"Numero entero","Bloque","",0,"");
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(703); ((ValorContext)_localctx).PAR_OP = match(PAR_OP);
				setState(704); compSi();
				setState(705); ((ValorContext)_localctx).PAR_CLOSE = match(PAR_CLOSE);

						
						t.crearTabla((((ValorContext)_localctx).PAR_OP!=null?((ValorContext)_localctx).PAR_OP.getLine():0),(((ValorContext)_localctx).PAR_OP!=null?((ValorContext)_localctx).PAR_OP.getText():null),"Separador","Bloque","",0,"");
						t.crearTabla((((ValorContext)_localctx).PAR_CLOSE!=null?((ValorContext)_localctx).PAR_CLOSE.getLine():0),(((ValorContext)_localctx).PAR_CLOSE!=null?((ValorContext)_localctx).PAR_CLOSE.getText():null),"Separador","Bloque","",0,"");
						
						
					
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(708); ((ValorContext)_localctx).ID = match(ID);

						
						if(!symbolTable.containsKey((((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getText():null))){
							t.agregarErrores("Error variable "+(((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getText():null)+" no fue declarada "+Integer.toString((((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getLine():0)));
						}else{
							if(dataType.containsKey((((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getText():null))){
								
								if(!dataType.get((((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getText():null)).equals("entero")){
									t.agregarErrores("Error variable "+(((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getText():null)+" no apta para comparacion "+Integer.toString((((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getLine():0)));
								}
								
								
							}
							else{
								t.agregarErrores("Error variable "+(((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getText():null)+" no tiene tipo de dato "+Integer.toString((((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getLine():0)));
							}
						}
						
						
						
						t.programa.append("mov ecx, ["+(((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getText():null)+"]\n");   
						t.programa.append("push ecx\n");
						
						t.crearTabla((((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getLine():0),(((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_claseContext extends ParserRuleContext {
		public Token t1;
		public Token t2;
		public Token PUNTO_COMA;
		public List<TerminalNode> ID() { return getTokens(HelloParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HelloParser.ID, i);
		}
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public Decl_claseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_clase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDecl_clase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDecl_clase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDecl_clase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_claseContext decl_clase() throws RecognitionException {
		Decl_claseContext _localctx = new Decl_claseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decl_clase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712); ((Decl_claseContext)_localctx).t1 = match(ID);
			setState(713); ((Decl_claseContext)_localctx).t2 = match(ID);
			setState(714); ((Decl_claseContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);
			 seEncuentra((((Decl_claseContext)_localctx).t1!=null?((Decl_claseContext)_localctx).t1.getText():null),(((Decl_claseContext)_localctx).t1!=null?((Decl_claseContext)_localctx).t1.getLine():0));
			 	fueDeclarada((((Decl_claseContext)_localctx).t2!=null?((Decl_claseContext)_localctx).t2.getText():null),(((Decl_claseContext)_localctx).t2!=null?((Decl_claseContext)_localctx).t2.getLine():0));symbolTable.put((((Decl_claseContext)_localctx).t2!=null?((Decl_claseContext)_localctx).t2.getText():null),new Object()); dataType.put((((Decl_claseContext)_localctx).t2!=null?((Decl_claseContext)_localctx).t2.getText():null),"objeto");
			 	if(hayFuncion){listaFuncion.add((((Decl_claseContext)_localctx).t2!=null?((Decl_claseContext)_localctx).t2.getText():null));}
			 	
			 	t.crearTabla((((Decl_claseContext)_localctx).t1!=null?((Decl_claseContext)_localctx).t1.getLine():0),(((Decl_claseContext)_localctx).t1!=null?((Decl_claseContext)_localctx).t1.getText():null),"Identificador","Bloque","",0,"");
			 	t.crearTabla((((Decl_claseContext)_localctx).t2!=null?((Decl_claseContext)_localctx).t2.getLine():0),(((Decl_claseContext)_localctx).t2!=null?((Decl_claseContext)_localctx).t2.getText():null),"Identificador","Bloque","",0,"");
			 	t.crearTabla((((Decl_claseContext)_localctx).PUNTO_COMA!=null?((Decl_claseContext)_localctx).PUNTO_COMA.getLine():0),(((Decl_claseContext)_localctx).PUNTO_COMA!=null?((Decl_claseContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
			 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamar_objectoContext extends ParserRuleContext {
		public Token ID;
		public Token PUNTO;
		public Token t1;
		public Token t2;
		public Token PUNTO_COMA;
		public List<TerminalNode> ID() { return getTokens(HelloParser.ID); }
		public TerminalNode PUNTO() { return getToken(HelloParser.PUNTO, 0); }
		public TerminalNode ID(int i) {
			return getToken(HelloParser.ID, i);
		}
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public LlamarFuncionContext llamarFuncion() {
			return getRuleContext(LlamarFuncionContext.class,0);
		}
		public Llamar_objectoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamar_objecto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLlamar_objecto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLlamar_objecto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLlamar_objecto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamar_objectoContext llamar_objecto() throws RecognitionException {
		Llamar_objectoContext _localctx = new Llamar_objectoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_llamar_objecto);
		try {
			setState(727);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717); ((Llamar_objectoContext)_localctx).ID = match(ID);
				setState(718); ((Llamar_objectoContext)_localctx).PUNTO = match(PUNTO);
				setState(719); llamarFuncion();
				seEncuentra((((Llamar_objectoContext)_localctx).ID!=null?((Llamar_objectoContext)_localctx).ID.getText():null),(((Llamar_objectoContext)_localctx).ID!=null?((Llamar_objectoContext)_localctx).ID.getLine():0));
						
						t.crearTabla((((Llamar_objectoContext)_localctx).ID!=null?((Llamar_objectoContext)_localctx).ID.getLine():0),(((Llamar_objectoContext)_localctx).ID!=null?((Llamar_objectoContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
						t.crearTabla((((Llamar_objectoContext)_localctx).PUNTO!=null?((Llamar_objectoContext)_localctx).PUNTO.getLine():0),(((Llamar_objectoContext)_localctx).PUNTO!=null?((Llamar_objectoContext)_localctx).PUNTO.getText():null),"Separador","Bloque","",0,"");
						
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(722); ((Llamar_objectoContext)_localctx).t1 = match(ID);
				setState(723); ((Llamar_objectoContext)_localctx).PUNTO = match(PUNTO);
				setState(724); ((Llamar_objectoContext)_localctx).t2 = match(ID);
				setState(725); ((Llamar_objectoContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);
				seEncuentra((((Llamar_objectoContext)_localctx).t1!=null?((Llamar_objectoContext)_localctx).t1.getText():null),(((Llamar_objectoContext)_localctx).t1!=null?((Llamar_objectoContext)_localctx).t1.getLine():0));seEncuentra((((Llamar_objectoContext)_localctx).t2!=null?((Llamar_objectoContext)_localctx).t2.getText():null),(((Llamar_objectoContext)_localctx).t2!=null?((Llamar_objectoContext)_localctx).t2.getLine():0));
						
						t.crearTabla((((Llamar_objectoContext)_localctx).t1!=null?((Llamar_objectoContext)_localctx).t1.getLine():0),(((Llamar_objectoContext)_localctx).t1!=null?((Llamar_objectoContext)_localctx).t1.getText():null),"Identificador","Bloque","",0,"");
						t.crearTabla((((Llamar_objectoContext)_localctx).PUNTO!=null?((Llamar_objectoContext)_localctx).PUNTO.getLine():0),(((Llamar_objectoContext)_localctx).PUNTO!=null?((Llamar_objectoContext)_localctx).PUNTO.getText():null),"Separador","Bloque","",0,"");
						t.crearTabla((((Llamar_objectoContext)_localctx).t2!=null?((Llamar_objectoContext)_localctx).t2.getLine():0),(((Llamar_objectoContext)_localctx).t2!=null?((Llamar_objectoContext)_localctx).t2.getText():null),"Identificador","Bloque","",0,"");
						t.crearTabla((((Llamar_objectoContext)_localctx).PUNTO_COMA!=null?((Llamar_objectoContext)_localctx).PUNTO_COMA.getLine():0),(((Llamar_objectoContext)_localctx).PUNTO_COMA!=null?((Llamar_objectoContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
						
						
					
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Incremento_decrementoContext extends ParserRuleContext {
		public Token ID;
		public Token SUMA;
		public Token PUNTO_COMA;
		public Token MENOS;
		public TerminalNode SUMA(int i) {
			return getToken(HelloParser.SUMA, i);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public List<TerminalNode> MENOS() { return getTokens(HelloParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(HelloParser.MENOS, i);
		}
		public List<TerminalNode> SUMA() { return getTokens(HelloParser.SUMA); }
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public LlamarFuncionContext llamarFuncion() {
			return getRuleContext(LlamarFuncionContext.class,0);
		}
		public Incremento_decrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento_decremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterIncremento_decremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitIncremento_decremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitIncremento_decremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Incremento_decrementoContext incremento_decremento() throws RecognitionException {
		Incremento_decrementoContext _localctx = new Incremento_decrementoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_incremento_decremento);
		try {
			setState(751);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(729); ((Incremento_decrementoContext)_localctx).ID = match(ID);
				setState(730); ((Incremento_decrementoContext)_localctx).SUMA = match(SUMA);
				setState(731); ((Incremento_decrementoContext)_localctx).SUMA = match(SUMA);
				setState(732); ((Incremento_decrementoContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);
				verificaIncrementoDecremento((((Incremento_decrementoContext)_localctx).ID!=null?((Incremento_decrementoContext)_localctx).ID.getText():null),(((Incremento_decrementoContext)_localctx).ID!=null?((Incremento_decrementoContext)_localctx).ID.getLine():0));
						
						t.programa.append("mov eax , ["+(((Incremento_decrementoContext)_localctx).ID!=null?((Incremento_decrementoContext)_localctx).ID.getText():null)+"]\n");
					    t.programa.append("inc eax\n");
					    t.programa.append("mov ["+(((Incremento_decrementoContext)_localctx).ID!=null?((Incremento_decrementoContext)_localctx).ID.getText():null)+"],eax\n");
					    
					    t.crearTabla((((Incremento_decrementoContext)_localctx).ID!=null?((Incremento_decrementoContext)_localctx).ID.getLine():0),(((Incremento_decrementoContext)_localctx).ID!=null?((Incremento_decrementoContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
					    t.crearTabla((((Incremento_decrementoContext)_localctx).SUMA!=null?((Incremento_decrementoContext)_localctx).SUMA.getLine():0),(((Incremento_decrementoContext)_localctx).SUMA!=null?((Incremento_decrementoContext)_localctx).SUMA.getText():null),"Operadores","Bloque","",0,"");
					    t.crearTabla((((Incremento_decrementoContext)_localctx).SUMA!=null?((Incremento_decrementoContext)_localctx).SUMA.getLine():0),(((Incremento_decrementoContext)_localctx).SUMA!=null?((Incremento_decrementoContext)_localctx).SUMA.getText():null),"Operadores","Bloque","",0,"");
					    t.crearTabla((((Incremento_decrementoContext)_localctx).PUNTO_COMA!=null?((Incremento_decrementoContext)_localctx).PUNTO_COMA.getLine():0),(((Incremento_decrementoContext)_localctx).PUNTO_COMA!=null?((Incremento_decrementoContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
						
						
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734); ((Incremento_decrementoContext)_localctx).ID = match(ID);
				setState(735); ((Incremento_decrementoContext)_localctx).MENOS = match(MENOS);
				setState(736); ((Incremento_decrementoContext)_localctx).MENOS = match(MENOS);
				setState(737); ((Incremento_decrementoContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);
				verificaIncrementoDecremento((((Incremento_decrementoContext)_localctx).ID!=null?((Incremento_decrementoContext)_localctx).ID.getText():null),(((Incremento_decrementoContext)_localctx).ID!=null?((Incremento_decrementoContext)_localctx).ID.getLine():0));
						
						t.programa.append("mov eax , ["+(((Incremento_decrementoContext)_localctx).ID!=null?((Incremento_decrementoContext)_localctx).ID.getText():null)+"]\n");
					    t.programa.append("dec eax\n");
					    t.programa.append("mov ["+(((Incremento_decrementoContext)_localctx).ID!=null?((Incremento_decrementoContext)_localctx).ID.getText():null)+"],eax\n");
					    
					    t.crearTabla((((Incremento_decrementoContext)_localctx).ID!=null?((Incremento_decrementoContext)_localctx).ID.getLine():0),(((Incremento_decrementoContext)_localctx).ID!=null?((Incremento_decrementoContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
					    t.crearTabla((((Incremento_decrementoContext)_localctx).MENOS!=null?((Incremento_decrementoContext)_localctx).MENOS.getLine():0),(((Incremento_decrementoContext)_localctx).MENOS!=null?((Incremento_decrementoContext)_localctx).MENOS.getText():null),"Operadores","Bloque","",0,"");
					    t.crearTabla((((Incremento_decrementoContext)_localctx).MENOS!=null?((Incremento_decrementoContext)_localctx).MENOS.getLine():0),(((Incremento_decrementoContext)_localctx).MENOS!=null?((Incremento_decrementoContext)_localctx).MENOS.getText():null),"Operadores","Bloque","",0,"");
					    t.crearTabla((((Incremento_decrementoContext)_localctx).PUNTO_COMA!=null?((Incremento_decrementoContext)_localctx).PUNTO_COMA.getLine():0),(((Incremento_decrementoContext)_localctx).PUNTO_COMA!=null?((Incremento_decrementoContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
						
						
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(739); llamarFuncion();
				setState(740); ((Incremento_decrementoContext)_localctx).SUMA = match(SUMA);
				setState(741); ((Incremento_decrementoContext)_localctx).SUMA = match(SUMA);
				setState(742); ((Incremento_decrementoContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

							  
					    t.crearTabla((((Incremento_decrementoContext)_localctx).SUMA!=null?((Incremento_decrementoContext)_localctx).SUMA.getLine():0),(((Incremento_decrementoContext)_localctx).SUMA!=null?((Incremento_decrementoContext)_localctx).SUMA.getText():null),"Operadores","Bloque","",0,"");
					    t.crearTabla((((Incremento_decrementoContext)_localctx).SUMA!=null?((Incremento_decrementoContext)_localctx).SUMA.getLine():0),(((Incremento_decrementoContext)_localctx).SUMA!=null?((Incremento_decrementoContext)_localctx).SUMA.getText():null),"Operadores","Bloque","",0,"");
					    t.crearTabla((((Incremento_decrementoContext)_localctx).PUNTO_COMA!=null?((Incremento_decrementoContext)_localctx).PUNTO_COMA.getLine():0),(((Incremento_decrementoContext)_localctx).PUNTO_COMA!=null?((Incremento_decrementoContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(745); llamarFuncion();
				setState(746); ((Incremento_decrementoContext)_localctx).MENOS = match(MENOS);
				setState(747); ((Incremento_decrementoContext)_localctx).MENOS = match(MENOS);
				setState(748); ((Incremento_decrementoContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

					    t.crearTabla((((Incremento_decrementoContext)_localctx).MENOS!=null?((Incremento_decrementoContext)_localctx).MENOS.getLine():0),(((Incremento_decrementoContext)_localctx).MENOS!=null?((Incremento_decrementoContext)_localctx).MENOS.getText():null),"Operadores","Bloque","",0,"");
					    t.crearTabla((((Incremento_decrementoContext)_localctx).MENOS!=null?((Incremento_decrementoContext)_localctx).MENOS.getLine():0),(((Incremento_decrementoContext)_localctx).MENOS!=null?((Incremento_decrementoContext)_localctx).MENOS.getText():null),"Operadores","Bloque","",0,"");
					    t.crearTabla((((Incremento_decrementoContext)_localctx).PUNTO_COMA!=null?((Incremento_decrementoContext)_localctx).PUNTO_COMA.getLine():0),(((Incremento_decrementoContext)_localctx).PUNTO_COMA!=null?((Incremento_decrementoContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
					
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeccionContext extends ParserRuleContext {
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public ProcedimientoContext procedimiento() {
			return getRuleContext(ProcedimientoContext.class,0);
		}
		public SeccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSeccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSeccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSeccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionContext seccion() throws RecognitionException {
		SeccionContext _localctx = new SeccionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_seccion);
		try {
			setState(755);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753); procedimiento();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(754); funcion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Token ENTERO;
		public Token ID;
		public Token ASSIGN;
		public Token NUMBER;
		public Token PUNTO_COMA;
		public Token LARGO;
		public Token FLOT;
		public Token NUMBER_FLOAT;
		public Token DOBLE;
		public Token BOOL;
		public Token BOOLEAN;
		public Token CARACTER;
		public Token CAR;
		public Token STRING;
		public Token COR_OP;
		public Token COR_CLOSE;
		public TerminalNode COR_CLOSE() { return getToken(HelloParser.COR_CLOSE, 0); }
		public TerminalNode BOOL() { return getToken(HelloParser.BOOL, 0); }
		public TerminalNode DOBLE() { return getToken(HelloParser.DOBLE, 0); }
		public TerminalNode FLOT() { return getToken(HelloParser.FLOT, 0); }
		public TerminalNode CAR() { return getToken(HelloParser.CAR, 0); }
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
		public RestriccionContext restriccion() {
			return getRuleContext(RestriccionContext.class,0);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HelloParser.ASSIGN, 0); }
		public TerminalNode LARGO() { return getToken(HelloParser.LARGO, 0); }
		public TerminalNode CARACTER() { return getToken(HelloParser.CARACTER, 0); }
		public TerminalNode COR_OP() { return getToken(HelloParser.COR_OP, 0); }
		public TerminalNode NUMBER_FLOAT() { return getToken(HelloParser.NUMBER_FLOAT, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public TerminalNode ENTERO() { return getToken(HelloParser.ENTERO, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_var_decl);
		int _la;
		try {
			setState(858);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				_la = _input.LA(1);
				if (_la==PUBLICO || _la==PRIVADO) {
					{
					setState(757); restriccion();
					}
				}

				setState(760); ((Var_declContext)_localctx).ENTERO = match(ENTERO);
				setState(761); ((Var_declContext)_localctx).ID = match(ID);

							t.crearTabla((((Var_declContext)_localctx).ENTERO!=null?((Var_declContext)_localctx).ENTERO.getLine():0),(((Var_declContext)_localctx).ENTERO!=null?((Var_declContext)_localctx).ENTERO.getText():null),"Palabra reservada","Clase","",0,"");
							t.crearTabla((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"Identificador","Variable global","0",0,"4 bytes");
					
							
				setState(766);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(763); ((Var_declContext)_localctx).ASSIGN = match(ASSIGN);
					setState(764); ((Var_declContext)_localctx).NUMBER = match(NUMBER);

									t.crearTabla((((Var_declContext)_localctx).ASSIGN!=null?((Var_declContext)_localctx).ASSIGN.getLine():0),(((Var_declContext)_localctx).ASSIGN!=null?((Var_declContext)_localctx).ASSIGN.getText():null),"Asignacion","Clase","",0,"");
									t.crearTabla((((Var_declContext)_localctx).NUMBER!=null?((Var_declContext)_localctx).NUMBER.getLine():0),(((Var_declContext)_localctx).NUMBER!=null?((Var_declContext)_localctx).NUMBER.getText():null),"Numero entero","Clase","",0,"");
									
									numero=(((Var_declContext)_localctx).NUMBER!=null?((Var_declContext)_localctx).NUMBER.getText():null); t.programa.append("mov eax,"+menos+(((Var_declContext)_localctx).NUMBER!=null?((Var_declContext)_localctx).NUMBER.getText():null)+"\n"); t.programa.append("mov ["+(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null)+"],eax\n");
								
					}
				}

				setState(768); ((Var_declContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);
					
								t.crearTabla((((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
								t.mapaDeclaraciones.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null)+": resd 1");
								fueDeclarada((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0));
								symbolTable.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),menos+numero); dataType.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"entero"); numero="0"; menos="";
								
							
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				_la = _input.LA(1);
				if (_la==PUBLICO || _la==PRIVADO) {
					{
					setState(770); restriccion();
					}
				}

				setState(773); ((Var_declContext)_localctx).LARGO = match(LARGO);
				setState(774); ((Var_declContext)_localctx).ID = match(ID);

							t.crearTabla((((Var_declContext)_localctx).LARGO!=null?((Var_declContext)_localctx).LARGO.getLine():0),(((Var_declContext)_localctx).LARGO!=null?((Var_declContext)_localctx).LARGO.getText():null),"Palabra reservada","Clase","",0,"");
							t.crearTabla((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"Identificador","Variable global","0",0,"8 bytes");
								
								
								
							
				setState(779);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(776); ((Var_declContext)_localctx).ASSIGN = match(ASSIGN);
					setState(777); ((Var_declContext)_localctx).NUMBER = match(NUMBER);

									t.crearTabla((((Var_declContext)_localctx).ASSIGN!=null?((Var_declContext)_localctx).ASSIGN.getLine():0),(((Var_declContext)_localctx).ASSIGN!=null?((Var_declContext)_localctx).ASSIGN.getText():null),"Asignacion","Clase","",0,"");
									t.crearTabla((((Var_declContext)_localctx).NUMBER!=null?((Var_declContext)_localctx).NUMBER.getLine():0),(((Var_declContext)_localctx).NUMBER!=null?((Var_declContext)_localctx).NUMBER.getText():null),"Numero largo","Clase","",0,"");
									numero=(((Var_declContext)_localctx).NUMBER!=null?((Var_declContext)_localctx).NUMBER.getText():null); t.programa.append("mov eax,"+menos+(((Var_declContext)_localctx).NUMBER!=null?((Var_declContext)_localctx).NUMBER.getText():null)+"\n"); t.programa.append("mov ["+(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null)+"],eax\n");
								
					}
				}

				setState(781); ((Var_declContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								t.crearTabla((((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
								t.mapaDeclaraciones.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null)+": resd 1");
								fueDeclarada((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),menos+numero); dataType.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"largo");  numero="0"; menos="";
								
							
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(784);
				_la = _input.LA(1);
				if (_la==PUBLICO || _la==PRIVADO) {
					{
					setState(783); restriccion();
					}
				}

				setState(786); ((Var_declContext)_localctx).FLOT = match(FLOT);
				setState(787); ((Var_declContext)_localctx).ID = match(ID);

							t.crearTabla((((Var_declContext)_localctx).FLOT!=null?((Var_declContext)_localctx).FLOT.getLine():0),(((Var_declContext)_localctx).FLOT!=null?((Var_declContext)_localctx).FLOT.getText():null),"Palabra reservada","Clase","",0,"");
							t.crearTabla((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"Identificador","Variable global","0",0,"4 bytes");
								
								
							
				setState(792);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(789); ((Var_declContext)_localctx).ASSIGN = match(ASSIGN);
					setState(790); ((Var_declContext)_localctx).NUMBER_FLOAT = match(NUMBER_FLOAT);

									
									t.crearTabla((((Var_declContext)_localctx).ASSIGN!=null?((Var_declContext)_localctx).ASSIGN.getLine():0),(((Var_declContext)_localctx).ASSIGN!=null?((Var_declContext)_localctx).ASSIGN.getText():null),"Asignacion","Clase","",0,"");
									t.crearTabla((((Var_declContext)_localctx).NUMBER_FLOAT!=null?((Var_declContext)_localctx).NUMBER_FLOAT.getLine():0),(((Var_declContext)_localctx).NUMBER_FLOAT!=null?((Var_declContext)_localctx).NUMBER_FLOAT.getText():null),"Numero flotante","Clase","",0,"");
									
									numero=(((Var_declContext)_localctx).NUMBER_FLOAT!=null?((Var_declContext)_localctx).NUMBER_FLOAT.getText():null);
								
					}
				}

				setState(794); ((Var_declContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								t.crearTabla((((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
								fueDeclarada((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),menos+numero); dataType.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"flotante");  numero="0"; menos="";
								
							
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(797);
				_la = _input.LA(1);
				if (_la==PUBLICO || _la==PRIVADO) {
					{
					setState(796); restriccion();
					}
				}

				setState(799); ((Var_declContext)_localctx).DOBLE = match(DOBLE);
				setState(800); ((Var_declContext)_localctx).ID = match(ID);

								
							t.crearTabla((((Var_declContext)_localctx).DOBLE!=null?((Var_declContext)_localctx).DOBLE.getLine():0),(((Var_declContext)_localctx).DOBLE!=null?((Var_declContext)_localctx).DOBLE.getText():null),"Palabra reservada","Clase","",0,"");
							t.crearTabla((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"Identificador","Variable global","0",0,"8 bytes");
								
							
				setState(805);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(802); ((Var_declContext)_localctx).ASSIGN = match(ASSIGN);
					setState(803); ((Var_declContext)_localctx).NUMBER_FLOAT = match(NUMBER_FLOAT);

									
									t.crearTabla((((Var_declContext)_localctx).ASSIGN!=null?((Var_declContext)_localctx).ASSIGN.getLine():0),(((Var_declContext)_localctx).ASSIGN!=null?((Var_declContext)_localctx).ASSIGN.getText():null),"Asignacion","Clase","",0,"");
									t.crearTabla((((Var_declContext)_localctx).NUMBER_FLOAT!=null?((Var_declContext)_localctx).NUMBER_FLOAT.getLine():0),(((Var_declContext)_localctx).NUMBER_FLOAT!=null?((Var_declContext)_localctx).NUMBER_FLOAT.getText():null),"Numero flotante","Clase","",0,"");
									
									numero=(((Var_declContext)_localctx).NUMBER_FLOAT!=null?((Var_declContext)_localctx).NUMBER_FLOAT.getText():null);
								
					}
				}

				setState(807); ((Var_declContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								t.crearTabla((((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
								fueDeclarada((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),menos+numero); dataType.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"doble");  numero="0"; menos="";
								
							
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(810);
				_la = _input.LA(1);
				if (_la==PUBLICO || _la==PRIVADO) {
					{
					setState(809); restriccion();
					}
				}

				setState(812); ((Var_declContext)_localctx).BOOL = match(BOOL);
				setState(813); ((Var_declContext)_localctx).ID = match(ID);

								
							t.crearTabla((((Var_declContext)_localctx).BOOL!=null?((Var_declContext)_localctx).BOOL.getLine():0),(((Var_declContext)_localctx).BOOL!=null?((Var_declContext)_localctx).BOOL.getText():null),"Palabra reservada","Clase","",0,"");
							t.crearTabla((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"Identificador","Variable global","0",0,"1 byte");
								
								
							
				setState(818);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(815); ((Var_declContext)_localctx).ASSIGN = match(ASSIGN);
					setState(816); ((Var_declContext)_localctx).BOOLEAN = match(BOOLEAN);
					numero=(((Var_declContext)_localctx).BOOLEAN!=null?((Var_declContext)_localctx).BOOLEAN.getText():null);
									
									t.constantes.append("msg"+Integer.toString(msg)+": dd \""+(((Var_declContext)_localctx).BOOLEAN!=null?((Var_declContext)_localctx).BOOLEAN.getText():null)+"\" \n");
								    t.programa.append("mov eax,msg"+Integer.toString(msg)+"\n");
									t.programa.append("mov ["+(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null)+"] , eax\n");
									msg++;
									
									t.crearTabla((((Var_declContext)_localctx).ASSIGN!=null?((Var_declContext)_localctx).ASSIGN.getLine():0),(((Var_declContext)_localctx).ASSIGN!=null?((Var_declContext)_localctx).ASSIGN.getText():null),"Asignacion","Clase","",0,"");
									t.crearTabla((((Var_declContext)_localctx).BOOLEAN!=null?((Var_declContext)_localctx).BOOLEAN.getLine():0),(((Var_declContext)_localctx).BOOLEAN!=null?((Var_declContext)_localctx).BOOLEAN.getText():null),"Booleano","Clase","",0,"");
									
									
								
					}
				}

				setState(820); ((Var_declContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								t.crearTabla((((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
								t.mapaDeclaraciones.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null)+": resd 1");
								fueDeclarada((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),numero); dataType.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"booleano");  numero="0"; menos="";
								
							
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(823);
				_la = _input.LA(1);
				if (_la==PUBLICO || _la==PRIVADO) {
					{
					setState(822); restriccion();
					}
				}

				setState(825); ((Var_declContext)_localctx).CARACTER = match(CARACTER);
				setState(826); ((Var_declContext)_localctx).ID = match(ID);

								
							t.crearTabla((((Var_declContext)_localctx).CARACTER!=null?((Var_declContext)_localctx).CARACTER.getLine():0),(((Var_declContext)_localctx).CARACTER!=null?((Var_declContext)_localctx).CARACTER.getText():null),"Palabra reservada","Clase","",0,"");
							t.crearTabla((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"Identificador","Variable global","0",0,"1 byte");
								
							
				setState(831);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(828); ((Var_declContext)_localctx).ASSIGN = match(ASSIGN);
					setState(829); ((Var_declContext)_localctx).CAR = match(CAR);
					numero=(((Var_declContext)_localctx).CAR!=null?((Var_declContext)_localctx).CAR.getText():null);
									
									t.constantes.append("msg"+Integer.toString(msg)+": dd "+(((Var_declContext)_localctx).CAR!=null?((Var_declContext)_localctx).CAR.getText():null)+"\n");
								    t.programa.append("mov eax,msg"+Integer.toString(msg)+"\n");
									t.programa.append("mov ["+(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null)+"] , eax\n");
									msg++;
									
									t.crearTabla((((Var_declContext)_localctx).ASSIGN!=null?((Var_declContext)_localctx).ASSIGN.getLine():0),(((Var_declContext)_localctx).ASSIGN!=null?((Var_declContext)_localctx).ASSIGN.getText():null),"Asignacion","Clase","",0,"");
									t.crearTabla((((Var_declContext)_localctx).CAR!=null?((Var_declContext)_localctx).CAR.getLine():0),(((Var_declContext)_localctx).CAR!=null?((Var_declContext)_localctx).CAR.getText():null),"Caracter","Clase","",0,"");
									
									
									
								
					}
				}

				setState(833); ((Var_declContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								t.crearTabla((((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
								t.mapaDeclaraciones.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null)+": resd 1");
								fueDeclarada((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),numero); dataType.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"caracter");  numero="0"; menos="";
								
							
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(836);
				_la = _input.LA(1);
				if (_la==PUBLICO || _la==PRIVADO) {
					{
					setState(835); restriccion();
					}
				}

				setState(838); ((Var_declContext)_localctx).STRING = match(STRING);
				setState(839); ((Var_declContext)_localctx).ID = match(ID);

								
							t.crearTabla((((Var_declContext)_localctx).STRING!=null?((Var_declContext)_localctx).STRING.getLine():0),(((Var_declContext)_localctx).STRING!=null?((Var_declContext)_localctx).STRING.getText():null),"Palabra reservada","Clase","",0,"");
							t.crearTabla((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"Identificador","Variable global","0",0,"255 byte");
								
							
				setState(844);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(841); ((Var_declContext)_localctx).ASSIGN = match(ASSIGN);
					setState(842); ((Var_declContext)_localctx).CAR = match(CAR);
					numero=(((Var_declContext)_localctx).CAR!=null?((Var_declContext)_localctx).CAR.getText():null);
									t.constantes.append("msg"+Integer.toString(msg)+": dd "+(((Var_declContext)_localctx).CAR!=null?((Var_declContext)_localctx).CAR.getText():null)+"\n");
								    t.programa.append("mov eax,msg"+Integer.toString(msg)+"\n");
									t.programa.append("mov ["+(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null)+"] , eax\n");
									msg++;
									
													t.crearTabla((((Var_declContext)_localctx).ASSIGN!=null?((Var_declContext)_localctx).ASSIGN.getLine():0),(((Var_declContext)_localctx).ASSIGN!=null?((Var_declContext)_localctx).ASSIGN.getText():null),"Asignacion","Clase","",0,"");
									t.crearTabla((((Var_declContext)_localctx).CAR!=null?((Var_declContext)_localctx).CAR.getLine():0),(((Var_declContext)_localctx).CAR!=null?((Var_declContext)_localctx).CAR.getText():null),"Caracter","Clase","",0,"");
									
									
								
					}
				}

				setState(846); ((Var_declContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								t.crearTabla((((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
								t.mapaDeclaraciones.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null)+": resd 1");
								fueDeclarada((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),numero); dataType.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"string");  numero="0"; menos="";
								
							
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(849);
				_la = _input.LA(1);
				if (_la==PUBLICO || _la==PRIVADO) {
					{
					setState(848); restriccion();
					}
				}

				setState(851); ((Var_declContext)_localctx).ENTERO = match(ENTERO);
				setState(852); ((Var_declContext)_localctx).ID = match(ID);
				setState(853); ((Var_declContext)_localctx).COR_OP = match(COR_OP);
				setState(854); ((Var_declContext)_localctx).NUMBER = match(NUMBER);
				setState(855); ((Var_declContext)_localctx).COR_CLOSE = match(COR_CLOSE);
				setState(856); ((Var_declContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								
								
								fueDeclarada((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"0"); dataType.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"entero");  numero="0"; menos="";
								
								
								t.crearTabla((((Var_declContext)_localctx).ENTERO!=null?((Var_declContext)_localctx).ENTERO.getLine():0),(((Var_declContext)_localctx).ENTERO!=null?((Var_declContext)_localctx).ENTERO.getText():null),"Palabra reservada","Clase","",0,"");
								t.crearTabla((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getLine():0),(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"Variable global","Clase","0",0,Integer.toString(Integer.parseInt((((Var_declContext)_localctx).NUMBER!=null?((Var_declContext)_localctx).NUMBER.getText():null))*4)+" bytes");
								t.crearTabla((((Var_declContext)_localctx).COR_OP!=null?((Var_declContext)_localctx).COR_OP.getLine():0),(((Var_declContext)_localctx).COR_OP!=null?((Var_declContext)_localctx).COR_OP.getText():null),"Separador","Clase","",0,"");
								t.crearTabla((((Var_declContext)_localctx).NUMBER!=null?((Var_declContext)_localctx).NUMBER.getLine():0),(((Var_declContext)_localctx).NUMBER!=null?((Var_declContext)_localctx).NUMBER.getText():null),"Numero entero","Clase","",0,"");
								t.crearTabla((((Var_declContext)_localctx).COR_CLOSE!=null?((Var_declContext)_localctx).COR_CLOSE.getLine():0),(((Var_declContext)_localctx).COR_CLOSE!=null?((Var_declContext)_localctx).COR_CLOSE.getText():null),"Separador","Clase","",0,"");
								
								
								
								t.crearTabla((((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declContext)_localctx).PUNTO_COMA!=null?((Var_declContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
								
							
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestriccionContext extends ParserRuleContext {
		public Token PUBLICO;
		public Token PRIVADO;
		public TerminalNode PRIVADO() { return getToken(HelloParser.PRIVADO, 0); }
		public TerminalNode PUBLICO() { return getToken(HelloParser.PUBLICO, 0); }
		public RestriccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restriccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterRestriccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitRestriccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitRestriccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestriccionContext restriccion() throws RecognitionException {
		RestriccionContext _localctx = new RestriccionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_restriccion);
		try {
			setState(864);
			switch (_input.LA(1)) {
			case PUBLICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(860); ((RestriccionContext)_localctx).PUBLICO = match(PUBLICO);
				t.crearTabla((((RestriccionContext)_localctx).PUBLICO!=null?((RestriccionContext)_localctx).PUBLICO.getLine():0),(((RestriccionContext)_localctx).PUBLICO!=null?((RestriccionContext)_localctx).PUBLICO.getText():null),"Palabra reservada","Clase","",0,"");
				}
				break;
			case PRIVADO:
				enterOuterAlt(_localctx, 2);
				{
				setState(862); ((RestriccionContext)_localctx).PRIVADO = match(PRIVADO);
				t.crearTabla((((RestriccionContext)_localctx).PRIVADO!=null?((RestriccionContext)_localctx).PRIVADO.getLine():0),(((RestriccionContext)_localctx).PRIVADO!=null?((RestriccionContext)_localctx).PRIVADO.getText():null),"Palabra reservada","Clase","",0,"");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declBContext extends ParserRuleContext {
		public Token ENTERO;
		public Token ID;
		public Token ASSIGN;
		public Token NUMBER;
		public Token PUNTO_COMA;
		public Token LARGO;
		public Token FLOT;
		public Token NUMBER_FLOAT;
		public Token DOBLE;
		public Token BOOL;
		public Token BOOLEAN;
		public Token CARACTER;
		public Token CAR;
		public Token STRING;
		public Token COR_OP;
		public Token COR_CLOSE;
		public TerminalNode COR_CLOSE() { return getToken(HelloParser.COR_CLOSE, 0); }
		public TerminalNode BOOL() { return getToken(HelloParser.BOOL, 0); }
		public TerminalNode DOBLE() { return getToken(HelloParser.DOBLE, 0); }
		public TerminalNode FLOT() { return getToken(HelloParser.FLOT, 0); }
		public TerminalNode CAR() { return getToken(HelloParser.CAR, 0); }
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HelloParser.ASSIGN, 0); }
		public TerminalNode LARGO() { return getToken(HelloParser.LARGO, 0); }
		public TerminalNode CARACTER() { return getToken(HelloParser.CARACTER, 0); }
		public TerminalNode COR_OP() { return getToken(HelloParser.COR_OP, 0); }
		public TerminalNode NUMBER_FLOAT() { return getToken(HelloParser.NUMBER_FLOAT, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public TerminalNode ENTERO() { return getToken(HelloParser.ENTERO, 0); }
		public Var_declBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVar_declB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVar_declB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitVar_declB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declBContext var_declB() throws RecognitionException {
		Var_declBContext _localctx = new Var_declBContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_var_declB);
		int _la;
		try {
			setState(943);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(866); ((Var_declBContext)_localctx).ENTERO = match(ENTERO);
				setState(867); ((Var_declBContext)_localctx).ID = match(ID);

					       	
					       				t.crearTabla((((Var_declBContext)_localctx).ENTERO!=null?((Var_declBContext)_localctx).ENTERO.getLine():0),(((Var_declBContext)_localctx).ENTERO!=null?((Var_declBContext)_localctx).ENTERO.getText():null),"Palabra reservada","Clase","",0,"");
							t.crearTabla((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"Identificador","Variable local","0",0,"4 bytes");
					       	
					       	
					       
				setState(872);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(869); ((Var_declBContext)_localctx).ASSIGN = match(ASSIGN);
					setState(870); ((Var_declBContext)_localctx).NUMBER = match(NUMBER);

						       	
						       					t.crearTabla((((Var_declBContext)_localctx).ASSIGN!=null?((Var_declBContext)_localctx).ASSIGN.getLine():0),(((Var_declBContext)_localctx).ASSIGN!=null?((Var_declBContext)_localctx).ASSIGN.getText():null),"Asignacion","Clase","",0,"");
									t.crearTabla((((Var_declBContext)_localctx).NUMBER!=null?((Var_declBContext)_localctx).NUMBER.getLine():0),(((Var_declBContext)_localctx).NUMBER!=null?((Var_declBContext)_localctx).NUMBER.getText():null),"Numero entero","Clase","",0,"");
						       	numero=(((Var_declBContext)_localctx).NUMBER!=null?((Var_declBContext)_localctx).NUMBER.getText():null); t.programa.append("mov eax,"+menos+(((Var_declBContext)_localctx).NUMBER!=null?((Var_declBContext)_localctx).NUMBER.getText():null)+"\n"); t.programa.append("mov ["+(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null)+"],eax\n");
						       	
						       
					}
				}

				setState(874); ((Var_declBContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

							t.crearTabla((((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
							t.mapaDeclaraciones.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null)+": resd 1");
							fueDeclarada((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),menos+numero); dataType.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"entero"); numero="0"; menos="";
							if(hayFuncion){listaFuncion.add((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null));}
							
							
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(876); ((Var_declBContext)_localctx).LARGO = match(LARGO);
				setState(877); ((Var_declBContext)_localctx).ID = match(ID);

								
								t.crearTabla((((Var_declBContext)_localctx).LARGO!=null?((Var_declBContext)_localctx).LARGO.getLine():0),(((Var_declBContext)_localctx).LARGO!=null?((Var_declBContext)_localctx).LARGO.getText():null),"Palabra reservada","Clase","",0,"");
							t.crearTabla((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"Identificador","Variable local","0",0,"8 bytes");
								
								
								
								
							
				setState(882);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(879); ((Var_declBContext)_localctx).ASSIGN = match(ASSIGN);
					setState(880); ((Var_declBContext)_localctx).NUMBER = match(NUMBER);

									
									t.crearTabla((((Var_declBContext)_localctx).ASSIGN!=null?((Var_declBContext)_localctx).ASSIGN.getLine():0),(((Var_declBContext)_localctx).ASSIGN!=null?((Var_declBContext)_localctx).ASSIGN.getText():null),"Asignacion","Clase","",0,"");
									t.crearTabla((((Var_declBContext)_localctx).NUMBER!=null?((Var_declBContext)_localctx).NUMBER.getLine():0),(((Var_declBContext)_localctx).NUMBER!=null?((Var_declBContext)_localctx).NUMBER.getText():null),"Numero largo","Clase","",0,"");
									
									
									numero=(((Var_declBContext)_localctx).NUMBER!=null?((Var_declBContext)_localctx).NUMBER.getText():null);t.programa.append("mov eax,"+menos+(((Var_declBContext)_localctx).NUMBER!=null?((Var_declBContext)_localctx).NUMBER.getText():null)+"\n"); t.programa.append("mov ["+(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null)+"],eax\n");
								
					}
				}

				setState(884); ((Var_declBContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								t.crearTabla((((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
								t.mapaDeclaraciones.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null)+": resd 1");
								fueDeclarada((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),menos+numero); dataType.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"largo");  numero="0"; menos="";
								if(hayFuncion){listaFuncion.add((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null));}
							
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(886); ((Var_declBContext)_localctx).FLOT = match(FLOT);
				setState(887); ((Var_declBContext)_localctx).ID = match(ID);

								
							t.crearTabla((((Var_declBContext)_localctx).FLOT!=null?((Var_declBContext)_localctx).FLOT.getLine():0),(((Var_declBContext)_localctx).FLOT!=null?((Var_declBContext)_localctx).FLOT.getText():null),"Palabra reservada","Clase","",0,"");
							t.crearTabla((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"Identificador","Variable local","0",0,"4 bytes");
								
								
							
				setState(892);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(889); ((Var_declBContext)_localctx).ASSIGN = match(ASSIGN);
					setState(890); ((Var_declBContext)_localctx).NUMBER_FLOAT = match(NUMBER_FLOAT);

									
									t.crearTabla((((Var_declBContext)_localctx).ASSIGN!=null?((Var_declBContext)_localctx).ASSIGN.getLine():0),(((Var_declBContext)_localctx).ASSIGN!=null?((Var_declBContext)_localctx).ASSIGN.getText():null),"Asignacion","Clase","",0,"");
									t.crearTabla((((Var_declBContext)_localctx).NUMBER_FLOAT!=null?((Var_declBContext)_localctx).NUMBER_FLOAT.getLine():0),(((Var_declBContext)_localctx).NUMBER_FLOAT!=null?((Var_declBContext)_localctx).NUMBER_FLOAT.getText():null),"Numero flotante","Clase","",0,"");
									
									numero=(((Var_declBContext)_localctx).NUMBER_FLOAT!=null?((Var_declBContext)_localctx).NUMBER_FLOAT.getText():null);
								
					}
				}

				setState(894); ((Var_declBContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								
								t.crearTabla((((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
								fueDeclarada((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),menos+numero); dataType.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"flotante");  numero="0"; menos="";
								if(hayFuncion){listaFuncion.add((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null));}
							
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(896); ((Var_declBContext)_localctx).DOBLE = match(DOBLE);
				setState(897); ((Var_declBContext)_localctx).ID = match(ID);

								
								
							t.crearTabla((((Var_declBContext)_localctx).DOBLE!=null?((Var_declBContext)_localctx).DOBLE.getLine():0),(((Var_declBContext)_localctx).DOBLE!=null?((Var_declBContext)_localctx).DOBLE.getText():null),"Palabra reservada","Clase","",0,"");
							t.crearTabla((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"Identificador","Variable local","0",0,"8 bytes");
								
								
							
				setState(902);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(899); ((Var_declBContext)_localctx).ASSIGN = match(ASSIGN);
					setState(900); ((Var_declBContext)_localctx).NUMBER_FLOAT = match(NUMBER_FLOAT);

									
									
									t.crearTabla((((Var_declBContext)_localctx).ASSIGN!=null?((Var_declBContext)_localctx).ASSIGN.getLine():0),(((Var_declBContext)_localctx).ASSIGN!=null?((Var_declBContext)_localctx).ASSIGN.getText():null),"Asignacion","Clase","",0,"");
									t.crearTabla((((Var_declBContext)_localctx).NUMBER_FLOAT!=null?((Var_declBContext)_localctx).NUMBER_FLOAT.getLine():0),(((Var_declBContext)_localctx).NUMBER_FLOAT!=null?((Var_declBContext)_localctx).NUMBER_FLOAT.getText():null),"Numero doble","Clase","",0,"");
									numero=(((Var_declBContext)_localctx).NUMBER_FLOAT!=null?((Var_declBContext)_localctx).NUMBER_FLOAT.getText():null);
									
								
					}
				}

				setState(904); ((Var_declBContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								t.crearTabla((((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
								
								fueDeclarada((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),menos+numero); dataType.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"doble");  numero="0"; menos="";
								if(hayFuncion){listaFuncion.add((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null));}
							
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(906); ((Var_declBContext)_localctx).BOOL = match(BOOL);
				setState(907); ((Var_declBContext)_localctx).ID = match(ID);

								
								
							t.crearTabla((((Var_declBContext)_localctx).BOOL!=null?((Var_declBContext)_localctx).BOOL.getLine():0),(((Var_declBContext)_localctx).BOOL!=null?((Var_declBContext)_localctx).BOOL.getText():null),"Palabra reservada","Clase","",0,"");
							t.crearTabla((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"Identificador","Variable local","0",0,"1 byte");
								
								
							
				setState(912);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(909); ((Var_declBContext)_localctx).ASSIGN = match(ASSIGN);
					setState(910); ((Var_declBContext)_localctx).BOOLEAN = match(BOOLEAN);

									
									
									t.crearTabla((((Var_declBContext)_localctx).ASSIGN!=null?((Var_declBContext)_localctx).ASSIGN.getLine():0),(((Var_declBContext)_localctx).ASSIGN!=null?((Var_declBContext)_localctx).ASSIGN.getText():null),"Asignacion","Clase","",0,"");
									t.crearTabla((((Var_declBContext)_localctx).BOOLEAN!=null?((Var_declBContext)_localctx).BOOLEAN.getLine():0),(((Var_declBContext)_localctx).BOOLEAN!=null?((Var_declBContext)_localctx).BOOLEAN.getText():null),"Booleano","Clase","",0,"");
									
									numero=(((Var_declBContext)_localctx).BOOLEAN!=null?((Var_declBContext)_localctx).BOOLEAN.getText():null);  t.constantes.append("msg"+Integer.toString(msg)+": dd \""+(((Var_declBContext)_localctx).BOOLEAN!=null?((Var_declBContext)_localctx).BOOLEAN.getText():null)+"\" \n");
									t.programa.append("mov eax,msg"+Integer.toString(msg)+"\n");
									t.programa.append("mov ["+(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null)+"] , eax\n");
									msg++;
								
					}
				}

				setState(914); ((Var_declBContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								t.crearTabla((((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
								t.mapaDeclaraciones.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null)+": resd 1");
								fueDeclarada((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),numero); dataType.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"booleano");  numero="0"; menos="";
								if(hayFuncion){listaFuncion.add((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null));}
							
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(916); ((Var_declBContext)_localctx).CARACTER = match(CARACTER);
				setState(917); ((Var_declBContext)_localctx).ID = match(ID);

								
										
							t.crearTabla((((Var_declBContext)_localctx).CARACTER!=null?((Var_declBContext)_localctx).CARACTER.getLine():0),(((Var_declBContext)_localctx).CARACTER!=null?((Var_declBContext)_localctx).CARACTER.getText():null),"Palabra reservada","Clase","",0,"");
							t.crearTabla((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"Identificador","Variable local","0",0,"1 byte");
								
								
							
				setState(922);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(919); ((Var_declBContext)_localctx).ASSIGN = match(ASSIGN);
					setState(920); ((Var_declBContext)_localctx).CAR = match(CAR);
					numero=(((Var_declBContext)_localctx).CAR!=null?((Var_declBContext)_localctx).CAR.getText():null); 
									
									t.crearTabla((((Var_declBContext)_localctx).ASSIGN!=null?((Var_declBContext)_localctx).ASSIGN.getLine():0),(((Var_declBContext)_localctx).ASSIGN!=null?((Var_declBContext)_localctx).ASSIGN.getText():null),"Asignacion","Clase","",0,"");
									t.crearTabla((((Var_declBContext)_localctx).CAR!=null?((Var_declBContext)_localctx).CAR.getLine():0),(((Var_declBContext)_localctx).CAR!=null?((Var_declBContext)_localctx).CAR.getText():null),"Caracter","Clase","",0,"");
									
									t.constantes.append("msg"+Integer.toString(msg)+": dd "+(((Var_declBContext)_localctx).CAR!=null?((Var_declBContext)_localctx).CAR.getText():null)+"\n");
								    t.programa.append("mov eax,msg"+Integer.toString(msg)+"\n");
									t.programa.append("mov ["+(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null)+"] , eax\n");
									msg++;
									
								
					}
				}

				setState(924); ((Var_declBContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								t.crearTabla((((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
								t.mapaDeclaraciones.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null)+": resd 1");
								fueDeclarada((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),numero); dataType.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"caracter");  numero="0"; menos="";
								if(hayFuncion){listaFuncion.add((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null));}
							
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(926); ((Var_declBContext)_localctx).STRING = match(STRING);
				setState(927); ((Var_declBContext)_localctx).ID = match(ID);

								
								t.crearTabla((((Var_declBContext)_localctx).STRING!=null?((Var_declBContext)_localctx).STRING.getLine():0),(((Var_declBContext)_localctx).STRING!=null?((Var_declBContext)_localctx).STRING.getText():null),"Palabra reservada","Clase","",0,"");
							    t.crearTabla((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"Identificador","Cadena","0",0,"255 bytes");
								
								
							
				setState(932);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(929); ((Var_declBContext)_localctx).ASSIGN = match(ASSIGN);
					setState(930); ((Var_declBContext)_localctx).CAR = match(CAR);
					numero=(((Var_declBContext)_localctx).CAR!=null?((Var_declBContext)_localctx).CAR.getText():null);
									
									t.constantes.append("msg"+Integer.toString(msg)+": dd "+(((Var_declBContext)_localctx).CAR!=null?((Var_declBContext)_localctx).CAR.getText():null)+"\n");
								    t.programa.append("mov eax,msg"+Integer.toString(msg)+"\n");
									t.programa.append("mov ["+(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null)+"] , eax\n");
									msg++;
									
									t.crearTabla((((Var_declBContext)_localctx).ASSIGN!=null?((Var_declBContext)_localctx).ASSIGN.getLine():0),(((Var_declBContext)_localctx).ASSIGN!=null?((Var_declBContext)_localctx).ASSIGN.getText():null),"Asignacion","Clase","",0,"");
									t.crearTabla((((Var_declBContext)_localctx).CAR!=null?((Var_declBContext)_localctx).CAR.getLine():0),(((Var_declBContext)_localctx).CAR!=null?((Var_declBContext)_localctx).CAR.getText():null),"Caracter","Clase","",0,"");
									
								
					}
				}

				setState(934); ((Var_declBContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								t.crearTabla((((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
								t.mapaDeclaraciones.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null)+": resd 1");
								fueDeclarada((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),numero); dataType.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"string");  numero="0"; menos="";
								if(hayFuncion){listaFuncion.add((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null));}
							
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(936); ((Var_declBContext)_localctx).ENTERO = match(ENTERO);
				setState(937); ((Var_declBContext)_localctx).ID = match(ID);
				setState(938); ((Var_declBContext)_localctx).COR_OP = match(COR_OP);
				setState(939); ((Var_declBContext)_localctx).NUMBER = match(NUMBER);
				setState(940); ((Var_declBContext)_localctx).COR_CLOSE = match(COR_CLOSE);
				setState(941); ((Var_declBContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);
				fueDeclarada((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0));symbolTable.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"0"); dataType.put((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"entero");  numero="0"; menos="";
								if(hayFuncion){listaFuncion.add((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null));}
							
							
							
								t.crearTabla((((Var_declBContext)_localctx).ENTERO!=null?((Var_declBContext)_localctx).ENTERO.getLine():0),(((Var_declBContext)_localctx).ENTERO!=null?((Var_declBContext)_localctx).ENTERO.getText():null),"Palabra reservada","Clase","",0,"");
								t.crearTabla((((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getLine():0),(((Var_declBContext)_localctx).ID!=null?((Var_declBContext)_localctx).ID.getText():null),"Variable local","Clase","0",0,Integer.toString(Integer.parseInt((((Var_declBContext)_localctx).NUMBER!=null?((Var_declBContext)_localctx).NUMBER.getText():null))*4)+" bytes");
								t.crearTabla((((Var_declBContext)_localctx).COR_OP!=null?((Var_declBContext)_localctx).COR_OP.getLine():0),(((Var_declBContext)_localctx).COR_OP!=null?((Var_declBContext)_localctx).COR_OP.getText():null),"Separador","Clase","",0,"");
								t.crearTabla((((Var_declBContext)_localctx).NUMBER!=null?((Var_declBContext)_localctx).NUMBER.getLine():0),(((Var_declBContext)_localctx).NUMBER!=null?((Var_declBContext)_localctx).NUMBER.getText():null),"Numero entero","Clase","",0,"");
								t.crearTabla((((Var_declBContext)_localctx).COR_CLOSE!=null?((Var_declBContext)_localctx).COR_CLOSE.getLine():0),(((Var_declBContext)_localctx).COR_CLOSE!=null?((Var_declBContext)_localctx).COR_CLOSE.getText():null),"Separador","Clase","",0,"");
								t.crearTabla((((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getLine():0),(((Var_declBContext)_localctx).PUNTO_COMA!=null?((Var_declBContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Clase","",0,"");
							
							
							
							
							
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_assignContext extends ParserRuleContext {
		public Token ID;
		public Token ASSIGN;
		public TermContext term;
		public Token PUNTO_COMA;
		public ExpresionContext expresion;
		public Token COR_OP;
		public Token NUMBER;
		public Token COR_CLOSE;
		public Token t5;
		public Inc_decContext inc_dec;
		public TerminalNode COR_CLOSE() { return getToken(HelloParser.COR_CLOSE, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HelloParser.ASSIGN, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(HelloParser.NUMBER, i);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COR_OP() { return getToken(HelloParser.COR_OP, 0); }
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(HelloParser.NUMBER); }
		public LlamarFuncionContext llamarFuncion() {
			return getRuleContext(LlamarFuncionContext.class,0);
		}
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVar_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitVar_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_var_assign);
		try {
			setState(977);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(945); ((Var_assignContext)_localctx).ID = match(ID);
				setState(946); ((Var_assignContext)_localctx).ASSIGN = match(ASSIGN);
				setState(947); ((Var_assignContext)_localctx).term = term();
				setState(948); ((Var_assignContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

				 		//System.out.println("valor "+((Var_assignContext)_localctx).term.value);
				 		verificaAsignacion((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),(String)((Var_assignContext)_localctx).term.value,(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getLine():0));
				 		t.programa.append("mov ["+(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null)+"] ,eax\n");
				 		
				 		t.crearTabla((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getLine():0),(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),"Identificador","Bloque","",((Var_assignContext)_localctx).term.value.toString(),"");
				 		t.crearTabla((((Var_assignContext)_localctx).ASSIGN!=null?((Var_assignContext)_localctx).ASSIGN.getLine():0),(((Var_assignContext)_localctx).ASSIGN!=null?((Var_assignContext)_localctx).ASSIGN.getText():null),"Asignacion","Bloque","",0,"");
				 		t.crearTabla((((Var_assignContext)_localctx).PUNTO_COMA!=null?((Var_assignContext)_localctx).PUNTO_COMA.getLine():0),(((Var_assignContext)_localctx).PUNTO_COMA!=null?((Var_assignContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
				 		
				 		 	
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(951); ((Var_assignContext)_localctx).ID = match(ID);
				setState(952); ((Var_assignContext)_localctx).ASSIGN = match(ASSIGN);
				setState(953); llamarFuncion();
				setState(954); ((Var_assignContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

				     		seEncuentra((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getLine():0));
				     		
				     	t.crearTabla((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getLine():0),(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
				 		t.crearTabla((((Var_assignContext)_localctx).ASSIGN!=null?((Var_assignContext)_localctx).ASSIGN.getLine():0),(((Var_assignContext)_localctx).ASSIGN!=null?((Var_assignContext)_localctx).ASSIGN.getText():null),"Asignacion","Bloque","",0,"");
				 		t.crearTabla((((Var_assignContext)_localctx).PUNTO_COMA!=null?((Var_assignContext)_localctx).PUNTO_COMA.getLine():0),(((Var_assignContext)_localctx).PUNTO_COMA!=null?((Var_assignContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");

				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(957); ((Var_assignContext)_localctx).ID = match(ID);
				setState(958); ((Var_assignContext)_localctx).ASSIGN = match(ASSIGN);
				setState(959); ((Var_assignContext)_localctx).expresion = expresion();
				setState(960); ((Var_assignContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

				    	
				 		//System.out.println("Valor de "+(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null)+" valor "+((Var_assignContext)_localctx).expresion.value);
				 		seEncuentra((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getLine():0));
				 		agregarAlaTabla((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),((Var_assignContext)_localctx).expresion.value);
				 		
				 		//guardar expresion
				 		
				 		t.programa.append("mov ["+(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null)+"] ,eax\n");
				 		t.programa.append("add esp,4\n");
				 		
				 		
				 		
				 		t.crearTabla((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getLine():0),(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),"Identificador","Bloque","",((Var_assignContext)_localctx).expresion.value.toString(),"");	
				 		t.crearTabla((((Var_assignContext)_localctx).ASSIGN!=null?((Var_assignContext)_localctx).ASSIGN.getLine():0),(((Var_assignContext)_localctx).ASSIGN!=null?((Var_assignContext)_localctx).ASSIGN.getText():null),"Asignacion","Bloque","",0,"");
				 		t.crearTabla((((Var_assignContext)_localctx).PUNTO_COMA!=null?((Var_assignContext)_localctx).PUNTO_COMA.getLine():0),(((Var_assignContext)_localctx).PUNTO_COMA!=null?((Var_assignContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
				 		
				 	
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(963); ((Var_assignContext)_localctx).ID = match(ID);
				setState(964); ((Var_assignContext)_localctx).COR_OP = match(COR_OP);
				setState(965); ((Var_assignContext)_localctx).NUMBER = match(NUMBER);
				setState(966); ((Var_assignContext)_localctx).COR_CLOSE = match(COR_CLOSE);
				setState(967); ((Var_assignContext)_localctx).ASSIGN = match(ASSIGN);
				setState(968); ((Var_assignContext)_localctx).t5 = match(NUMBER);
				setState(969); ((Var_assignContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);
				seEncuentra((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getLine():0));
				    	
				    	t.crearTabla((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getLine():0),(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),"Identificador","Bloque","",(((Var_assignContext)_localctx).t5!=null?((Var_assignContext)_localctx).t5.getText():null),"");
				    	t.crearTabla((((Var_assignContext)_localctx).COR_OP!=null?((Var_assignContext)_localctx).COR_OP.getLine():0),(((Var_assignContext)_localctx).COR_OP!=null?((Var_assignContext)_localctx).COR_OP.getText():null),"Separador","Bloque","",0,"");
				 		t.crearTabla((((Var_assignContext)_localctx).NUMBER!=null?((Var_assignContext)_localctx).NUMBER.getLine():0),(((Var_assignContext)_localctx).NUMBER!=null?((Var_assignContext)_localctx).NUMBER.getText():null),"Numero entero","Bloque","",0,"");
				 		t.crearTabla((((Var_assignContext)_localctx).COR_CLOSE!=null?((Var_assignContext)_localctx).COR_CLOSE.getLine():0),(((Var_assignContext)_localctx).COR_CLOSE!=null?((Var_assignContext)_localctx).COR_CLOSE.getText():null),"Separador","Bloque","",0,"");
				 		t.crearTabla((((Var_assignContext)_localctx).ASSIGN!=null?((Var_assignContext)_localctx).ASSIGN.getLine():0),(((Var_assignContext)_localctx).ASSIGN!=null?((Var_assignContext)_localctx).ASSIGN.getText():null),"Asignacion","Bloque","",0,"");
				 		t.crearTabla((((Var_assignContext)_localctx).t5!=null?((Var_assignContext)_localctx).t5.getLine():0),(((Var_assignContext)_localctx).t5!=null?((Var_assignContext)_localctx).t5.getText():null),"Numero entero","Bloque","",0,"");
				 		t.crearTabla((((Var_assignContext)_localctx).PUNTO_COMA!=null?((Var_assignContext)_localctx).PUNTO_COMA.getLine():0),(((Var_assignContext)_localctx).PUNTO_COMA!=null?((Var_assignContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
				    	
				    	
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(971); ((Var_assignContext)_localctx).ID = match(ID);
				setState(972); ((Var_assignContext)_localctx).ASSIGN = match(ASSIGN);
				setState(973); ((Var_assignContext)_localctx).inc_dec = inc_dec();
				setState(974); ((Var_assignContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

				    	
				    
				    	seEncuentra((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getLine():0));
				    	agregarAlaTabla((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),((Var_assignContext)_localctx).inc_dec.value);
				    	t.programa.append("mov ["+(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null)+"],eax\n");
				    	
				    	t.crearTabla((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getLine():0),(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),"Identificador","Bloque","",((Var_assignContext)_localctx).inc_dec.value.toString(),"");
				 		t.crearTabla((((Var_assignContext)_localctx).ASSIGN!=null?((Var_assignContext)_localctx).ASSIGN.getLine():0),(((Var_assignContext)_localctx).ASSIGN!=null?((Var_assignContext)_localctx).ASSIGN.getText():null),"Asignacion","Bloque","",0,"");
				 		t.crearTabla((((Var_assignContext)_localctx).PUNTO_COMA!=null?((Var_assignContext)_localctx).PUNTO_COMA.getLine():0),(((Var_assignContext)_localctx).PUNTO_COMA!=null?((Var_assignContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inc_decContext extends ParserRuleContext {
		public Object value;
		public Token ID;
		public Token SUMA;
		public Token MENOS;
		public TerminalNode SUMA(int i) {
			return getToken(HelloParser.SUMA, i);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public List<TerminalNode> MENOS() { return getTokens(HelloParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(HelloParser.MENOS, i);
		}
		public List<TerminalNode> SUMA() { return getTokens(HelloParser.SUMA); }
		public Inc_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitInc_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitInc_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_inc_dec);
		try {
			setState(987);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(979); ((Inc_decContext)_localctx).ID = match(ID);
				setState(980); ((Inc_decContext)_localctx).SUMA = match(SUMA);
				setState(981); ((Inc_decContext)_localctx).SUMA = match(SUMA);
				((Inc_decContext)_localctx).value = retornaNumero(retornaValor((((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getText():null),(((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getLine():0)).toString(),(((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getLine():0))+1; 
					    	
					    	if(!dataType.get((((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getText():null)).toString().equals("entero")){
					    		t.agregarErrores("Error tipo de dato no aceptado "+(((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getText():null)+" linea "+(((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getLine():0));
					    	}
					    	
					    	t.programa.append("mov eax , ["+(((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getText():null)+"]\n");
					    	t.programa.append("inc eax\n");
					    	
					    	t.crearTabla((((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getLine():0),(((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
					    	t.crearTabla((((Inc_decContext)_localctx).SUMA!=null?((Inc_decContext)_localctx).SUMA.getLine():0),(((Inc_decContext)_localctx).SUMA!=null?((Inc_decContext)_localctx).SUMA.getText():null),"Operadores","Bloque","",0,"");
					    	t.crearTabla((((Inc_decContext)_localctx).SUMA!=null?((Inc_decContext)_localctx).SUMA.getLine():0),(((Inc_decContext)_localctx).SUMA!=null?((Inc_decContext)_localctx).SUMA.getText():null),"Operadores","Bloque","",0,"");
					    	
					    	
					    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(983); ((Inc_decContext)_localctx).ID = match(ID);
				setState(984); ((Inc_decContext)_localctx).MENOS = match(MENOS);
				setState(985); ((Inc_decContext)_localctx).MENOS = match(MENOS);
				((Inc_decContext)_localctx).value = retornaNumero(retornaValor((((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getText():null),(((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getLine():0)).toString(),(((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getLine():0))-1;
							
							t.programa.append("mov eax , ["+(((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getText():null)+"]\n");
					    	t.programa.append("dec eax\n");
					    	
					    	t.crearTabla((((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getLine():0),(((Inc_decContext)_localctx).ID!=null?((Inc_decContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
					    	t.crearTabla((((Inc_decContext)_localctx).MENOS!=null?((Inc_decContext)_localctx).MENOS.getLine():0),(((Inc_decContext)_localctx).MENOS!=null?((Inc_decContext)_localctx).MENOS.getText():null),"Operadores","Bloque","",0,"");
					    	t.crearTabla((((Inc_decContext)_localctx).MENOS!=null?((Inc_decContext)_localctx).MENOS.getLine():0),(((Inc_decContext)_localctx).MENOS!=null?((Inc_decContext)_localctx).MENOS.getText():null),"Operadores","Bloque","",0,"");
							
						
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public Object value;
		public FactorContext t1;
		public OpMatContext opMat;
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<OpMatContext> opMat() {
			return getRuleContexts(OpMatContext.class);
		}
		public OpMatContext opMat(int i) {
			return getRuleContext(OpMatContext.class,i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989); ((ExpresionContext)_localctx).t1 = factor();
			((ExpresionContext)_localctx).value =  (int)((ExpresionContext)_localctx).t1.value;
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMA || _la==MENOS) {
				{
				{
				setState(991); ((ExpresionContext)_localctx).opMat = opMat();
				setState(992); ((ExpresionContext)_localctx).t2 = factor();

							
							t.programa.append("pop ecx\n");
							t.programa.append("pop eax\n");
							if((((ExpresionContext)_localctx).opMat!=null?_input.getText(((ExpresionContext)_localctx).opMat.start,((ExpresionContext)_localctx).opMat.stop):null).equals("+")){
								t.programa.append("add eax,ecx\n");
								((ExpresionContext)_localctx).value =  (int)_localctx.value + (int)((ExpresionContext)_localctx).t2.value;	
							}
							else{
								t.programa.append("sub eax,ecx\n");
								((ExpresionContext)_localctx).value =  (int)_localctx.value - (int)((ExpresionContext)_localctx).t2.value;
							}
							
							t.programa.append("push eax\n");			

								
							
				}
				}
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Object value;
		public Term2Context t1;
		public OpMayorContext opMayor;
		public Term2Context t2;
		public List<Term2Context> term2() {
			return getRuleContexts(Term2Context.class);
		}
		public OpMayorContext opMayor(int i) {
			return getRuleContext(OpMayorContext.class,i);
		}
		public Term2Context term2(int i) {
			return getRuleContext(Term2Context.class,i);
		}
		public List<OpMayorContext> opMayor() {
			return getRuleContexts(OpMayorContext.class);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000); ((FactorContext)_localctx).t1 = term2();
			((FactorContext)_localctx).value =  (int)((FactorContext)_localctx).t1.value; 
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(1002); ((FactorContext)_localctx).opMayor = opMayor();
				setState(1003); ((FactorContext)_localctx).t2 = term2();

						 
							t.programa.append("pop ecx\n");
							t.programa.append("pop eax\n");
							
							if((((FactorContext)_localctx).opMayor!=null?_input.getText(((FactorContext)_localctx).opMayor.start,((FactorContext)_localctx).opMayor.stop):null).equals("*")){
								t.programa.append("mul ecx\n");
								((FactorContext)_localctx).value =  (int)_localctx.value * (int)((FactorContext)_localctx).t2.value ;	
							}
							else{
								t.programa.append("div ecx\n");
								((FactorContext)_localctx).value =  (int)_localctx.value / (int)((FactorContext)_localctx).t2.value ;	
							}
							
							
							t.programa.append("push eax\n");
						
					
				}
				}
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpMatContext extends ParserRuleContext {
		public Token SUMA;
		public Token MENOS;
		public TerminalNode MENOS() { return getToken(HelloParser.MENOS, 0); }
		public TerminalNode SUMA() { return getToken(HelloParser.SUMA, 0); }
		public OpMatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opMat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOpMat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOpMat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitOpMat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpMatContext opMat() throws RecognitionException {
		OpMatContext _localctx = new OpMatContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_opMat);
		try {
			setState(1015);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011); ((OpMatContext)_localctx).SUMA = match(SUMA);

							    	
					    	t.crearTabla((((OpMatContext)_localctx).SUMA!=null?((OpMatContext)_localctx).SUMA.getLine():0),(((OpMatContext)_localctx).SUMA!=null?((OpMatContext)_localctx).SUMA.getText():null),"Operadores","Bloque","",0,"");
					    	
					
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013); ((OpMatContext)_localctx).MENOS = match(MENOS);

						t.crearTabla((((OpMatContext)_localctx).MENOS!=null?((OpMatContext)_localctx).MENOS.getLine():0),(((OpMatContext)_localctx).MENOS!=null?((OpMatContext)_localctx).MENOS.getText():null),"Operadores","Bloque","",0,"");
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpMayorContext extends ParserRuleContext {
		public Token DIV;
		public Token MULT;
		public TerminalNode MULT() { return getToken(HelloParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(HelloParser.DIV, 0); }
		public OpMayorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opMayor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOpMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOpMayor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitOpMayor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpMayorContext opMayor() throws RecognitionException {
		OpMayorContext _localctx = new OpMayorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_opMayor);
		try {
			setState(1021);
			switch (_input.LA(1)) {
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(1017); ((OpMayorContext)_localctx).DIV = match(DIV);

						
						t.crearTabla((((OpMayorContext)_localctx).DIV!=null?((OpMayorContext)_localctx).DIV.getLine():0),(((OpMayorContext)_localctx).DIV!=null?((OpMayorContext)_localctx).DIV.getText():null),"Operadores","Bloque","",0,"");
						
						
					
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1019); ((OpMayorContext)_localctx).MULT = match(MULT);

						t.crearTabla((((OpMayorContext)_localctx).MULT!=null?((OpMayorContext)_localctx).MULT.getLine():0),(((OpMayorContext)_localctx).MULT!=null?((OpMayorContext)_localctx).MULT.getText():null),"Operadores","Bloque","",0,"");
						
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Object value;
		public Token NUMBER;
		public Token BOOLEAN;
		public Token ID;
		public Token CAR;
		public Token NUMBER_FLOAT;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode CAR() { return getToken(HelloParser.CAR, 0); }
		public TerminalNode NUMBER_FLOAT() { return getToken(HelloParser.NUMBER_FLOAT, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_term);
		try {
			setState(1033);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023); ((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).value =  menos+(((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null);
						t.programa.append("mov eax ,"+menos+(((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)+"\n");
						menos="";
						t.crearTabla((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getLine():0),(((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null),"Numero entero","Bloque","",0,"");
					
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1025); ((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermContext)_localctx).value =  (((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null);
						
						t.constantes.append("msg"+Integer.toString(msg)+":  dd \""+(((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null)+"\" \n");
						t.programa.append("mov eax, msg"+Integer.toString(msg)+"\n");
						msg++;
						
						
						
						t.crearTabla((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getLine():0),(((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null),"Booleano","Bloque","",0,"");
						
					
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(1027); ((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).value =  retornaValor((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null),(((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getLine():0));
						
						t.programa.append("mov eax ,["+(((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null)+"]\n");
						
						t.crearTabla((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getLine():0),(((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
					
				}
				break;
			case CAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1029); ((TermContext)_localctx).CAR = match(CAR);
				((TermContext)_localctx).value =  (((TermContext)_localctx).CAR!=null?((TermContext)_localctx).CAR.getText():null); 
						
						t.constantes.append("msg"+Integer.toString(msg)+":  dd "+(((TermContext)_localctx).CAR!=null?((TermContext)_localctx).CAR.getText():null)+"\n");
						t.programa.append("mov eax, msg"+Integer.toString(msg)+"\n");
						msg++;
						
						t.crearTabla((((TermContext)_localctx).CAR!=null?((TermContext)_localctx).CAR.getLine():0),(((TermContext)_localctx).CAR!=null?((TermContext)_localctx).CAR.getText():null),"Caracter","Bloque","",0,"");
						
					
				}
				break;
			case NUMBER_FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1031); ((TermContext)_localctx).NUMBER_FLOAT = match(NUMBER_FLOAT);
				((TermContext)_localctx).value =  menos+(((TermContext)_localctx).NUMBER_FLOAT!=null?((TermContext)_localctx).NUMBER_FLOAT.getText():null); menos=""; t.programa.append("mov eax ,0\n");
						
						t.crearTabla((((TermContext)_localctx).NUMBER_FLOAT!=null?((TermContext)_localctx).NUMBER_FLOAT.getLine():0),(((TermContext)_localctx).NUMBER_FLOAT!=null?((TermContext)_localctx).NUMBER_FLOAT.getText():null),"Numero flotante","Bloque","",0,"");
						
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlamarFuncionContext extends ParserRuleContext {
		public Token t1;
		public Token PAR_OP;
		public Token ID;
		public Token COMA;
		public Token PAR_CLOSE;
		public Token PUNTO_COMA;
		public List<TerminalNode> ID() { return getTokens(HelloParser.ID); }
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public TerminalNode COMA(int i) {
			return getToken(HelloParser.COMA, i);
		}
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
		public TerminalNode ID(int i) {
			return getToken(HelloParser.ID, i);
		}
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public List<TerminalNode> COMA() { return getTokens(HelloParser.COMA); }
		public LlamarFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamarFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLlamarFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLlamarFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLlamarFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamarFuncionContext llamarFuncion() throws RecognitionException {
		LlamarFuncionContext _localctx = new LlamarFuncionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_llamarFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035); ((LlamarFuncionContext)_localctx).t1 = match(ID);
			seEncuentraFuncion((((LlamarFuncionContext)_localctx).t1!=null?((LlamarFuncionContext)_localctx).t1.getText():null),(((LlamarFuncionContext)_localctx).ID!=null?((LlamarFuncionContext)_localctx).ID.getLine():0));
						
						t.crearTabla((((LlamarFuncionContext)_localctx).t1!=null?((LlamarFuncionContext)_localctx).t1.getLine():0),(((LlamarFuncionContext)_localctx).t1!=null?((LlamarFuncionContext)_localctx).t1.getText():null),"Identificador","Bloque","",0,"");
					
			setState(1037); ((LlamarFuncionContext)_localctx).PAR_OP = match(PAR_OP);
			t.crearTabla((((LlamarFuncionContext)_localctx).PAR_OP!=null?((LlamarFuncionContext)_localctx).PAR_OP.getLine():0),(((LlamarFuncionContext)_localctx).PAR_OP!=null?((LlamarFuncionContext)_localctx).PAR_OP.getText():null),"Separador","Bloque","",0,"");
			setState(1049);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1039); ((LlamarFuncionContext)_localctx).ID = match(ID);

							
							seEncuentra((((LlamarFuncionContext)_localctx).ID!=null?((LlamarFuncionContext)_localctx).ID.getText():null),(((LlamarFuncionContext)_localctx).ID!=null?((LlamarFuncionContext)_localctx).ID.getLine():0)); contadorParametros++;
							t.crearTabla((((LlamarFuncionContext)_localctx).ID!=null?((LlamarFuncionContext)_localctx).ID.getLine():0),(((LlamarFuncionContext)_localctx).ID!=null?((LlamarFuncionContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
						
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(1041); ((LlamarFuncionContext)_localctx).COMA = match(COMA);
					setState(1042); ((LlamarFuncionContext)_localctx).ID = match(ID);

									
									seEncuentra((((LlamarFuncionContext)_localctx).ID!=null?((LlamarFuncionContext)_localctx).ID.getText():null),(((LlamarFuncionContext)_localctx).ID!=null?((LlamarFuncionContext)_localctx).ID.getLine():0)); contadorParametros++;
									
									t.crearTabla((((LlamarFuncionContext)_localctx).COMA!=null?((LlamarFuncionContext)_localctx).COMA.getLine():0),(((LlamarFuncionContext)_localctx).COMA!=null?((LlamarFuncionContext)_localctx).COMA.getText():null),"Separador","Bloque","",0,"");
									t.crearTabla((((LlamarFuncionContext)_localctx).ID!=null?((LlamarFuncionContext)_localctx).ID.getLine():0),(((LlamarFuncionContext)_localctx).ID!=null?((LlamarFuncionContext)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
									
								
					}
					}
					setState(1048);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1051); ((LlamarFuncionContext)_localctx).PAR_CLOSE = match(PAR_CLOSE);
			setState(1052); ((LlamarFuncionContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

						
						String com=funcion.get((((LlamarFuncionContext)_localctx).t1!=null?((LlamarFuncionContext)_localctx).t1.getText():null)).toString();
				
						if(!com.equals(Integer.toString(contadorParametros))){
							t.agregarErrores("Error parametros no coinciden con la funcion "+Integer.toString((((LlamarFuncionContext)_localctx).t1!=null?((LlamarFuncionContext)_localctx).t1.getLine():0)));
						}
						
						contadorParametros=0;
						
						t.crearTabla((((LlamarFuncionContext)_localctx).PAR_CLOSE!=null?((LlamarFuncionContext)_localctx).PAR_CLOSE.getLine():0),(((LlamarFuncionContext)_localctx).PAR_CLOSE!=null?((LlamarFuncionContext)_localctx).PAR_CLOSE.getText():null),"Separador","Bloque","",0,"");
						t.crearTabla((((LlamarFuncionContext)_localctx).PUNTO_COMA!=null?((LlamarFuncionContext)_localctx).PUNTO_COMA.getLine():0),(((LlamarFuncionContext)_localctx).PUNTO_COMA!=null?((LlamarFuncionContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Bloque","",0,"");
						
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Term2Context extends ParserRuleContext {
		public Object value;
		public Token NUMBER;
		public Token PAR_OP;
		public ExpresionContext expresion;
		public Token PAR_CLOSE;
		public Token ID;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public Term2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTerm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTerm2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTerm2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term2Context term2() throws RecognitionException {
		Term2Context _localctx = new Term2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_term2);
		try {
			setState(1065);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1055); ((Term2Context)_localctx).NUMBER = match(NUMBER);
				((Term2Context)_localctx).value =  Integer.parseInt((((Term2Context)_localctx).NUMBER!=null?((Term2Context)_localctx).NUMBER.getText():null)); ;  
						
						t.programa.append("mov ecx , "+(((Term2Context)_localctx).NUMBER!=null?((Term2Context)_localctx).NUMBER.getText():null)+"\n");
						t.programa.append("push ecx \n");
						t.crearTabla((((Term2Context)_localctx).NUMBER!=null?((Term2Context)_localctx).NUMBER.getLine():0),(((Term2Context)_localctx).NUMBER!=null?((Term2Context)_localctx).NUMBER.getText():null),"Numero entero","Bloque","",0,""); 
					
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057); ((Term2Context)_localctx).PAR_OP = match(PAR_OP);
				setState(1058); ((Term2Context)_localctx).expresion = expresion();
				 ((Term2Context)_localctx).value = ((Term2Context)_localctx).expresion.value;
				setState(1060); ((Term2Context)_localctx).PAR_CLOSE = match(PAR_CLOSE);

						
						
						t.crearTabla((((Term2Context)_localctx).PAR_OP!=null?((Term2Context)_localctx).PAR_OP.getLine():0),(((Term2Context)_localctx).PAR_OP!=null?((Term2Context)_localctx).PAR_OP.getText():null),"Separador","Bloque","",0,"");
						t.crearTabla((((Term2Context)_localctx).PAR_CLOSE!=null?((Term2Context)_localctx).PAR_CLOSE.getLine():0),(((Term2Context)_localctx).PAR_CLOSE!=null?((Term2Context)_localctx).PAR_CLOSE.getText():null),"Separador","Bloque","",0,"");
						
						
					
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(1063); ((Term2Context)_localctx).ID = match(ID);
				((Term2Context)_localctx).value = retornaNumero(retornaValor((((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getText():null),(((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getLine():0)).toString(),(((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getLine():0));
							
						if(symbolTable.containsKey((((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getText():null))){
							if(dataType.get((((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getText():null)).toString().equals("entero") || dataType.get((((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getText():null)).toString().equals("largo")){
								
							}else{
								t.agregarErrores("Error tipo de dato no aceptado "+Integer.toString((((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getLine():0)));
							}
						}
						
					  if(symbolTable.get((((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getText():null)).toString().equals("0")){
							t.programa.append("mov ecx, 0\n");
							
						}else{
						//	System.out.print("push dword  ["+(((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getText():null)+"]\n");	
						t.programa.append("mov ecx , ["+(((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getText():null)+"]\n");
						}
						
						
						
						
						t.programa.append("push ecx \n");
						t.crearTabla((((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getLine():0),(((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getText():null),"Identificador","Bloque","",0,"");
						
						 

					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantesContext extends ParserRuleContext {
		public Token DEFINE;
		public Token ID;
		public Token ASSIGN;
		public Token NUMBER;
		public Token PUNTO_COMA;
		public Token NUMBER_FLOAT;
		public Token BOOLEAN;
		public Token CAR;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HelloParser.ASSIGN, 0); }
		public TerminalNode DEFINE() { return getToken(HelloParser.DEFINE, 0); }
		public TerminalNode CAR() { return getToken(HelloParser.CAR, 0); }
		public TerminalNode NUMBER_FLOAT() { return getToken(HelloParser.NUMBER_FLOAT, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constantes);
		try {
			setState(1091);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1067); ((ConstantesContext)_localctx).DEFINE = match(DEFINE);
				setState(1068); ((ConstantesContext)_localctx).ID = match(ID);
				setState(1069); ((ConstantesContext)_localctx).ASSIGN = match(ASSIGN);
				setState(1070); ((ConstantesContext)_localctx).NUMBER = match(NUMBER);
				setState(1071); ((ConstantesContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);
				fueDeclarada((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),(((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getLine():0)); symbolTable.put((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),menos+(((ConstantesContext)_localctx).NUMBER!=null?((ConstantesContext)_localctx).NUMBER.getText():null)); dataType.put((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),"entero");
						    	 
						    	t.constantes.append((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null)+": dd "+menos+(((ConstantesContext)_localctx).NUMBER!=null?((ConstantesContext)_localctx).NUMBER.getText():null)+"\n");
						    	menos="";
						    	
						    	t.crearTabla((((ConstantesContext)_localctx).DEFINE!=null?((ConstantesContext)_localctx).DEFINE.getLine():0),(((ConstantesContext)_localctx).DEFINE!=null?((ConstantesContext)_localctx).DEFINE.getText():null),"Palabra reservada","Constantes","",0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getLine():0),(((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),"Identificador","Constantes",(((ConstantesContext)_localctx).NUMBER!=null?((ConstantesContext)_localctx).NUMBER.getText():null),0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).ASSIGN!=null?((ConstantesContext)_localctx).ASSIGN.getLine():0),(((ConstantesContext)_localctx).ASSIGN!=null?((ConstantesContext)_localctx).ASSIGN.getText():null),"Asignacion","Constantes","",0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).NUMBER!=null?((ConstantesContext)_localctx).NUMBER.getLine():0),(((ConstantesContext)_localctx).NUMBER!=null?((ConstantesContext)_localctx).NUMBER.getText():null),"Numero entero","Constantes","",0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).PUNTO_COMA!=null?((ConstantesContext)_localctx).PUNTO_COMA.getLine():0),(((ConstantesContext)_localctx).PUNTO_COMA!=null?((ConstantesContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Constantes","",0,"");
						    	
						    	
						    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073); ((ConstantesContext)_localctx).DEFINE = match(DEFINE);
				setState(1074); ((ConstantesContext)_localctx).ID = match(ID);
				setState(1075); ((ConstantesContext)_localctx).ASSIGN = match(ASSIGN);
				setState(1076); ((ConstantesContext)_localctx).NUMBER_FLOAT = match(NUMBER_FLOAT);
				setState(1077); ((ConstantesContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								
								t.constantes.append((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null)+": dq "+menos+(((ConstantesContext)_localctx).NUMBER_FLOAT!=null?((ConstantesContext)_localctx).NUMBER_FLOAT.getText():null)+"\n");
								fueDeclarada((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),(((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getLine():0)); symbolTable.put((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),menos+(((ConstantesContext)_localctx).NUMBER_FLOAT!=null?((ConstantesContext)_localctx).NUMBER_FLOAT.getText():null));menos="";
								dataType.put((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),"flotante");
								
								t.crearTabla((((ConstantesContext)_localctx).DEFINE!=null?((ConstantesContext)_localctx).DEFINE.getLine():0),(((ConstantesContext)_localctx).DEFINE!=null?((ConstantesContext)_localctx).DEFINE.getText():null),"Palabra reservada","Constantes","",0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getLine():0),(((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),"Identificador","Constantes",(((ConstantesContext)_localctx).NUMBER_FLOAT!=null?((ConstantesContext)_localctx).NUMBER_FLOAT.getText():null),0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).ASSIGN!=null?((ConstantesContext)_localctx).ASSIGN.getLine():0),(((ConstantesContext)_localctx).ASSIGN!=null?((ConstantesContext)_localctx).ASSIGN.getText():null),"Asignacion","Constantes","",0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).NUMBER_FLOAT!=null?((ConstantesContext)_localctx).NUMBER_FLOAT.getLine():0),(((ConstantesContext)_localctx).NUMBER_FLOAT!=null?((ConstantesContext)_localctx).NUMBER_FLOAT.getText():null),"Numero flotante","Constantes","",0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).PUNTO_COMA!=null?((ConstantesContext)_localctx).PUNTO_COMA.getLine():0),(((ConstantesContext)_localctx).PUNTO_COMA!=null?((ConstantesContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Constantes","",0,"");
								
							
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1079); ((ConstantesContext)_localctx).DEFINE = match(DEFINE);
				setState(1080); ((ConstantesContext)_localctx).ID = match(ID);
				setState(1081); ((ConstantesContext)_localctx).ASSIGN = match(ASSIGN);
				setState(1082); ((ConstantesContext)_localctx).BOOLEAN = match(BOOLEAN);
				setState(1083); ((ConstantesContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								
								fueDeclarada((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),(((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getLine():0)); symbolTable.put((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),(((ConstantesContext)_localctx).BOOLEAN!=null?((ConstantesContext)_localctx).BOOLEAN.getText():null));
								dataType.put((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),"booleano");
								t.constantes.append((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null)+": db \""+(((ConstantesContext)_localctx).BOOLEAN!=null?((ConstantesContext)_localctx).BOOLEAN.getText():null)+"\" ,10,0"+"\n");
								
								t.crearTabla((((ConstantesContext)_localctx).DEFINE!=null?((ConstantesContext)_localctx).DEFINE.getLine():0),(((ConstantesContext)_localctx).DEFINE!=null?((ConstantesContext)_localctx).DEFINE.getText():null),"Palabra reservada","Constantes","",0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getLine():0),(((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),"Identificador","Constantes",(((ConstantesContext)_localctx).BOOLEAN!=null?((ConstantesContext)_localctx).BOOLEAN.getText():null),0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).ASSIGN!=null?((ConstantesContext)_localctx).ASSIGN.getLine():0),(((ConstantesContext)_localctx).ASSIGN!=null?((ConstantesContext)_localctx).ASSIGN.getText():null),"Asignacion","Constantes","",0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).BOOLEAN!=null?((ConstantesContext)_localctx).BOOLEAN.getLine():0),(((ConstantesContext)_localctx).BOOLEAN!=null?((ConstantesContext)_localctx).BOOLEAN.getText():null),"Booleano","Constantes","",0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).PUNTO_COMA!=null?((ConstantesContext)_localctx).PUNTO_COMA.getLine():0),(((ConstantesContext)_localctx).PUNTO_COMA!=null?((ConstantesContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Constantes","",0,"");
								
							
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1085); ((ConstantesContext)_localctx).DEFINE = match(DEFINE);
				setState(1086); ((ConstantesContext)_localctx).ID = match(ID);
				setState(1087); ((ConstantesContext)_localctx).ASSIGN = match(ASSIGN);
				setState(1088); ((ConstantesContext)_localctx).CAR = match(CAR);
				setState(1089); ((ConstantesContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

								
								
								fueDeclarada((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),(((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getLine():0)); symbolTable.put((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),(((ConstantesContext)_localctx).CAR!=null?((ConstantesContext)_localctx).CAR.getText():null));
								dataType.put((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),"string");
								t.constantes.append((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null)+": db "+(((ConstantesContext)_localctx).CAR!=null?((ConstantesContext)_localctx).CAR.getText():null)+" ,10,0"+"\n");
								
								t.crearTabla((((ConstantesContext)_localctx).DEFINE!=null?((ConstantesContext)_localctx).DEFINE.getLine():0),(((ConstantesContext)_localctx).DEFINE!=null?((ConstantesContext)_localctx).DEFINE.getText():null),"Palabra reservada","Constantes","",0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getLine():0),(((ConstantesContext)_localctx).ID!=null?((ConstantesContext)_localctx).ID.getText():null),"Identificador","Constantes",(((ConstantesContext)_localctx).CAR!=null?((ConstantesContext)_localctx).CAR.getText():null),0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).ASSIGN!=null?((ConstantesContext)_localctx).ASSIGN.getLine():0),(((ConstantesContext)_localctx).ASSIGN!=null?((ConstantesContext)_localctx).ASSIGN.getText():null),"Asignacion","Constantes","",0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).CAR!=null?((ConstantesContext)_localctx).CAR.getLine():0),(((ConstantesContext)_localctx).CAR!=null?((ConstantesContext)_localctx).CAR.getText():null),"Booleano","Constantes","",0,"");
						    	t.crearTabla((((ConstantesContext)_localctx).PUNTO_COMA!=null?((ConstantesContext)_localctx).PUNTO_COMA.getLine():0),(((ConstantesContext)_localctx).PUNTO_COMA!=null?((ConstantesContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Constantes","",0,"");
							
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibreriaContext extends ParserRuleContext {
		public Token IMPORTA;
		public Token ID;
		public Token PUNTO_COMA;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode IMPORTA() { return getToken(HelloParser.IMPORTA, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public LibreriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libreria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLibreria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLibreria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLibreria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibreriaContext libreria() throws RecognitionException {
		LibreriaContext _localctx = new LibreriaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_libreria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093); ((LibreriaContext)_localctx).IMPORTA = match(IMPORTA);
			setState(1094); ((LibreriaContext)_localctx).ID = match(ID);
			setState(1095); ((LibreriaContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

						
						t.crearTabla((((LibreriaContext)_localctx).IMPORTA!=null?((LibreriaContext)_localctx).IMPORTA.getLine():0),(((LibreriaContext)_localctx).IMPORTA!=null?((LibreriaContext)_localctx).IMPORTA.getText():null),"Palabra reservada","Biblioteca","",0,"");
					    t.crearTabla((((LibreriaContext)_localctx).ID!=null?((LibreriaContext)_localctx).ID.getLine():0),(((LibreriaContext)_localctx).ID!=null?((LibreriaContext)_localctx).ID.getText():null),"Identificador","Biblioteca","",0,"");
					    t.crearTabla((((LibreriaContext)_localctx).PUNTO_COMA!=null?((LibreriaContext)_localctx).PUNTO_COMA.getLine():0),(((LibreriaContext)_localctx).PUNTO_COMA!=null?((LibreriaContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Biblioteca","",0,"");

						
						
						
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lib_constContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public LibreriaContext libreria() {
			return getRuleContext(LibreriaContext.class,0);
		}
		public Lib_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lib_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLib_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLib_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLib_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lib_constContext lib_const() throws RecognitionException {
		Lib_constContext _localctx = new Lib_constContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lib_const);
		try {
			setState(1100);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1098); constantes();
				}
				break;
			case IMPORTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099); libreria();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedimientoContext extends ParserRuleContext {
		public Token FUNCION;
		public Token ID;
		public Token PAR_OP;
		public Token PAR_CLOSE;
		public Token TERMINAFUNCION;
		public Token PUNTO_COMA;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public Parametros_funcionContext parametros_funcion(int i) {
			return getRuleContext(Parametros_funcionContext.class,i);
		}
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
		public TerminalNode FUNCION() { return getToken(HelloParser.FUNCION, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<Parametros_funcionContext> parametros_funcion() {
			return getRuleContexts(Parametros_funcionContext.class);
		}
		public TerminalNode TERMINAFUNCION() { return getToken(HelloParser.TERMINAFUNCION, 0); }
		public RestriccionContext restriccion() {
			return getRuleContext(RestriccionContext.class,0);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public ProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProcedimiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProcedimiento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitProcedimiento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedimientoContext procedimiento() throws RecognitionException {
		ProcedimientoContext _localctx = new ProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_procedimiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			_la = _input.LA(1);
			if (_la==PUBLICO || _la==PRIVADO) {
				{
				setState(1102); restriccion();
				}
			}

			setState(1105); ((ProcedimientoContext)_localctx).FUNCION = match(FUNCION);
			setState(1106); ((ProcedimientoContext)_localctx).ID = match(ID);
			setState(1107); ((ProcedimientoContext)_localctx).PAR_OP = match(PAR_OP);

						t.crearTabla((((ProcedimientoContext)_localctx).FUNCION!=null?((ProcedimientoContext)_localctx).FUNCION.getLine():0),(((ProcedimientoContext)_localctx).FUNCION!=null?((ProcedimientoContext)_localctx).FUNCION.getText():null),"Palabra reservada","Funcion","",0,"");
					    t.crearTabla((((ProcedimientoContext)_localctx).ID!=null?((ProcedimientoContext)_localctx).ID.getLine():0),(((ProcedimientoContext)_localctx).ID!=null?((ProcedimientoContext)_localctx).ID.getText():null),"Identificador","Funcion","",0,"");
					    t.crearTabla((((ProcedimientoContext)_localctx).PAR_OP!=null?((ProcedimientoContext)_localctx).PAR_OP.getLine():0),(((ProcedimientoContext)_localctx).PAR_OP!=null?((ProcedimientoContext)_localctx).PAR_OP.getText():null),"Separador","Funcion","",0,"");
				
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(1109); parametros_funcion();
				}
				}
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1115); ((ProcedimientoContext)_localctx).PAR_CLOSE = match(PAR_CLOSE);

					 t.crearTabla((((ProcedimientoContext)_localctx).PAR_CLOSE!=null?((ProcedimientoContext)_localctx).PAR_CLOSE.getLine():0),(((ProcedimientoContext)_localctx).PAR_CLOSE!=null?((ProcedimientoContext)_localctx).PAR_CLOSE.getText():null),"Separador","Funcion","",0,"");
					hayFuncion=true;fueDeclaradaFuncion((((ProcedimientoContext)_localctx).ID!=null?((ProcedimientoContext)_localctx).ID.getText():null),(((ProcedimientoContext)_localctx).ID!=null?((ProcedimientoContext)_localctx).ID.getLine():0)); listaFuncion.add((((ProcedimientoContext)_localctx).ID!=null?((ProcedimientoContext)_localctx).ID.getText():null));
				
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING) | (1L << EN_CASO) | (1L << REPITE) | (1L << MIENTRAS) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(1117); bloque();
				}
				}
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1123); ((ProcedimientoContext)_localctx).TERMINAFUNCION = match(TERMINAFUNCION);
			setState(1124); ((ProcedimientoContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

					

					   
					    t.crearTabla((((ProcedimientoContext)_localctx).TERMINAFUNCION!=null?((ProcedimientoContext)_localctx).TERMINAFUNCION.getLine():0),(((ProcedimientoContext)_localctx).TERMINAFUNCION!=null?((ProcedimientoContext)_localctx).TERMINAFUNCION.getText():null),"Palabra reservada","Funcion","",0,"");
					    t.crearTabla((((ProcedimientoContext)_localctx).PUNTO_COMA!=null?((ProcedimientoContext)_localctx).PUNTO_COMA.getLine():0),(((ProcedimientoContext)_localctx).PUNTO_COMA!=null?((ProcedimientoContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Funcion","",0,"");
					
					
					hayFuncion=false; limpiarVariablesFuncion(); contadorParametros=0; listaFuncion.clear();
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public Token ID;
		public Token PAR_OP;
		public Token PAR_CLOSE;
		public Token REGRESA;
		public Token PUNTO_COMA;
		public Token TERMINAFUNCION;
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(HelloParser.PUNTO_COMA, i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(HelloParser.PUNTO_COMA); }
		public List<Parametros_funcionContext> parametros_funcion() {
			return getRuleContexts(Parametros_funcionContext.class);
		}
		public TerminalNode TERMINAFUNCION() { return getToken(HelloParser.TERMINAFUNCION, 0); }
		public RestriccionContext restriccion() {
			return getRuleContext(RestriccionContext.class,0);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public Parametros_funcionContext parametros_funcion(int i) {
			return getRuleContext(Parametros_funcionContext.class,i);
		}
		public TerminalNode REGRESA() { return getToken(HelloParser.REGRESA, 0); }
		public TipoDedatoContext tipoDedato() {
			return getRuleContext(TipoDedatoContext.class,0);
		}
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
		public RegresaParametrosContext regresaParametros() {
			return getRuleContext(RegresaParametrosContext.class,0);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			_la = _input.LA(1);
			if (_la==PUBLICO || _la==PRIVADO) {
				{
				setState(1127); restriccion();
				}
			}

			setState(1130); tipoDedato();
			setState(1131); ((FuncionContext)_localctx).ID = match(ID);
			setState(1132); ((FuncionContext)_localctx).PAR_OP = match(PAR_OP);

							    t.crearTabla((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0),(((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),"Identificador","Funcion","",0,"");
					    t.crearTabla((((FuncionContext)_localctx).PAR_OP!=null?((FuncionContext)_localctx).PAR_OP.getLine():0),(((FuncionContext)_localctx).PAR_OP!=null?((FuncionContext)_localctx).PAR_OP.getText():null),"Separador","Funcion","",0,"");
				
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(1134); parametros_funcion();
				}
				}
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1140); ((FuncionContext)_localctx).PAR_CLOSE = match(PAR_CLOSE);

					 t.crearTabla((((FuncionContext)_localctx).PAR_CLOSE!=null?((FuncionContext)_localctx).PAR_CLOSE.getLine():0),(((FuncionContext)_localctx).PAR_CLOSE!=null?((FuncionContext)_localctx).PAR_CLOSE.getText():null),"Separador","Funcion","",0,"");
					hayFuncion=true;fueDeclaradaFuncion((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),(((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0)); listaFuncion.add((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null));
				
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << ENTERO) | (1L << FLOT) | (1L << BOOL) | (1L << CARACTER) | (1L << LARGO) | (1L << DOBLE) | (1L << STRING) | (1L << EN_CASO) | (1L << REPITE) | (1L << MIENTRAS) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(1142); bloque();
				}
				}
				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1148); ((FuncionContext)_localctx).REGRESA = match(REGRESA);
			 t.crearTabla((((FuncionContext)_localctx).REGRESA!=null?((FuncionContext)_localctx).REGRESA.getLine():0),(((FuncionContext)_localctx).REGRESA!=null?((FuncionContext)_localctx).REGRESA.getText():null),"Palabra reservada","Funcion","",0,"");
			setState(1150); regresaParametros();
			setState(1151); ((FuncionContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);
			setState(1152); ((FuncionContext)_localctx).TERMINAFUNCION = match(TERMINAFUNCION);
			setState(1153); ((FuncionContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

					
					
						

					   
					   
					    t.crearTabla((((FuncionContext)_localctx).PUNTO_COMA!=null?((FuncionContext)_localctx).PUNTO_COMA.getLine():0),(((FuncionContext)_localctx).PUNTO_COMA!=null?((FuncionContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Funcion","",0,"");
					    t.crearTabla((((FuncionContext)_localctx).TERMINAFUNCION!=null?((FuncionContext)_localctx).TERMINAFUNCION.getLine():0),(((FuncionContext)_localctx).TERMINAFUNCION!=null?((FuncionContext)_localctx).TERMINAFUNCION.getText():null),"Palabra reservada","Funcion","",0,"");
					    t.crearTabla((((FuncionContext)_localctx).PUNTO_COMA!=null?((FuncionContext)_localctx).PUNTO_COMA.getLine():0),(((FuncionContext)_localctx).PUNTO_COMA!=null?((FuncionContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","Funcion","",0,"");
					
					
					
					hayFuncion=false; limpiarVariablesFuncion(); contadorParametros=0; listaFuncion.clear();
					
					
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegresaParametrosContext extends ParserRuleContext {
		public Token NUMBER;
		public Token NUMBER_FLOAT;
		public Token BOOLEAN;
		public Token ID;
		public Token CAR;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode CAR() { return getToken(HelloParser.CAR, 0); }
		public TerminalNode NUMBER_FLOAT() { return getToken(HelloParser.NUMBER_FLOAT, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
		public RegresaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regresaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterRegresaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitRegresaParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitRegresaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegresaParametrosContext regresaParametros() throws RecognitionException {
		RegresaParametrosContext _localctx = new RegresaParametrosContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_regresaParametros);
		try {
			setState(1166);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156); ((RegresaParametrosContext)_localctx).NUMBER = match(NUMBER);
				 t.crearTabla((((RegresaParametrosContext)_localctx).NUMBER!=null?((RegresaParametrosContext)_localctx).NUMBER.getLine():0),(((RegresaParametrosContext)_localctx).NUMBER!=null?((RegresaParametrosContext)_localctx).NUMBER.getText():null),"Numero entero","Funcion","",0,"");
				}
				break;
			case NUMBER_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158); ((RegresaParametrosContext)_localctx).NUMBER_FLOAT = match(NUMBER_FLOAT);
				 t.crearTabla((((RegresaParametrosContext)_localctx).NUMBER_FLOAT!=null?((RegresaParametrosContext)_localctx).NUMBER_FLOAT.getLine():0),(((RegresaParametrosContext)_localctx).NUMBER_FLOAT!=null?((RegresaParametrosContext)_localctx).NUMBER_FLOAT.getText():null),"Numero flotante","Funcion","",0,"");
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1160); ((RegresaParametrosContext)_localctx).BOOLEAN = match(BOOLEAN);
				 t.crearTabla((((RegresaParametrosContext)_localctx).BOOLEAN!=null?((RegresaParametrosContext)_localctx).BOOLEAN.getLine():0),(((RegresaParametrosContext)_localctx).BOOLEAN!=null?((RegresaParametrosContext)_localctx).BOOLEAN.getText():null),"Booleano","Funcion","",0,"");
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(1162); ((RegresaParametrosContext)_localctx).ID = match(ID);
				fueDeclarada((((RegresaParametrosContext)_localctx).ID!=null?((RegresaParametrosContext)_localctx).ID.getText():null),(((RegresaParametrosContext)_localctx).ID!=null?((RegresaParametrosContext)_localctx).ID.getLine():0)); t.crearTabla((((RegresaParametrosContext)_localctx).ID!=null?((RegresaParametrosContext)_localctx).ID.getLine():0),(((RegresaParametrosContext)_localctx).ID!=null?((RegresaParametrosContext)_localctx).ID.getText():null),"Variable local","Funcion","",0,"");
				}
				break;
			case CAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(1164); ((RegresaParametrosContext)_localctx).CAR = match(CAR);
				t.crearTabla((((RegresaParametrosContext)_localctx).CAR!=null?((RegresaParametrosContext)_localctx).CAR.getLine():0),(((RegresaParametrosContext)_localctx).CAR!=null?((RegresaParametrosContext)_localctx).CAR.getText():null),"Caracter","Funcion","",0,"");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parametros_funcionContext extends ParserRuleContext {
		public TipoDedatoContext tipoDedato;
		public Token ID;
		public Token COMA;
		public List<TerminalNode> ID() { return getTokens(HelloParser.ID); }
		public List<TipoDedatoContext> tipoDedato() {
			return getRuleContexts(TipoDedatoContext.class);
		}
		public TerminalNode COMA(int i) {
			return getToken(HelloParser.COMA, i);
		}
		public TipoDedatoContext tipoDedato(int i) {
			return getRuleContext(TipoDedatoContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(HelloParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(HelloParser.COMA); }
		public Parametros_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterParametros_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitParametros_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitParametros_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_funcionContext parametros_funcion() throws RecognitionException {
		Parametros_funcionContext _localctx = new Parametros_funcionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parametros_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168); ((Parametros_funcionContext)_localctx).tipoDedato = tipoDedato();
			setState(1169); ((Parametros_funcionContext)_localctx).ID = match(ID);

					fueDeclarada((((Parametros_funcionContext)_localctx).ID!=null?((Parametros_funcionContext)_localctx).ID.getText():null),(((Parametros_funcionContext)_localctx).ID!=null?((Parametros_funcionContext)_localctx).ID.getLine():0)); symbolTable.put((((Parametros_funcionContext)_localctx).ID!=null?((Parametros_funcionContext)_localctx).ID.getText():null),0); dataType.put((((Parametros_funcionContext)_localctx).ID!=null?((Parametros_funcionContext)_localctx).ID.getText():null),((Parametros_funcionContext)_localctx).tipoDedato.value);contadorParametros++;listaFuncion.add((((Parametros_funcionContext)_localctx).ID!=null?((Parametros_funcionContext)_localctx).ID.getText():null));
					t.crearTabla((((Parametros_funcionContext)_localctx).ID!=null?((Parametros_funcionContext)_localctx).ID.getLine():0),(((Parametros_funcionContext)_localctx).ID!=null?((Parametros_funcionContext)_localctx).ID.getText():null),"Identificador","Variable local","",0,"");
				
			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(1171); ((Parametros_funcionContext)_localctx).COMA = match(COMA);

						t.crearTabla((((Parametros_funcionContext)_localctx).COMA!=null?((Parametros_funcionContext)_localctx).COMA.getLine():0),(((Parametros_funcionContext)_localctx).COMA!=null?((Parametros_funcionContext)_localctx).COMA.getText():null),"Separador","Funcion","",0,"");
					
				setState(1173); ((Parametros_funcionContext)_localctx).tipoDedato = tipoDedato();
				setState(1174); ((Parametros_funcionContext)_localctx).ID = match(ID);

						fueDeclarada((((Parametros_funcionContext)_localctx).ID!=null?((Parametros_funcionContext)_localctx).ID.getText():null),(((Parametros_funcionContext)_localctx).ID!=null?((Parametros_funcionContext)_localctx).ID.getLine():0)); symbolTable.put((((Parametros_funcionContext)_localctx).ID!=null?((Parametros_funcionContext)_localctx).ID.getText():null),0); dataType.put((((Parametros_funcionContext)_localctx).ID!=null?((Parametros_funcionContext)_localctx).ID.getText():null),((Parametros_funcionContext)_localctx).tipoDedato.value);contadorParametros++;listaFuncion.add((((Parametros_funcionContext)_localctx).ID!=null?((Parametros_funcionContext)_localctx).ID.getText():null));
						t.crearTabla((((Parametros_funcionContext)_localctx).ID!=null?((Parametros_funcionContext)_localctx).ID.getLine():0),(((Parametros_funcionContext)_localctx).ID!=null?((Parametros_funcionContext)_localctx).ID.getText():null),"Identificador","Variable local","",0,"");
					
				}
				}
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoDedatoContext extends ParserRuleContext {
		public Object value;
		public Token ENTERO;
		public Token FLOT;
		public Token BOOL;
		public Token CARACTER;
		public Token LARGO;
		public Token DOBLE;
		public Token STRING;
		public TerminalNode LARGO() { return getToken(HelloParser.LARGO, 0); }
		public TerminalNode BOOL() { return getToken(HelloParser.BOOL, 0); }
		public TerminalNode CARACTER() { return getToken(HelloParser.CARACTER, 0); }
		public TerminalNode DOBLE() { return getToken(HelloParser.DOBLE, 0); }
		public TerminalNode FLOT() { return getToken(HelloParser.FLOT, 0); }
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public TerminalNode ENTERO() { return getToken(HelloParser.ENTERO, 0); }
		public TipoDedatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDedato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTipoDedato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTipoDedato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTipoDedato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDedatoContext tipoDedato() throws RecognitionException {
		TipoDedatoContext _localctx = new TipoDedatoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tipoDedato);
		try {
			setState(1196);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182); ((TipoDedatoContext)_localctx).ENTERO = match(ENTERO);
				((TipoDedatoContext)_localctx).value = (((TipoDedatoContext)_localctx).ENTERO!=null?((TipoDedatoContext)_localctx).ENTERO.getText():null); t.crearTabla((((TipoDedatoContext)_localctx).ENTERO!=null?((TipoDedatoContext)_localctx).ENTERO.getLine():0),(((TipoDedatoContext)_localctx).ENTERO!=null?((TipoDedatoContext)_localctx).ENTERO.getText():null),"Palabra reservada","Funcion","",0,"");
				}
				break;
			case FLOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184); ((TipoDedatoContext)_localctx).FLOT = match(FLOT);
				((TipoDedatoContext)_localctx).value = (((TipoDedatoContext)_localctx).FLOT!=null?((TipoDedatoContext)_localctx).FLOT.getText():null); t.crearTabla((((TipoDedatoContext)_localctx).FLOT!=null?((TipoDedatoContext)_localctx).FLOT.getLine():0),(((TipoDedatoContext)_localctx).FLOT!=null?((TipoDedatoContext)_localctx).FLOT.getText():null),"Palabra reservada","Funcion","",0,"");
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1186); ((TipoDedatoContext)_localctx).BOOL = match(BOOL);
				((TipoDedatoContext)_localctx).value = (((TipoDedatoContext)_localctx).BOOL!=null?((TipoDedatoContext)_localctx).BOOL.getText():null); t.crearTabla((((TipoDedatoContext)_localctx).BOOL!=null?((TipoDedatoContext)_localctx).BOOL.getLine():0),(((TipoDedatoContext)_localctx).BOOL!=null?((TipoDedatoContext)_localctx).BOOL.getText():null),"Palabra reservada","Funcion","",0,"");
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1188); ((TipoDedatoContext)_localctx).CARACTER = match(CARACTER);
				((TipoDedatoContext)_localctx).value = (((TipoDedatoContext)_localctx).CARACTER!=null?((TipoDedatoContext)_localctx).CARACTER.getText():null); t.crearTabla((((TipoDedatoContext)_localctx).CARACTER!=null?((TipoDedatoContext)_localctx).CARACTER.getLine():0),(((TipoDedatoContext)_localctx).CARACTER!=null?((TipoDedatoContext)_localctx).CARACTER.getText():null),"Palabra reservada","Funcion","",0,"");
				}
				break;
			case LARGO:
				enterOuterAlt(_localctx, 5);
				{
				setState(1190); ((TipoDedatoContext)_localctx).LARGO = match(LARGO);
				((TipoDedatoContext)_localctx).value = (((TipoDedatoContext)_localctx).LARGO!=null?((TipoDedatoContext)_localctx).LARGO.getText():null); t.crearTabla((((TipoDedatoContext)_localctx).LARGO!=null?((TipoDedatoContext)_localctx).LARGO.getLine():0),(((TipoDedatoContext)_localctx).LARGO!=null?((TipoDedatoContext)_localctx).LARGO.getText():null),"Palabra reservada","Funcion","",0,"");
				}
				break;
			case DOBLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1192); ((TipoDedatoContext)_localctx).DOBLE = match(DOBLE);
				((TipoDedatoContext)_localctx).value = (((TipoDedatoContext)_localctx).DOBLE!=null?((TipoDedatoContext)_localctx).DOBLE.getText():null); t.crearTabla((((TipoDedatoContext)_localctx).DOBLE!=null?((TipoDedatoContext)_localctx).DOBLE.getLine():0),(((TipoDedatoContext)_localctx).DOBLE!=null?((TipoDedatoContext)_localctx).DOBLE.getText():null),"Palabra reservada","Funcion","",0,"");
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 7);
				{
				setState(1194); ((TipoDedatoContext)_localctx).STRING = match(STRING);
				((TipoDedatoContext)_localctx).value = (((TipoDedatoContext)_localctx).STRING!=null?((TipoDedatoContext)_localctx).STRING.getText():null); t.crearTabla((((TipoDedatoContext)_localctx).STRING!=null?((TipoDedatoContext)_localctx).STRING.getLine():0),(((TipoDedatoContext)_localctx).STRING!=null?((TipoDedatoContext)_localctx).STRING.getText():null),"Palabra reservada","Funcion","",0,"");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeerContext extends ParserRuleContext {
		public Token LEER;
		public Token ID;
		public Token PUNTO_COMA;
		public TerminalNode LEER() { return getToken(HelloParser.LEER, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198); ((LeerContext)_localctx).LEER = match(LEER);
			setState(1199); ((LeerContext)_localctx).ID = match(ID);
			setState(1200); ((LeerContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

					
					
					if(symbolTable.containsKey((((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null))){
						
						
						if(!symbolTable.get((((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null)).toString().equals("0")){
							t.agregarErrores("Error variable "+(((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null)+" fue inicializada "+Integer.toString((((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getLine():0)));
						}
						
						
						if(dataType.containsKey((((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null))){
							
							if(dataType.get((((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null)).equals("entero")){
								t.constantes.append("msg"+Integer.toString(msg)+": dd  \"%d\"   \n");
								
							}
							else if(dataType.get((((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null)).equals("largo")){
								t.constantes.append("msg"+Integer.toString(msg)+": dd  \"%d\"   \n");
							}
							//else if(dataType.get((((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null)).equals("doble")){
								
							//}
							//else if(dataType.get((((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null)).equals("flotante")){
								
							//}
							else if(dataType.get((((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null)).equals("caracter")){
								t.constantes.append("msg"+Integer.toString(msg)+": db  \"%s\"   \n");
							}
							else if(dataType.get((((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null)).equals("string")){
								t.constantes.append("msg"+Integer.toString(msg)+": db  \"%s\"   \n");
							}
							else{
								t.agregarErrores("Error variable "+(((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null)+" tipo de dato no valido "+Integer.toString((((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getLine():0)));
							}
							
						}else{
							t.agregarErrores("Error variable "+(((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null)+" no contiene tipo de dato "+Integer.toString((((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getLine():0)));
						}
					}else{
						t.agregarErrores("Error variable "+(((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null)+" no fue declarada "+Integer.toString((((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getLine():0)));
					}
					
					t.programa.append("push dword "+(((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null)+"\n");
					t.programa.append("push dword msg"+Integer.toString(msg)+"\n");
					t.programa.append("call scanf\n");
					t.programa.append("add esp,8\n");
					msg++;
					
					t.crearTabla((((LeerContext)_localctx).LEER!=null?((LeerContext)_localctx).LEER.getLine():0),(((LeerContext)_localctx).LEER!=null?((LeerContext)_localctx).LEER.getText():null),"Palabra reservada","bloque","",0,"");
					t.crearTabla((((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getLine():0),(((LeerContext)_localctx).ID!=null?((LeerContext)_localctx).ID.getText():null),"Identificador","bloque","",0,"");
					t.crearTabla((((LeerContext)_localctx).PUNTO_COMA!=null?((LeerContext)_localctx).PUNTO_COMA.getLine():0),(((LeerContext)_localctx).PUNTO_COMA!=null?((LeerContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","bloque","",0,"");
					
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermPriContext extends ParserRuleContext {
		public Token NUMBERPRI;
		public Token BOOLEAN;
		public Token ID;
		public Token CAR;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode NUMBERPRI() { return getToken(HelloParser.NUMBERPRI, 0); }
		public TerminalNode CAR() { return getToken(HelloParser.CAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
		public TermPriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termPri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTermPri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTermPri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTermPri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermPriContext termPri() throws RecognitionException {
		TermPriContext _localctx = new TermPriContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_termPri);
		try {
			setState(1211);
			switch (_input.LA(1)) {
			case NUMBERPRI:
				enterOuterAlt(_localctx, 1);
				{
				setState(1203); ((TermPriContext)_localctx).NUMBERPRI = match(NUMBERPRI);
				t.programa.append("push "+(((TermPriContext)_localctx).NUMBERPRI!=null?((TermPriContext)_localctx).NUMBERPRI.getText():null)+"\n"); 
											      //System.out.print("msg"+Integer.toString(contadorMsg)+": db \"%d\",10,0\n");
										          
										          t.constantes.append("msg"+Integer.toString(msg)+": db \"%d\" ,10,0 \n");
										          t.programa.append("push dword msg"+Integer.toString(msg)+"\n");
												  msg++;	
												  t.crearTabla((((TermPriContext)_localctx).NUMBERPRI!=null?((TermPriContext)_localctx).NUMBERPRI.getLine():0),(((TermPriContext)_localctx).NUMBERPRI!=null?((TermPriContext)_localctx).NUMBERPRI.getText():null),"Numero entero","bloque","",0,"");							  //contadorMsg++;	
					
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1205); ((TermPriContext)_localctx).BOOLEAN = match(BOOLEAN);

						imprimeCadena=true;
						t.constantes.append("msg"+Integer.toString(msg)+":  db \"+(((TermPriContext)_localctx).BOOLEAN!=null?((TermPriContext)_localctx).BOOLEAN.getText():null)+\",10,0 \n ");
						t.programa.append("push dword msg"+Integer.toString(msg)+"\n");
						msg++;
						 t.crearTabla((((TermPriContext)_localctx).BOOLEAN!=null?((TermPriContext)_localctx).BOOLEAN.getLine():0),(((TermPriContext)_localctx).BOOLEAN!=null?((TermPriContext)_localctx).BOOLEAN.getText():null),"Booleano","bloque","",0,"");
						
					
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(1207); ((TermPriContext)_localctx).ID = match(ID);

						
						if(symbolTable.containsKey((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null))){
							
							if(dataType.containsKey((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null))){
								
								if(dataType.get((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)).equals("entero")){
									t.constantes.append("msg"+Integer.toString(msg)+": db \"%d\" ,10,0\n");
									
											if(symbolTable.get((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)).toString().equals("0")){
												
												//t.programa.append("push dword 0\n");
												t.programa.append("push dword  ["+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+"]\n");
												}else{
													t.programa.append("push dword  ["+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+"]\n");	
												}
						
									
								}
								else if(dataType.get((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)).equals("largo")){
									t.constantes.append("msg"+Integer.toString(msg)+": db \"%d\" ,10,0\n");
																if(symbolTable.get((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)).toString().equals("0")){
												//t.programa.append("push dword 0\n");
												t.programa.append("push dword  ["+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+"]\n");
												}else{
													t.programa.append("push dword  ["+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+"]\n");	
												}
								}
								/*else if(dataType.get((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)).equals("doble")){
									
								}
								else if(dataType.get((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)).equals("flotante")){
									
								}*/
								else if(dataType.get((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)).equals("caracter")){
									t.constantes.append("msg"+Integer.toString(msg)+": db \"%s\" ,10,0\n");
									
									if(symbolTable.get((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)).toString().equals("0")){
									
									t.agregarErrores("Error variable "+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+" tipo ha sido inicializada "+Integer.toString((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getLine():0)));
									
									}else{
											t.programa.append("push dword  ["+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+"] \n");	
									}
								}
								else if(dataType.get((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)).equals("string")){
									t.constantes.append("msg"+Integer.toString(msg)+": db \"%s\" ,10,0\n");
									
									
								    if(symbolTable.get((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)).toString().equals("0")){
									
									t.agregarErrores("Error variable "+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+" tipo ha sido inicializada "+Integer.toString((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getLine():0)));
									
									}else{
											t.programa.append("push dword  ["+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+"]\n");	
									} 
									 
									
								}
							   else if(dataType.get((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)).equals("booleano")){
									t.constantes.append("msg"+Integer.toString(msg)+": db \"%s\" ,10,0\n");
									
									
								    if(symbolTable.get((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)).toString().equals("0")){
									
									t.agregarErrores("Error variable "+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+" tipo ha sido inicializada "+Integer.toString((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getLine():0)));
									
									}else{
											t.programa.append("push dword  ["+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+"]\n");	
									} 
									 
									
								} 
								
								else{
									t.agregarErrores("Error variable "+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+" tipo de dato no valido "+Integer.toString((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getLine():0)));
								}
								
							}else{
								t.agregarErrores("Error variable "+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+" no contiene tipo de dato "+Integer.toString((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getLine():0)));
							}
						}else{
							t.agregarErrores("Error variable "+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+" no fue declarada "+Integer.toString((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getLine():0)));
						}
						

						 
						// h.st.append("msg"+Integer.toString(contadorMsg)+": db \"%d\",10,0\n");	  
				         //System.out.print("push dword msg"+Integer.toString(contadorMsg)+"\n");
				         t.programa.append("push dword msg"+Integer.toString(msg)+"\n");
				         msg++;	
				         //contadorMsg++;
				         t.crearTabla((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getLine():0),(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null),"Identificador","bloque","",0,""); 
				         
					
				}
				break;
			case CAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1209); ((TermPriContext)_localctx).CAR = match(CAR);

						imprimeCadena=true;
						 
						t.constantes.append("msg"+Integer.toString(msg)+": db "+(((TermPriContext)_localctx).CAR!=null?((TermPriContext)_localctx).CAR.getText():null)+" ,10,0\n");
						t.programa.append("push dword msg"+Integer.toString(msg)+"\n");
						msg++; 
						
						
						t.crearTabla((((TermPriContext)_localctx).CAR!=null?((TermPriContext)_localctx).CAR.getLine():0),(((TermPriContext)_localctx).CAR!=null?((TermPriContext)_localctx).CAR.getText():null),"Caracter","bloque","",0,"");
						
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscribirContext extends ParserRuleContext {
		public Token ESCRIBIR;
		public Token PUNTO_COMA;
		public TerminalNode ESCRIBIR() { return getToken(HelloParser.ESCRIBIR, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public TermPriContext termPri() {
			return getRuleContext(TermPriContext.class,0);
		}
		public EscribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterEscribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitEscribir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitEscribir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscribirContext escribir() throws RecognitionException {
		EscribirContext _localctx = new EscribirContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_escribir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213); ((EscribirContext)_localctx).ESCRIBIR = match(ESCRIBIR);

						t.crearTabla((((EscribirContext)_localctx).ESCRIBIR!=null?((EscribirContext)_localctx).ESCRIBIR.getLine():0),(((EscribirContext)_localctx).ESCRIBIR!=null?((EscribirContext)_localctx).ESCRIBIR.getText():null),"Palabra reservada","bloque","",0,"");
				
			setState(1215); termPri();
			setState(1216); ((EscribirContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);

					
					t.programa.append("call printf\n");
					
					if(imprimeCadena){
						t.programa.append("add esp,4\n");
						imprimeCadena=false;
					}
					else{
					t.programa.append("add esp,8\n");
					}
				 
					
					t.crearTabla((((EscribirContext)_localctx).PUNTO_COMA!=null?((EscribirContext)_localctx).PUNTO_COMA.getLine():0),(((EscribirContext)_localctx).PUNTO_COMA!=null?((EscribirContext)_localctx).PUNTO_COMA.getText():null),"Terminacion","bloque","",0,"");	 
					 
					
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u04c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\7\3b\n\3\f\3\16\3e\13\3\3\3\3\3\3\3"+
		"\3\3\7\3k\n\3\f\3\16\3n\13\3\3\3\7\3q\n\3\f\3\16\3t\13\3\3\3\3\3\3\3\7"+
		"\3y\n\3\f\3\16\3|\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0099"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5\u00af\n\5\f\5\16\5\u00b2\13\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\5\6\u00bc\n\6\3\7\3\7\3\7\3\7\7\7\u00c2\n\7\f\7\16\7\u00c5"+
		"\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u00ce\n\b\f\b\16\b\u00d1\13\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\5\n\u00dd\n\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00e3\n\n\3\n\3\n\3\n\5\n\u00e8\n\n\3\n\3\n\3\n\3\n\5\n\u00ee\n\n\7"+
		"\n\u00f0\n\n\f\n\16\n\u00f3\13\n\3\n\5\n\u00f6\n\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00fc\n\n\3\n\3\n\3\n\5\n\u0101\n\n\3\n\3\n\3\n\3\n\5\n\u0107\n\n\7\n"+
		"\u0109\n\n\f\n\16\n\u010c\13\n\3\n\5\n\u010f\n\n\3\n\3\n\3\n\3\n\5\n\u0115"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u011b\n\n\3\n\5\n\u011e\n\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0124\n\n\7\n\u0126\n\n\f\n\16\n\u0129\13\n\3\n\5\n\u012c\n\n\3\n\3"+
		"\n\3\n\3\n\5\n\u0132\n\n\3\n\3\n\3\n\3\n\5\n\u0138\n\n\3\n\5\n\u013b\n"+
		"\n\3\n\3\n\3\n\3\n\5\n\u0141\n\n\7\n\u0143\n\n\f\n\16\n\u0146\13\n\5\n"+
		"\u0148\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0153\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u015d\n\f\f\f\16\f\u0160\13\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0169\n\f\f\f\16\f\u016c\13\f\3\f\3\f\3\f"+
		"\3\f\7\f\u0172\n\f\f\f\16\f\u0175\13\f\3\f\3\f\3\f\7\f\u017a\n\f\f\f\16"+
		"\f\u017d\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u018b"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0195\n\16\f\16\16\16"+
		"\u0198\13\16\3\16\3\16\3\16\7\16\u019d\n\16\f\16\16\16\u01a0\13\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01ae\n\17"+
		"\f\17\16\17\u01b1\13\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\5\21\u01bb"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u01c2\n\21\3\21\3\21\3\21\5\21\u01c7"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u01ce\n\21\7\21\u01d0\n\21\f\21\16"+
		"\21\u01d3\13\21\3\21\5\21\u01d6\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u01dd"+
		"\n\21\3\21\3\21\3\21\5\21\u01e2\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u01e9"+
		"\n\21\7\21\u01eb\n\21\f\21\16\21\u01ee\13\21\3\21\3\21\3\21\5\21\u01f3"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u01fa\n\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0200\n\21\3\21\5\21\u0203\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u020a\n"+
		"\21\7\21\u020c\n\21\f\21\16\21\u020f\13\21\3\21\3\21\3\21\5\21\u0214\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u021b\n\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0221\n\21\3\21\5\21\u0224\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u022b\n"+
		"\21\7\21\u022d\n\21\f\21\16\21\u0230\13\21\3\21\3\21\5\21\u0234\n\21\3"+
		"\22\5\22\u0237\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u023e\n\22\3\22\3\22"+
		"\3\22\5\22\u0243\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u024a\n\22\7\22\u024c"+
		"\n\22\f\22\16\22\u024f\13\22\3\22\5\22\u0252\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0259\n\22\3\22\3\22\3\22\5\22\u025e\n\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u0265\n\22\7\22\u0267\n\22\f\22\16\22\u026a\13\22\3\22\3"+
		"\22\3\22\5\22\u026f\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0276\n\22\3\22"+
		"\3\22\3\22\3\22\5\22\u027c\n\22\3\22\5\22\u027f\n\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u0286\n\22\7\22\u0288\n\22\f\22\16\22\u028b\13\22\3\22\3"+
		"\22\3\22\5\22\u0290\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0297\n\22\3\22"+
		"\3\22\3\22\3\22\5\22\u029d\n\22\3\22\5\22\u02a0\n\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u02a7\n\22\7\22\u02a9\n\22\f\22\16\22\u02ac\13\22\3\22\3"+
		"\22\5\22\u02b0\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u02be\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u02c9\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u02da\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u02f2\n\27\3\30\3\30\5\30\u02f6\n\30\3\31\5\31\u02f9\n\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u0301\n\31\3\31\3\31\3\31\5\31\u0306"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u030e\n\31\3\31\3\31\3\31\5\31"+
		"\u0313\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u031b\n\31\3\31\3\31\3"+
		"\31\5\31\u0320\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0328\n\31\3\31"+
		"\3\31\3\31\5\31\u032d\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0335\n"+
		"\31\3\31\3\31\3\31\5\31\u033a\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0342\n\31\3\31\3\31\3\31\5\31\u0347\n\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u034f\n\31\3\31\3\31\3\31\5\31\u0354\n\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u035d\n\31\3\32\3\32\3\32\3\32\5\32\u0363\n\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u036b\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0375\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u037f\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0389\n"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0393\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u039d\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u03a7\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u03b2\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u03d4\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u03de\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u03e6\n\36\f\36\16\36\u03e9\13\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u03f1\n\37\f\37\16\37\u03f4\13\37\3 \3 \3 \3 \5 \u03fa\n \3!\3!"+
		"\3!\3!\5!\u0400\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u040c\n"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0417\n#\f#\16#\u041a\13#\5#\u041c\n"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u042c\n$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0446\n"+
		"%\3&\3&\3&\3&\3&\3\'\3\'\5\'\u044f\n\'\3(\5(\u0452\n(\3(\3(\3(\3(\3(\7"+
		"(\u0459\n(\f(\16(\u045c\13(\3(\3(\3(\7(\u0461\n(\f(\16(\u0464\13(\3(\3"+
		"(\3(\3(\3)\5)\u046b\n)\3)\3)\3)\3)\3)\7)\u0472\n)\f)\16)\u0475\13)\3)"+
		"\3)\3)\7)\u047a\n)\f)\16)\u047d\13)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\5*\u0491\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u049c\n"+
		"+\f+\16+\u049f\13+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u04af"+
		"\n,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u04be\n.\3/\3/\3/\3/\3/"+
		"\3/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\\2\2\u055c\2^\3\2\2\2\4c\3\2\2\2\6\u0098\3\2\2"+
		"\2\b\u009a\3\2\2\2\n\u00bb\3\2\2\2\f\u00bd\3\2\2\2\16\u00ca\3\2\2\2\20"+
		"\u00d8\3\2\2\2\22\u0147\3\2\2\2\24\u0152\3\2\2\2\26\u0154\3\2\2\2\30\u018a"+
		"\3\2\2\2\32\u018c\3\2\2\2\34\u01a5\3\2\2\2\36\u01b6\3\2\2\2 \u0233\3\2"+
		"\2\2\"\u02af\3\2\2\2$\u02bd\3\2\2\2&\u02c8\3\2\2\2(\u02ca\3\2\2\2*\u02d9"+
		"\3\2\2\2,\u02f1\3\2\2\2.\u02f5\3\2\2\2\60\u035c\3\2\2\2\62\u0362\3\2\2"+
		"\2\64\u03b1\3\2\2\2\66\u03d3\3\2\2\28\u03dd\3\2\2\2:\u03df\3\2\2\2<\u03ea"+
		"\3\2\2\2>\u03f9\3\2\2\2@\u03ff\3\2\2\2B\u040b\3\2\2\2D\u040d\3\2\2\2F"+
		"\u042b\3\2\2\2H\u0445\3\2\2\2J\u0447\3\2\2\2L\u044e\3\2\2\2N\u0451\3\2"+
		"\2\2P\u046a\3\2\2\2R\u0490\3\2\2\2T\u0492\3\2\2\2V\u04ae\3\2\2\2X\u04b0"+
		"\3\2\2\2Z\u04bd\3\2\2\2\\\u04bf\3\2\2\2^_\5\4\3\2_\3\3\2\2\2`b\5L\'\2"+
		"a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\3\2\2"+
		"gh\7>\2\2hl\b\3\1\2ik\5\60\31\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2mr\3\2\2\2nl\3\2\2\2oq\5.\30\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2su\3\2\2\2tr\3\2\2\2uv\7\5\2\2vz\b\3\1\2wy\5\6\4\2xw\3\2\2\2y|\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\6\2\2~\177\7:\2\2\177\u0080"+
		"\b\3\1\2\u0080\u0081\7\4\2\2\u0081\u0082\7:\2\2\u0082\u0083\b\3\1\2\u0083"+
		"\5\3\2\2\2\u0084\u0099\5\\/\2\u0085\u0099\5X-\2\u0086\u0099\5\64\33\2"+
		"\u0087\u0099\5\66\34\2\u0088\u0099\5D#\2\u0089\u0099\5,\27\2\u008a\u0099"+
		"\5(\25\2\u008b\u0099\5*\26\2\u008c\u008d\5\32\16\2\u008d\u008e\b\4\1\2"+
		"\u008e\u0099\3\2\2\2\u008f\u0090\5\34\17\2\u0090\u0091\b\4\1\2\u0091\u0099"+
		"\3\2\2\2\u0092\u0099\5\26\f\2\u0093\u0099\5\16\b\2\u0094\u0099\5\f\7\2"+
		"\u0095\u0096\5\b\5\2\u0096\u0097\b\4\1\2\u0097\u0099\3\2\2\2\u0098\u0084"+
		"\3\2\2\2\u0098\u0085\3\2\2\2\u0098\u0086\3\2\2\2\u0098\u0087\3\2\2\2\u0098"+
		"\u0088\3\2\2\2\u0098\u0089\3\2\2\2\u0098\u008a\3\2\2\2\u0098\u008b\3\2"+
		"\2\2\u0098\u008c\3\2\2\2\u0098\u008f\3\2\2\2\u0098\u0092\3\2\2\2\u0098"+
		"\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2\2\2\u0099\7\3\2\2\2"+
		"\u009a\u009b\7$\2\2\u009b\u009c\7\65\2\2\u009c\u009d\7\23\2\2\u009d\u009e"+
		"\7>\2\2\u009e\u009f\b\5\1\2\u009f\u00a0\7\64\2\2\u00a0\u00a1\7?\2\2\u00a1"+
		"\u00a2\7:\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4\b\5\1\2\u00a4\u00a5\5\n\6"+
		"\2\u00a5\u00a6\7?\2\2\u00a6\u00a7\7:\2\2\u00a7\u00a8\7>\2\2\u00a8\u00a9"+
		"\b\5\1\2\u00a9\u00aa\7\'\2\2\u00aa\u00ab\7\'\2\2\u00ab\u00ac\7\66\2\2"+
		"\u00ac\u00b0\b\5\1\2\u00ad\u00af\5\6\4\2\u00ae\u00ad\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\7%\2\2\u00b4\u00b5\7:\2\2\u00b5\u00b6\b\5\1"+
		"\2\u00b6\t\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8\u00bc\b\6\1\2\u00b9\u00ba"+
		"\7\61\2\2\u00ba\u00bc\b\6\1\2\u00bb\u00b7\3\2\2\2\u00bb\u00b9\3\2\2\2"+
		"\u00bc\13\3\2\2\2\u00bd\u00be\7\"\2\2\u00be\u00bf\b\7\1\2\u00bf\u00c3"+
		"\5\22\n\2\u00c0\u00c2\5\6\4\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2"+
		"\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00c7\7#\2\2\u00c7\u00c8\7:\2\2\u00c8\u00c9\b\7\1\2\u00c9"+
		"\r\3\2\2\2\u00ca\u00cb\7 \2\2\u00cb\u00cf\b\b\1\2\u00cc\u00ce\5\6\4\2"+
		"\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7!\2\2\u00d3"+
		"\u00d4\b\b\1\2\u00d4\u00d5\5\22\n\2\u00d5\u00d6\7:\2\2\u00d6\u00d7\b\b"+
		"\1\2\u00d7\17\3\2\2\2\u00d8\u00d9\7-\2\2\u00d9\u00da\b\t\1\2\u00da\21"+
		"\3\2\2\2\u00db\u00dd\5\20\t\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00e2\5\24\13\2\u00df\u00e0\5$\23\2\u00e0\u00e1"+
		"\5\24\13\2\u00e1\u00e3\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e3\3\2\2\2"+
		"\u00e3\u00f1\3\2\2\2\u00e4\u00e5\7+\2\2\u00e5\u00e7\b\n\1\2\u00e6\u00e8"+
		"\5\36\20\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2"+
		"\u00e9\u00ed\5\24\13\2\u00ea\u00eb\5$\23\2\u00eb\u00ec\5\24\13\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2"+
		"\2\2\u00ef\u00e4\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u0148\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6\5\20"+
		"\t\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00fb\5\24\13\2\u00f8\u00f9\5$\23\2\u00f9\u00fa\5\24\13\2\u00fa\u00fc"+
		"\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u010a\3\2\2\2\u00fd"+
		"\u00fe\7,\2\2\u00fe\u0100\b\n\1\2\u00ff\u0101\5\36\20\2\u0100\u00ff\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0106\5\24\13\2\u0103"+
		"\u0104\5$\23\2\u0104\u0105\5\24\13\2\u0105\u0107\3\2\2\2\u0106\u0103\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u00fd\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0148\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u010f\5\20\t\2\u010e\u010d\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0114\5\24\13\2\u0111\u0112\5"+
		"$\23\2\u0112\u0113\5\24\13\2\u0113\u0115\3\2\2\2\u0114\u0111\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0127\3\2\2\2\u0116\u0117\7+\2\2\u0117\u011b\b\n"+
		"\1\2\u0118\u0119\7,\2\2\u0119\u011b\b\n\1\2\u011a\u0116\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011e\5\20\t\2\u011d\u011c\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0123\5\24\13\2\u0120"+
		"\u0121\5$\23\2\u0121\u0122\5\24\13\2\u0122\u0124\3\2\2\2\u0123\u0120\3"+
		"\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u011a\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0148\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u012c\5\20\t\2\u012b\u012a\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0131\5\24\13\2\u012e\u012f\5"+
		"$\23\2\u012f\u0130\5\24\13\2\u0130\u0132\3\2\2\2\u0131\u012e\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0144\3\2\2\2\u0133\u0134\7,\2\2\u0134\u0138\b\n"+
		"\1\2\u0135\u0136\7+\2\2\u0136\u0138\b\n\1\2\u0137\u0133\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u013b\5\20\t\2\u013a\u0139\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0140\5\24\13\2\u013d"+
		"\u013e\5$\23\2\u013e\u013f\5\24\13\2\u013f\u0141\3\2\2\2\u0140\u013d\3"+
		"\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0137\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0148\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0147\u00dc\3\2\2\2\u0147\u00f5\3\2\2\2\u0147"+
		"\u010e\3\2\2\2\u0147\u012b\3\2\2\2\u0148\23\3\2\2\2\u0149\u014a\7>\2\2"+
		"\u014a\u0153\b\13\1\2\u014b\u014c\7\65\2\2\u014c\u014d\5\22\n\2\u014d"+
		"\u014e\7\66\2\2\u014e\u014f\b\13\1\2\u014f\u0153\3\2\2\2\u0150\u0151\7"+
		"?\2\2\u0151\u0153\b\13\1\2\u0152\u0149\3\2\2\2\u0152\u014b\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\25\3\2\2\2\u0154\u0155\7\33\2\2\u0155\u0156\7>\2"+
		"\2\u0156\u0157\b\f\1\2\u0157\u0158\7<\2\2\u0158\u0159\7\34\2\2\u0159\u015a"+
		"\5\30\r\2\u015a\u015e\7<\2\2\u015b\u015d\5\6\4\2\u015c\u015b\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\35\2\2\u0162\u0163\7:\2\2\u0163"+
		"\u0173\b\f\1\2\u0164\u0165\7\34\2\2\u0165\u0166\5\30\r\2\u0166\u016a\7"+
		"<\2\2\u0167\u0169\5\6\4\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016d\u016e\7\35\2\2\u016e\u016f\7:\2\2\u016f\u0170\b\f\1\2\u0170"+
		"\u0172\3\2\2\2\u0171\u0164\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0177\7\36\2\2\u0177\u017b\7<\2\2\u0178\u017a\5\6\4\2\u0179\u0178\3\2"+
		"\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7\35\2\2\u017f\u0180\7"+
		":\2\2\u0180\u0181\7\37\2\2\u0181\u0182\7:\2\2\u0182\u0183\b\f\1\2\u0183"+
		"\27\3\2\2\2\u0184\u0185\7>\2\2\u0185\u018b\b\r\1\2\u0186\u0187\7C\2\2"+
		"\u0187\u018b\b\r\1\2\u0188\u0189\7?\2\2\u0189\u018b\b\r\1\2\u018a\u0184"+
		"\3\2\2\2\u018a\u0186\3\2\2\2\u018a\u0188\3\2\2\2\u018b\31\3\2\2\2\u018c"+
		"\u018d\7\20\2\2\u018d\u018e\7\65\2\2\u018e\u018f\b\16\1\2\u018f\u0190"+
		"\5 \21\2\u0190\u0191\7\66\2\2\u0191\u0192\7\32\2\2\u0192\u0196\b\16\1"+
		"\2\u0193\u0195\5\6\4\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199"+
		"\u019a\7\21\2\2\u019a\u019e\b\16\1\2\u019b\u019d\5\6\4\2\u019c\u019b\3"+
		"\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\7\22\2\2\u01a2\u01a3\7"+
		":\2\2\u01a3\u01a4\b\16\1\2\u01a4\33\3\2\2\2\u01a5\u01a6\7\20\2\2\u01a6"+
		"\u01a7\7\65\2\2\u01a7\u01a8\b\17\1\2\u01a8\u01a9\5\"\22\2\u01a9\u01aa"+
		"\7\66\2\2\u01aa\u01ab\7\32\2\2\u01ab\u01af\b\17\1\2\u01ac\u01ae\5\6\4"+
		"\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\7\22\2\2"+
		"\u01b3\u01b4\7:\2\2\u01b4\u01b5\b\17\1\2\u01b5\35\3\2\2\2\u01b6\u01b7"+
		"\7-\2\2\u01b7\u01b8\b\20\1\2\u01b8\37\3\2\2\2\u01b9\u01bb\5\36\20\2\u01ba"+
		"\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c1\5&"+
		"\24\2\u01bd\u01be\5$\23\2\u01be\u01bf\5&\24\2\u01bf\u01c0\b\21\1\2\u01c0"+
		"\u01c2\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01d1\3\2"+
		"\2\2\u01c3\u01c4\7+\2\2\u01c4\u01c6\b\21\1\2\u01c5\u01c7\5\36\20\2\u01c6"+
		"\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cd\5&"+
		"\24\2\u01c9\u01ca\5$\23\2\u01ca\u01cb\5&\24\2\u01cb\u01cc\b\21\1\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01c9\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2"+
		"\2\2\u01cf\u01c3\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u0234\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d6\5\36"+
		"\20\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01dc\5&\24\2\u01d8\u01d9\5$\23\2\u01d9\u01da\5&\24\2\u01da\u01db\b\21"+
		"\1\2\u01db\u01dd\3\2\2\2\u01dc\u01d8\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01ec\3\2\2\2\u01de\u01df\7,\2\2\u01df\u01e1\b\21\1\2\u01e0\u01e2\5\36"+
		"\20\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e8\5&\24\2\u01e4\u01e5\5$\23\2\u01e5\u01e6\5&\24\2\u01e6\u01e7\b\21"+
		"\1\2\u01e7\u01e9\3\2\2\2\u01e8\u01e4\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01eb\3\2\2\2\u01ea\u01de\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01f0\b\21\1\2\u01f0\u0234\3\2\2\2\u01f1\u01f3\5\36\20\2\u01f2\u01f1"+
		"\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f9\5&\24\2\u01f5"+
		"\u01f6\5$\23\2\u01f6\u01f7\5&\24\2\u01f7\u01f8\b\21\1\2\u01f8\u01fa\3"+
		"\2\2\2\u01f9\u01f5\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u020d\3\2\2\2\u01fb"+
		"\u01fc\7+\2\2\u01fc\u0200\b\21\1\2\u01fd\u01fe\7,\2\2\u01fe\u0200\b\21"+
		"\1\2\u01ff\u01fb\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\3\2\2\2\u0201"+
		"\u0203\5\36\20\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3"+
		"\2\2\2\u0204\u0209\5&\24\2\u0205\u0206\5$\23\2\u0206\u0207\5&\24\2\u0207"+
		"\u0208\b\21\1\2\u0208\u020a\3\2\2\2\u0209\u0205\3\2\2\2\u0209\u020a\3"+
		"\2\2\2\u020a\u020c\3\2\2\2\u020b\u01ff\3\2\2\2\u020c\u020f\3\2\2\2\u020d"+
		"\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2"+
		"\2\2\u0210\u0211\b\21\1\2\u0211\u0234\3\2\2\2\u0212\u0214\5\36\20\2\u0213"+
		"\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u021a\5&"+
		"\24\2\u0216\u0217\5$\23\2\u0217\u0218\5&\24\2\u0218\u0219\b\21\1\2\u0219"+
		"\u021b\3\2\2\2\u021a\u0216\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u022e\3\2"+
		"\2\2\u021c\u021d\7,\2\2\u021d\u0221\b\21\1\2\u021e\u021f\7+\2\2\u021f"+
		"\u0221\b\21\1\2\u0220\u021c\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0223\3"+
		"\2\2\2\u0222\u0224\5\36\20\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u022a\5&\24\2\u0226\u0227\5$\23\2\u0227\u0228\5&"+
		"\24\2\u0228\u0229\b\21\1\2\u0229\u022b\3\2\2\2\u022a\u0226\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u0220\3\2\2\2\u022d\u0230\3\2"+
		"\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0232\b\21\1\2\u0232\u0234\3\2\2\2\u0233\u01ba\3"+
		"\2\2\2\u0233\u01d5\3\2\2\2\u0233\u01f2\3\2\2\2\u0233\u0213\3\2\2\2\u0234"+
		"!\3\2\2\2\u0235\u0237\5\36\20\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2"+
		"\2\u0237\u0238\3\2\2\2\u0238\u023d\5&\24\2\u0239\u023a\5$\23\2\u023a\u023b"+
		"\5&\24\2\u023b\u023c\b\22\1\2\u023c\u023e\3\2\2\2\u023d\u0239\3\2\2\2"+
		"\u023d\u023e\3\2\2\2\u023e\u024d\3\2\2\2\u023f\u0240\7+\2\2\u0240\u0242"+
		"\b\22\1\2\u0241\u0243\5\36\20\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2"+
		"\2\u0243\u0244\3\2\2\2\u0244\u0249\5&\24\2\u0245\u0246\5$\23\2\u0246\u0247"+
		"\5&\24\2\u0247\u0248\b\22\1\2\u0248\u024a\3\2\2\2\u0249\u0245\3\2\2\2"+
		"\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u023f\3\2\2\2\u024c\u024f"+
		"\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u02b0\3\2\2\2\u024f"+
		"\u024d\3\2\2\2\u0250\u0252\5\36\20\2\u0251\u0250\3\2\2\2\u0251\u0252\3"+
		"\2\2\2\u0252\u0253\3\2\2\2\u0253\u0258\5&\24\2\u0254\u0255\5$\23\2\u0255"+
		"\u0256\5&\24\2\u0256\u0257\b\22\1\2\u0257\u0259\3\2\2\2\u0258\u0254\3"+
		"\2\2\2\u0258\u0259\3\2\2\2\u0259\u0268\3\2\2\2\u025a\u025b\7,\2\2\u025b"+
		"\u025d\b\22\1\2\u025c\u025e\5\36\20\2\u025d\u025c\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0264\5&\24\2\u0260\u0261\5$\23\2\u0261"+
		"\u0262\5&\24\2\u0262\u0263\b\22\1\2\u0263\u0265\3\2\2\2\u0264\u0260\3"+
		"\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u025a\3\2\2\2\u0267"+
		"\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2"+
		"\2\2\u026a\u0268\3\2\2\2\u026b\u026c\b\22\1\2\u026c\u02b0\3\2\2\2\u026d"+
		"\u026f\5\36\20\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3"+
		"\2\2\2\u0270\u0275\5&\24\2\u0271\u0272\5$\23\2\u0272\u0273\5&\24\2\u0273"+
		"\u0274\b\22\1\2\u0274\u0276\3\2\2\2\u0275\u0271\3\2\2\2\u0275\u0276\3"+
		"\2\2\2\u0276\u0289\3\2\2\2\u0277\u0278\7+\2\2\u0278\u027c\b\22\1\2\u0279"+
		"\u027a\7,\2\2\u027a\u027c\b\22\1\2\u027b\u0277\3\2\2\2\u027b\u0279\3\2"+
		"\2\2\u027c\u027e\3\2\2\2\u027d\u027f\5\36\20\2\u027e\u027d\3\2\2\2\u027e"+
		"\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0285\5&\24\2\u0281\u0282\5$"+
		"\23\2\u0282\u0283\5&\24\2\u0283\u0284\b\22\1\2\u0284\u0286\3\2\2\2\u0285"+
		"\u0281\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2\2\2\u0287\u027b\3\2"+
		"\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028c\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028d\b\22\1\2\u028d\u02b0\3"+
		"\2\2\2\u028e\u0290\5\36\20\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0296\5&\24\2\u0292\u0293\5$\23\2\u0293\u0294\5&"+
		"\24\2\u0294\u0295\b\22\1\2\u0295\u0297\3\2\2\2\u0296\u0292\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u02aa\3\2\2\2\u0298\u0299\7,\2\2\u0299\u029d\b\22"+
		"\1\2\u029a\u029b\7+\2\2\u029b\u029d\b\22\1\2\u029c\u0298\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u02a0\5\36\20\2\u029f\u029e\3"+
		"\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a6\5&\24\2\u02a2"+
		"\u02a3\5$\23\2\u02a3\u02a4\5&\24\2\u02a4\u02a5\b\22\1\2\u02a5\u02a7\3"+
		"\2\2\2\u02a6\u02a2\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8"+
		"\u029c\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2"+
		"\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\b\22\1\2\u02ae"+
		"\u02b0\3\2\2\2\u02af\u0236\3\2\2\2\u02af\u0251\3\2\2\2\u02af\u026e\3\2"+
		"\2\2\u02af\u028f\3\2\2\2\u02b0#\3\2\2\2\u02b1\u02b2\7.\2\2\u02b2\u02be"+
		"\b\23\1\2\u02b3\u02b4\7/\2\2\u02b4\u02be\b\23\1\2\u02b5\u02b6\7\60\2\2"+
		"\u02b6\u02be\b\23\1\2\u02b7\u02b8\7\61\2\2\u02b8\u02be\b\23\1\2\u02b9"+
		"\u02ba\7\62\2\2\u02ba\u02be\b\23\1\2\u02bb\u02bc\7\63\2\2\u02bc\u02be"+
		"\b\23\1\2\u02bd\u02b1\3\2\2\2\u02bd\u02b3\3\2\2\2\u02bd\u02b5\3\2\2\2"+
		"\u02bd\u02b7\3\2\2\2\u02bd\u02b9\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be%\3"+
		"\2\2\2\u02bf\u02c0\7?\2\2\u02c0\u02c9\b\24\1\2\u02c1\u02c2\7\65\2\2\u02c2"+
		"\u02c3\5 \21\2\u02c3\u02c4\7\66\2\2\u02c4\u02c5\b\24\1\2\u02c5\u02c9\3"+
		"\2\2\2\u02c6\u02c7\7>\2\2\u02c7\u02c9\b\24\1\2\u02c8\u02bf\3\2\2\2\u02c8"+
		"\u02c1\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\'\3\2\2\2\u02ca\u02cb\7>\2\2"+
		"\u02cb\u02cc\7>\2\2\u02cc\u02cd\7:\2\2\u02cd\u02ce\b\25\1\2\u02ce)\3\2"+
		"\2\2\u02cf\u02d0\7>\2\2\u02d0\u02d1\7;\2\2\u02d1\u02d2\5D#\2\u02d2\u02d3"+
		"\b\26\1\2\u02d3\u02da\3\2\2\2\u02d4\u02d5\7>\2\2\u02d5\u02d6\7;\2\2\u02d6"+
		"\u02d7\7>\2\2\u02d7\u02d8\7:\2\2\u02d8\u02da\b\26\1\2\u02d9\u02cf\3\2"+
		"\2\2\u02d9\u02d4\3\2\2\2\u02da+\3\2\2\2\u02db\u02dc\7>\2\2\u02dc\u02dd"+
		"\7\'\2\2\u02dd\u02de\7\'\2\2\u02de\u02df\7:\2\2\u02df\u02f2\b\27\1\2\u02e0"+
		"\u02e1\7>\2\2\u02e1\u02e2\7(\2\2\u02e2\u02e3\7(\2\2\u02e3\u02e4\7:\2\2"+
		"\u02e4\u02f2\b\27\1\2\u02e5\u02e6\5D#\2\u02e6\u02e7\7\'\2\2\u02e7\u02e8"+
		"\7\'\2\2\u02e8\u02e9\7:\2\2\u02e9\u02ea\b\27\1\2\u02ea\u02f2\3\2\2\2\u02eb"+
		"\u02ec\5D#\2\u02ec\u02ed\7(\2\2\u02ed\u02ee\7(\2\2\u02ee\u02ef\7:\2\2"+
		"\u02ef\u02f0\b\27\1\2\u02f0\u02f2\3\2\2\2\u02f1\u02db\3\2\2\2\u02f1\u02e0"+
		"\3\2\2\2\u02f1\u02e5\3\2\2\2\u02f1\u02eb\3\2\2\2\u02f2-\3\2\2\2\u02f3"+
		"\u02f6\5N(\2\u02f4\u02f6\5P)\2\u02f5\u02f3\3\2\2\2\u02f5\u02f4\3\2\2\2"+
		"\u02f6/\3\2\2\2\u02f7\u02f9\5\62\32\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9"+
		"\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\7\23\2\2\u02fb\u02fc\7>\2\2\u02fc"+
		"\u0300\b\31\1\2\u02fd\u02fe\7\64\2\2\u02fe\u02ff\7?\2\2\u02ff\u0301\b"+
		"\31\1\2\u0300\u02fd\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"\u0303\7:\2\2\u0303\u035d\b\31\1\2\u0304\u0306\5\62\32\2\u0305\u0304\3"+
		"\2\2\2\u0305\u0306\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\7\27\2\2\u0308"+
		"\u0309\7>\2\2\u0309\u030d\b\31\1\2\u030a\u030b\7\64\2\2\u030b\u030c\7"+
		"?\2\2\u030c\u030e\b\31\1\2\u030d\u030a\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u030f\3\2\2\2\u030f\u0310\7:\2\2\u0310\u035d\b\31\1\2\u0311\u0313\5\62"+
		"\32\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0315\7\24\2\2\u0315\u0316\7>\2\2\u0316\u031a\b\31\1\2\u0317\u0318\7"+
		"\64\2\2\u0318\u0319\7A\2\2\u0319\u031b\b\31\1\2\u031a\u0317\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\7:\2\2\u031d\u035d\b\31"+
		"\1\2\u031e\u0320\5\62\32\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320"+
		"\u0321\3\2\2\2\u0321\u0322\7\30\2\2\u0322\u0323\7>\2\2\u0323\u0327\b\31"+
		"\1\2\u0324\u0325\7\64\2\2\u0325\u0326\7A\2\2\u0326\u0328\b\31\1\2\u0327"+
		"\u0324\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\7:"+
		"\2\2\u032a\u035d\b\31\1\2\u032b\u032d\5\62\32\2\u032c\u032b\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\7\25\2\2\u032f\u0330\7"+
		">\2\2\u0330\u0334\b\31\1\2\u0331\u0332\7\64\2\2\u0332\u0333\7=\2\2\u0333"+
		"\u0335\b\31\1\2\u0334\u0331\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3"+
		"\2\2\2\u0336\u0337\7:\2\2\u0337\u035d\b\31\1\2\u0338\u033a\5\62\32\2\u0339"+
		"\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\7\26"+
		"\2\2\u033c\u033d\7>\2\2\u033d\u0341\b\31\1\2\u033e\u033f\7\64\2\2\u033f"+
		"\u0340\7C\2\2\u0340\u0342\b\31\1\2\u0341\u033e\3\2\2\2\u0341\u0342\3\2"+
		"\2\2\u0342\u0343\3\2\2\2\u0343\u0344\7:\2\2\u0344\u035d\b\31\1\2\u0345"+
		"\u0347\5\62\32\2\u0346\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\3"+
		"\2\2\2\u0348\u0349\7\31\2\2\u0349\u034a\7>\2\2\u034a\u034e\b\31\1\2\u034b"+
		"\u034c\7\64\2\2\u034c\u034d\7C\2\2\u034d\u034f\b\31\1\2\u034e\u034b\3"+
		"\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\7:\2\2\u0351"+
		"\u035d\b\31\1\2\u0352\u0354\5\62\32\2\u0353\u0352\3\2\2\2\u0353\u0354"+
		"\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\7\23\2\2\u0356\u0357\7>\2\2\u0357"+
		"\u0358\7\67\2\2\u0358\u0359\7?\2\2\u0359\u035a\78\2\2\u035a\u035b\7:\2"+
		"\2\u035b\u035d\b\31\1\2\u035c\u02f8\3\2\2\2\u035c\u0305\3\2\2\2\u035c"+
		"\u0312\3\2\2\2\u035c\u031f\3\2\2\2\u035c\u032c\3\2\2\2\u035c\u0339\3\2"+
		"\2\2\u035c\u0346\3\2\2\2\u035c\u0353\3\2\2\2\u035d\61\3\2\2\2\u035e\u035f"+
		"\7\7\2\2\u035f\u0363\b\32\1\2\u0360\u0361\7\b\2\2\u0361\u0363\b\32\1\2"+
		"\u0362\u035e\3\2\2\2\u0362\u0360\3\2\2\2\u0363\63\3\2\2\2\u0364\u0365"+
		"\7\23\2\2\u0365\u0366\7>\2\2\u0366\u036a\b\33\1\2\u0367\u0368\7\64\2\2"+
		"\u0368\u0369\7?\2\2\u0369\u036b\b\33\1\2\u036a\u0367\3\2\2\2\u036a\u036b"+
		"\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\7:\2\2\u036d\u03b2\b\33\1\2\u036e"+
		"\u036f\7\27\2\2\u036f\u0370\7>\2\2\u0370\u0374\b\33\1\2\u0371\u0372\7"+
		"\64\2\2\u0372\u0373\7?\2\2\u0373\u0375\b\33\1\2\u0374\u0371\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\7:\2\2\u0377\u03b2\b\33"+
		"\1\2\u0378\u0379\7\24\2\2\u0379\u037a\7>\2\2\u037a\u037e\b\33\1\2\u037b"+
		"\u037c\7\64\2\2\u037c\u037d\7A\2\2\u037d\u037f\b\33\1\2\u037e\u037b\3"+
		"\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\7:\2\2\u0381"+
		"\u03b2\b\33\1\2\u0382\u0383\7\30\2\2\u0383\u0384\7>\2\2\u0384\u0388\b"+
		"\33\1\2\u0385\u0386\7\64\2\2\u0386\u0387\7A\2\2\u0387\u0389\b\33\1\2\u0388"+
		"\u0385\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\7:"+
		"\2\2\u038b\u03b2\b\33\1\2\u038c\u038d\7\25\2\2\u038d\u038e\7>\2\2\u038e"+
		"\u0392\b\33\1\2\u038f\u0390\7\64\2\2\u0390\u0391\7=\2\2\u0391\u0393\b"+
		"\33\1\2\u0392\u038f\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394"+
		"\u0395\7:\2\2\u0395\u03b2\b\33\1\2\u0396\u0397\7\26\2\2\u0397\u0398\7"+
		">\2\2\u0398\u039c\b\33\1\2\u0399\u039a\7\64\2\2\u039a\u039b\7C\2\2\u039b"+
		"\u039d\b\33\1\2\u039c\u0399\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3"+
		"\2\2\2\u039e\u039f\7:\2\2\u039f\u03b2\b\33\1\2\u03a0\u03a1\7\31\2\2\u03a1"+
		"\u03a2\7>\2\2\u03a2\u03a6\b\33\1\2\u03a3\u03a4\7\64\2\2\u03a4\u03a5\7"+
		"C\2\2\u03a5\u03a7\b\33\1\2\u03a6\u03a3\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03a9\7:\2\2\u03a9\u03b2\b\33\1\2\u03aa\u03ab\7\23"+
		"\2\2\u03ab\u03ac\7>\2\2\u03ac\u03ad\7\67\2\2\u03ad\u03ae\7?\2\2\u03ae"+
		"\u03af\78\2\2\u03af\u03b0\7:\2\2\u03b0\u03b2\b\33\1\2\u03b1\u0364\3\2"+
		"\2\2\u03b1\u036e\3\2\2\2\u03b1\u0378\3\2\2\2\u03b1\u0382\3\2\2\2\u03b1"+
		"\u038c\3\2\2\2\u03b1\u0396\3\2\2\2\u03b1\u03a0\3\2\2\2\u03b1\u03aa\3\2"+
		"\2\2\u03b2\65\3\2\2\2\u03b3\u03b4\7>\2\2\u03b4\u03b5\7\64\2\2\u03b5\u03b6"+
		"\5B\"\2\u03b6\u03b7\7:\2\2\u03b7\u03b8\b\34\1\2\u03b8\u03d4\3\2\2\2\u03b9"+
		"\u03ba\7>\2\2\u03ba\u03bb\7\64\2\2\u03bb\u03bc\5D#\2\u03bc\u03bd\7:\2"+
		"\2\u03bd\u03be\b\34\1\2\u03be\u03d4\3\2\2\2\u03bf\u03c0\7>\2\2\u03c0\u03c1"+
		"\7\64\2\2\u03c1\u03c2\5:\36\2\u03c2\u03c3\7:\2\2\u03c3\u03c4\b\34\1\2"+
		"\u03c4\u03d4\3\2\2\2\u03c5\u03c6\7>\2\2\u03c6\u03c7\7\67\2\2\u03c7\u03c8"+
		"\7?\2\2\u03c8\u03c9\78\2\2\u03c9\u03ca\7\64\2\2\u03ca\u03cb\7?\2\2\u03cb"+
		"\u03cc\7:\2\2\u03cc\u03d4\b\34\1\2\u03cd\u03ce\7>\2\2\u03ce\u03cf\7\64"+
		"\2\2\u03cf\u03d0\58\35\2\u03d0\u03d1\7:\2\2\u03d1\u03d2\b\34\1\2\u03d2"+
		"\u03d4\3\2\2\2\u03d3\u03b3\3\2\2\2\u03d3\u03b9\3\2\2\2\u03d3\u03bf\3\2"+
		"\2\2\u03d3\u03c5\3\2\2\2\u03d3\u03cd\3\2\2\2\u03d4\67\3\2\2\2\u03d5\u03d6"+
		"\7>\2\2\u03d6\u03d7\7\'\2\2\u03d7\u03d8\7\'\2\2\u03d8\u03de\b\35\1\2\u03d9"+
		"\u03da\7>\2\2\u03da\u03db\7(\2\2\u03db\u03dc\7(\2\2\u03dc\u03de\b\35\1"+
		"\2\u03dd\u03d5\3\2\2\2\u03dd\u03d9\3\2\2\2\u03de9\3\2\2\2\u03df\u03e0"+
		"\5<\37\2\u03e0\u03e7\b\36\1\2\u03e1\u03e2\5> \2\u03e2\u03e3\5<\37\2\u03e3"+
		"\u03e4\b\36\1\2\u03e4\u03e6\3\2\2\2\u03e5\u03e1\3\2\2\2\u03e6\u03e9\3"+
		"\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8;\3\2\2\2\u03e9\u03e7"+
		"\3\2\2\2\u03ea\u03eb\5F$\2\u03eb\u03f2\b\37\1\2\u03ec\u03ed\5@!\2\u03ed"+
		"\u03ee\5F$\2\u03ee\u03ef\b\37\1\2\u03ef\u03f1\3\2\2\2\u03f0\u03ec\3\2"+
		"\2\2\u03f1\u03f4\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3"+
		"=\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f5\u03f6\7\'\2\2\u03f6\u03fa\b \1\2\u03f7"+
		"\u03f8\7(\2\2\u03f8\u03fa\b \1\2\u03f9\u03f5\3\2\2\2\u03f9\u03f7\3\2\2"+
		"\2\u03fa?\3\2\2\2\u03fb\u03fc\7*\2\2\u03fc\u0400\b!\1\2\u03fd\u03fe\7"+
		")\2\2\u03fe\u0400\b!\1\2\u03ff\u03fb\3\2\2\2\u03ff\u03fd\3\2\2\2\u0400"+
		"A\3\2\2\2\u0401\u0402\7?\2\2\u0402\u040c\b\"\1\2\u0403\u0404\7=\2\2\u0404"+
		"\u040c\b\"\1\2\u0405\u0406\7>\2\2\u0406\u040c\b\"\1\2\u0407\u0408\7C\2"+
		"\2\u0408\u040c\b\"\1\2\u0409\u040a\7A\2\2\u040a\u040c\b\"\1\2\u040b\u0401"+
		"\3\2\2\2\u040b\u0403\3\2\2\2\u040b\u0405\3\2\2\2\u040b\u0407\3\2\2\2\u040b"+
		"\u0409\3\2\2\2\u040cC\3\2\2\2\u040d\u040e\7>\2\2\u040e\u040f\b#\1\2\u040f"+
		"\u0410\7\65\2\2\u0410\u041b\b#\1\2\u0411\u0412\7>\2\2\u0412\u0418\b#\1"+
		"\2\u0413\u0414\79\2\2\u0414\u0415\7>\2\2\u0415\u0417\b#\1\2\u0416\u0413"+
		"\3\2\2\2\u0417\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419"+
		"\u041c\3\2\2\2\u041a\u0418\3\2\2\2\u041b\u0411\3\2\2\2\u041b\u041c\3\2"+
		"\2\2\u041c\u041d\3\2\2\2\u041d\u041e\7\66\2\2\u041e\u041f\7:\2\2\u041f"+
		"\u0420\b#\1\2\u0420E\3\2\2\2\u0421\u0422\7?\2\2\u0422\u042c\b$\1\2\u0423"+
		"\u0424\7\65\2\2\u0424\u0425\5:\36\2\u0425\u0426\b$\1\2\u0426\u0427\7\66"+
		"\2\2\u0427\u0428\b$\1\2\u0428\u042c\3\2\2\2\u0429\u042a\7>\2\2\u042a\u042c"+
		"\b$\1\2\u042b\u0421\3\2\2\2\u042b\u0423\3\2\2\2\u042b\u0429\3\2\2\2\u042c"+
		"G\3\2\2\2\u042d\u042e\7\t\2\2\u042e\u042f\7>\2\2\u042f\u0430\7\64\2\2"+
		"\u0430\u0431\7?\2\2\u0431\u0432\7:\2\2\u0432\u0446\b%\1\2\u0433\u0434"+
		"\7\t\2\2\u0434\u0435\7>\2\2\u0435\u0436\7\64\2\2\u0436\u0437\7A\2\2\u0437"+
		"\u0438\7:\2\2\u0438\u0446\b%\1\2\u0439\u043a\7\t\2\2\u043a\u043b\7>\2"+
		"\2\u043b\u043c\7\64\2\2\u043c\u043d\7=\2\2\u043d\u043e\7:\2\2\u043e\u0446"+
		"\b%\1\2\u043f\u0440\7\t\2\2\u0440\u0441\7>\2\2\u0441\u0442\7\64\2\2\u0442"+
		"\u0443\7C\2\2\u0443\u0444\7:\2\2\u0444\u0446\b%\1\2\u0445\u042d\3\2\2"+
		"\2\u0445\u0433\3\2\2\2\u0445\u0439\3\2\2\2\u0445\u043f\3\2\2\2\u0446I"+
		"\3\2\2\2\u0447\u0448\7\n\2\2\u0448\u0449\7>\2\2\u0449\u044a\7:\2\2\u044a"+
		"\u044b\b&\1\2\u044bK\3\2\2\2\u044c\u044f\5H%\2\u044d\u044f\5J&\2\u044e"+
		"\u044c\3\2\2\2\u044e\u044d\3\2\2\2\u044fM\3\2\2\2\u0450\u0452\5\62\32"+
		"\2\u0451\u0450\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454"+
		"\7\13\2\2\u0454\u0455\7>\2\2\u0455\u0456\7\65\2\2\u0456\u045a\b(\1\2\u0457"+
		"\u0459\5T+\2\u0458\u0457\3\2\2\2\u0459\u045c\3\2\2\2\u045a\u0458\3\2\2"+
		"\2\u045a\u045b\3\2\2\2\u045b\u045d\3\2\2\2\u045c\u045a\3\2\2\2\u045d\u045e"+
		"\7\66\2\2\u045e\u0462\b(\1\2\u045f\u0461\5\6\4\2\u0460\u045f\3\2\2\2\u0461"+
		"\u0464\3\2\2\2\u0462\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0465\3\2"+
		"\2\2\u0464\u0462\3\2\2\2\u0465\u0466\7\f\2\2\u0466\u0467\7:\2\2\u0467"+
		"\u0468\b(\1\2\u0468O\3\2\2\2\u0469\u046b\5\62\32\2\u046a\u0469\3\2\2\2"+
		"\u046a\u046b\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\5V,\2\u046d\u046e"+
		"\7>\2\2\u046e\u046f\7\65\2\2\u046f\u0473\b)\1\2\u0470\u0472\5T+\2\u0471"+
		"\u0470\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2"+
		"\2\2\u0474\u0476\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u0477\7\66\2\2\u0477"+
		"\u047b\b)\1\2\u0478\u047a\5\6\4\2\u0479\u0478\3\2\2\2\u047a\u047d\3\2"+
		"\2\2\u047b\u0479\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047e\3\2\2\2\u047d"+
		"\u047b\3\2\2\2\u047e\u047f\7\r\2\2\u047f\u0480\b)\1\2\u0480\u0481\5R*"+
		"\2\u0481\u0482\7:\2\2\u0482\u0483\7\f\2\2\u0483\u0484\7:\2\2\u0484\u0485"+
		"\b)\1\2\u0485Q\3\2\2\2\u0486\u0487\7?\2\2\u0487\u0491\b*\1\2\u0488\u0489"+
		"\7A\2\2\u0489\u0491\b*\1\2\u048a\u048b\7=\2\2\u048b\u0491\b*\1\2\u048c"+
		"\u048d\7>\2\2\u048d\u0491\b*\1\2\u048e\u048f\7C\2\2\u048f\u0491\b*\1\2"+
		"\u0490\u0486\3\2\2\2\u0490\u0488\3\2\2\2\u0490\u048a\3\2\2\2\u0490\u048c"+
		"\3\2\2\2\u0490\u048e\3\2\2\2\u0491S\3\2\2\2\u0492\u0493\5V,\2\u0493\u0494"+
		"\7>\2\2\u0494\u049d\b+\1\2\u0495\u0496\79\2\2\u0496\u0497\b+\1\2\u0497"+
		"\u0498\5V,\2\u0498\u0499\7>\2\2\u0499\u049a\b+\1\2\u049a\u049c\3\2\2\2"+
		"\u049b\u0495\3\2\2\2\u049c\u049f\3\2\2\2\u049d\u049b\3\2\2\2\u049d\u049e"+
		"\3\2\2\2\u049eU\3\2\2\2\u049f\u049d\3\2\2\2\u04a0\u04a1\7\23\2\2\u04a1"+
		"\u04af\b,\1\2\u04a2\u04a3\7\24\2\2\u04a3\u04af\b,\1\2\u04a4\u04a5\7\25"+
		"\2\2\u04a5\u04af\b,\1\2\u04a6\u04a7\7\26\2\2\u04a7\u04af\b,\1\2\u04a8"+
		"\u04a9\7\27\2\2\u04a9\u04af\b,\1\2\u04aa\u04ab\7\30\2\2\u04ab\u04af\b"+
		",\1\2\u04ac\u04ad\7\31\2\2\u04ad\u04af\b,\1\2\u04ae\u04a0\3\2\2\2\u04ae"+
		"\u04a2\3\2\2\2\u04ae\u04a4\3\2\2\2\u04ae\u04a6\3\2\2\2\u04ae\u04a8\3\2"+
		"\2\2\u04ae\u04aa\3\2\2\2\u04ae\u04ac\3\2\2\2\u04afW\3\2\2\2\u04b0\u04b1"+
		"\7\16\2\2\u04b1\u04b2\7>\2\2\u04b2\u04b3\7:\2\2\u04b3\u04b4\b-\1\2\u04b4"+
		"Y\3\2\2\2\u04b5\u04b6\7@\2\2\u04b6\u04be\b.\1\2\u04b7\u04b8\7=\2\2\u04b8"+
		"\u04be\b.\1\2\u04b9\u04ba\7>\2\2\u04ba\u04be\b.\1\2\u04bb\u04bc\7C\2\2"+
		"\u04bc\u04be\b.\1\2\u04bd\u04b5\3\2\2\2\u04bd\u04b7\3\2\2\2\u04bd\u04b9"+
		"\3\2\2\2\u04bd\u04bb\3\2\2\2\u04be[\3\2\2\2\u04bf\u04c0\7\17\2\2\u04c0"+
		"\u04c1\b/\1\2\u04c1\u04c2\5Z.\2\u04c2\u04c3\7:\2\2\u04c3\u04c4\b/\1\2"+
		"\u04c4]\3\2\2\2\u008dclrz\u0098\u00b0\u00bb\u00c3\u00cf\u00dc\u00e2\u00e7"+
		"\u00ed\u00f1\u00f5\u00fb\u0100\u0106\u010a\u010e\u0114\u011a\u011d\u0123"+
		"\u0127\u012b\u0131\u0137\u013a\u0140\u0144\u0147\u0152\u015e\u016a\u0173"+
		"\u017b\u018a\u0196\u019e\u01af\u01ba\u01c1\u01c6\u01cd\u01d1\u01d5\u01dc"+
		"\u01e1\u01e8\u01ec\u01f2\u01f9\u01ff\u0202\u0209\u020d\u0213\u021a\u0220"+
		"\u0223\u022a\u022e\u0233\u0236\u023d\u0242\u0249\u024d\u0251\u0258\u025d"+
		"\u0264\u0268\u026e\u0275\u027b\u027e\u0285\u0289\u028f\u0296\u029c\u029f"+
		"\u02a6\u02aa\u02af\u02bd\u02c8\u02d9\u02f1\u02f5\u02f8\u0300\u0305\u030d"+
		"\u0312\u031a\u031f\u0327\u032c\u0334\u0339\u0341\u0346\u034e\u0353\u035c"+
		"\u0362\u036a\u0374\u037e\u0388\u0392\u039c\u03a6\u03b1\u03d3\u03dd\u03e7"+
		"\u03f2\u03f9\u03ff\u040b\u0418\u041b\u042b\u0445\u044e\u0451\u045a\u0462"+
		"\u046a\u0473\u047b\u0490\u049d\u04ae\u04bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}