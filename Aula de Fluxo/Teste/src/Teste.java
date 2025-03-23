public class Teste {
    public static void main(String[] args) {
       
        System.out.println("Entrei no método main !");

        a();
        
        System.out.println("Finalizou o método main");
        
    }

    public static void a(){

        System.out.println("Entrei no método a !");

        b();

        System.out.println("Finalizou o método a. ");

    }
    public static void b(){
           
        for(int x =1;x<=4;x++) System.out.println(x);

        c();

        System.out.println("Finalizou o método b. ");

    }
    public static void c(){

        System.out.println("Entrou método c. ");
        Thread.dumpStack();
        System.out.println("Finalizou o método c. ");


    }
    
    }

