import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    
    public static void main(String[] args) throws Exception {
            
                //TODO: Conhecer e importar a classe Scanner
                //Exibir as mensagens para o nosso usuário
                //Obter pela scanner os valores digitados no termonal
                //Exibir a mensagem conta criada
                

        

        Scanner scanner= (new Scanner(System.in)).useLocale(Locale.US);

                
                // Capturando o número da conta do usuário
                System.out.print("\n* Digite o Número da Conta: ");
                int numeroConta=scanner.nextInt();
                
                // Capturando a agência do usuário
                System.out.print("\n* Digite o Número da Agência: ");
                String agencia=scanner.next();

                // Capturando o último primeiro nome do usuário
                System.out.print("\n* Digite o Primeiro Nome do Cliente: ");
                String nomeCliente=scanner.next();
            
                
                // Capturando o último sobrenome do usuário
                System.out.print("\n* Digite o Sobrenome do Cliente: ");
                String sobreNomeCliente=scanner.next();

                // Concantenando o nomeCliente com o sobrenomeCliente

                String nomeCompleto=nomeCliente + " " + sobreNomeCliente;

                // Capturando o valor do saldo 
                System.out.print("\n* Digite o Seu Saldo: ");
                Double saldo=scanner.nextDouble();

                // Pulando duas linhas
                System.out.println("\n\n");

                
                // Imprimindo os dados para o usuário
        System.out.println("-------------Olá " + nomeCompleto + "!" +
         "------------- \n\n* Obrigado por Criar Uma Conta Em Nosso Banco.      \n* Agência : " +
          agencia.toString() + "      \n* Conta   : " +  numeroConta + "       \n* Saldo   : " + "R$ "  + saldo + 
          "            \n* Status  : SALDO DISPONÍVEL !!!\n\n----------------------------------------------");


    }
}
