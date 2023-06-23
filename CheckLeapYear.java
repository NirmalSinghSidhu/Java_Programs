import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any year");
        int y=s.nextInt();
        leapOrNot(y);
        
    }
    public static void leapOrNot(int year){
        if(year%400==0){
            System.out.println("it is leap year..");
        }
        else if(year%100!=0){
            if(year%4==0){
                System.out.println("its a leap year");
            }
            else{
                System.out.println("It is not leap year");
            }
        }
        else{
            System.out.println("it is not  valid  year");
        }
    }
    
}
