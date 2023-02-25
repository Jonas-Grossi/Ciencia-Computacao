#include<stdio.h>
#include<stdlib.h>


struct No {
   int chave;
   struct No* esq;
   struct No* dir;
};

typedef struct No arvore;

arvore* inicializa()
{
    return NULL;
}

arvore* insere(arvore* a, int v)
{
    if (a == NULL)
    {
        a = (arvore*) malloc(sizeof(arvore));
        a->chave = v;
        a->esq = a-> dir = NULL;
        return a;
    }
    else if(v < a->chave)
        a->esq = insere(a->esq, v);

    else
        a->dir = insere(a->dir, v);

    return a;
}

void imprime(arvore* a)
{
    if (a!=NULL)
    {
        imprime(a->dir);
        printf("%d ", a->chave);
        imprime(a->esq);
    }
}

arvore* busca(arvore* buscado, int v)
{
    if(buscado == NULL)
        return NULL;

    else if(buscado->chave > v)
        return busca(buscado->esq, v);

    else if (buscado->chave < v)
        return busca(buscado->dir, v);

    else
        return buscado;
}

arvore* remover (arvore* r, int v)
{
     if (r == NULL)
         return NULL;

     else if (r->chave > v)
         r->esq = remover(r->esq, v);

     else if (r->chave < v)
         r->dir = remover(r->dir, v);

     else {                               //SE HOUVER FILHOS
          if (r->esq == NULL && r->dir == NULL)             //SEM FILHOS
          {
             free (r);
             r = NULL;
          }
          else if (r->esq == NULL)                          //POSSUI FILHO A DIREITA
               {
                 arvore* t = r;
                 r = r->dir;
                 free (t);
               }
          else if (r->dir == NULL)                          //POSSUI FILHO A ESQUERDA
               {
                 arvore* t = r;
                 r = r->esq;
                 free (t);
               }
               else                                         //POSSUI AMBOS FILHOS
               {
                 arvore* pai = r;
                 arvore* f = r->esq;

                 while (f->dir != NULL)
                 {
                    pai = f;
                    f = f->dir;
                 }

                 r->chave = f->chave;
                 f->chave = v;
                 r->esq = remover(r->esq,v);
               }
           }
     return r;
}

int main ()
{
    arvore* a = inicializa();

    a = insere(a, 6);
    a = insere(a, 8);
    a = insere(a, 4);
    a = insere(a, 2);
    a = insere(a, 5);
    a = insere(a, 3);
    a = insere(a, 1);
    a = insere(a, 7);

    remover(a, 1);

    imprime(a);

    arvore* x = busca(a, 3);

    return 0;
}
