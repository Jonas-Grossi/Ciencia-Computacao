#include<stdio.h>
#include<stdlib.h>

//estrutura arvore
struct arvore{
int chave;
struct no* esq;
struct no* dir;

};
arvore *raiz;//fazendo a arvore apontar para raiz


arvore* visita(arvore *a,arvore *b,int pvalor){//metodo visita arvore
if(a == NULL){
    a = (arvore*)malloc(sizeof(arvore));//alocando espaço na memoria para a nova estrutura

    //aterrando ponteiros
    a->dir = NULL;
    a->esq = NULL;
    a-> chave = pvalor;//chave da estrutura recebe o novo valor

    if(b == NULL){

        printf("\n\nValor adicionado a raiz\n\n");
        system("PAUSE");
        return a;//raiz aponta para a

    }
if(pvalor < b->chave){
            b->esq = a;
            printf("\nEsse numero foi adicionado a esqueda de %d\n", b->chave);
        }else{
            b->dir = a;
            printf("\nEssa numero foi adicionado a direita %d\n", b->chave);
        }
        system("pause");
        return a;
    }
if(pvalor < a->chave){

        visita(a,a->esq,pvalor);


    }else{

    visita(a,a->dir,pvalor);
    }


    }





void incluir(){
int valor;
printf("digite um valor para inserir\n\n");
scanf("%d",&valor);
if(raiz == NULL){

raiz = visita(raiz,raiz,valor);

}else{
visita( raiz,raiz,valor);
}
}



int main(){
int op;
raiz = NULL;
do
    {
        printf("\n\tBy Jonas Grossi\n\n");
        printf("1. Inserir\n");
        printf("2. Pre-Ordem\n");
        printf("3. Pos-Ordem\n");
        printf("0. Sair\n");

printf("Digite a opcao desejada\n");
scanf("%d",&op);
system("cls || clear");
switch(op){

case 1:
incluir();
break;
 default:
printf("Digite uma opcao valida\n");
}
    }while(op);
}





