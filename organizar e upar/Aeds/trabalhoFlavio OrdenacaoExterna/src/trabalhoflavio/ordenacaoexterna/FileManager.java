/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoflavio.ordenacaoexterna;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileManager {
public static int acesso =0; //variável contadora de acessos ao arquivo
    public static void escreverArquivo(String texto, String caminho) { //FUNÇÃO PRONTA DE ESCRITA EM ARQUIVO
        acesso++;
        File arquivo = new File(caminho); // CRIA-SE UMA VARIAVEL ARQUIVO
        FileWriter fw; // CRIA-SE UM OBJETO DE ESCRITA
        try { //TENTA FAZER AS OPERAÇOES DO BLOCO
            fw = new FileWriter(arquivo); //Abre-se o arquivo para escrita, SE COLOCAR "(arquivo , TRUE)" só escreve no final
            fw.write(texto); //OBJETO DE ESCRITA PREPARA O TEXTO NO ARQUIVO
            fw.flush(); //LIBERA O FLUXO DE DADOS, ESCREVENDO DE VERDADE NO ARQUIVO
            fw.close(); // FECHA O ARQUIVO
        } catch (Exception e) { //CASO DÊ ERRO EM ALGUMA OPERAÇÃO DO BLOCO
            System.out.println("Erro" + e); //Mostra msg de erro
        }
    }

    public static String lerArquivo(String caminho) { //Função de leitura de arquivo
        
        try {
            acesso++;
            String lido = ""; //variavel de texto lido começa vazia porque nada foi lido
            FileReader fr = new FileReader(caminho); //Abre-se o arquivo para leitura
            try (Scanner arquivoLido = new Scanner(fr)) { //Cria-se um objeto que vai ler
                arquivoLido.useDelimiter("\n"); //Separa-se o que está escrito no arquivo em blocos que são determinados pela qubre de linha
                arquivoLido.next(); //Pula linha '0', fazendo ir para a primeira linha escrita do arquivo.
                while (arquivoLido.hasNext()) { //Se tiver mais conteúdo, ou seja, se não chegou no final
                    lido += arquivoLido.next() + "\n"; //lido recebe o próximo bloco separado (a próxima linha)
                    //  System.out.println(lido); //joga na tela o que foi lido
                }
            }
            return lido;
        } catch (Exception e) {
            return "";
        }
    }

    public static String[] getLinhas(String lido) { //separa linha a linha em um vetor
        String texto = lido;  //texto completo
        String[] arrayTexto = texto.split("\r\n"); //arrayTexto recebe em cada posição o que for separado por '\n' quebra linha
        return arrayTexto;
    }
}
