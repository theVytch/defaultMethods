package aplicacao;

import model.servico.ServicoJuros;
import model.servico.ServicoJurosBrasil;
import model.servico.ServicoJurosUSA;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.print("Valor: ");
        double valor = ler.nextDouble();
        System.out.print("Mes: ");
        int mes = ler.nextInt();

        ServicoJuros servicoJuros = new ServicoJurosUSA(1.0);
        double taxaJuros = servicoJuros.formaPagamento(valor, mes);

        System.out.println("pagamento depois de "+ mes +" meses: ");
        System.out.println(String.format("%.2f", taxaJuros));



        ler.close();
    }
}
