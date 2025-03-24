
import java.util.Scanner;

public class Contador {

  /**
   * O programa recebe dois números do usuário.
   * Valida se o o primeiro número , é maior que o segundo.
   * Se a validação for falsa, ele entra na exceção e imprimi o erro.
   * Se a validação for verdadeira ele imprime um contador com base na diferença
   * entre o primeiro e o segundo número.
   * 
   * @param args
   */

  public static void main(String[] args) {

    try (Scanner terminal = new Scanner(System.in)) {
      
      // Solicita ao usuário o valor do primeiro parâmetro.
      System.out.println("Digite o primeiro Número: ");
      int parametroUm = terminal.nextInt();

      // Solicita ao usuário o valor do segundo parâmetro.
      System.out.println("Digite o segundo Número: ");
      int parametroDois = terminal.nextInt();

      // Pula uma linha depois da interação com o usuário.
      System.out.println();

      try {
        contar(parametroUm, parametroDois);
      }

      catch (Exception e) {
        e.getMessage();

      }
    }
  }

  /**
   * @param parametroUm   . Recebe o primeiro número do usuário.
   * @param parametroDois . Recebe o segundo número do usuário.
   * @throws ParametrosInvalidosException
   */
  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

    // Valida se parametroUm é maior que parametroDois e lançar exceção
    if (parametroDois > parametroUm) {

      int contagem = (parametroDois - parametroUm);

      for (int i = 1; contagem > 0; i++) {

        // realiza o for para imprimir os números com base na variável contagem.
        System.out.println("Imprimindo o número " + i);

        contagem--;
      }

      // Imprime mensagem de 'Programa Finalizado', caso a condição seja verdadeira.
     System.out.println("\nPROGRAMA FINALIZADO...!\n");

    } else {

      // Caso a condição seja falsa, o programa lança a exceção e imprime a mensagem.
      throw new ParametrosInvalidosException();
    }

  }

}
