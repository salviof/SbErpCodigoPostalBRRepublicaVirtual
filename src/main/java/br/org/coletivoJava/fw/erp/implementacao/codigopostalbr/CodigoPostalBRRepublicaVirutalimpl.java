package br.org.coletivoJava.fw.erp.implementacao.codigopostalbr;

import java.util.List;
import br.org.coletivoJava.fw.api.erp.codigopostalbr.CodigoPostalBRRepublicaVirutal;
import br.org.coletivoJava.fw.api.erp.codigopostalbr.InfoRespostaCepWebService;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ComoLocal;

@CodigoPostalBRRepublicaVirutal
public class CodigoPostalBRRepublicaVirutalimpl implements br.org.coletivoJava.fw.api.erp.codigoPostal.br.ItfCodigoPostalBR {

    @Override
    public boolean configuraEndereco(String cep, ComoLocal pLocal) {
        return UtilSBCoreCEPRepublicaVirtual.configuraEndereco(cep, pLocal);
    }

    @Override
    public List<String> cepsPorEndereco(String pEndereco) {
        throw new UnsupportedOperationException("O METODO AINDA N\u00c3O FOI IMPLEMENTADO.");
    }

    @Override
    public boolean configurarPosicaoGeogafica(ComoLocal pLocal) {
        throw new UnsupportedOperationException("O METODO AINDA N\u00c3O FOI IMPLEMENTADO.");
    }

    @Override
    public boolean contribuirCadastroNovoEndereco(ComoLocal pLocal) {
        throw new UnsupportedOperationException("O METODO AINDA N\u00c3O FOI IMPLEMENTADO.");
    }

    @Override
    public boolean isCepExiste(String pCep) {
        return UtilSBCoreCEPRepublicaVirtual.cepExiste(pCep);
    }

    @Override
    public InfoRespostaCepWebService getInfoRespostaWebService(String cep) {
        throw new UnsupportedOperationException("O METODO AINDA N\u00c3O FOI IMPLEMENTADO.");
    }

}
