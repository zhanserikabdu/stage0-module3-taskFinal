package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float celsius;
        celsius=(int)temperatureCelsius;
        float Fahrenheit;
        Fahrenheit =((celsius*9)/5)+32;
        System.out.println( Fahrenheit);
    }
}
