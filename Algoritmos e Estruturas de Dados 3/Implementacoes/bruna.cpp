#include<stdlib.h>
#include<stdio.h>

void inicio(){
char caracter;
int numero_malha,numero_fontes,numero_no;
float impedancia_malha,impedancia_no;

printf("----------Analise de Circuitos----------\n\n");


printf(" 1- O circuito contem fonte de tensao ou fonte de corrente?\n");
printf("\n\n ----- pressione t para tensao ou c para corrente -----\n\n");
scanf("%c",&caracter);
system("cls");


if(caracter == 't'){

printf("\n\n 2- Quantas fontes?\n\n");
scanf("%d",&numero_fontes);

printf("Quantas malhas?\n\n");
scanf("%d",&numero_malha);
system("cls");
for(int i=0;i<numero_malha;i++){

printf("Qual a impedancia na malha %d?\n\n",i);

scanf("%f",&impedancia_malha);

}


system("cls");
}else if(caracter == 'c'){

printf("\n\n 2- Quantas fontes?\n\n");
scanf("%d",&numero_fontes);

printf("\n\nQuantos nos?\n\n");

scanf("%d",&numero_no);
system("cls");
for(int i=0;i<numero_no;i++){

printf("Qual a impedancia do no %d?\n\n",i);

scanf("%f",&impedancia_no);
}

system("cls");



}else{

printf ("\n\nOpcao errada\n\n\n");
return inicio();
system("cls");

}

}

int main(){
inicio();


system("PAUSE");

}
