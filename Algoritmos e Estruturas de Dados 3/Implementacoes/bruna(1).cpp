#include<stdlib.h>
#include<stdio.h>



void inicio(){
    int no_um=0;
    int no_dois=0;
    int no_tres=0;
    int no_quatro=0;
    int no_cinco=0;
    int malha_um=0;
    int malha_dois=0;
    int malha_tres=0;
    int malha_quatro=0;
    int malha_5=0;
    int numero_no=0;
    int numero_malha=0;
    int numero_fontes=0;
    int numero_impedancia;


char caracter;
float valor_impedancia[3],impedancia_malha,impedancia_no;

printf("----------Analise de Circuitos----------\n\n");


printf("O circuito contem fonte de tensao ou fonte de corrente?\n");
printf("\n\n ----- pressione t para tensao ou c para corrente -----\n\n");
scanf("%c",&caracter);
system("cls");


if(caracter == 't'){

printf("\n\nQuantas fontes?\n\n");
scanf("%d",&numero_fontes);
while (numero_fontes>2){
        printf("Numeros de fontes acima do limite!!");
        printf("\n\nQuantas fontes?\n\n");
        scanf("%d",&numero_fontes);
        system("cls");
    }
printf("Quantas malhas?\n\n");
scanf("%d",&numero_malha);
while (numero_malha>5){
        printf("\n\nNumeros de malhas acima do limite!!");
        printf("\n\nQuantas malhas?\n\n");
        scanf("%d",&numero_malha);
        system("cls");
    }
system("cls");
for(int i=1;i<=numero_malha;i++){

printf("Quantas impedancias na malha %d?\n\n",i);
scanf("%d",&numero_impedancia);

float soma = 0,cont=0;
for(int d=0;d<numero_impedancia ;d++){
if(numero_impedancia>3){
system("cls");
   printf("\n\nnumero de impedancia ultrapassou o limite!!!\n\n");
break;
}else{

printf("Digite o valor da %d impedancia\n\n",d);
scanf("%f",&valor_impedancia[d]);

cont = valor_impedancia[d];
soma = cont + soma;
}
}
printf("\nvalor de %.2f é\n\n" ,soma);



}
}else if(caracter == 'c'){

printf("\n\nQuantas fontes?\n\n");
scanf("%d",&numero_fontes);
while (numero_fontes>2){
        printf("Numeros de fontes acima do limite!!");
        printf("\n\nQuantas fontes?\n\n");
        scanf("%d",&numero_fontes);
        system("cls");
    }
printf("\n\nQuantos nos?\n\n");
scanf("%d",&numero_no);
system("cls");
 while (numero_no>5){
        printf("Numeros de nos acima do limite!!");
        printf("\n\nQuantos nos?\n\n");
        scanf("%d",&numero_no);
        system("cls");
    }
system("cls");
for(int i=1;i<=numero_no;i++){

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
