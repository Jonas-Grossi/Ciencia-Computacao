#include<stdlib.h>
#include<stdio.h>

int dividir(int vet,int esq,int dir){
int aux;//troca de posicoes
int cont = esq;//recebe o valor da esq no exemplo e o valor 0

for(int i = esq+1 ; i< = dir ; i++){
if(vet[i]<vet[esq]){
cont++;
aux=vet[i];
vet[i]=vet[cont];
vet[esq]=aux;

}

}
aux = vet[esq];
vet[esq]= vet[cont];
vet[cont] = aux;
return ;

}


void quick(int vet[],int esq, int dir){
int pos;//fala posicao que parou de ordenar na esquerda e depois a direita

if(esq<dir){

pos = dividir(vetor,esq,dir);
quick(vet,esq,pos-1);
quick(vet,pos+1,dir);
}



}




int main(){

int vet[]={3,5,8,1,9,2,4,7,0,6};
int n=10;
quick(vet,0,n);
printf("\n\n\n");
for(int i=0;i<n;i++){
prinf("%d-",vet[i]);
printf("\n\n\n");
system("PAUSE");

}


}
