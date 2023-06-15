import java.util.Scanner;

class AreaOfCircle{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the radius =>");
            double r=s.nextDouble();
            double area=3.14*r*r;
            System.out.println("area of the circle is "+area);
        }
    }
}