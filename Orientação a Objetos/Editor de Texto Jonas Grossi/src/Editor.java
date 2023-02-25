/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author aluno
 */
public class Editor extends JFrame implements ActionListener{
    public JTextArea texto;
    public JScrollPane jSP;
    public JButton btnAbrir,btnSalvar,btnSair;
    public static void main(String[] args){
        Editor ed=new Editor();
        ed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Editor(){
        super("Editor de Texto");
        setSize(300,410);
        setLayout(null);
        Container c=getContentPane();
        
        texto=new JTextArea();
        jSP=new JScrollPane(texto);
        jSP.setBounds(10,10,390,450);
        c.add(jSP);
        
        btnAbrir=new JButton("Abrir");
        btnAbrir.setBounds(60,470,100,20);
        btnAbrir.addActionListener(this);
        c.add(btnAbrir);
        
        btnSalvar=new JButton("Salvar");
        btnSalvar.setBounds(165,470,100,20);
        btnSalvar.addActionListener(this);
        c.add(btnSalvar);
        
        btnSair=new JButton("Sair");
        btnSair.setBounds(270,470,100,20);
        btnSair.addActionListener(this);
        c.add(btnSair);
        show();
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==btnAbrir){
            String arq=JOptionPane.showInputDialog(rootPane, "Entre com o nome(caminho) do arquivo que desejas abrir:");
            try {
                FileInputStream stream=null;
                stream = new FileInputStream(arq);
                   
                InputStreamReader streamReader = new InputStreamReader(stream);
                BufferedReader reader = new BufferedReader(streamReader);
                String line="";
            
               while (reader.ready()){
                    line+=reader.readLine()+"\n";
                }
            
                texto.setText(line);
                reader.close();
            
            } 
            catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(rootPane, "Arquivo de cadastros não localizado!");  
            } 
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (e.getSource()==btnSalvar){
            String arq=JOptionPane.showInputDialog(rootPane, "Entre com o nome(caminho) do arquivo que desejas salvar:");
            try {
                FileOutputStream stream=new FileOutputStream(arq);
                OutputStreamWriter streamWriter=new OutputStreamWriter(stream);
                BufferedWriter writer=new BufferedWriter(streamWriter);
                writer.write(texto.getText().toString());
                writer.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if (e.getSource()==btnSair){
            int op=JOptionPane.showConfirmDialog(rootPane, "Tem certeza que desejas sair?", "Sair",JOptionPane.OK_CANCEL_OPTION);
            if (op==JOptionPane.OK_OPTION){
                JOptionPane.showMessageDialog(rootPane, "Bye!");
                System.exit(1);
                
            }
        }
    }
    
}
