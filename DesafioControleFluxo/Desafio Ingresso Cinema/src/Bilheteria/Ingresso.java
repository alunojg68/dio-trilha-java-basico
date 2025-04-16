package Bilheteria;

public class Ingresso {
    private String nomeFilme;
    private String audio;
    private double preco = 30.0;

    public double getPreco() {
        return preco;
    }

    protected void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public Ingresso(String nomeFilme, String audio) {
        this.nomeFilme = nomeFilme;
        this.audio = audio;
    }

}
