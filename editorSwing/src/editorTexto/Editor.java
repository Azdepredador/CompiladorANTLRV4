package editorTexto;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Element;
import javax.swing.text.Highlighter;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;


public class Editor extends JFrame implements MouseListener,CaretListener,ActionListener,KeyListener{
	
	
		
		public static DefaultListModel modeloLista= new DefaultListModel();
		public static String nombreArchivo;
		public static String pathArchivo;
		public JTextArea texto;
		public JScrollPane scroll,scroll1,scroll2,scrollLexico,scrollTree,scrollSimbolos;
		public JTextArea lineas;
		public Highlighter.HighlightPainter pintura,pintura2;
		public JList list;
		public JLabel etiqueta;
		public JMenuBar barra;
		public JMenu archivo,analizadores;
		public JMenuItem nuevo,abrir,guardar,salir;
		public JTabbedPane pestanas,pestanas1;
		public JButton boton,boton1,boton2,ejecutar;
		public JPanel panel,panel2,panel3;
		int x;  
		String ruta;
		int contadorError=0;
		
		
		
	
		
		
	    boolean presiono=true; 
	    private String outString = null;
	        
		public Editor(){
		super();
		
		final StyleContext cont = StyleContext.getDefaultStyleContext();
        final AttributeSet attr = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.RED);
        final AttributeSet attrBlack = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLACK);
        DefaultStyledDocument doc = new DefaultStyledDocument() {
            public void insertString (int offset, String str, AttributeSet a) throws BadLocationException {
                super.insertString(offset, str, a);

                String text = getText(0, getLength());
                int before = findLastNonWordChar(text, offset);
                if (before < 0) before = 0;
                int after = findFirstNonWordChar(text, offset + str.length());
                int wordL = before;
                int wordR = before;

                while (wordR <= after) {
                    if (wordR == after || String.valueOf(text.charAt(wordR)).matches("\\W")) {
                        if (text.substring(wordL, wordR).matches("(\\W)*(private|public|protected|waymas|koko)"))
                            setCharacterAttributes(wordL, wordR - wordL, attr, false);
                        else
                            setCharacterAttributes(wordL, wordR - wordL, attrBlack, false);
                        wordL = wordR;
                    }
                    wordR++;
                }
            }

            public void remove (int offs, int len) throws BadLocationException {
                super.remove(offs, len);

                String text = getText(0, getLength());
                int before = findLastNonWordChar(text, offs);
                if (before < 0) before = 0;
                int after = findFirstNonWordChar(text, offs);

                if (text.substring(before, after).matches("(\\W)*(private|public|protected|waymas|koko)")) {
                    setCharacterAttributes(before, after - before, attr, false);
                } else {
                    setCharacterAttributes(before, after - before, attrBlack, false);
                }
            }
        };
		

		
		ventanaDimensiones();
	
		botones();
		texto();
		lista();
		etiquetaP();
		barra();
		
		
		
		
		}
		
		
	    private int findLastNonWordChar (String text, int index) {
	        while (--index >= 0) {
	            if (String.valueOf(text.charAt(index)).matches("\\W")) {
	                break;
	            }
	        }
	        return index;
	    }

	    private int findFirstNonWordChar (String text, int index) {
	        while (index < text.length()) {
	            if (String.valueOf(text.charAt(index)).matches("\\W")) {
	                break;
	            }
	            index++;
	        }
	        return index;
	    }
	    
	    
		
		
		
		

		
		public void botones(){
		boton= new JButton();
		boton1= new JButton();
		boton2= new JButton();
		ejecutar= new JButton();
		boton.setIcon(new ImageIcon(getClass().getResource("/image/new.gif")));
		boton1.setIcon(new ImageIcon(getClass().getResource("/image/open.gif")));
		boton2.setIcon(new ImageIcon(getClass().getResource("/image/SAVE.GIF")));
		ejecutar.setIcon(new ImageIcon(getClass().getResource("/image/run.gif")));
		boton.setBounds(1, 2, 24, 24);
		boton1.setBounds(25, 2, 24, 24);
		boton2.setBounds(50, 2, 24, 24);
		ejecutar.setBounds(75,2,24,24);
		
		boton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				texto.setText("");
				lineas.setText("1");
				
			}
			
		});
		
		boton1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				presiono=false;
				// TODO Auto-generated method stub
				JFileChooser abrirArchivo = new JFileChooser();
				abrirArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
				
				if(outString !=null){
					abrirArchivo.setCurrentDirectory(new File(outString));
				}
				
				
				int seleccion = abrirArchivo.showOpenDialog(null);
				
				if(seleccion == JFileChooser.APPROVE_OPTION){
					File f = abrirArchivo.getSelectedFile();
					
					String nombre = f.getName();
					String path = f.getAbsolutePath();
					nombreArchivo=nombre;
					pathArchivo=path;
							
					
					String contenido = getContenido(path);
					
					setTitle(nombre + " [" + path + "]");
					texto.setText(contenido);
					outString=path;
				}
			}
			
		});
		
		boton2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String path;
				if(ruta!=null){
					salvarArchivo(ruta);
					JOptionPane.showMessageDialog(boton2, "Archivo Guardado");
				}
				else{
				JFileChooser guardarArchivo = new JFileChooser();
				guardarArchivo.setSelectedFile(new File("archivo.txt"));
				guardarArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
				
				int seleccion = guardarArchivo.showSaveDialog(null);
				
				if(seleccion == JFileChooser.APPROVE_OPTION){
					File f = guardarArchivo.getSelectedFile();
					
					path = f.getAbsolutePath();
					
					if(f.exists()){
						if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(boton2,"El archivo existe,deseas reemplazarlo?","Sobreescribir Archivo",JOptionPane.YES_NO_OPTION)){
							salvarArchivo(path);
							ruta=path;
						}
					}else{
						try {
							f.createNewFile();
							salvarArchivo(path);
							ruta=path;
							System.out.println(ruta);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			
				}
			
			
			
			
			}
			
			
		});
		
		
		
		
		add(boton);
		add(boton1);
		add(boton2);
		add(ejecutar);
		
		
		}
		
		public void barra(){
		barra= new JMenuBar();
		archivo = new JMenu("Archivo");
		analizadores= new JMenu("Analizadores");
		nuevo = new JMenuItem("Nuevo");
		abrir = new JMenuItem("Abrir");
		guardar= new JMenuItem("Guardar Como");
		salir = new JMenuItem("Salir");
		
		abrir.setIcon(new ImageIcon(getClass().getResource("/image/open.gif")));
		nuevo.setIcon(new ImageIcon(getClass().getResource("/image/new.gif")));
		guardar.setIcon(new ImageIcon(getClass().getResource("/image/SAVE.GIF")));
		
		barra.add(archivo);
	  //  barra.add(analizadores);
	    barra.add(salir);
	    archivo.add(nuevo);
	    archivo.add(abrir);
	    archivo.add(guardar);
	    archivo.add(new JSeparator());
	    archivo.add(salir);
		setJMenuBar(barra);
		
		
		
		nuevo.addActionListener(this);
		abrir.addActionListener(this);
		guardar.addActionListener(this);
		salir.addActionListener(this);
		
		}
		
		
		
	    public boolean esNumero(String j)
	    {
	        try{
	            Integer.parseInt(j);
	            return  true;
	        }
	        catch(NumberFormatException numberFormatException){
	            return false;
	        }
	    }
	    
	    public void agregarErrores(String errores){
	    	
	    	
	    	
	    	modeloLista.addElement(errores);
	    	list.setModel(modeloLista);
	    	
			list.addMouseListener(new MouseListener(){
			
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
			    	  if(e.getSource().equals(list)){
				    	  if (e.getClickCount() == 2) {
				    		  
				    		  
				    	
					    int index = list.locationToIndex(e.getPoint());
					    String error=modeloLista.get(index).toString();
					    String error1;
				        StringTokenizer token= new StringTokenizer(error," ");
				        while(token.hasMoreTokens()){
				            error1=token.nextToken();
				            if(esNumero(error1)){
				                int numero=Integer.parseInt(error1);
				                numero-=1;
				                colorear(numero);
							    texto.setCaretPosition(numero);
				                break;
				            }
				        }
					    
					    //int pos=Integer.parseInt(p1[index]);
					    //pos-=1;
					 
					    
					//   buscarpalabra(texto, p1[index]);
					  // colorear(buscarpalabra(texto, p1[index]));
				    	  
				    	  
				    	  }
				    	  }

					
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

	
				
				
				
			});	
	    	
	    	
	    	
	    
	    }
		
		public  void lista(){
			
			
	
			
			list = new JList();
			
			
			
			pestanas= new JTabbedPane();
			scroll2 = new JScrollPane();
			scroll1= new JScrollPane();

			
		
		
			//scroll1.setBounds(2, 440, 893, 200);
			scroll1.getViewport().add(list);
		
			scroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
			
			
			pestanas.setBounds(2,440,893,200);
			
			pestanas.addTab("Errores", scroll1);
			
			add(pestanas);
			
			
		 
			
			
		}
		
		int buscarpalabra(JTextArea area1, String texto) {
			int ind=-1;
	        if (texto.length() >= 1) {
	            DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.GREEN);
	            Highlighter h = area1.getHighlighter();
	            h.removeAllHighlights();
	            String text = area1.getText();
	            String caracteres = texto;
	            Pattern p = Pattern.compile("(?i)" + caracteres);
	            Matcher m = p.matcher(text);
	            
	            while (m.find()) {
	                try {
	                    h.addHighlight(m.start(), m.end(), highlightPainter);
	                    area1.setCaretPosition(m.start());
	                   ind=m.start(); 
	                } catch (BadLocationException ex) {
	                    Logger.getLogger(Color.class.getName()).log(Level.SEVERE, null, ex);
	                }
	            }
	            
	        } else {
	            JOptionPane.showMessageDialog(area1, "la palabra a buscar no puede ser vacia");
	        }
			return ind;
	       
	    }

		


		
		public void ventanaDimensiones(){
			setTitle("Editor");
			setSize(900,730);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Editor");
			
			setResizable(false);
			
			setLayout(null);
			
		}
		
		public void etiquetaP(){
			etiqueta = new JLabel();
			etiqueta.setBounds(760,600,500,100);
			etiqueta.setText("Fila: 0 - Columna: 0");
			add(etiqueta);
			
		}
		
		public void texto(){
			pestanas1= new JTabbedPane();
			texto = new JTextArea();
			scroll= new JScrollPane();
			lineas= new JTextArea();
			panel= new JPanel();
			panel2= new JPanel();
			panel3= new JPanel();
			scrollLexico= new JScrollPane();
			scrollTree= new JScrollPane();
			scrollSimbolos= new JScrollPane();
			
			
			texto.getDocument().addDocumentListener(new DocumentListener(){
				public String getText(){
					int caretPosition = texto.getDocument().getLength();
					Element root = texto.getDocument().getDefaultRootElement();
					String text = "1" + System.getProperty("line.separator");
					for(int i = 2; i < root.getElementIndex( caretPosition ) + 2; i++){
						text += i + System.getProperty("line.separator");
					}
					return text;
				}
				
				public void changedUpdate(DocumentEvent de) {
					
					
					//lineas.setText(getText());
					
				}
	 
				
				public void insertUpdate(DocumentEvent de) {
					
				
					if(presiono==false){
					lineas.setText(getText());
					
					}
					
					
					presiono=true;
				     
					
					
					
				}
	 
				
				public void removeUpdate(DocumentEvent de) {

					//System.out.println(x);
					//lineas.setText(getText());
					if(x==0){
					//System.out.println(getText());
					lineas.setText(getText());
					}
					x=1;
				}

	
	 
			});
			
			//texto.setBounds(1,50,991,500);
			lineas.setBackground(Color.DARK_GRAY);
			
			lineas.setEditable(false);
			lineas.setText("1");
			
			
			scroll.getViewport().add(texto);
			scroll.setRowHeaderView(lineas);
			scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			
			
			pestanas1.setBounds(1, 30, 893, 400);
			texto.addCaretListener(this);
			pestanas1.addTab("Editor", scroll);
			pestanas1.addTab("Lexico", scrollLexico);
			pestanas1.addTab("Sintactico", scrollTree);
			pestanas1.addTab("Semantico", scrollSimbolos);
			//pestanas1.addTab("G. Intermedia", panel3);
			
			add(pestanas1);
			
			texto.setFont(new java.awt.Font("Comic Sans Ms", 0, 13));
			
			lineas.setFont(new java.awt.Font("Comic Sans Ms", 0, 13));
			lineas.setForeground(Color.WHITE);
			
			texto.addKeyListener(this);

			
			
		}
		

		public void colorear(int dato){
			try {
				int startIndex = lineas.getLineStartOffset(dato);
				int endIndex = lineas.getLineEndOffset(dato);
				
				pintura = new DefaultHighlighter.DefaultHighlightPainter(Color.RED);
				lineas.getHighlighter().addHighlight(startIndex, endIndex, pintura);
				
				
				
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, "No existe la linea");
			}
		}
		
		
		
   
	      public void mouseEntered(MouseEvent e) 
	      {}
	   
	      public void mouseExited(MouseEvent e) 
	      {}
	   
	      public void mouseReleased(MouseEvent e) 
	      {}

	      public void mousePressed(MouseEvent e) 
	      {}
	      


		@Override
		public void actionPerformed(ActionEvent e) {
		
			if(e.getSource().equals(abrir)){
				presiono=false;
				JFileChooser abrirArchivo = new JFileChooser();
				abrirArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
				if(outString !=null){
					abrirArchivo.setCurrentDirectory(new File(outString));
				}
				
				int seleccion = abrirArchivo.showOpenDialog(null);
				
				
				
				if(seleccion == JFileChooser.APPROVE_OPTION){
					File f = abrirArchivo.getSelectedFile();
					
					String nombre = f.getName();
					String path = f.getAbsolutePath();
					
					String contenido = getContenido(path);
					
					setTitle(nombre + " [" + path + "]");
					outString=path;
					texto.setText(contenido);
				}
			}
			if(e.getSource().equals(guardar)){
				String path;
				JFileChooser guardarArchivo = new JFileChooser();
				guardarArchivo.setSelectedFile(new File("archivo.txt"));
				guardarArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
				
				int seleccion = guardarArchivo.showSaveDialog(null);
				
				if(seleccion == JFileChooser.APPROVE_OPTION){
					File f = guardarArchivo.getSelectedFile();
					
					path = f.getAbsolutePath();
					
					if(f.exists()){
						if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(this,"El archivo existe,deseas reemplazarlo?","Sobreescribir Archivo",JOptionPane.YES_NO_OPTION)){
							salvarArchivo(path);
							ruta=path;
						}
					}else{
						try {
							f.createNewFile();
							salvarArchivo(path);
							ruta=path;
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				
			}if(e.getSource().equals(salir)){
				System.exit(0);
			}
			if(e.getSource().equals(nuevo)){
				texto.setText("");
				lineas.setText("1");
			}
		}
		
		
		public void salvarArchivo(String path){
			FileWriter fw;
			BufferedWriter bw = null ;
			String contenido="";
			try {
				fw = new FileWriter(path);
				bw = new BufferedWriter(fw);
				
				BufferedReader reader = new BufferedReader(
						  new StringReader(texto.getText()));
				
				String linea;
				while((linea=reader.readLine())!=null){
					contenido += linea + "\n";
				}
				
				bw.write(contenido);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		public String getContenido(String path){
			FileReader fr;
			BufferedReader br = null;
			String contenido = "";
			try {
				fr = new FileReader(path);
				br = new BufferedReader(fr);
				
				
				String linea;
				while((linea=br.readLine())!=null){
					contenido += linea + "\n";
					
				}
				return contenido;
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			return contenido;
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
			// TODO Auto-generated method stub
			if(e.getKeyCode()==KeyEvent.VK_ENTER){
				presiono=false;
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
	
			
			
		}

		@Override
		public void caretUpdate(CaretEvent e) {
			
			
			// TODO Auto-generated method stub
			
			int caretPos;
			int y = 1;           //valor de la línea inicialmente en 1
			             //valor de la columna inicialmente en 1
			    
			    try {
			       
			        caretPos = texto.getCaretPosition();
			        y = texto.getLineOfOffset(caretPos);
			        x = caretPos - texto.getLineStartOffset(y);
			        y += 1;
			       
			    } catch (BadLocationException ex) {    //en caso de que ocurra una excepción
			        System.err.println(ex);
			    }
			    etiqueta.setText("Linea: "+y +" -"+" Columna: "+x);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	    public static void main(String[] args) {
	    	Editor e= new Editor();
	    	Tablas t= new Tablas();
	    	
	    	//e.setVisible(true);
	    	t.tablaLexico();
	    	t.tablaSimbolos();
	    	t.setVisible(true);
	    }

		
}
