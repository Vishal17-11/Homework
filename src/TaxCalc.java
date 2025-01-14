//2. WAP to calculate tax for a taxable Income of ₹ 3,10,000 If tax is fixed at 2.2%



public class TaxCalc {
    static final double TaxRate = 2.2/100;

    public static void main(String[] args) {

        TaxAmount(310000);


    }
    static void TaxAmount(int amount) {
            double res = amount*TaxRate;


        System.out.println("The Tax is " + "₹" +res);

    }

}
