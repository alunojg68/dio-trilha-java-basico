

import java.util.Scanner;




public class Contador {



    public static void main(String[] args){ 
         
          Scanner terminal=new Scanner(System.in);
          
          System.out.println("Digite o primeiro Número: ");
          int parametroUm=terminal.nextInt();

          System.out.println("Digite o segundo Número: ");
          int parametroDois=terminal.nextInt();

          

              
                  try{
                    contar(parametroUm, parametroDois);
                  }

            catch(Exception e){
                    
              
              System.out.println(e.getMessage());
            }
            }
          
      
      
    
    
    static void contar(int numeroUm, int numeroDois) throws Exception{
             // Validar se parametroUm é maior que parametroDois e lançar exceção

               
               if(numeroDois > numeroUm){
                
                int contagem=(numeroDois - numeroUm);

                for(int i = 1;contagem > 0;i++ ){
               
                  //realiza o for para imprimir os números com base na variável contagem.
                  System.out.println("Imprimindo o número "+ i);

                  contagem-=1;
                  }
                  

                    }
                else{
                   
                  throw new Exception("O segundo Número deve ser maior que o primeiro !");
                }


          System.out.println("\nFIM DO PROGRAMA !");
         }
        
   
    }
              

              

             

    

