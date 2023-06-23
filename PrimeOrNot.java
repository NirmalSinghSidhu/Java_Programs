public class PrimeOrNot {
    public static void main(String[] args) {
        PrimeOrNot.isPrime(26);
    }
    public static void isPrime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("its a prime number");
        }
        else{
            System.out.println("it is not a prime number ");
        }
    }
    
}
