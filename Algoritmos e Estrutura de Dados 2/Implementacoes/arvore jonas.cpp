#include<stdio.h>
#include<stdlib.h>

 typedef struct No{
struct No* esq;
struct No* dir;
int chave;
};

struct Arvore{

No* raiz;

};
void incializar(arvore* a){

a->raiz = NULL;
}

/* inserir(no* noVisitado, int chave)`{
int aux;
if(noVisita == NULL){
    no* aux = new no;
    aux->esq = NULL;
    aux->dir = NULL;
    aux->chave = chave;
    return aux;

}
*/

}

int main(){

arvore* a = new arvore;
inicializar(a);
a->raiz = inserir(a->raiz, 16);

}
