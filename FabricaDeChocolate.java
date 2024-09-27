public class FabricaDeChocolate {
    public static void main(String[] args) {
        
        CaldeiraChocolate caldeira = CaldeiraChocolate.getInstancia();

        caldeira.encher();  
        caldeira.encher();  

        caldeira.ferver();
        caldeira.ferver();

        caldeira.drenar();
        caldeira.drenar();
        
        caldeira.encher();
        caldeira.ferver(); 
        caldeira.drenar();
    }
}
