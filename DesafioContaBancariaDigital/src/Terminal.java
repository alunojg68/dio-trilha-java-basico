
public class Terminal {
    public static void main(String[] args) throws Exception {
      
        Banco banco = new Banco("Banco Bradesco");
        
        Cliente c = new Cliente("Geraldo");
       
        
        Cliente c1 = new Cliente("Paulo");
        
        
        Conta cc =new ContaCorrente(c);
        Conta cp =new ContaPoupanca(c1);
        
        banco.adicionarConta(cp);
        banco.adicionarConta(cc);
        
        cc.Depositar(250.0);
        cp.Depositar(550.0);
     
        banco.listarConta();
        
        
 } 
}
