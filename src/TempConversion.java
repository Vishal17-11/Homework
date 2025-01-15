public class TempConversion {


    public static void main(String[] args) {


        FahrenheitToCelsius(98.6);


    }

   static void FahrenheitToCelsius(double Degree){

        double Celsius = ((Degree - 32)*5)/9;

        System.out.println(Celsius);



    }



}
