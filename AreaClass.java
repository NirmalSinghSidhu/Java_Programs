import java.util.Scanner;
//Calculation of the area of the circle ,square,rectangle... using constructor
// here depending upon the number of the arguments we can calculate the area 
//number of the arguments determine the type of area for specific shape.. 
class Area{
    double area;
    public Area(double rad){
    area=(22*rad*rad)/7;
    }
    public Area(int l,int b){
        area=l*b;
    }
    public Area(int a){
        area=a*a;
    }
    public Area(int a,int b,int c){
        int s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public void display(){
        System.out.println("area is=>"+area);
    }

}
public class AreaClass{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("enter the radius =>");
            double r= s.nextDouble();
            Area o1=new Area(r);
            o1.display();
            System.out.println("enter the first side of the triangle=>");
            int a= s.nextInt();
            System.out.println("enter the second side of the triangle=>");
            int b= s.nextInt();
            System.out.println("enter the third side of the triangle=>");
            int c= s.nextInt();
            Area o2=new Area(a, b, c);
            o2.display();
        }

    }
}
