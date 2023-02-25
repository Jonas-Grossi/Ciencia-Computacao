/* Antes do racionamento de energia ser decretado, quase ninguém falava em quilowatts; 
mas, agora, todos incorporam essa palavra em seu vocabulário. Sabendo-se que 100 quilowatts de
energia custam um sétimo do salário mínimo, fazer uma classe em java que:
· Tenha dois atributos: um que represente o valor do salário mínimo e outro que represente a
quantidade de quilowatts gata por uma residência;
· Crie um método que retorne o valor em reais de cada quilowatt;
· Crie um método que retorne o valor em reais que a residência terá que pagar;
· Crie um método que retorne o valor em reais que a residência terá que pagar com desconto
de 10%;
· Crie um método main que:
o Atribua um valor aos atributos da classe;
o E que mostre na tela a quantidade em reais que a residência vai pagar, com e sem o
desconto.  */

/** @author Dâmaris  **/

package quilowatt;
import java.util.Scanner;

public class Quilowatt {
       
    
    public static void main(String[] args) {
        double salario;
        double kw;
        
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite o valor do salario: ");
        salario = entrada.nextDouble();
        System.out.print("Digite a quantidade de kw: ");
        kw = entrada.nextDouble();
        
        valorQuilowatt(salario, kw);
        totalPago(salario, kw);
        totalPagoDesc(salario, kw);
     }

    // · Crie um método que retorne o valor em reais de cada quilowatt;
     public static void  valorQuilowatt(double x, double y){  
        double s, q;
        s = x/7; 
        s = s/100;
        q = y/100;
              
        System.out.print("\nValor de cada KW: R$ "+s*q);
               
    }
     
     //· Crie um método que retorne o valor em reais que a residência terá que pagar;
      public static void totalPago(double x, double y){  
        double s, q;
        s = x/7; 
        s = s/100;
        q = y/100;
                
        System.out.print("\nValor Total a pagar: R$ "+s*q*y);
        
               
    }
    
      //· Crie um método que retorne o valor em reais que a residência terá que pagar com desconto de 10%
     public static void totalPagoDesc(double x, double y){  
        double s, q, desc, total;
        s = x/7; 
        s = s/100;
        q = y/100;
        total = (s*q*y);
        desc = total*0.1;        
        System.out.print("\nValor Total a pagar com desconto: R$ "+ (total-desc));
              
    }
}
