package model.servico;

import java.security.InvalidParameterException;

public interface ServicoJuros {

    double getTaxaJuros();

    default double formaPagamento(double valor, int mes){
            if(mes < 1){
                throw  new InvalidParameterException("Mes tem que ser maior que 0!");
            }
            return valor * Math.pow(1.0 + getTaxaJuros() / 100.0, mes);
    }
}
