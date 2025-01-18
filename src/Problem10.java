//10. WAP to Print Multiplication Table of a Number


public class Problem10 {

    public static void main(String[] args) {
        Multiples(2,16);
    }
    public static void Multiples(int num,int len){
        for (int i = 0; i <= len; i++) {
            System.out.println(num * i);
        }
    }
}
