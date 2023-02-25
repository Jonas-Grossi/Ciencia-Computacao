/* Fazer formulários com FlowLayout(Janelinhas uma ao lado das outras) */

package formulariogrid;

/** @author Dâmaris **/

import javax.swing.*;
import java.awt.GridLayout;

public class FormularioGrid extends JFrame {

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
    
    public FormularioGrid(){

        setTitle ("GridLayout");
        setSize (400, 200);
        setLocation (400, 300);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setResizable (true);
        
        getContentPane().setLayout(new GridLayout (5,2));
        
        nome = new JLabel ("Nome: ");
        getContentPane().add(nome);
        tf_nome = new JTextField(20);
        getContentPane().add(tf_nome);
        
        endereco = new JLabel ("Endereço: ");
        getContentPane().add(endereco);
        tf_endereco = new JTextField(30);
        getContentPane().add(tf_endereco);
        
        cidade = new JLabel("Cidade");
        getContentPane().add(cidade);
        tf_cidade = new JTextField(20);
        getContentPane().add(tf_cidade);
        
        estado = new JLabel("Estado");
        getContentPane().add(estado);
        tf_estado = new JTextField(2);
        getContentPane().add(tf_estado);
        
        ok = new JButton ("OK");
        getContentPane().add(ok);
        
        cancelar = new JButton ("Cancelar");
        getContentPane().add(cancelar);
        
    }
    
    public static void main(String[] args) {
        JFrame objeto = new FormularioGrid();
        objeto.setVisible(true);
    }
}
