#include<stdio.h>
#include<stdlib.h>

typedef struct no arvore;

arvore* inicializa();
arvore* insere (arvore* a, int v);
void imprime(arvore* a);
arvore* busca(arvore* buscado, int v);
arvore* remover (arvore* r, int v);
int altura(arvore* a);
int quant_no(arvore* a);
int altura_no(arvore* a);
