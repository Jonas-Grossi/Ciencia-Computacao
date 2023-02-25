/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoflavio.ordenacaoexterna;

import java.util.ArrayList;

public class MergeSort {

    OrdenacaoExterna r = new OrdenacaoExterna(); //Cria-se instancia da classe OrdenacaoExterna
    private ArrayList<Registro> registros = new ArrayList<Registro>(); //Cria-se um vetor de registros
    private ArrayList<Registro> aux = new ArrayList<Registro>(); // Cria-se um vetor auxiliar de registros
    ;
    public int tam, trocas = 0, comparacoes = 0, trocasAux = 0; //Instancia-se as informações com o valor 0

    public ArrayList<Registro> sort(ArrayList<Registro> reg) { //assinatura do métoodo utilizando o vetor a ser ordenado

        this.registros.addAll(reg); //vetor registros copia os dados do vetor a ser ordenado

        tam = reg.size(); // tamanho recebe o tamanho do vetor a ser ordenado

        mergesort(0, tam - 1); // método mergesort variando de 0 ao tamanho máximo do vetor
        System.out.println("Foram feitas " + comparacoes + " comparações e " + (trocas) + " trocas."); //Informações pedidas no trabalho
        System.out.println("Considerando a cópia do vetor vetor principal como troca, temos " + (trocas + trocasAux) + " trocas."); //Dúvida se eram só trocas feitas durante o desenvolvimento, ou se também contava o a cópia do vetor auxiliar do início da ordenação
        return registros; //retorna vetor ordenado
    }

    private void mergesort(int low, int high) {

        if (low < high) { //se menor posição for menor que a maior

            //Pega o índice do elemento que está no meio
            int middle = low + (high - low) / 2;

            //Ordena a metade esquerda do vetor
            mergesort(low, middle);

            //Ordena a metade direita do vetor
            mergesort(middle + 1, high);

            //Combina a primeira metade com a segunda
            merge(low, middle, high);

        }

    }

    private void merge(int low, int middle, int high) {

        //Vetor auxiliar copia valores do vetor registros
        for (int i = low; i <= high; i++) {
            aux.add(i, registros.get(i));
            trocasAux++;
        }

        int i = low;        //menor indice
        int j = middle + 1; //indice medio+1 (primeira posiçao do vetor da direita)
        int k = low; //copia do menor indice

        while (i <= middle && j <= high) { //roda os vetores para comparar a menor posiçao do vetor esquerdo com a menor do direito
            comparacoes++; //para o if else, obrigatoriamente será feita uma comparação,
            if (r.comparaRegistro(aux.get(i), aux.get(j)) == -1 || r.comparaRegistro(aux.get(i), aux.get(j)) == 0) { //comparação de (menor posiçao do vetor esquerdo <= menor posiçao do vetor direito)
                registros.set(k, aux.get(i)); //vetor resultado na posiçao atual recebe o menor elemento da comparaçao
                trocas++; // troca efetuada
                i++; //proxima posiçao do elemento de menor valor comparado
            } else { //se o outro elemento for menor
                trocas++; // troca efetuada no menor valor
                registros.set(k, aux.get(j)); //vetor resultado na posiçao atual recebe o menor elemento da comparaçao
                j++; // próxima posição do elemento de menor valor comparado
            }

            k++; // próxima posição do vetor resultado
        }

        while (i <= middle) {
            //enquanto o vetor da esquerda não chegar no meio+1, ou seja,não tiver terminado, não chegar no vetor da direita
            registros.set(k, aux.get(i)); //vetor resultado recebe o restante do vetor da esquerda
            trocas++; // troca efetuada
            k++; //próxima posição do vetor resultado
            i++; // próxima posição do vetor da esquerda
        }
        // Since we are sorting in-place any leftover elements from the right side
        // are already at the right position.

    }
}
