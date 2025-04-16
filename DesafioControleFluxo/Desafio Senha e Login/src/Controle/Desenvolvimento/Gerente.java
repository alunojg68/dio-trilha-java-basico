package Controle.Desenvolvimento;

public class Gerente {
    private String Nome;
    private String Email;
    private final boolean administrador=true;

    
    public Gerente(String nome, String email,boolean administrador) {
        Nome = nome;
        Email = email;
    }
    void GerarRelatorioFinaceiro(){

    }
    void ConsultarVendas(){

    }
    void RealizarLogin(){

    }
    void AlterarDados(){
        
    }
    void AlterarSenha(){
        
    }


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


  
    
}
