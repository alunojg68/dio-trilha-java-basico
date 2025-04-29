public interface Operacoes {

    void Sacar(double valor);
    void Depositar(double valor);
    void Transferir(double valor,Operacoes agenciaDestino);
    void ImprimirExtratos();

}
