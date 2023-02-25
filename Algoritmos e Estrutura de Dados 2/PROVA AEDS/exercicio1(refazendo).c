#include <stdio.h>
#include <conio.h>
#include<stdlib.h>
int main(void)
{
	char url[]="simulado.txt";
	char ch,a,i;

	FILE *arq;

	arq = fopen(url, "r");
	if(arq == NULL)
	    printf("Erro, nao foi possivel abrir o arquivo\n");
	else
	    while( (ch=fgetc(arq))!= EOF)
		putchar(ch);

printf("\nDigite S para ver o texto ao contrario ou qualquer tecla para encerrar o programa\n\n");
a = getchar();
if(a == 's'){
       //for(i=EOF-1;i>=0;i--)
        //printf("%c",i]);
printf("esntrou ");
       //for(ch=EOF;ch>fgetc(arq);ch--)
        //while( (ch=fgetc(arq))= EOF)
		//putchar(ch);
}else{

fclose(arq);

}


	fclose(arq);

	getchar();
	//return 0;
}
