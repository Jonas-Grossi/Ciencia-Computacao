
#include <cstdlib>
#include <stdio.h>
#include <stdlib.h>

using namespace std;

/*
 *
 */
void heapsort(int a[], int n) {
   int i = n / 2, pai, filho, t;
   for (;;) {
      if (i > 0) {
          i--;
          t = a[i];
      } else {
          n--;
          if (n == 0) return;
          t = a[n];
          a[n] = a[0];
      }
      pai = i;
      filho = i * 2 + 1;
      while (filho < n) {
          if ((filho + 1 < n)  &&  (a[filho + 1] > a[filho]))
              filho++;
          if (a[filho] > t) {
             a[pai] = a[filho];
             pai = filho;
             filho = pai * 2 + 1;
          } else {
             break;
          }
      }
      a[pai] = t;
   }
}
int main(int argc, char** argv) {
int vetorAux[30];
    int aux, i = 0, j = 0;
    FILE *arq;

	arq = fopen("arquivo.txt", "r+");
	if(arq == NULL)
			printf("Erro, nao foi possivel abrir o arquivo\n");
	else{
		while( (fscanf(arq,"%d", &aux))!=EOF )
		{
			vetorAux[i]=aux;
			i++;
		}
        heapsort(vetorAux, i);
        }
        freopen("arquivo.txt", "r+", arq);
         while( j != i )
		{
		    fprintf(arq,"%d ", vetorAux[j]);
			j++;
		}
        fclose(arq);

    return 0;
}
