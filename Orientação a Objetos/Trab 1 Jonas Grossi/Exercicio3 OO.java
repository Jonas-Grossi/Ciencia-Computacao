 package exercicio3;

 import javax.swing.JOptionPane;

  public class Exercicio3
 {
   public static void main(String[] args)
   {
     int resultado = 0;

     int aux = 1;
     while (aux != 0)
     {
       int num1 = 1 + (int)(Math.random() * 9.0D);
       int num2 = 1 + (int)(Math.random() * 9.0D);
       JOptionPane.showMessageDialog(null, " " + num1 + " x " + num2, "Operação:", -1);
       while (resultado != num1 * num2)
       {
         String s1 = JOptionPane.showInputDialog("Digite o resultado: ");
         resultado = Integer.parseInt(s1);
         if (resultado == num1 * num2) {
           JOptionPane.showMessageDialog(null, "MUITO BEM!", "Resultado:", -1);
         } else {
          JOptionPane.showMessageDialog(null, "ESTUDE MAIS e TENTE NOVAMENTE!", "Resultado:", -1);
         }
       }
       String s2 = JOptionPane.showInputDialog("Digite: \n 1-Responder novamente; \n0-Para sair;");
       aux = Integer.parseInt(s2);
     }
   }
 }

