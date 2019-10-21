package br.org.coletivoJava.fw.erp.implementacao.codigopostalbr;

import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfLocal;
import br.org.coletivoJava.fw.api.erp.codigopostalbr.CodigoPostalBRRepublicaVirutal;

@CodigoPostalBRRepublicaVirutal
public class CodigoPostalBRRepublicaVirutalimpl implements br.org.coletivoJava.fw.api.erp.codigoPostal.br.ItfCodigoPostalBR {

    @Override
    public boolean configuraEndereco(String cep, ItfLocal pLocal) {
        return UtilSBCoreCEPRepublicaVirtual.configuraEndereco(cep, pLocal);
    }

    @Override
    public List<String> cepsPorEndereco(String pEndereco) {
        throw new UnsupportedOperationException("O METODO AINDA N\u00c3O FOI IMPLEMENTADO.");
    }

    @Override
    public boolean configurarPosicaoGeogafica(ItfLocal pLocal) {
        throw new UnsupportedOperationException("O METODO AINDA N\u00c3O FOI IMPLEMENTADO.");
    }

    @Override
    public boolean contribuirCadastroNovoEndereco(ItfLocal pLocal) {
        throw new UnsupportedOperationException("O METODO AINDA N\u00c3O FOI IMPLEMENTADO.");
    }

    @Override
    public boolean cepExiste(String pCep) {
        return UtilSBCoreCEPRepublicaVirtual.cepExiste(pCep);
    }
}
