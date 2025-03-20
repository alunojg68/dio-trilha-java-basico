import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    
    public static void main(String[] args) throws Exception {
      
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no termonal

        //Exibir a mensagem conta criada

        Scanner scanner= (new Scanner(System.in)).useLocale(Locale.US);

        System.out.println("********Seja Bem Vindo(a)!********** \n" + " Digite o Número da Conta: ");
        int numeroConta=scanner.nextInt();

        System.out.println(" Digite o Número da Agência: ");
        String agencia=scanner.next();


        System.out.println(" Digite o Primeiro Nome do Cliente: ");
        String nomeCliente=scanner.next();

        System.out.println(" Digite o Sobrenome do Cliente: ");
        String sobreNomeCliente=scanner.next();


        System.out.println(" Digite o Seu Saldo: ");
        Double saldo=scanner.nextDouble();


        //System.out.println("\n \n");

        System.out.println("Olá " + nomeCliente + " " + sobreNomeCliente + "! \n Obrigado por Criar Uma Conta Em Nosso Banco. \n Sua Agência é " + agencia.toString() + ", \n Sua Conta é " + numeroConta + ", \n e Seu Saldo de " + saldo + ", Já Está Disponível !");


    }
}
