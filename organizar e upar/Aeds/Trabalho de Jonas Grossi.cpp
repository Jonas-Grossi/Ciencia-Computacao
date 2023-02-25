#include <stdio.h>
#include <time.h>
#include <iostream>
#include <cstdlib>

using namespace std;

int tam;
int  vetor_Randomico[1000],vetor_Select[1000],vetorInsert[1000],vetorBubble[1000];

void gera_vetor()
{
    cout <<"Digite o tamanho do vetor:\n";
    cin >>tam;
	for (int i = 0; i < tam; i++ ) {
		vetor_Randomico[i] =1 + rand() % 10;
	}

	cout <<"O vetor criado com sucesso!!!\n\n";
		for (int i = 0; i < tam; i++ ) {
		cout <<"[" <<vetor_Randomico[i]<<"]";
	}
}
void  geraGraficos(int v[]){
    int i;
    int j;
    int max;
    max = 0;
   for (i = 0; i < tam; i++)
      if (v[i] > max)
         max = v[i];

   for (i = max; i > 0; i--){
      for (j = 0; j < tam; j++)
         if (v[j] >= i)
                cout << " *";
            else
                cout << "  ";
                putchar('\n');

   }

}


void imprimir_vetor(char tipoOrdenacao){

   switch(tipoOrdenacao)
   {
        case 's':
        {
            for(int cont = 0; cont < tam; cont++)
                cout <<"[" << vetor_Select[cont]<<"]";

            break;
        }
        case 'i':
            for(int cont1 = 0; cont1 < tam; cont1++)
                cout <<"[" << vetorInsert[cont1]<<"]";

                break;

        case 'b':
            for(int cont2 = 0; cont2 < tam; cont2++)
                cout <<"[" <<vetorBubble[cont2]<<"]";

   }
   cout<<"\n\n\n";
}

void select (){
int i;

    for(i=0;i<tam;i++)
    {
        vetor_Select[i]= vetor_Randomico[i];
    }
    cout <<"\n -- Vetor ordenado pelo metodo SELECT --\n";
    int aux, j;
    for(i=0; i<=tam-1; i++){
        aux=i;
        for (j=i+1; j<tam; j++){

                if (vetor_Select[j] < vetor_Select[aux]){
                    aux = j;
                }
            }

            if(i != aux){
                int swap = vetor_Select[i];
                vetor_Select[i] = vetor_Select[aux];
                vetor_Select[aux] = swap;

            }
            for(int a=0;a<tam;a++){
                cout <<"[" <<vetor_Select[a]<<"]";
            }
            cout <<"\n";
            geraGraficos(vetor_Select);
            cout <<"\n";
          }
}


void insert (){

    cout <<"\n -- Isertion Sort --\n";

    int aux, j, i;
    for(i=0;i<tam;i++)
    {
        vetorInsert[i]= vetor_Randomico[i];
    }
    for (i=1; i<=tam; i++){
        aux = vetorInsert[i];
        j = i-1;
        while (j>=0 && aux<vetorInsert[j]){
            vetorInsert[j+1] = vetorInsert[j];
            j--;
        }
        for(int a=0;a<tam;a++){
                cout <<"[" << vetorInsert[a]<<"]";
            }
            cout <<"\n";
        vetorInsert[j+1] = aux;
        geraGraficos(vetorInsert);
        cout <<"\n";
    }

}


void  booble_Sort (){
   int i, j, x;

   cout <<"\n -- Booble Sort --\n";
       for(i=0;i<tam;i++)
    {
        vetorBubble[i] = vetor_Randomico[i];
    }

   for(i=0; i<tam-1; i++){
        for(j=i+1; j<tam; j++){

            if(vetorBubble[i] > vetorBubble[j]){
                x = vetorBubble[i];
                vetorBubble[i] = vetorBubble[j];
                vetorBubble[j] = x;
            }
            for(int a=0;a<tam;a++){
                    cout <<"[" <<vetorBubble[a]<<"]";
            }
            cout <<"\n";
            geraGraficos(vetorBubble);
            cout <<"\n";
        }
   }

}

// MENU PRINCIPAL

void menu(){
    printf("\n");
    printf("----------- Trabalho de AEDS 3 JONAS GROSSI ------------\n");
    printf("\nEscolha uma das opcoes abaixo: \n\n");
    printf ("1 - Criar  vetor;\n");
    printf("2 - Selection Sort;\n");
    printf("3 - Insertion Sort;\n");
    printf("4 - Booble Sort;\n");
    printf("0 -  sair\n\n");

}
int main (void){
    int a;
    clock_t begin, end;
	srand(time(NULL));
    menu();
   cin>>a;
    while(a!=0)
    {
        switch(a){

             case 1:
                system("cls");
               gera_vetor();
                break;


             case 2:
                system("cls");
                begin = clock();
                select();
                end = clock();
                printf( "\n Erro vetor nao preenchido!  ");
                cout << ((double) (end - begin)) / CLOCKS_PER_SEC;
                cout << " segundos" << endl;
                cout << "\nVetor ordenado: " << endl;
                imprimir_vetor('s');
                break;

             case 3:
                system("cls");
                begin = clock();
                insert();
                end = clock();
                cout << "\nErro vetor nao preenchido! ";
                cout << ((double) (end - begin)) / CLOCKS_PER_SEC;
                cout << " segundos" << endl;
                cout << "\nVetor ordenado: " << endl;
                imprimir_vetor('i');
                break;

             case 4:
                system("cls");
                begin = clock();
                booble_Sort();
                end = clock();
                cout << "\n Erro vetor nao preenchido! ";
                cout << ((double) (end - begin)) / CLOCKS_PER_SEC;
                cout << " segundos" << endl;
                cout << "\nVetor ordenado: " << endl;
                imprimir_vetor('b');
                break;

             default:
                cout <<"Opcao Invalida!.";
        }
        menu();
       cin>>a;
    }
    system ("cls");
    system("pause");
}



