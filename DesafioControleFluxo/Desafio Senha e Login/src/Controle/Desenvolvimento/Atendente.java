package Controle.Desenvolvimento;

public class Atendente {
    private String Nome;
    private String Email;
    private double valorEmCaixa;
    private final boolean administrador=false;
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }

    public Atendente(String nome, String email, double valorEmCaixa, boolean administrador) {
        Nome = nome;
        Email = email;
        this.valorEmCaixa = valorEmCaixa;
       
    }
    void ReceberPagamentos(double valorEmCaixa){

        setValorEmCaixa(getValorEmCaixa() + valorEmCaixa);
    }
    void RealizarLogin(){

    }
    void AlterarDados(){
        
    }
    void AlterarSenha(){
        
    }
}
