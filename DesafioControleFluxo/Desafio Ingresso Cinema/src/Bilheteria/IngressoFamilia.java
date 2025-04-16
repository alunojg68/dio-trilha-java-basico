package Bilheteria;

import java.lang.foreign.ValueLayout;

public class IngressoFamilia extends Ingresso {

    int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    double preco;
    double valorFamilia;

    public IngressoFamilia(String nomeFilme, String audio, int quantidade) {
        super(nomeFilme, audio);
        setQuantidade(quantidade);
        ImprimeIngresso();

    }

    void ImprimeIngresso() {

        DefineValorIngresso();

        System.out.println("\n============TÍTULO============");
        System.out.printf("          %s            ", getNomeFilme());
        System.out.println();
        System.out.println("========LEGENDA/DUBLADO=======");
        System.out.printf("          %s            ", getAudio());
        System.out.println();
        System.out.println("=========INGRESSO TIPO========");
        System.out.printf("          FAMÍILIA            ");
        System.out.println();
        System.out.println("=======NÚMERO DE PESSOAS======");
        System.out.printf("             %S            ", getQuantidade());
        System.out.println();
        System.out.println("============PREÇO==============");
        System.out.printf("          R$ %S            ",valorFamilia);
        System.out.println();

    }

    public Double DefineValorIngresso() {

        if (quantidade <= 3) {

            valorFamilia = getQuantidade() * super.getPreco();

        } else {
            preco = super.getPreco() - (super.getPreco() * .05);
            valorFamilia = getQuantidade() * preco;
        }

        return valorFamilia;
    }

}
