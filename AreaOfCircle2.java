import java.util.Scanner;

class AreaCalculation{
    double area;
    void circle(double r){
        area=(22*r*r)/7;
        System.out.println("Area of the circle is=>"+area);
    }
}
class AreaOfCircle2 extends AreaCalculation{
public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
        System.out.println("Enter the radius of Circle=>");
        double radius=s.nextDouble();
AreaOfCircle2 a=new AreaOfCircle2();
a.circle(radius);
    }
}
}
