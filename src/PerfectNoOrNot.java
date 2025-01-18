


public class PerfectNoOrNot {


    public static void main(String[] args) {


        if(isPerfectNo(16)){

            System.out.println("It is a valid perfect square!");
        }else{
            System.out.println("It is not valid perfect square");
        }




    }


  public  static boolean isPerfectNo(int no){


    if(no>0 ){

        int sqrt = (int)Math.sqrt(no);
    return sqrt * sqrt == no;
    }
else{
    return false;
    }


    }
}
