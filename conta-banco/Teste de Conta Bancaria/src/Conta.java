public class Conta extends Cliente{

    private double Depositar;
    private double  Sacar;
    private double Saldo;
    private double limiteCheque;
    private double taxaLimite;
    
   private double getLimiteCheque() {
        return limiteCheque;
    }
   private void setLimiteCheque(double limiteCheque) {
        this.limiteCheque = limiteCheque;
    }
    private double getSacar() {
        return Sacar;
    }
    private void setSacar(double sacar) {
        this.Sacar = sacar;
    
    }
    private double getDepositar() {
        return Depositar;
    }
    private void setDepositar(double depositar) {
        Depositar = depositar;
    }

    private double getSaldo() {
        return Saldo;
    }
    private void setSaldo(double saldo) {
      
       Saldo = saldo ;
     
    }

    
    public Conta(String nome, double depositoInicial) {
        super(nome, depositoInicial);
       
        setSaldo(depositoInicial);
        System.out.println("\n Cliente: " + getNome());
        System.out.println(" Abriu aconta com: R$ " + getdepositoInicial());
        ConsultaChequeEspecial();
        setSaldo(getLimiteCheque() + getSaldo());
        System.out.printf(" Seu Saldo Atual: R$ %.1f", getSaldo());
        System.out.println();
        
    }
    void FazerDeposito(double Valor){
        taxaLimite=(getLimiteCheque() - getSaldo());
    
        if(getSaldo() >= getLimiteCheque()){

            setSaldo(getSaldo()+Valor);
            System.out.println("\n Você Depositou  R$ " + Valor );
             System.out.printf("\n Seu Saldo Atual: R$ %.1f",getSaldo());
           
        }else{

          
            
            setSaldo(getSaldo()+(Valor-(taxaLimite *.2)));
            System.out.println("\n Você Depositou  R$ " + Valor );
            System.out.println(" Taxa 20% Uso Limite Cheque Especial: R$ -" + (taxaLimite *.2) );
             System.out.printf(" Seu Saldo Atual: R$ %.1f",getSaldo());
             System.out.println("\n");

        }
      
    }
    void FazerSaque(double Valor) throws ErrosException{
        setSacar(Valor);
        setSaldo(getSaldo()-Valor);
        
        try {
  
      ConsultarSaldo();
      System.out.println("\n Você Sacou  R$ " + getSacar() );
      System.out.printf(" Seu Saldo Atual: R$ %.1f",getSaldo());
      System.out.println();
     
        }
        catch (ErrosException e) {
            e.SaldoNegativo();
            
        }
        

    }void ConsultarSaldo(){

        getSaldo();
        
        if( getSaldo() >= getLimiteCheque()){
            
           
           
            System.out.printf("\n Seu Saldo Atual: R$ %.1f",getSaldo());
            System.out.println();
            
        }
        else if(getSaldo() < getLimiteCheque() && getSaldo() >=0){

            System.out.printf("\n Entrando no Limite Cheque Especial: %.1f", getSaldo());
            System.out.println(" Taxa de Uso Cheque Especial: 20%");
            System.out.println(" Valor da Taxa , Será Debitado do Próximo Depósito...\n");
            
        }else{
           
            setSaldo(getSaldo()+getSacar());
            System.out.printf("\n VOCÊ TENTOU SACAR: R$ %.1f",getSacar());
            System.out.println();
            throw new ErrosException();
        }


    }
    void ConsultaChequeEspecial(){
         
        if(super.getdepositoInicial() > 0 && super.getdepositoInicial() <= 500){

            setLimiteCheque(50);

            System.out.printf(" Limite de Cheque Especial: R$ %.1f", getLimiteCheque());
            System.out.println();

        }else{

            setLimiteCheque(getdepositoInicial() * .20);
            System.out.printf(" Limite de Cheque Especial: R$ %.1f", getLimiteCheque());
            System.out.println();
        }
    }
    
}
