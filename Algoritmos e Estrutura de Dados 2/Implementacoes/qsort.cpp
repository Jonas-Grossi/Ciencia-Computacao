#include<stdio.h>
#include<stdlib.h>

int compara(const void *x,cont void *y){
return (int) (*(int *)x - *(int *)y);
}

int main(){
int vetor[5]={100,90,80,70,60};
int i;
qsort(vetor,5,sizeof(int),compara);
for(i=0;i<5;i++){
printf("%d\n",vetor[i]);

}
return 0;


}
