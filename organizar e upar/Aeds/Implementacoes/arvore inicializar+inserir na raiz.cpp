#include<stdio.h>
#include<stdlib.h>

typedef struct No{
int chave;
No* esq;
No* dir;


};
typedef struct Arvore{


No* raiz;

};
void inicio(Arvore*  a){

a->raiz = NULL;


};
No *primeiro(No* visinho){
int chave;
printf("Digite o valor a ser inserido na raiz?\n");
scanf("%d",&chave);


    if(visinho == NULL){
        No* aux = new No;
        aux -> esq = NULL;
        aux -> dir = NULL;
        aux -> chave = chave;
        printf("\n\nValor inserido com sucesso!!!\n\n");

        return aux;
    }
}

int main(){

Arvore* a = new Arvore;
inicio(a);

a->raiz = primeiro(a->raiz);
    printf("--%d--",a->raiz->chave);

system("PAUSE");
}
