/* Criar uma classe Ordem cujos campos são variáveis double: x, y e z. A classe Ordem deverá
possuir os métodos mostramaior, mostrarmenor, mostrarcerescente, mostrardecrescente  */

package ordem;

/** @author Dâmaris **/

import javax.swing.*;
import java.util.Scanner;

public class Ordem {

    public static void main(String[] args) {
        
        double x, y, z;
        Scanner e = new Scanner (System.in);
        
        System.out.print("Digite um valor para x, y e z: \nPS: Digite valor diferentes.\n\n");
        System.out.print("X: ");
        x = e.nextDouble();
        System.out.print("Y: ");
        y = e.nextDouble();
        System.out.print("Z: ");
        z = e.nextDouble();
        
        mostrarMaior(x, y, z);
        mostrarMenor(x, y, z);
        mostrarCrescente(x, y, z);
        mostrarDecrescente(x, y, z);
        
    }
    
    /*public static double mostrarMaior(double x, double y, double z){
    
        double maior=0;
        if (x>y && x>z) maior = x;
        if (y>x && y>z) maior = y;
        if (z>x && z>y) maior = z;
        System.out.print("O maior valor é: "+maior);
        return maior;*/

    // mostrar maior valor de x, y, z
    public static void mostrarMaior(double x, double y, double z){
	String nome = "X";
	double maior = x;
	if (maior < y){
		maior = y;
		nome = "Y";
	}
	if (maior < z){
		maior = z;
		nome = "Z";
	}
	System.out.printf("\n\nMaior campo: %s - %.1f", nome, maior);
    }
    

    // mostrar menor valor de x, y, z
    public static void mostrarMenor(double x, double y, double z){
	String nome = "X";
	double menor = x;
	if (y < menor){
		menor = y;
		nome = "Y";
	}
	if (z < menor){
		menor = z;
		nome = "Z";
	}
	System.out.printf("\nMenor campo: %s - %.1f", nome, menor);
    }
   

    // mostrar ordem crescente
    public static void mostrarCrescente(double x, double y, double z){
        
        double n1=x, n2=y, n3=z;
        
        if ((x < y) && (x < z)) n1=x;
        if ((y < x) && (y < z)) n1=y;
        if ((z < x) && (z < y)) n1=z;
        if ((x > y) && (x < z)) n2 = x;
        if ((y > x) && (y < z)) n2 = y;
        if ((z > x) && (z < y)) n2 = z;
        if ((x > y) && (x > z)) n3 = x;
        if ((y > x) && (y > z)) n3 = y;
        if ((z > x) && (z > y)) n3 = z;
        
        System.out.printf("\nOrdem crescente: "+ n1+" - "+ n2+" - "+ n3+" .");
        
    }
    // mostrar ordem crescente
    public static void mostrarDecrescente(double x, double y, double z){
        
        double n1=x, n2=y, n3=z;
        
        if ((x < y) && (x < z)) n1=x;
        if ((y < x) && (y < z)) n1=y;
        if ((z < x) && (z < y)) n1=z;
        if ((x > y) && (x < z)) n2 = x;
        if ((y > x) && (y < z)) n2 = y;
        if ((z > x) && (z < y)) n2 = z;
        if ((x > y) && (x > z)) n3 = x;
        if ((y > x) && (y > z)) n3 = y;
        if ((z > x) && (z > y)) n3 = z;
        
        System.out.printf("\nOrdem decrescente: "+ n3+" - "+ n2+" - "+ n1+" .");
        
    }

}