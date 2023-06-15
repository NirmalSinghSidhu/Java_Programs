import java.util.Scanner;

class CalculateBill{
    double billpay;
    void Bill(long units){
        if(units<100){
            billpay=units*1.20;
        }
        else if(units<=300){
            billpay=100*1.20+(units-100)*2;
        }
        else{
            billpay=100*1.20+200*2+(units-300)*3;
        }
    }
}
public class ComputeElectricitybill extends CalculateBill{
    public static void main(String[] args) {
        long units;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of units");
            units=sc.nextLong();
        }
        ComputeElectricitybill o1= new ComputeElectricitybill();
        o1.Bill(units);
        System.out.println("Amount to be paid= $"+o1.billpay);
    }
    
}
