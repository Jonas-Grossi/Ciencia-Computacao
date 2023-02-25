    #include<stdio.h>
#include<stdlib.h>

main(){
char j,i,aux;
char vet[5]={'a','c','b','f','e'};
for(i=1;i<10;i++){
aux=vet[i];
j=i-1;
while(j>=0 && aux<vet[j]){
vet[j+1] = vet[j];
j--;

}
vet[j+1]=aux;

}
for(i=0;i<5;i++){
    printf("%c",vet[i]);

system("PAUSE");

}
}
