#include<stdio.h>
#include<stdlib.h>



typedef struct no
{
	int chave;
	no* esq;
    no* dir;
}no;

typedef struct arvore
{
	no* raiz;

}arvore;

void inicializa(arvore* a)
{
	a->raiz = NULL;

}



void imprimePreOrdem(no* a)
{
    if(a != NULL)
    {
        printf("%d ", a->chave);
        imprimePreOrdem(a->esq);
        imprimePreOrdem(a->dir);
    }
}



no* inserir(no* noVisitado, int chave)
{
    if(noVisitado == NULL)
    {
        no* aux = new no;
        aux->esq = NULL;
        aux->dir = NULL;
        aux->chave = chave;
        return aux;
    }
    if(chave < noVisitado->chave)
        noVisitado->esq = inserir(noVisitado->esq, chave);
printf("%d ", noVisitado->chave);
    else if(chave > noVisitado->chave)
        noVisitado->dir = inserir(noVisitado->dir, chave);

    return noVisitado;
}

int main()
{
    arvore* a = new arvore;
	inicializa(a);
	a->raiz = inserir(a->raiz, 16);
    a->raiz = inserir(a->raiz, 12);
    a->raiz = inserir(a->raiz, 18);
    a->raiz = inserir(a->raiz, 14);

    printf("PRE ORDEM: ");
    imprimePreOrdem(a->raiz);
    printf("\n");





    return 0;
}
