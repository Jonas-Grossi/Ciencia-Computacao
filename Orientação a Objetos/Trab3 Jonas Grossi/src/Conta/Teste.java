/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conta;

/**
 *
 * @author pc-not
 */
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
    
        float limite;
        float saldo;
        float valorlimite;
       
        ContaCorrente BancoDoBrasil = new ContaCorrente();
        BancoDoBrasil.saldo = 10;
        BancoDoBrasil.valorlimite=100;
        BancoDoBrasil.limite=5;        
        int opcao=100;
        Scanner entrada = new Scanner(System.in);
        
        while(opcao!=0){
            
            System.out.println("DIGITE UMA OPÇÃO:\n");
            System.out.println("0 - Sair");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Saldo da conta");
            System.out.print("-->");
            opcao=entrada.nextInt();
            switch(opcao){
            
                case 1:
            
                    System.out.println("Digite o valor em que deseja sacar");
                    float sacar=entrada.nextFloat();
                    try {
                        BancoDoBrasil.Sacar(sacar);
                    } catch (Exception ex) {

                        System.out.println("ERRO!!!\nSaque Impossivel!");
                    }
                            break;
                case 2:
                    
                    System.out.println("Digite o valor para depositar:");
                    float depositar=entrada.nextFloat();
                   try{
                    BancoDoBrasil.Depositar(depositar);
                   }
                   catch(Exception bb){
                  
                       System.out.println("ERRO!!!\n Impossível depositar valores negativo!");
                   }
                   break;
                case 3:
                    
                    System.out.println("Saldo da conta: R$ "+BancoDoBrasil.saldo);
                    
                    break;
                default:
                    
                    System.out.println("Essa Opção não existe!!!");
          
                    break;
            }
            
        }
        
        
        
        
        
    
    }
    
}
