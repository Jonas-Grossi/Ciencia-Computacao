package exercicio1;

import java.io.PrintStream;
mport javax.swing.JOptionPane;

public class Exercicio1
{
    public static void main(String[] args)
   {
     String s1 = JOptionPane.showInputDialog("Informe quantos números serão sorteados: ");

     String s2 = JOptionPane.showInputDialog("Informe a quantidade de numeros que serão pesquisados: ");

     double qtd = Double.parseDouble(s1);
     double sorteio = Double.parseDouble(s2);
     for (int i = 1; i <= qtd; i++) {
       System.out.println("[" + i + "] = " + Math.round(Math.random() * sorteio));
     }
   }
 }

