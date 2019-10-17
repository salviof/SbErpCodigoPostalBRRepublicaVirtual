package br.org.coletivoJava.fw.erp.implementacao.codigopostalbr;

import br.org.coletivoJava.fw.api.erp.codigoPostal.br.ItfCodigoPostalBR;
import br.org.coletivoJava.fw.api.erp.codigopostalbr.GatewayPgtoRepublicaVirutal;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfLocal;
import java.util.List;

@GatewayPgtoRepublicaVirutal
public class GatewayPgtoRepublicaVirutalimpl implements ItfCodigoPostalBR {

    @Override
    public boolean configuraEndereco(String cep, ItfLocal pLocal) {
        return UtilSBCoreCEP.configuraEndereco(cep, pLocal);
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

}
