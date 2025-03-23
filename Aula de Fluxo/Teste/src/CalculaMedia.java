import java.util.Locale;
import java.util.Scanner;

public class CalculaMedia {

    public static void main(String[] args) {

        String[] alunos={"Fernando","Gabriel","Laura","Aghata"};


        Scanner sc=new Scanner(System.in).useLocale(Locale.US);

        double media=CalcularMedia(alunos,sc);

        System.out.printf("\nMédia da Turma: %.1f",media);


   
    } public static double CalcularMedia(String[] alunos,Scanner scanner){

        double soma =0;

        for(String aluno: alunos){

            System.out.printf("\nNota do Aluno %s: ",aluno);

            double nota=scanner.nextDouble();

            soma+=nota;
        }


        return soma / alunos.length;
    }

}
