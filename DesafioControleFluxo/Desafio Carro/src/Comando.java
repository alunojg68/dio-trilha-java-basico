import java.util.Random;

/**
 *  A classe Comando representa um carro que pode ser ligado, desligado, acelerar, desacelerar e mudar de marcha.
 *  Ela estende a classe Carro e fornece funcionalidades adicionais para controle do veículo.
 */

public class Comando extends Carro {

    private int velocidade;// A velocidade atual do carro
    private int marcha;    // A marcha atual do carro
    private String mensagemMarcha;// Mensagem relacionada à marcha (não utilizada no código)
    private int geraVelocidade; // Velocidade gerada (não utilizada no código)
    private int rand; // Variável para armazenar um número aleatório (não utilizada no código)
    private boolean carroLigado;


    /**
     *Construtor da classe Comando.
     * Inicializa o carro com um nome, montadora e ano, e desliga o carro.
     * @param nome O nome do carro.
     * @param montadora A montadora do carro.
     * @param ano O ano de fabricação do carro.
     */

    public Comando(String nome, String montadora, int ano) {
        super(nome, montadora, ano);

        DesligarCarro();
        setVelocidade(0);
        setMarcha(0);
        System.out.println(" CARRO EM PONTO MORTO. VELOCIDADE: " + getVelocidade() + " Km/h.\n");

        

    }

    /*
     * Liga o motor do carro e exibe uma mensagem.
     */
    void LigarCarro() {

        carroLigado=true;

        System.out.println("\n MOTOR LIGADO...!!!");

    }
    /*
     * Desliga o motor do carro e exibe uma mensagem.
     */

    void DesligarCarro() {

        carroLigado=false;

        System.out.println(" MOTOR DESLIGADO...!!!");

    }
    /**
     * Acelera o carro, aumentando a velocidade e verificando a marcha atual.
     */

    void Acelerar(){

        TratandoErros();

         try {
            
        
        setVelocidade(getVelocidade() + 1);

        switch (getMarcha()) {
            case 0:

                System.out.println("\n VOCÊ ACELEROU...!!!");
                System.out.println("\n VRUUUUUUNNN...!!!");
                System.out.println(" Carro em ponto morto. Esperando marcha...!!!\n");

                break;

            case 1:

                VerificarVelocidade();

                break;

            case 2:

                VerificarVelocidade();

                break;

            case 3:

                VerificarVelocidade();

                break;

            case 4:

                VerificarVelocidade();

                break;

            case 5:

                VerificarVelocidade();

                break;

            case 6:

                VerificarVelocidade();

                break;

            default:
                System.out.println("\n OLHA O DEFEITO AI ...");
                break;
        }

    }
       catch (ErrosException e) {
         
        
         System.out.println(e.getMessage());
 }
      

    }
        
    
    /*
     *  Desacelera o carro, diminuindo a velocidade e verificando a marcha atual.
     */

    void DiminuirVelocidade() throws RuntimeException{

        TratandoErros();

        try {
            
      
        System.out.println("\n VOCÊ DESACELEROU...!!!");

        setVelocidade(getVelocidade() - 1);

        switch (getMarcha()) {
            case 0:

                System.out.println(" Carro em ponto morto. Esperando marcha...!!!\n");

                break;

            case 1:

                VerificarVelocidade();

                break;

            case 2:

                VerificarVelocidade();

                break;

            case 3:

                VerificarVelocidade();

                break;

            case 4:

                VerificarVelocidade();

                break;

            case 5:

                VerificarVelocidade();

                break;

            case 6:

                VerificarVelocidade();

                break;

            default:
                
                break;
        }

    } catch (ErrosException e) {

        System.out.println(e.getMessage());
           
    }


    }
    /*
     *  Faz o carro virar para a esquerda, gerando uma velocidade aleatória.
     */

    void VirarParaEsquerda() {

        Random rand =new Random();

        setVelocidade(rand.nextInt(1,41));
        VerificarVelocidade();
        
        System.out.println(" DANDO SETA PARA ESQUERDA...");
        System.out.println(" VIRANDO A ESQUERDA...!!!\n");
        
    }

    /*
     *  Faz o carro virar para a direita, gerando uma velocidade aleatória.
     */
    void VirarParaDireita() {

        Random rand =new Random();

        setVelocidade(rand.nextInt(1,41));
        VerificarVelocidade();
        
        System.out.println(" DANDO SETA PARA DIREITA...");
        System.out.println(" VIRANDO A DIREITA...!!!\n");
    }

    private void VerificarVelocidade() {

        if (getVelocidade() > 0 && getVelocidade() < 21) {
            setMarcha(1);

        } else if (getVelocidade() >= 21 && getVelocidade() < 41) {
            setMarcha(2);

        } else if (getVelocidade() >= 41 && getVelocidade() < 61) {
            setMarcha(3);
        } else if (getVelocidade() >= 61 && getVelocidade() < 81) {
            setMarcha(4);
        } else if (getVelocidade() >= 81 && getVelocidade() < 101) {
            setMarcha(5);
        } else if (getVelocidade() >= 101 && getVelocidade() <= 120) {
            setMarcha(6);
        } else {
            System.out.println("\n VOCÊ CHEGOU NA VELOCIDADE MÁXIMA !!!");

        }

        System.out.println(" Carro está na " + getMarcha() + "ª marcha.");
        System.out.println(" Andando agora andando a: " + getVelocidade() + " Km/h.\n");

    }

    void TrocarMarcha(int marcha) {
        this.setMarcha(marcha);

        Random rand = new Random();

        switch (getMarcha()) {
            case 0:
                setVelocidade(0);
                System.out.println("\n O carro está parado. Velocidade: " + getVelocidade());
                break;

            case 1:

                setVelocidade(rand.nextInt(1, 21));
                System.out.println(
                        " Você engatou a " + getMarcha()+ "ª marcha.");
                break;

            case 2:

                setVelocidade(rand.nextInt(21, 41));
                System.out.println(
                        " Você engatou a " + getMarcha() + "ª marcha.");
                break;

            case 3:

                setVelocidade(rand.nextInt(41, 61));
                System.out.println(
                        " Você engatou a " + getMarcha() + "ª marcha.");
                break;

            case 4:

                setVelocidade(rand.nextInt(61, 81));
                System.out.println(
                        " Você engatou a " + getMarcha() + "ª marcha.");
                break;

            case 5:

                setVelocidade(rand.nextInt(81, 101));
                System.out.println(
                        " Você engatou a " + getMarcha()+ "ª marcha.");
                break;

            case 6:

                setVelocidade(rand.nextInt(101, 121));
                System.out.println(
                        " Você engatou a " + getMarcha() + "ª marcha.");
                break;

            default:

                System.out.println("\n O CARRO POSSUI APENAS 6 MARCHAS. ESSA MARCHA NÃO EXISTE...\n");
                break;

        }

    }
    private void TratandoErros()  {

        if(carroLigado==false){
            throw new ErrosException("\n O CARRO NÃO ESTÁ LIGADO !!!");
        
        }
    }
    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getGeraVelocidade() {
        return geraVelocidade;
    }

    public void setGeraVelocidade(int geraVelocidade) {
        this.geraVelocidade = geraVelocidade;
    }

}