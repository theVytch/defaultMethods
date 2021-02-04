package model.servico;

import java.security.InvalidParameterException;

public class ServicoJurosUSA implements ServicoJuros {
    private double taxaJuros;


    public ServicoJurosUSA(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double getTaxaJuros() {
        return taxaJuros;
    }

}
