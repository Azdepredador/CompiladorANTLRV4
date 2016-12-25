package editorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import editorTexto.HelloLexer;
import editorTexto.HelloParser;


public class Tablas extends Editor implements ActionListener{
	public JTable tabla,tablaSimbolos;
	public static DefaultTableModel modelo,modeloSimbolos;
	public static String [] simbolos= new String[9];
	public static String [] datos= new String[4];
	public static int id=0;
	public static boolean hayErrores=false;
	
	public static StringBuilder constantes= new StringBuilder();
	public static StringBuilder declaracion= new StringBuilder();
	public static StringBuilder programa= new StringBuilder();
	public static StringBuilder asm= new StringBuilder();
	
	public static HashMap<String,String> mapaDeclaraciones= new HashMap<String,String>();
	
	
	public void crearTabla(int linea, String token, String descrip, String ambito,String vIni,Object vFin,String mem){
		
		agregarTablaLexico(linea, token, descrip);
		agregarTablaSimbolos(linea, token, descrip, ambito, vIni, vFin, mem, nombreArchivo, pathArchivo);
		
	}
	
	
	public void agregarTablaLexico(int lista, String token, String descrip){
		id++;
		datos[0]=Integer.toString(id);
		datos[1]=Integer.toString(lista);
		datos[2]=token;
		datos[3]=descrip;
		modelo.addRow(datos);
	}
	
	
	public void agregarTablaSimbolos(int linea,String token,String iden,String ambito,String vIni, Object vFin, String mem, String arch, String dir){
		simbolos[0]=Integer.toString(linea);
		simbolos[1]=token;
		simbolos[2]=iden;
		simbolos[3]=ambito;
		simbolos[4]=vIni;
		
		if(vFin.equals(0)){
			simbolos[5]="";
		}
		else{
			simbolos[5]=vFin.toString();
		}
		
		simbolos[6]=mem;
		simbolos[7]=arch;
		simbolos[8]=dir;
		
		modeloSimbolos.addRow(simbolos);
	}
	
	public void ejecutarASM() {

        String command2 = "nasm -f elf Prog.asm";
        Process proc2;
		try {
			proc2 = Runtime.getRuntime().exec(command2);
			proc2.waitFor();
	        String command3 = "gcc -m32 Prog.o -o Prog";
	        Process proc3 = Runtime.getRuntime().exec(command3);
	        proc3.waitFor();
	    	
	        String command = "./Prog";

	        Process proc = Runtime.getRuntime().exec(command);
	        

	        // Read the output

	        BufferedReader reader =  
	              new BufferedReader(new InputStreamReader(proc.getInputStream()));

	        String line = "";
	        while((line = reader.readLine()) != null) {
	            asm.append(line + "\n");
	        }

	        proc.waitFor();   
			
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        

	}
	
	public void crearArchivo(String dato) {
		File archivo = new File("Prog.asm");
		FileWriter escribir;
		
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write(dato);
			escribir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void eliminarArchivo(){
		File file= new File("Prog.asm");
		if(file.exists()){
			file.delete();
		}
	}
	
	public void agregarDeclaraciones(){
	   mapaDeclaraciones.forEach((key,value)-> declaracion.append(value+"\n"));
	}
	
	public void crearEnsamblado(){
		constantes.append("extern printf\n");
		constantes.append("extern scanf\n");
		constantes.append("SECTION .data\n");
		
		declaracion.append("SECTION .bss\n");
		
		programa.append("SECTION .text\n");
		programa.append("global main\n");
		programa.append("main:\n");
		programa.append("push ebp\n");
		programa.append("mov ebp,esp\n");
		
	}
	
	public void vaciarEnsamblado(){
		
		agregarDeclaraciones();
		
		/*System.out.print(constantes.toString());
		System.out.print(declaracion.toString());
		System.out.print(programa.toString());*/
		
		crearArchivo(constantes.toString()+declaracion.toString()+programa.toString());
		
	}
	
	public void crearVentana(){
		
		JScrollPane scrollV= new JScrollPane();
		JTextArea textoV= new JTextArea();
		JFrame panelV= new JFrame();
		textoV.setText(asm.toString());
		textoV.setEditable(true);
		scrollV.getViewport().add(textoV);
		scrollV.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panelV.add(scrollV);
		panelV.setVisible(true);
		panelV.setSize(500, 400);
	
		
		
		
	}
	
	
	public void tablaLexico(){
		
		tabla= new JTable();
		modelo= new DefaultTableModel();
		
		
		modelo.addColumn("Id");
		modelo.addColumn("Linea");
		modelo.addColumn("Token");
		modelo.addColumn("Descripcion");
		tabla.setModel(modelo);
	
		
		
		scrollLexico.getViewport().add(tabla);
		scrollLexico.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		ejecutar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				//modelo.removeTableModelListener(tabla);
				id=0;
				hayErrores=false;
				eliminarArchivo();
				constantes.delete(0, constantes.length());
				declaracion.delete(0, declaracion.length());
				programa.delete(0, programa.length());
				asm.delete(0, asm.length());
				
				modelo.getDataVector().removeAllElements();
				modeloSimbolos.getDataVector().removeAllElements();
				modeloLista.clear();
				list.removeAll();
				lineas.getHighlighter().removeAllHighlights();
				crearEnsamblado();
				
				
				analizarANTLRv4(texto.getText());
				
				vaciarEnsamblado();
				

				agregarErrores("");
				ejecutarASM();
				
				if(!hayErrores){
					crearVentana();
				}
				
				

			}
		});
	}
	
	public void tablaSimbolos(){
		tablaSimbolos = new JTable();
		modeloSimbolos=new DefaultTableModel();
		
		modeloSimbolos.addColumn("Linea");
		modeloSimbolos.addColumn("Token");
		modeloSimbolos.addColumn("Identificador");
		modeloSimbolos.addColumn("Ambito");
		modeloSimbolos.addColumn("V. ini");
		modeloSimbolos.addColumn("V. fin");
		modeloSimbolos.addColumn("Mem");
		modeloSimbolos.addColumn("N. archivo");
		modeloSimbolos.addColumn("Dir");
		
		tablaSimbolos.setModel(modeloSimbolos);
		scrollSimbolos.getViewport().add(tablaSimbolos);
		scrollSimbolos.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		
	}
	
	
	public void analizarANTLRv4(String archivo){
		
		
		//System.out.println(archivo);
		
		ANTLRInputStream input= new ANTLRInputStream(archivo);		
	    HelloLexer lexer = new HelloLexer(input);
	    CommonTokenStream tokens = new CommonTokenStream( lexer );
	    HelloParser parser = new HelloParser( tokens );
	    parser.removeErrorListeners(); // remove ConsoleErrorListener
	    parser.addErrorListener(new VerboseListener()); // add ours
	    ParseTree tree = parser.programa();
        TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        
        scrollTree.getViewport().add(viewr);
        scrollTree.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollTree.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
    
        
	    
	}
	
	public static class VerboseListener extends BaseErrorListener {
		
		Editor ed= new Editor();
	    @Override
	    public void syntaxError(Recognizer<?, ?> recognizer,
	                            Object offendingSymbol,
	                            int line, int charPositionInLine,
	                            String msg,
	                            RecognitionException e)
	    {
	    	new Tablas().hayErrores=true;
	        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
	        Collections.reverse(stack);
	        ed.agregarErrores("Error linea "+line+" : "+charPositionInLine+" at "+msg);
	    }

	}
	

}
