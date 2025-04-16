public class Principal {
    public static void main(String[] args) throws Exception {
      
        double valorTotal=1000.0;
        double entrada=300;
        int parcelas=8;

        
        try {

            Financiamento f= new Financiamento(valorTotal,entrada,parcelas);
              System.out.println(f.Prestacao());

            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

       
    }
}
