package exercicio2;

 import javax.swing.JOptionPane;

 public class Exercicio2
 {
   public static void main(String[] args)
   {
     String s1 = JOptionPane.showInputDialog("Informe quantos volantes: ");

     int sorteio = Integer.parseInt(s1);
     for (int j = 1; j <= sorteio; j++) {
       for (int i = 1; i <= 6; i++)
       {
         int oi = 1 + (int)(Math.random() * 60.0D);
         JOptionPane.showMessageDialog(null, "LOTE: " + j + "\nPalpite: " + oi, "Resultado:", -1);
       }
     }
   }
 }


