/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matricula;

/**
 *
 * @author 
 */
import javax.swing.*;
import java.awt.*;

public class Matricula extends JFrame {
  
    private JPanel painelamarelo,painelbranco;
    private JTextField tfNome,tfcurso,tfdisciplina;
    private JLabel lbltitulo,lblnome,lblcurso,lbldisciplina,lblcomentario;
    private JTextArea tacomentario;
    
    private Matricula()
    {

        setTitle("Utilizando o JtextComponent");
        setVisible(true);
        Container C=getContentPane();
        C.setLayout(null);
        painelbranco=new JPanel();
        painelbranco.setLayout(null);
        painelbranco.setBounds(10, 10, 510, 340); 
        painelbranco.setBackground(Color.WHITE);
        C.add(painelbranco);
        
        lbltitulo=new JLabel();
        lbltitulo.setText("Matrícula em Disciplina"); 
        lbltitulo.setForeground(Color.blue);
        lbltitulo.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,18));
        lbltitulo.setBounds(170, 10, 210, 30);
        painelbranco.add(lbltitulo);
        
        lblnome=new JLabel();
        lblnome.setText("Nome do aluno: ");
        lblnome.setBounds(20, 60, 115, 15); 
        painelbranco.add(lblnome);
        
        lblcurso = new JLabel();
        lblcurso.setText("Curso: ");
        lblcurso.setBounds(20, 90, 50, 15);
        painelbranco.add(lblcurso);
        
        lbldisciplina = new JLabel();
        lbldisciplina.setText("Disciplina: ");
        lbldisciplina.setBounds(20, 130, 110, 15);
        painelbranco.add(lbldisciplina);
        
        tfNome = new JTextField();
        tfNome.setText("Digite o seu nome!"); 
        tfNome.setForeground(Color.blue);
        tfNome.setBounds(110, 60, 390, 20);
        painelbranco.add(tfNome);
        
        tfcurso = new JTextField();
        tfcurso.setText("Ciência da Computação");
        tfcurso.setForeground(Color.blue);
        tfcurso.setBounds(60, 90, 430, 20);
        painelbranco.add(tfcurso);
        
        tfdisciplina = new JTextField();
        tfdisciplina.setText("Orientação à Objetos");
        tfdisciplina.setForeground(Color.blue);
        tfdisciplina.setBounds(80, 130, 420, 20);
        painelbranco.add(tfdisciplina);
        
        painelamarelo = new JPanel();
        painelamarelo.setLayout(null);
        painelamarelo.setBounds(20, 180, 470, 130);
        painelamarelo.setBackground(Color.yellow);
        painelamarelo.setBorder(BorderFactory.createEtchedBorder());
        painelbranco.add(painelamarelo);
        
        lblcomentario=new JLabel();
        lblcomentario.setText("Comentários: ");
        lblcomentario.setBounds(20, 10, 100, 15);
        painelamarelo.add(lblcomentario);
        
        tacomentario = new JTextArea();
        tacomentario.setText("O Intuito da disciplina é ensinar ao aluno o paradigma orientado a objetos,utilizando a linguagem de programação orientada a objetos JAVA, também apresentar os componentes para construção de interface gráfica, o SWING.");
        tacomentario.setForeground(Color.blue);
        tacomentario.setLineWrap(true); 
        tacomentario.setWrapStyleWord(true);
        tacomentario.setBounds(20, 30, 430, 87);
        painelamarelo.add(tacomentario);
        
        setSize(560,400);
        show();

    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        Matricula mat=new Matricula();
        mat.show();
    }
}
