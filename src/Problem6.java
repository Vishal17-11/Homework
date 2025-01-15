//WAP that invokes method toWord() that receives a single digit number and displays it in
//words, example if the number passed is 4 then it prints four


import java.util.Scanner;

public class Problem6 {
        private static final String[] Units = {
                "Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"
    };
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Your Number upto 10 : ");

        int res = scn.nextInt();

        System.out.println(toWord(res));
    }
    static String toWord(int no){

        if(no<=10){
            return Units[no];
        }else{
            return null;
        }

    }


}
