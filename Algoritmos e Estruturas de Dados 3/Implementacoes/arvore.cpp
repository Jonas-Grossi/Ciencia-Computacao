#include <stdio.h>
#include <stdlib.h>

typedef struct Elemento{
	int valor;
	struct Elemento *direita;
	struct Elemento *esquerda;
}Elemento;

typedef struct{
	Elemento *raiz;
}Arvore;

void IniciaArvore(Arvore *arv){
	arv->raiz = NULL;
}

Elemento *InserirArvore(Elemento *atual, int num){
	if(atual == NULL){
		atual = (Elemento *) malloc(sizeof(Elemento));
		atual->valor = num;
		atual->direita = NULL;
		atual->esquerda = NULL;
	return atual;
	}
	else{
		if(num < atual->valor){
		atual->esquerda = InserirArvore(atual->esquerda, num);
		return atual;
	}
	else{
		atual->direita = InserirArvore(atual->direita, num);
		return atual;
		}
	}
}

void ImprimirArvore(Elemento *atual){
	if(atual == NULL){
	return;
}
	if(atual != NULL){
		printf("chave da raiz visitada: %d\n", atual->valor);
		printf("visitando arv esquerda: \n");
		ImprimirArvore(atual->esquerda);
		printf("visitando arv direita: \n");
		ImprimirArvore(atual->direita);
	}
}

Elemento * buscar(Elemento *atual,int num){

	if(atual == NULL){
		return atual;
	}

	if(atual != NULL){

		if(atual->valor == num){
			printf("Achou!.");
			printf("O elemento encontrado: %d\n", atual->valor);
			return atual; // Retornando posição.
		}
		if(atual->valor > num){
			buscar(atual->direita,num);
		}
		if(atual->valor < num){
			buscar(atual->esquerda,num);
		}
	}
}

int main(int argc, char *argv[]) {
	Arvore *arv = (Arvore *) malloc(sizeof(Arvore));
	int num,x = -1;
	IniciaArvore(arv);

while(x != 0){
	printf("1-ADD, 0-Sair: ");
	scanf("%d",&x);
	if(x == 1){
		printf("Digite o valor: ");
		scanf("%d",&num);
		arv->raiz = InserirArvore(arv->raiz, num);
	}
}
	ImprimirArvore(arv->raiz);
	Elemento* aux = buscar(arv->raiz,6); // fizemos Elemento *aux receber alguem pq se o aux receber algo quer dizer que achou;
}
