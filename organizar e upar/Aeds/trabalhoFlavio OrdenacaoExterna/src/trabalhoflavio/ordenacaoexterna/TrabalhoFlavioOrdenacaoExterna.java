
package trabalhoflavio.ordenacaoexterna;

import java.io.File;
import java.util.Scanner;

public class TrabalhoFlavioOrdenacaoExterna {

    
    public static void main(String[] args) {
        
        System.out.println("Registro: Orlando Oliveira dos Santos");
        System.out.println("Matrícula: 2226-14");
        System.out.println("Curso: Ciência da Computação");
        System.out.println("2º Trabalho Prático -- Ordenação Externa");
        System.out.println("DCC 254 -- 2017 -- IFSEMG -- Turma Especial");
        System.out.println("Prof. Flávio Augusto de Freitas");
        System.out.println("Compilador: Netbeans IDE versão 8.1");
        System.out.println("Sistema Operacional: Windows 8");
        System.out.println("\n\n\n");
        
        long tempoExecucao = System.currentTimeMillis(); 
        long tempo = 0;
        int trocas = 0, comparacoes = 0; 
        
        File fp1 = new File("registros.txt"); 
        File fp2 = new File("registros2.txt");
        
        OrdenacaoExterna ordena = new OrdenacaoExterna();
        
        int n = 100, opcao = 99;
        Scanner scanner = new Scanner(System.in);
        
        
        while(opcao != 0){
            
            System.out.println("***********************************************************");
            System.out.println("*** 1 - Criar arquivo com registros aleatórios      *******");
            System.out.println("*** 2 - Ordenar                                     *******");
            System.out.println("*** 3 - Imprimir informações                        *******");
            System.out.println("*** 4 - Deletar                                     *******");
            System.out.println("*** 5 - Alterar número de registros a serem criados *******");
            System.out.println("*** 0 - Sair                                        *******");
            System.out.println("***********************************************************");
            
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            
            if(opcao == 1){
                fp2.delete();
                new OrdenacaoExterna(fp1, n); 

                System.out.println(n + " registros criados em " + fp1.getPath() + ".");                   
                System.out.println("\n\nImprimir 10 primeiros registros?");
                System.out.println("\n1 - Sim");
                System.out.println("Digite qualquer outra coisa para continuar.");
                String resp = scanner.next();
                if (resp.equals("1")) {
                    ordena.imprimeRegistros(fp1, 10);    
                }
            }
            else if(opcao == 2){
                try {
                    long tempoInicio = System.currentTimeMillis(); 
                    ordena.ordenar(fp1, n); 
                    tempo = (System.currentTimeMillis() - tempoInicio); 
                    System.out.println("Arquivo ordenado criado em registros2.txt"); 

                    System.out.println("\n\nImprimir 10 primeiros registros?");
                    System.out.println("\n1 - Sim");
                    System.out.println("Digite qualquer outra coisa para continuar.");
                    String resp2 = scanner.next();
                    if (resp2.equals("1")) {
                        ordena.imprimeRegistros(fp2, 10); 
                    }

                } catch (Exception e) {
                    System.out.println("Arquivo desordenado não encontrado. Por favor, vá na opção 1 do menu. Erro: " + e);
                } 
            }
            else if(opcao == 3){
                try { //tenta executar o seguinte bloco
                    System.out.println(""); //pula linha
                    System.out.println("DESORDENADOS"); //título: DESORDENADOS
                    ordena.imprimeRegistros(fp1, 10); //exibe os 10 primeiros registros do arquivo desordenado ("registros.txt")

                    try {
                        System.out.println("\nORDENADOS"); // título: ORDENADOS
                        ordena.imprimeRegistros(fp2, 10);//exibe os 10 primeiros registros do arquivo ordenado ("registros2.txt")
                        System.out.println("Tempo total da última ordenação: " + tempo + " ms.");
                        System.out.println("Quantidade de trocas total: " + trocas + ".");
                        System.out.println("Quantidade de comparações total: " + comparacoes + ".");
                        System.out.println("Quantidade de acessos no arquivo: " + FileManager.acesso + ".");
                            
                            
                    } catch (Exception e) {
                        System.out.println("Por favor, ordene o arquivo na opção 2 do menu. Erro: " + e);
                    }

                } catch (Exception e) { //caso dê algum erro no bloco acima
                    System.out.println("Por favor, crie o arquivo desordenado na opção 1. Erro: " + e); //aparece a mensagem + o erro que ocorreu
                }
            }
            else if(opcao == 4){
                fp1.delete();
                fp2.delete();
                System.out.println("Arquivos deletados com sucesso.");
            }
            else if(opcao == 5){
                System.out.println("Informe o número de registros a serem criados quando acessar a opção 1: ");
                n = scanner.nextInt();
            }
            else if(opcao == 0){
                break;
            }
            else{
                System.out.println("Opcao Invalida! ");
            }
        }

        tempoExecucao = System.currentTimeMillis() - tempoExecucao; 
        System.out.println("Tempo de execução do programa:" + tempoExecucao + "ms ou " + (tempoExecucao/1000) + "s.");
    }

}
