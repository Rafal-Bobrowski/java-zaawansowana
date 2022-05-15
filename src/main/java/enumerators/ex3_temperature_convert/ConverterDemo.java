package enumerators.ex3_temperature_convert;

public class ConverterDemo {
    public static void main(String[] args) {
        try {
            System.out.println(TemperatureConvert.convertTemperature('K', 'C', -300));
        }catch (IllegalArgumentException exc){
            System.out.println(exc.getMessage());
        }
    }
}
