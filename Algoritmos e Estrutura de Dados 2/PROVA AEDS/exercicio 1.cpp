#include <stdio.h>
#include <stdlib.h>
FILE*pont;
int **criaPilha(int nLinhas,int nColunas){
  register int i;
  int **pilha;
  pilha=(int **) malloc(nLinhas*sizeof(int *));
  if(!pilha)
      printf("\nFalta memoria para alocar a matriz de ponteiros");
  for(i=0;i<nLinhas;i++){
    pilha[i]=(int *) malloc(nColunas*sizeof(int));
    if (!pilha[i])
      printf("\nFalta memoria para alocar a matriz de ponteiros.\n");
  }
  return pilha;
}
int imprime(int **p, int l, int c){
    for (int i=0; i<l; i++){
        for (int j=0; j<c; j++){
            printf("%c ",p[i][j]);
        }
        printf("\n");
    }
}
int carrega(int **p, int l, int c){
    for (int i=0; i<l; i++){
        for (int j=0; j<c; j++){
            fscanf(pont,"%c",&p[i][j]);
        }
    }
}
/*
int inverso(int **p, int l, int c){
    for (int i=0; i<l; i--){
        for (int j=c; j>0; j--){
            printf("%cO",&p[i][j]);
        }
    }
}
*/
int main (){
    int **p;
    int l,c;
    pont = fopen ("matriz5x5.txt", "r");
    fscanf(pont,"%d",&l);
    fscanf(pont,"%d",&c);
    p=criaPilha(l,c);
    carrega(p,l,c);
//    inverso(p,l,c);
    imprime(p,l,c);
system("pause");
return 0;
}
