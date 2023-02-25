/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoflavio.ordenacaoexterna;

import java.util.Random;

public class Registro {

    String ceps[] = {
        "36180-000", "25500-000", "36140-000", "37510-234", "12240-000",
        "34567-111", "76456-322", "45654-987", "98765-216", "40000-000"
    }; // INSTANCIAÇÃO DOS CEPS PRE DEFINIDOS DE ACORDO COM O PDF DO TRABALHO

    int MAX_REGISTROS = 1000000; // NÚMERO MÁXIMO DE REGISTROS 
    int MAX_CHARS = 80; // NÚMERO MÁXIMO DE CHARS QUE UM NOME PODE TER

    char[] cpf = new char[11]; // 11 algarismos aleatórios
    char[] nome = new char[MAX_CHARS]; // até MAX_CHARS letras aleatórias dentre ’ ’ e A-Z
    int idade; // valor aleatório entre 10 e 50, inclusive
    char sexo; // valor aleatório dentre ’F’ e ’M’
    char[] cep = new char[8]; // valor aleatório dentre 10 cep’s pré-definidos 
    Random r = new Random(); //instancia-se um Rando para trabalhar com valores aleatórios

    public Registro() {

    }

    public Registro gera_Registro() { //FUNÇÃO QUE GERA OS DADOS ALEATÓRIOS
        Registro copia = new Registro(); //CRIANDO UM OBJETO COPIA SÓ PARA FAZER A FUNÇÃO TER UM RETORNO
        gera_cpf(cpf); //GERA CPF ALEATÓRIO
        gera_nome(nome); // GERA NOME ALEATÓRIO
        idade = gera_idade(); // GERA IDADE ALEATÓRIA
        sexo = gera_sexo(); //GERA SEXO ALEATÓRIO
        gera_cep(cep); // GERA CEP ALEATÓRIO

        copia.cep = cep; //COPIANDO OS DADOS
        copia.cpf = cpf;
        copia.idade = idade;
        copia.sexo = sexo;
        copia.nome = nome;
        return copia;
    }

    public void imprimir() { //IMPRIME OS DADOS DO REGISTRO
        System.out.print("CEP: ");
        imprimirCEP(); // FUNÇÃO QUE IMPRIME O CEP NO FORMATO NNNNN-NNN (5 números traço 3 números 12345-678)
        System.out.print("\tCPF: ");
        imprimirCPF(); // FUNÇÃO QUE IMPRIME O CPF NO FORMATO NNN.NNN.NNN-NN
        System.out.print("\tIdade: ");
        imprimirIdade(); // FUNÇÃO QUE IMPRIME A IDADE
        System.out.print("\tSexo: ");
        imprimirSexo(); // FUNÇÃO QUE IMPRIME O SEXO
        System.out.print("\t\tNome: ");
        imprimirNome(); // FUNÇÃO QUE IMPRIME O NOME
        System.out.println("");
    }

    public void imprimirNome() {
        for (int i = 0; i < nome.length; i++) { //PERCORE DE 0 ATÉ O TAMANHO DO NOME
            System.out.print(nome[i]); //IMPRIME CHAR A CHAR (LETRA A LETRA) UMA DO LADO DA OUTRA
        }
    }

    public void imprimirIdade() {
        System.out.print(idade); //IMPRIME A IDADE
    }

    public void imprimirSexo() {
        System.out.print(sexo); //IMPRIME O SEXO (M OU F)
    }

    public void imprimirCPF() { // IMPRIME O CPF
        for (int i = 0; i < 11; i++) {
            System.out.print(cpf[i]); // COLOCA OS NÚMEROS DO CPF
            if (i == 2 || i == 5) {
                System.out.print("."); // LOGO APÓS O 3º e 6º NÚMERO (LEMBRANDO QUE A POSIÇÃO 1 É O INDICE 0), COLOCA UM PONTO 111.222.
            }
            if (i == 8) {
                System.out.print("-"); //APÓS O 9º NÚMERO, COLOCA UM TRAÇO
            }
        }
    }

    public void imprimirCEP() {
        for (int i = 0; i < 9; i++) {
            if (i < 5) {
                System.out.print(cep[i]); //COLOCA OS PRIMEIROS 5 DÍGITOS DO CEP
            } else if (i == 5) {
                System.out.print("-"); //COLOCA UM TRAÇO 
            } else {
                System.out.print(cep[i - 1]); //COLOCA OS 3 ÚLTIMOS DÍGITOS DO CEP
            }
        }
    }

    public void gera_cep(char cep[]) { //GERA CEP ALEATÓRIO
        int aux = r.nextInt(10); //10 ceps registrados
        for (int i = 0; i < 9; i++) {
            if (i < 5) { //Para não copiar o traço, já que o vetor CEP tem exatamente as 8 posições de números.
                cep[i] = ceps[aux].charAt(i); //PEGA CARACTER A CARACTER DO VETOR PRE DEFINIDO EM CEPS E JOGA NO ATRIBUTO CEP DO REGISTRO
            } else if (i > 5) {
                cep[i - 1] = ceps[aux].charAt(i); //Copia o valores do CEP que vem depois do hífen - e joga no atributo cep
            }
        }

    }

    public void gera_cpf(char cpf[]) { //GERA CPF ALEATORIO
        for (int i = 0; i < 11; i++) {
            int digito = r.nextInt(10); //DIGITO RECEBE UM INTEIRO DE 0 A 9
            char[] aux = Integer.toString(digito).toCharArray(); //AUX RECEBE O VALOR DE DIGITO E COLOCA NA PRIMEIRA POSIÇAO
            cpf[i] = aux[0]; // CPF COPIA O VALOR DO DIGITO QUE FOI COLOCADO NA PRIMEIRA POSIÇAO DO AUX
        }
    }

    public void gera_nome(char nome[]) { //GERA NOME ALEATORIO
        int cont = 0; //CONTADOR DE LETRAS DE CADA PARTE DO NOME
        boolean espacoAleatorio = false; //VERIFICADOR SE VAI DAR ESPAÇO OU NAO NA ITERAÇAO
        Random espaco = new Random(); //CHANCE DE DAR ESPAÇO
        int contEspacos = 0; // CONTA QUANTOS ESPAÇOS JA FORAM DADOS

        for (int i = 0; i < MAX_CHARS; i++) { //PERCORRE CARACTER A CARACTER DO NOME ATE O LIMITE MAXIMO

            if (i > 0 && i < MAX_CHARS) { //SE NAO FOR O PRIMEIRO OU O ULTIMO CARACTER, É PERMITIDO DA R ESPAÇO
                if (espaco.nextInt(100) < 10) { // 10% DE DAR ESPAÇO NESSA ITERAÇAO
                    espacoAleatorio = true; //VAI DAR ESPAÇO
                }
            }

            if (cont == Math.abs((MAX_CHARS - 2) / 3)) { //limite de caracteres por parte do nome
                espacoAleatorio = true; // VAI DAR ESPAÇO SE CHEGAR NO MAXIMO PERMITIDO
            }
            if (espacoAleatorio == true) { //SE FOR DAR ESPAÇO
                espacoAleatorio = false; // VERIFICADOR VOLTA PRA FALSE
                if (contEspacos < 3) { // CONFERE SE CHEGOU NO LIMITE DE 3 ESPAÇOS POR NOME
                    contEspacos++; //SE NÃO ATINGIU O LIMITE, ADICIONA 1 NO CONTADOR DE  ESPAÇO
                    nome[i] = ' '; //CARACTER DO NOME RECEBE O ESPAÇO
                    cont = 0; // COMEÇA OUTRA PARTE DO NOME, ENTÃO CONTADOR DE LETRAS DA PARTE DO NOME ZERA.
                } else { //SE JÁ TIVER NO LIMITE DE ESPAÇOSPERMITIDO
                    i = MAX_CHARS - 1; // I VAI PRO FINAL DO NOME
                    //fim do nome
                }

            } else if (cont < Math.abs((MAX_CHARS - 2) / 3)) { //SE NÃO FOR DAR ESPAÇO E SE AINDA NÃO ATINGIU O LIMITE DE LETRAS A PARTE DO NOME
                int letra = (65 + r.nextInt(26)); //LETRA RECEBE O CÓDIGO ALEATÓRIO DE UMA LETRA ALEATÓRIA ENTRE A E Z (OS CÓDIGOS DAS LETRAS DE A A Z VARIAM ENTRE 65 E 90, R.NEXTINT(26) RECEBE VALOR VARIAVEL ENTRE 0 E 25, INCLUSIVE. SOMANDO-SE COM 65, VARIA ENTRE 65 E 90 QUE SÃO OS CÓDIGOS INTEIROS PARA LETRAS DE 'A' A 'Z')
                nome[i] = (char) letra; //CARACTER ATUAL DO NOME (NA ITERAÇAO QUE ESTAMOS) RECEBE UMA LETRA DE A A Z ((CHAR) LETRA CONVERTE O INTEIRO DE 65-90 PARA LETRA DE A-Z).
                cont++; // CONTADOR DE QUANTAS LETRAS TEM ESSA PARTE DO NOME É INCREMENTADO EM 1.
            } else { // SE NÃO FOR COLOCAR ESPAÇO EM BRANCO E NÃO TIVER MAIS ESPAÇO PARA COLOCAR LETRAS, ACABA O NOME
                i = MAX_CHARS; // PULA pro final porque não pode escrever mais. 
            }
            //nome[i] = (char) r.nextInt();
            //System.out.print(nome[i]);
        }
    }

    public int gera_idade() { //GERA IDADE ALEATÓRIA
        int idade = 0; //VALOR INICIA SÓ PARA ENTRAR NO WHILE
        while (idade < 10 || idade > 50) { //Cnfere se idade está no intervalo de idade pedido de 10 a 50, aceitando o 10 e o 50.
            idade = r.nextInt(51); //51 para variar entre 0 e 50.
        }
        return idade;
    }

    public char gera_sexo() { //GERA SEXO ALEATÓRIO
        char sexo;
        if (r.nextInt(2) == 0) { //R (RANDOM - ALEATÓRIO) VARIA DE 0 A 1, SE DER 0
            sexo = 'F'; //SEXO RECEBE 'F'
        } else { // SE NÃO DER 0, OU SEJA, DER 1
            sexo = 'M'; //SEXO RECEBE 'M'
        }
        return sexo;
    }

    public String CSV() { //FORMATO CSV PARA COLOCAR NO ARQUIVO
        String cep2 = new String(cep); //Copia-se os atributos em formato de string
        String cpf2 = new String(cpf);
        String idade2 = String.valueOf(idade);
        String sexo2 = String.valueOf(sexo);
        String nome2 = new String(nome);

        String texto = cep2 + ";" + cpf2 + ";" + idade2 + ";" + sexo2 + ";" + nome2 + "\r\n"; //VARIÁVEL TEXTO RECEBE OS ATRIBUTOS SEPARADOS POR ' ; '

        return texto; //retorna uma string com todos os atributos separados pro ponto e vírgula ;
    }

    public void carregarCSV(String texto) { //PEGAR DO ARQUIVO QUE JÁ ESTÁ NO FORMATO CSV
        String[] arrayTexto = texto.split(";");  //separa os blocos por ';' (ponto e vírgula)
        this.cep = arrayTexto[0].toCharArray(); //Converte-se o texto para o formato do atributo
        this.cpf = arrayTexto[1].toCharArray();
        this.idade = Integer.parseInt(arrayTexto[2]);
        this.sexo = arrayTexto[3].charAt(0);
        this.nome = arrayTexto[4].toCharArray();
    }

}
