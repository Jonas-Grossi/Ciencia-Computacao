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
public class ContaCorrente {

    public float limite;
    public float saldo;
    public float valorlimite;
  
   public void ContaCorrentes(float valorsacar ) throws Exception {
      if (saldo+limite < valorsacar){
         throw new Exception("Valor Indisponível para saque!");
      }
   }
   
   public void Depositar(float valor) throws Exception{
       if(valor<0)
           throw new Exception("ERRO!!!\n Impossível depositar valores negativos");
        saldo+=valor;
    
   }
   public void Sacar(float valor) throws Exception{
        try{
      
            ContaCorrentes(valor);
            saldo-=valor;
        }
        catch(Exception lj){
            System.out.println("ERRO!!!\nSaque Impossivel!");
        }
   }
   

   
    
}
