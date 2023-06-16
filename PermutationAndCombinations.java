import java.util.Scanner;

public class PermutationAndCombinations {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value n");
        long n=s.nextLong();
        System.out.println("enter the value of r");
        long r=s.nextLong();
        System.out.println("Permutaion "+n+"P"+r+"="+PermutationAndCombinations.permutation(n, r));
        System.out.println("Combination "+n+"C"+r+"="+PermutationAndCombinations.combination(n, r));

        
    }
    public static long factorial(long n){
        if(n<=0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static long permutation(long n,long r){
        return (factorial(n))/factorial(r);
    }
    public static long combination(long n, Long r){
        return (factorial(n))/(factorial(r)*factorial(n-r));
    }
}
