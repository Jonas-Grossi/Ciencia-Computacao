/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frmcombo;

/**
 *
 * @author 
 */
import javax.swing.*;
import java.awt.*;

public class FRmcombo extends JFrame{

    private JPanel carro;
    private JLabel OpçõesDeCarro,resposta,CarroGanhado,índicedovalor,Index;
    private JComboBox Jcarro;
    private JSeparator DividirATela;
    private JButton Apagar;
    private FRmcombo(){
    
        Container C = getContentPane();
        C.setLayout(null);
        setTitle("Exemplo evento JComboBox");
        setSize(468,210);
        
        carro = new JPanel();
        carro.setBounds(4,4,440,50);
        carro.setBorder(BorderFactory.createEtchedBorder());
        carro.setLayout(null);
        C.add(carro);
        
        OpçõesDeCarro = new JLabel();
        OpçõesDeCarro.setText("Escolha um carro: ");
        OpçõesDeCarro.setBounds(6,6,120,20);
        carro.add(OpçõesDeCarro);
        String[] dados = {"Fusca","Palio","Civic"};
        
        Jcarro = new JComboBox(dados);
        Jcarro.setBounds(126,6,310,25);
        carro.add(Jcarro);
        
        CarroGanhado = new JLabel();
        CarroGanhado.setText("Você acaba de ganhar um: ");
        CarroGanhado.setBounds(4,60,190,20);
        C.add(CarroGanhado);
        
        resposta = new JLabel();
        resposta.setBounds(196,60,60,20);
        resposta.setText(Jcarro.getSelectedItem().toString());
        C.add(resposta);
        
        índicedovalor = new JLabel();
        índicedovalor.setText("Index do valor escolhido: ");
        índicedovalor.setBounds(4,84,190,20);
        C.add(índicedovalor);
        
        Index = new JLabel();
        Index.setText(String.valueOf(Jcarro.getSelectedIndex()));
        Index.setBounds(198,84,15,20);
        C.add(Index);
        
        DividirATela = new JSeparator(SwingConstants.VERTICAL);
        DividirATela.setPreferredSize(new Dimension(800, 5));  
        DividirATela.setBorder(BorderFactory.createEtchedBorder());
        DividirATela.setBounds(260, 56, 2, 100);
        C.add(DividirATela);
        
        Apagar = new JButton("Limpar");
        Apagar.setBounds(280,70,100,30);
        C.add(Apagar);
        show();
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        FRmcombo combobox = new FRmcombo();
        combobox.show();
    
    }
}
