public class Cliente {

private String Nome;
private double depositoInicial;


String getNome() {
    return Nome;
}


private void setNome(String nome) {
    this.setNome(nome);
}


double getdepositoInicial() {
    return depositoInicial;
}


private void setdepositoInicial(double depositoInicial) {
    this.setdepositoInicial( depositoInicial);
}


public Cliente(String nome, double depositoInicial) {
    this.Nome = nome;
    this.depositoInicial = depositoInicial;
}

    
}
