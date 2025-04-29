public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);

    }

    @Override
    public void ImprimirExtratos() {

        System.out.println("=== Extrato Conta Poupança ===");
        super.toString();
    }
}