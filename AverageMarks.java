import java.util.Scanner;

class AverageCalculation{
    double avg=0;
    AverageCalculation(int a[]){
        for(int i=0;i<a.length;i++){
            avg=avg+a[i];        }
    }
}
public class AverageMarks {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of Subjects ... ");
        int n=s.nextInt();
        System.out.println("enter the marks ");
        int[] marks= new int[n];
        for(int i=0;i<n;i++){
            marks[i]=s.nextInt();
        }
        AverageCalculation o1=new AverageCalculation(marks);
        System.out.println("Average of (");
        for(int i=0;i<n;i++){
        System.out.println(marks[i]);   
         }
         System.out.println(") is equal to "+o1.avg/n);
    }
    
}
