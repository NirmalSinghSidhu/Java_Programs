import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the hight of the cylinder");
            double h=s.nextDouble();
            System.out.println("Enter the radius of the cylinder");
            double r=s.nextDouble();
            double vc= Volume.cylinderVol(h, r);
            System.out.println("Enter the hight of the cone");
            double p=s.nextDouble();
            System.out.println("Enter the radius of the cone");
            double q=s.nextDouble();
            double vco=Volume.conVol(p,q);
            System.out.println("Enter the radius of the sphere");
            double r1=s.nextDouble();
            double vs=Volume.sphereVol(r1);
            System.out.println("Volume of the cylinder is "+vc);
            System.out.println("Volume of the cone is "+vco);
            System.out.println("Volume of the sphere is "+vs);
        }
    }
    public static double conVol(double h,double r){
        double v=(22*r*r*h)/(3*7);
        return v;
    }
    public static double sphereVol(double r){
        double v=(4*22*r*r)/7;
        return v;
    }
    public static double cylinderVol(double h,double r){
        double v=(22*r*r*h)/7;
        return v;
    }
}
