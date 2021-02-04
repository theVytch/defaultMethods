package model.servico;

import java.security.InvalidParameterException;

public class ServicoJurosBrasil implements  ServicoJuros{
    private Double taxaJuros;


    public ServicoJurosBrasil(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    @Override
    public double getTaxaJuros() {
        return taxaJuros;
    }

}
