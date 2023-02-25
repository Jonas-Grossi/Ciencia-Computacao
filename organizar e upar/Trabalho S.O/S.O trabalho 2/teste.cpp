#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main(int argc, char* argv[]) {

	FILE *arquivo;
    char str[255];
    char *ret;
    int cont = 0;


	if (argc != 3){
		printf("Formato Invalido.");
	return 0;
	}else{
		arquivo = fopen(argv[2],"r");
		if(arquivo){
			while (fscanf(arquivo, "%s", str) != EOF ){
                ret = strstr(str, argv[1]);
                if(ret != NULL){
                    printf("%s\n", str);
                    cont++;
                }
			}
		}else{
			printf("Erro na operação!\n");
			fclose(arquivo);
			return cont;
		}
	}
	fclose(arquivo);
	if(cont != 0){
		printf("String encontrada %d vezes \n", cont);
	}else{
		printf("String nao encontrada.\n");
	}
	return 0;

}
