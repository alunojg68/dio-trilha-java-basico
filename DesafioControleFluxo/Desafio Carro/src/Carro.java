/**
 * A classe Carro representa um veículo com informações sobre seu modelo, montadora e ano de fabricação.
 */
 

public class Carro {
   // A montadora do carro
    private String Montadora;
    // O nome do modelo do carro (estático, compartilhado entre todas as instâncias)
    private static String Nome;
     // O ano de fabricação do carro
    private int Ano;

  
    /**
     * Construtor da classe Carro.
     *  @param nome O nome do modelo do carro.
     * @param montadora A montadora que fabricou o carro.
     *  @param ano O ano de fabricação do carro.
     */

    public  Carro(String nome,String montadora,int ano) {

        this.setNome(nome);
        this.setMontadora(montadora);
        this.setAno(ano);

        System.out.printf("\n Carro Modelo: %s%s%s" , nome + "\n Montadora : " , montadora + "\n Ano de Fabricação: " , Integer.toString(ano) + "\n");
        
    }
    /**  /
     * Obtém a montadora do carro.
     * 
     * @return A montadora do carro.
     */

    public String getMontadora() {
        return Montadora;
    }

    /**
     * Define a montadora do carro.
     * @param montadora A montadora a ser definida.
     */
    
    public void setMontadora(String montadora) {
        Montadora = montadora;
    }
  
    /*
     * Obtém o nome do modelo do carro.
     * @return O nome do modelo do carro.
     */

    public  String getNome() {
        return  Nome;
    }

    /**
     * Define o nome do modelo do carro.
     * @param nome O nome a ser definido para o modelo do carro.
     */
    public void setNome(String nome) {
       
        Carro.Nome = nome;
    }

/**
 * Obtém o ano de fabricação do carro.
 * @return  O ano de fabricação do carro.
 */
    public int getAno() {
        return Ano;
    }

    /**
     *  Define o ano de fabricação do carro.
     * 
     * @param ano O ano a ser definido para o carro.
     */
    public void setAno(int ano) {
        Ano = ano;
    }


    
}
