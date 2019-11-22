public class TestaConversor {
    public static void main(String[] args) {
        
        ConversorDeTemperatura t = new ConversorDeTemperatura();
        
        double c = 0;
        double f = 0;
        
        try{
            
             c = t.converterParaCelsius(0.0);
             f = t.converterParaFarenheit(-1000);
            
        }catch(MenorQueZeroAbsolutoException ex){
        
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Conversão para Celsius: " + c);
        System.out.println("Conversão para Celsius: " + f);
    }
    
}