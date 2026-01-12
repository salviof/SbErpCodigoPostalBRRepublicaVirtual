/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package br.org.coletivoJava.fw.erp.implementacao.codigopostalbr;

import br.org.coletivoJava.fw.api.erp.codigopostalbr.InfoRespostaCepWebService;
import br.org.coletivoJava.fw.erp.implementacao.codigopostalbr.apiClients.UtilWebService.cep.WebServiceCepRepublicaVirtual;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.cep.ComoLocal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public abstract class UtilCRCCEPRepublicaVirtual {

    /**
     *
     * Configura rua, cidade, estado, nome do local, a partir de um CEP
     *
     * @param cep cep utilizado em uma pesquisa
     * @param pLocal O local onde o endereço será configurado
     * @return True se encontrar o CEP, false se não encontrar
     */
    public static boolean configuraEndereco(String cep, ComoLocal pLocal) {
        try {
            WebServiceCepRepublicaVirtual republicaVirtual = WebServiceCepRepublicaVirtual.searchCep(cep);

            if (!republicaVirtual.isCepNotFound()) {
                InfoRespostaCepWebService infoCep = new InfoRespostaCepWebService(republicaVirtual.getUf(),
                        republicaVirtual.getCidade(), republicaVirtual.getBairro(), republicaVirtual.getLogradouroFull());

                infoCep.applicarDados(pLocal);
                return true;
            } else {
                System.out.println("local:" + pLocal);
                System.out.println("Cep não encontrado em republic virtual" + cep);
            }
        } catch (Throwable t) {
            return false;
        }
        return false;
    }

    public static boolean cepExiste(String cep) {
        WebServiceCepRepublicaVirtual republicaVirtual = WebServiceCepRepublicaVirtual.searchCep(cep);

        return !republicaVirtual.isCepNotFound();
    }

    public static List<String> cepsEncontrados(String parametros) {
        return new ArrayList<>();
    }

}
