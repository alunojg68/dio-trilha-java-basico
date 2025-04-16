public class ContaBanco extends Cliente {

   private double valorCheque;
    private double saldoComCheque;

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public double getSaldoComCheque() {
        return saldoComCheque;
    }

    public void setSaldoComCheque(double saldoComCheque) {
        this.saldoComCheque = saldoComCheque;
    }

    public ContaBanco(String Nome, int Conta, double depositoInicial) {
        super(Nome, Conta, depositoInicial);

    }
    
    void LimiteChequeEspecial(){
    

        if (super.getDepositoInicial() <= 500) {

            setValorCheque(50);
            super.setSaldo(getValorCheque() + super.getDepositoInicial());
            System.out.printf(" Limite do cheque especial: %.1f", getValorCheque());
            System.out.println( "\n------------------------------------------");
            System.out.println("\n");
        } else {

            setValorCheque(super.getDepositoInicial() * 0.5);
            super.setSaldo(getValorCheque() + super.getDepositoInicial());
            System.out.printf(" Limite do cheque especial: %.1f", getValorCheque());
            System.out.println( "\n------------------------------------------");
            System.out.println("\n");
        }

    }

    void imprimirAberturaConta() {
    
        System.out.println( "\n------------------------------------------");
        System.out.println("\n Olá " + super.getNome() + "...");
        System.out.println(" Obrigado por abrir uma conta no nosso banco. ");
        System.out.printf(" O número da sua conta é: %.0f", super.getConta());
        System.out.println("\n valor de abertura de conta: R$ " + super.getDepositoInicial());
        

         LimiteChequeEspecial();

    }

    public void Depositar(double deposito) {
        super.setDeposito(deposito);

      

        System.out.printf("\n\n Saldo anterior: %.1f", super.getSaldo());
        System.out.printf("\n Voce depositou: R$ %.1f", super.getDeposito());
        super.setDeposito( deposito - super.getValorUsadoCheque());
        super.setSaldo(super.getSaldo() + super.getDeposito());
        System.out.printf("\n\n Seu saldo atual: R$ %.1f", super.getSaldo());
        setValorUsadoCheque(0);

        System.out.println( "\n------------------------------------------");
        System.out.println();

    }

    public void Sacar(double sacar) {

        if (sacar > super.getSaldo()) {

            System.out.printf("\n\n Voce tentou sacar: R$ %.1f", sacar);
            System.out.println("\n Saldo Insuficiente !!!");
            System.out.println( "\n------------------------------------------");

        } else if (super.getSaldo() < getValorCheque()) {

            System.out.printf("\n\n Saldo anterior: %.1f", (super.getSaldo() + sacar));
            super.setSaldo(super.getSaldo() - sacar);

            System.out.printf("\n Voce sacou: R$ %.1f", sacar);
            System.out.printf("\n\n Seu saldo atual: R$ %.1f", super.getSaldo());

           
            System.out.println( "\n ------------------------------------------");
            

        } else {

            this.setSaque(sacar);
            System.out.printf("\n Saldo anterior: %.1f", super.getSaldo());

            System.out.printf("\n Voce sacou: R$ %.1f", super.getSaque());
            super.setSaldo(super.getSaldo() - sacar);
            System.out.printf("\n\n Seu saldo atual: R$ %.1f", super.getSaldo());
         
               Taxar();
               
              
              
            System.out.println( "\n------------------------------------------");

        }
    }
    void Taxar(){

       

        if( super.getSaldo() < getValorCheque()){

            super.setValorUsadoCheque(getValorCheque() - super.getSaldo());
            super.setValorUsadoCheque(super.getValorUsadoCheque() * 0.2);
             System.out.println( "\n Taxa de uso limite do cheque especial 20%: R$ " + super.getValorUsadoCheque());
             System.out.println("\n A taxa do limite do cheque especial, será cobrada do próximo depósito !");
           
        }
        else{
            super.setValorUsadoCheque(0);
        } 
    }













}
