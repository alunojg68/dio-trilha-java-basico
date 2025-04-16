
public class Cliente {

    private String Nome;
    private int Conta;
    private double Saldo;
    private double deposito;
    private double saque;
    private double depositoInicial;
    private double valorUsadoCheque=0;
    
    public Cliente(String Nome, int Conta, double depositoInicial) {

        this.setNome(Nome);
        this.setConta(Conta);
        this.setDepositoInicial(depositoInicial);
        this.setSaldo(depositoInicial);
    }
    public double getValorUsadoCheque() {
        return valorUsadoCheque;
    }

    public void setValorUsadoCheque(double valorUsadoCheque) {
        this.valorUsadoCheque = valorUsadoCheque;
    }


    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
 
        
        this.deposito = deposito;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setConta(int conta) {
        this.Conta = conta;
    }

    public void setSaldo(double saldo) {

        this.Saldo = saldo;

    }

    public String getNome() {
        return Nome;
    }

    public double getConta() {
        return Conta;
    }

    public double getSaldo() {

        return Saldo;

    }

}
