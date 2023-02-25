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

int main(){

Arvore* a = new Arvore;
inicio(a);
system("PAUSE");
}
