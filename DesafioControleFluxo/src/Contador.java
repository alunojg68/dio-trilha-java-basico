
import java.util.Scanner;

/**
 * A classe Contador é responsável por solicitar dois números inteiros ao
 * usuário
 * e contar a partir do primeiro número até o segundo, se o segundo número for
 * maior.
 */

public class Contador {

  /**
   * O ponto de entrada do programa. Solicita ao usuário dois números inteiros
   * e chama o método contar para realizar a contagem.
   * 
   * @param args Argumentos da linha de comando .
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
   * Conta de parametroUm até parametroDois, imprimindo os números no processo.
   * 
   * @param parametroUm   O primeiro número inteiro.
   * @param parametroDois O segundo número inteiro, que deve ser maior que
   *                      parametroUm.
   * @throws ParametrosInvalidosException Se parametroDois não for maior que
   *                                      parametroUm.
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
