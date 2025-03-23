import java.util.Random;

public class FazEnquanto {

    public static void main(String[] args) {
   
        System.out.println("Discando...");

        do{
            System.out.println("Telefone Tocando");
        }
        while(Tocando());

        System.out.println("Alô !");

    
        
    }
    private static boolean Tocando(){

        boolean atendeu=new Random().nextInt(3)==1;

        String resposta;

        if(atendeu==false)
        resposta="Não...";
        else
        resposta="Sim !!!";
        
        System.out.println("Atendeu ? "+ resposta);


        return !atendeu;
    }
}
