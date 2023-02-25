#include<iostream>
using namespace std;


class No
{
private:
    No *esq;
    No *dir;
    int chave;
public:
    No(int chave)
    {
        this->chave = chave;
        esq = NULL;
        dir = NULL;
    }
    int getChave()
    {
        return chave;

    }

    No* getEsq(){

        return esq;

    }
    No* getdir(){

     return dir;
    }
    void setEsq(No* no)
    {
        esq = no;

    }
    void setDir(No* no)
    {
        dir = no;

    }
class Arvore
{
private:
    No* raiz;

public:
    Arvore()
    {

        raiz = NULL;

        }
void inserir(int chave)
{
    if(raiz == NULL)
        raiz = new No(chave);

    else
        inserirAux(raiz,chave);



}
void inserirAux(No* no,int chave)
{

    if(chave < no->getChave())
    {
        No* novo_no = new No(chave);
        no->setEsq(novo_no);
    }
    else{
        inserirAux(no->getEsq(),chave);

    }
    else if(chave > no->getChave())
        {
        if(no->getDir()== NULL)
        {
            No* novo_no = new No(chave);
            no->setDir(novo_no);


        }
        else
        {

            inserirAux(no->getDir(),chave);

        }
    }
}
}
No* getRaiz()
{

    return raiz;
}
void emordem(No* no)
{
if(no != NULL)
{

    emordem(no->getEsq());
    cout << no->getChave() <<"";
    emordem(no->getDir());
}
}
int main(int argc, char *argv[])
{
    Arvore arv;
    Arv.inserir(8)
    Arv.inserir(10);
    Arv.inserir(14);
    Arv.inserir(13);
    Arv.inserir(3);
    Arv.inserir(1);
    Arv.inserir(6);
    Arv.inserir(4);
    Arv.inserir(7);
cout<<"Percorrendo em ordem...\n";
arv.emOrdem(arv.getRaiz());
return 0;
}

};

