
//9. WAP to Sum of Numbers from 1 to N

public class Problem9 {

    public static void main(String[] args) {
            SumOfNumbers(7);
    }

    public static void  SumOfNumbers(int no){

        int sum = 0;
        for (int i = 0; i <= no; i++) {

sum+=i;
        }
        System.out.println(sum);
    }
}
