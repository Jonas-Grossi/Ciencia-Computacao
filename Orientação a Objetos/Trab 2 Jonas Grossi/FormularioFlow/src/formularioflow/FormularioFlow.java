/* Fazer formulários com FlowLayout(Janelinhas uma ao lado das outras) */

package formularioflow;

/** @author Dâmaris Bento **/

import javax.swing.*;
import java.awt.FlowLayout;

public class FormularioFlow extends JFrame {

    JLabel nome;
    JTextField tf_nome;
    JLabel endereco;
    JTextField tf_endereco;
    JLabel cidade;
    JTextField tf_cidade;
    JLabel estado;
    JTextField tf_estado;
    JButton ok;
    JButton cancelar;
    
    public FormularioFlow(){
        
        setTitle ("FlowLayout");
        setSize (400, 200);
        setLocation(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        
        nome = new JLabel("Nome: ");
        getContentPane().add(nome);
        tf_nome = new JTextField(20);
        getContentPane().add(tf_nome);
        
        endereco = new JLabel("Endereço: ");
        getContentPane().add(endereco);
        tf_endereco = new JTextField(30);
        getContentPane().add(tf_endereco);
        
        cidade = new JLabel("Cidade: ");
        getContentPane().add(cidade);
        tf_cidade = new JTextField(15);
        getContentPane().add(tf_cidade);
        
        estado = new JLabel ("Estado: ");
        getContentPane().add(estado);
        tf_cidade = new JTextField(2);
        getContentPane().add(tf_cidade);
        
        ok = new JButton("OK");
        getContentPane().add(ok);
        
        cancelar = new JButton("Cancelar");
        getContentPane().add(cancelar);
                
             
    
    }
    public static void main(String[] args) {
        JFrame objeto = new FormularioFlow();
        objeto.setVisible(true);
    }
}
