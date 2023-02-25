/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author 
 */
import javax.swing.*;
import java.awt.*;

public class jFrameLogin extends JFrame {

    private JLabel lbltitulo,lbllogin,lblpassword;
    private JTextField jtflogin;
    private JPasswordField jpfpassword;
    private JPanel jpanelbotoes;
    private JButton btnok,btncancelar;
    
    private jFrameLogin()
    {
    
        Container C = getContentPane();
        C.setLayout(null);
        lbltitulo= new JLabel();
        lbltitulo.setBounds(90, 20, 180, 15);
        lbltitulo.setFont(new Font("Arial",Font.BOLD,12));
        lbltitulo.setForeground(Color.red);
        lbltitulo.setText("Entre com os seus dados!");
        C.add(lbltitulo);
        
        lbllogin = new JLabel();
        lbllogin.setBounds(30, 50, 60, 20); 
        lbllogin.setText("Login: "); 
        C.add(lbllogin);
        
        lblpassword = new JLabel();
        lblpassword.setBounds(20, 90,110, 15);
        lblpassword.setText("Password: ");
        C.add(lblpassword);
        
        jtflogin = new JTextField();
        jtflogin.setBounds(100, 50, 210, 20);
        jtflogin.setText("Insira seu Login!");
        C.add(jtflogin);
        
        jpfpassword = new JPasswordField();
        jpfpassword.setBounds(90, 90, 210, 20); 
        C.add(jpfpassword);
        
        jpanelbotoes = new JPanel();
        jpanelbotoes.setBounds(30, 120, 350, 60);
        jpanelbotoes.setLayout(null);
        jpanelbotoes.setBackground(Color.blue);
        C.add(jpanelbotoes);
        
        btnok = new JButton("OK");
        btnok.setBounds(70, 20, 60, 23);
        jpanelbotoes.add(btnok);
        
        btncancelar=new JButton("Sair do Programa");
        btncancelar.setBounds(150, 20, 150, 23);
        jpanelbotoes.add(btncancelar);
        
        setTitle("Tela de Inicializalação - José Lucas Pereira");
        setSize(400,250);
        show();
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
    
    
        jFrameLogin login = new jFrameLogin();
        login.show();
    }
}
