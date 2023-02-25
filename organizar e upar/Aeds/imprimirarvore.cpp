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

void imprimeEmOrdem(no* a)
{
    if(a != NULL)
    {
        imprimeEmOrdem(a->esq);
        printf("%d ", a->chave);
        imprimeEmOrdem(a->dir);
    }
}

void imprimePosOrdem(no* a)
{
    if(a != NULL)
    {
        imprimePosOrdem(a->esq);
        imprimePosOrdem(a->dir);
        printf("%d ", a->chave);
    }
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

no* busca(no* buscado, int v)
{
    if(buscado == NULL)
    {
        printf("\nNAO ENCONTRADO!");
        return NULL;
    }

    else if(buscado->chave > v)
        return busca(buscado->esq, v);

    else if (buscado->chave < v)
        return busca(buscado->dir, v);

    else
    {
        printf("\nENCONTRADO!");
        return buscado;
    }
}

no* inserir(no* noVisitado, int chave)
{
    if(noVisitado == NULL)
    {
    no* aux = (no*) malloc(sizeof no);

      //  no* aux = new no;
        aux->esq = NULL;
        aux->dir = NULL;
        aux->chave = chave;
        return aux;
    }
    if(chave < noVisitado->chave)
        noVisitado->esq = inserir(noVisitado->esq, chave);

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

    printf(" EM ORDEM: ");
    imprimeEmOrdem(a->raiz);
    printf("\n");

    printf("PRE ORDEM: ");
    imprimePreOrdem(a->raiz);
    printf("\n");

    printf("POS ORDEM: ");
    imprimePosOrdem(a->raiz);
    printf("\n");

    busca(a->raiz,22);

    return 0;
}
