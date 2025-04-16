package Controle.Desenvolvimento;

public class Vendedor {
    
    private String Nome;
    private String e_mail;
    private int senha;
    private int quantidadeDeVendas;


    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(int quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

 

    private final boolean administrador=false;
    
    
     public Vendedor(String nome, String e_mail, int senha, int quantidadeDeVendas) {
        Nome = nome;
        this.e_mail = e_mail;
        this.senha = senha;
        this.setQuantidadeDeVendas(quantidadeDeVendas);
    }

     void RealizarVendas(){

        setQuantidadeDeVendas(getQuantidadeDeVendas()+quantidadeDeVendas);

     }
     void ConsultarVendas(){
        
     
    }
    void RealizarLogin(){

    }
    void AlterarDados(){
        
    }
    void AlterarSenha(){
        
    }

 
}
