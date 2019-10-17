/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package br.org.coletivoJava.testes.erp;

import br.org.coletivoJava.fw.erp.implementacao.codigopostalbr.apiClients.UtilWebService.cep.WebServiceCepRepublicaVirtual;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class WebServiceCepRepublicaVirtualTest {

    public WebServiceCepRepublicaVirtualTest() {

    }

    @Before
    public void setUp() {
    }

    @Test
    public void testSearchCep() {
        //SBCore.getServicoLocalizacao().instanciarNovoBairo(pBairro, pCidade);
        WebServiceCepRepublicaVirtual webServiceCep = WebServiceCepRepublicaVirtual.searchCep("13345-325");
        //A ferramenta de busca ignora qualquer caracter que não seja número.

        //caso a busca ocorra bem, imprime os resultados.
        if (webServiceCep.wasSuccessful()) {
            System.out.println("Cep: " + webServiceCep.getCep());
            System.out.println("Logradouro: " + webServiceCep.getLogradouroFull());
            System.out.println("Bairro: " + webServiceCep.getBairro());
            System.out.println("Cidade: " + webServiceCep.getCidade() + "/" + webServiceCep.getUf());

            //caso haja problemas imprime as exceções.
        } else {
            System.out.println("Erro número: " + webServiceCep.getResulCode());
            System.out.println("Descrição do erro: " + webServiceCep.getResultText());
        }

    }

}
