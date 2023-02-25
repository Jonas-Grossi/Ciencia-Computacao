/* programa que receba os coeficientes a (use uma estrutura de
repetição para garantir a>0), b e c da equação do segundo grau, calcule e
imprima suas raízes reais (caso existam) com precisão de 4 casas decimais.
Use as funções: pow e sqrt.
· Equação do segundo grau: ax2 + bx + c = 0, .
· Discriminante: Δ = b2-4ac;
· Fórmula de Baskara: ; -b+-raiz(delta)/2a
· Raízes:
Se Δ > 0, existem duas raízes reais e distintas;
Se Δ = 0, existem duas raízes reais e iguais;
Se Δ < 0, não existem raízes reais. */
# include <stdio.h>
# include <math.h>
main ()
{
    int a,b,c;
    float delta,x1,x2;
    do
    {
        printf ("\nDIGITE O VALOR DE 'a' DIFERENTE DE 0. ");
        scanf ("%d",&a);
    }while (a==0);
    printf ("\nDigite o valor de 'b'. ");
    scanf ("%d",&b);
    printf ("\nDigite o valor de 'c'. ");
    scanf ("%d",&c);
    delta=(pow(b,2))-(4*a*c); /* pow(a,b) função para calcular potencia */
    printf ("\n\ndelta =%.4f.",delta);
    if (delta<0)
    printf ("\n\nDELTA MENOR QUE ZERO.\nNAO EXISTE RAIZ REAL.\n\n");
    else
    {
        if (delta==0)
        {
            x1=-b/(2*a);
            printf ("\n\nDELTA IGUAL A ZERO.\nA EQUACAO POSSUI DUAS RAIZER REAIS IGUAIS A %.4f.\n\n",x1);
        }
        else
        {
            x1=((-b)+(sqrt(delta)))/(2*a); /*sqrt(delta) função uaada para calcular a raiz quadrada da variavel delta */
            x2=((-b)-(sqrt(delta)))/(2*a); /*sqrt(delta) função uaada para calcular a raiz quadrada da variavel delta */
            printf ("\n\nA EQUACAO POSSUI DUAS RAIZES REAIS IGUAIS A: %.4f E %.4f.\n\n",x1,x2);
        }
    }
    return 0;
}
