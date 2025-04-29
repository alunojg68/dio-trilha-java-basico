

public abstract class Conta implements Operacoes{
    
        private static final int AGENCIA_PADRAO = 1;
        private static int SEQUENCIAL = 1;
    
        protected int agencia;
        protected int  numeroConta=SEQUENCIAL++;
        protected double saldo;
        protected Cliente cliente;
        
        
        public Conta(Cliente cliente) {
            this.agencia = Conta.AGENCIA_PADRAO;
           
            this.cliente = cliente;


    
        }
  

        @Override
        public void Sacar(double valor) {

            this.saldo-=valor;
            
        }
        
        @Override
        public void Depositar(double valor) {
            this.saldo+=valor;
            
        }
        
        @Override
        public void Transferir(double valor, Operacoes agenciaDestino) {
            this.Sacar(valor);
            agenciaDestino.Depositar(valor);
            
        }
        
        


        @Override
        public String toString() {

            System.out.println("\nTitular: " + this.cliente.getNome() + "\n" +
            "Agência: " + this.agencia + "\n" + 
            "Número da Conta: " + this.numeroConta + "\n" +
            "Saldo: " + this.saldo);
          
        
            return null;
        }
        
        
            public int getAgencia() {
                    return agencia;
                }
        
                public int getNumeroConta() {
                    return numeroConta;
                }
        
        
                public double getSaldo() {
                    return saldo;
                }
        
        
                public Cliente getCliente() {
                    return cliente;
                }
      
    }
