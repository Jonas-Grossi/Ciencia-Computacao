//By Jonas Grossi

#include<stdio.h>
#include<stdlib.h>

int main(){
	int numero;

	for(int i=0; i<20; i++){
		printf("%d\n", rand() % 100);
	}
}
