    
public class ConversorDeTemperatura {

    public void z()throws MenorQueZeroAbsolutoException{
        throw new MenorQueZeroAbsolutoException("Valor menor que zero absoluto");
    }
    
    public double converterParaCelsius(double t)throws MenorQueZeroAbsolutoException{
       
        if(t < -273.15) {
        z();
        }
        
        return (t-32) * 5/9;
    }
    
    public double converterParaFarenheit(double t)throws MenorQueZeroAbsolutoException{
        
        if(t < -459.67) {
        z();
        }
        return (t*9/5) + 32;
    }
}