//1. WAP to find the perimeter of a triangle with sides measuring 10cm, 14cm and 15cm.
class Triangle{

    public static void main(String[] args) {
        PerimeterOfTriangle Triangle = new PerimeterOfTriangle();
        Triangle.Perimeter(10,14,15);
    }
}

class PerimeterOfTriangle {

    static void Perimeter(double x,double y,double z){

     double res = x+y+z;

     System.out.println(res + "cm");
 }



};