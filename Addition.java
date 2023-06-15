import java.util.Scanner;

class AddinClas{
    double add;
     AddinClas(double x,double y){
        add=x+y;
    }
}
public class Addition {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the first number");
        double n1=s.nextDouble();
        System.out.println("Enter the second number");
        double n2=s.nextDouble();
        AddinClas o1=new AddinClas(n1, n2);
        System.out.println("Addition of two numbers is "+o1.add);
    }
    
}
