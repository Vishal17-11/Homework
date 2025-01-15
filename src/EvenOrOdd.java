import java.util.Scanner;

public class EvenOrOdd {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number :  ");
        int in = scn.nextInt();

        EvenOrOdd(in);


    }

    static void EvenOrOdd(int no){



        if(no %2 == 0){

            System.out.println("Even");
        }else if(no ==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }



    }
}
