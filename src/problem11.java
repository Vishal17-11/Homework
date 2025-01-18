import java.util.Scanner;

public class problem11 {


    public static void main(String[] args) {



        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int data = scn.nextInt();



        if(data <=0){
            System.out.println("Please enter the non zero number!");
        }else{
            System.out.println("The factorial is " + factorial(data));
        }
    }

    public static int factorial(int no){
int fact = 1;
        for (int i = no; i >1 ; i--) {
            fact *=i;

        }
//        return  fact;

        return fact;
    }

}
