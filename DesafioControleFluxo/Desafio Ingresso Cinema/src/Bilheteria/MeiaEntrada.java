package Bilheteria;

public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(String nomeFilme, String audio) {
        super(nomeFilme, audio);

        ImprimeIngresso();

    }

    void ImprimeIngresso() {

        
        System.out.println("\n============TÍTULO============");
        System.out.printf("       %s          ", getNomeFilme());
        System.out.println();
        System.out.println("========LEGENDA/DUBLADO=======");
        System.out.printf("          %s            ", getAudio());
        System.out.println();
        System.out.println("=========INGRESSO TIPO========");
        System.out.printf("            MEIA           ");
        System.out.println();
        System.out.println("============PREÇO==============");
        System.out.printf("          R$ %S            ",(super.getPreco() / 2));
        System.out.println();

    }

}
