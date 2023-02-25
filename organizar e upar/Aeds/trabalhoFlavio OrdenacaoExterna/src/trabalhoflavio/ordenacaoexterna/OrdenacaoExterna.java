/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//NOME DO PROJETO
package trabalhoflavio.ordenacaoexterna;
//IMPORTAÇÃO DOS PACOTES USADOS

import java.io.File; 
import java.util.ArrayList; 
 

public class OrdenacaoExterna { // CLASSE COM OS MÉTODOS PEDIDOS NO TRABALHO

    int acesso = 0;
    long tempo = 0;
    int trocas = 0, comparacoes = 0;
    ArrayList<Registro> registros = new ArrayList<>(); // VETOR DINÂMICO COM OS REGISTROS PEDIDOS NO TRBALHO
    Registro r = new Registro(); // INSTANCIAÇÃO DE UMA VARIÁVEL REGISTRO PARA PODER USAR OS MÉTODOS DA CLASSE REGISTRO

    public OrdenacaoExterna() {
    }

    ;
    public OrdenacaoExterna(File fp, int n) { // CONSTRUTOR DA CLASSE PRINCIPAL, ELA É CHAMADA NO "New OrdenacaoExterna()" na classe main, passando o caminho do arquivo e a qtd de registros a serem criados
        geraRegistros(fp, n); //GERA n REGISTROS ALEATÓRIOS
    }

    public void geraRegistros(File fp, int n) { // gera n registros no arquivo fp
        for (int i = 0; i < n; i++) { //laço com n repetições
            r = new Registro(); //Iniciando registro vazio
            registros.add(i, r); //CRIANDO 10 REGISTROS VAZIOS
            r = r.gera_Registro(); // GERANDO VALORES ALEATÓRIOS PARA OS REGISTROS (NOMES, IDADES, CPFS, ETC. ALEATÓRIOS)
            registros.set(i, r);  //colocando no registros de registros
        }

        //n = r.MAX_REGISTROS;
        String texto; // variável de texto
        for (int i = 0; i < n; i++) { // laço (n)
            texto = registroCSV(); // texto recebe o retorno da função. (A função foi explicada nela mesma)
            FileManager.escreverArquivo(texto, fp.getPath()); //Função que escreve o valor de 'texto' no arquivo fp.
        }

    }

    public void imprimeRegistros(File fp, int n) { //Função para exibir na tela os registros
        String texto = FileManager.lerArquivo(fp.getPath()); // texto recebe o que tiver no arquivo
        carregarDadosRegistro(texto); // joga-se os valores de texto no ArrayList registros
        if (n == -1 || n > registros.size()) { //se for -1 ou maior que o máximo
            n = registros.size(); // n recebe o número total de registros
        }
        for (int i = 0; i < n; i++) { //laço (n)
            registros.get(i).imprimir(); //imprime o registro atual do laço
        }

    }

    public void ordenar(File fp, int n) { //ordena-se n registros do arquivo fp
        String texto = ""; // zera-se a variável texto
        texto = FileManager.lerArquivo(fp.getPath()); //texto recebe o que tiver no arquivo fp
        carregarDadosRegistro(texto); // o valor de texto é enviado para o ArrayList registros
        if (n == -1 || n > registros.size()) { //se for -1 ou maior que o máximo
            n = registros.size(); // n recebe o número total de registros
        }
        metodoOrdenar(); //ordena-se o ArrayList registros
        for (int i = 0; i < n; i++) { //laço (n)
            texto = registroCSV(); //texto recebe os dados na formatação CSV, explicada na função registroCSV
            FileManager.escreverArquivo(texto, "registros2.txt");  //escreve-se os valores ordenados de texto em registros2.txt
        }

    }

    public void metodoOrdenar() { //ordena-se usando o MergeSort adaptado para registros

        ArrayList<Registro> aux = new ArrayList<Registro>(); //vetor que auxiliar para manter os dados 
        MergeSort ms = new MergeSort(); // Instancia do MergeSort que está em uma classe própria
        aux.addAll(registros); //vetor auxiliar recebe os valores desordenados do vetor registros
        registros.clear(); //limpa-se o vetor registros

        registros.addAll(ms.sort(aux)); //registros recebe o resultado da ordenação do vetor auxiliar

        trocas = ms.trocas;
        comparacoes = ms.comparacoes;

    }

    public int comparaInt(int a, int b) { //Função que compara 2 inteiros
        int resposta = 0; // por padrão, 0 será o resultado de igualdade
        if (a < b) { //se o primeiro valor for menor que o segundo
            resposta = -1; // a resposta é -1
        } else if (b < a) { // se for o contrário,
            resposta = 1; // a resposta será 1
        }
        return resposta; //retorna a resposta final
    }

    public int comparaString(String a, String b) { //comparação de string
        int resposta = 0; //se forem iguais, a resposta será 0
        resposta = a.compareTo(b); //retorna a diferença entre as posições numéricas de 2 letras, exemplo: a.compareTo(c) = -2, porque o valor numérico de a é 97 e c é 99.
        //System.out.println( (int) 'a' ); -> teste para ver em que valor começa o alfabeto minúsculo ('a' = 97).
        return resposta; //retorna a diferença entre os char.
    }

    public int comparaRegistro(Registro a, Registro b) { //compara os registros, atributo a atributo na ordem pedida no trabalho.
        String texto, sexoA, sexoB, nomeA, nomeB; //variáveis auxiliares para receber valores dos atributos
        int cepA = 0, cepB = 0, resposta = 0; //variáveis auxiliares para receber valores dos atributos e resposta
        texto = new String(a.cep); //texto recebe valor do cep do primeiro registro convertido em String
        cepA = Integer.parseInt(texto); // cepA recebe texto convertido em inteiro 
        texto = new String(b.cep); // texto recebe valor do cep do segundo registro convertido em String
        cepB = Integer.parseInt(texto); // cepB recebe texto convertido em inteiro
        sexoA = String.valueOf(a.sexo); //sexoA recebe valor do sexo do primeiro registro convertido de char para String
        sexoB = String.valueOf(b.sexo); //sexoB recebe valor do sexo do segundo registro convertido de char para String
        nomeA = new String(a.nome); //nomeA recebe o valor do primeiro registro convertido de char[] pra String
        nomeB = new String(b.nome); //nomeB recebe o valor do segundo registro convertido de char[] pra String

        resposta = comparaInt(cepA, cepB); //compara o cep do primeiro registro com o do segundo, resposta recebe o valor -1, 0 ou 1 como explicado na função

        if (resposta == 0) { //se forem iguais
            resposta = comparaString(sexoA, sexoB); //compara o sexo deles
            if (resposta < 0) { // se a primeira letra vier antes da segunda,
                resposta = -1; //resposta passa a ser -1, como pedido no trabalho
            } else if (resposta > 0) { // se for maior,
                resposta = 1; // passa a ser 1
            } else { //se forem iguais
                resposta = comparaInt(a.idade, b.idade); //compara idade
                if (resposta == 0) { // se forem iguais
                    resposta = comparaString(nomeA, nomeB); //compara o nome
                    if (resposta < 0) { //se o nome do primeiro vier antes do segundo
                        resposta = -1; // resposta recebe -1
                    } else if (resposta > 0) { // se for o contrário
                        resposta = 1; // resposta recebe 1
                    }
                }
            }
        }
        return resposta; // retorna o resultado da comparação
    }

    public String registroCSV() { // formatação CSV para arquivo
        String texto = "CEP;CPF;IDADE;SEXO;NOME\r\n"; //cabeçalho do texto
        for (Registro r : registros) { //laço que percorre todo o vetor
            texto += r.CSV(); //texto recebe o registro atual em CSV.
        }
        return texto; // retorna o conteúdo de texto
    }

    public void lerArq(String registrotxt) {
        FileManager.lerArquivo(registrotxt); //lê o arquivo que está no parâmetro

    }

    public void carregarDadosRegistro(String registrotxt) { //coloca os dados do arquivo lido no vetor registros
        registros.clear(); // limpa o vetor registros
        String[] texto = FileManager.getLinhas(registrotxt); //vetor de String texto recebe registro linha a linha
        for (int i = 0; i < texto.length; i++) { //para cada linha que existir
            Registro r = new Registro(); //cria-se um registro
            r.carregarCSV(texto[i]); //coloca-se o valor da linha no registro
            registros.add(r); // adiciona-se o registro no vetor de registros
        }
    }

}
