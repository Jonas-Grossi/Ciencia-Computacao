/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressaoregular;

/**
 *
 * @author jose
 */
public class AulaExpressaoRegular {

    public static void main(String[] args) {
        ExpressaoRegular ER = new ExpressaoRegular();

        //Teste 1, expressão regular: DIGITOS
        ER.confere(ER.DIGITOS, "000511200021");
        
        //Teste 2, expressão regular: DIGITOS
        ER.confere(ER.DIGITOS, "000511200021ADAF");

        
        //Teste 3, expressão regular: LETRAS
        ER.confere(ER.LETRAS, "ASDFEAFdafsafdsf");

        //Teste 4, expressão regular: LETRAS
        ER.confere(ER.LETRAS, "ASDFEAFdafsafdsf4565");
        
        
        //Teste 5, expressão regular: IDENT (nome de variável, função e classes)
        ER.confere(ER.IDENT, "Altura1");

        //Teste 6, expressão regular: IDENT (nome de variável, função e classes)
        ER.confere(ER.IDENT, "1Altura");
                
        
        //Teste 7, expressão regular: REAL
        ER.confere(ER.REAL, "123.908777E+30");
        
        //Teste 8, expressão regular: REAL
        ER.confere(ER.REAL, "0.17E-5");

        
        //Teste 9, expressão regular: ATRIBUICAO
        ER.confere(ER.ATRIBUICAO, "media     =      --123.908777E+30");

        
        ER.confere(ER.INTEIRO, "10");
        
        ER.confere(ER.INDEXADOR, "[10]");
        
        ER.confere(ER.DESIGNADOR, "matriz[a][2].ponto.x[9][0]");
        
        
    }

}
