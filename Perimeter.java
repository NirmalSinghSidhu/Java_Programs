import java.util.Scanner;
//here i calculate the perimeter of the circle ,rectengle,square using static method
public class Perimeter {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the radius of the circle=>");
            double rad=s.nextDouble();
            double p= Perimeter.circlePer(rad);
            System.out.println("perimeter of the circle is ..= "+p);
            System.out.println("enter the edge of the square=>");
            int e=s.nextInt();
            int a=Perimeter.squarePer(e);
            System.out.println("perimeter of the square is.."+a);
            System.out.println("enter the sides of the rectangle=>");
            double d=s.nextDouble();
            double f=s.nextDouble();
            double q= Perimeter.rectanglePer(d, f);
            System.out.println("perimeter of the square is.."+q);
        }
    }
    public static double circlePer(double r){
        double cp= (2*22*r)/7;
        return cp;
    }
    public static double rectanglePer(double x,double y){
        double rp=2*(x+y);
        return rp;
    }
    public static int squarePer(int a){
        int sp=4*a;
        return sp;
    }
}
