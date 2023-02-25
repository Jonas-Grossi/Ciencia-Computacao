#include<stdio.h>
#include<stdlib.h>




void quick(int vet[],int esq,int dir){
int trab;
int pivo;

int aux_dir;
int aux_esq;

aux_esq = esq;
aux_dir = dir;

pivo = vet[(esq+dir)/2];

while(aux_esq<=aux_dir){
    while(vet[aux_esq]<pivo)
        aux_esq = (aux_esq+1);
    while(vet[aux_dir]>pivo)
    aux_dir = (aux_dir-1);

if(aux_esq<=aux_dir){

    trab = vet[aux_esq];
    vet[aux_esq] = vet[aux_dir];
    vet[aux_dir] = trab;
    aux_esq = (aux_esq+1);
    aux_dir = (aux_dir -1 );

}
}
if(esq<aux_dir){

    quick(vet,esq,aux_dir);

}
if(dir>aux_esq){

    quick(vet,aux_esq,dir);

}
system("cls");
printf("\n\n Valores ordenados\n");
for(int i=0;i<10;i++){

    printf("%d\n",vet[i]);

}
}
int main(){
int a=0;
int b=9;
int vet[]={9,8,17,6,5,3,4,1,2,10};

quick(vet,0,9);
system("PAUSE");

}
