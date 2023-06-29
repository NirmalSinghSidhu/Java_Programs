public class StarPascal {
    //method to find the factorial of a number
   public static int factorial(int num){
      if(num<=0){
         return 1;
      }
      return num*factorial(num-1);
   }
   public static void main(String[] args) {
      int k=4;
      int i,j;
      for(i=0;i<=k;i++){
         for(j=0;j<k-i;j++){
            System.out.print(" ");
         }
         for(j=0;j<=i;j++){
            System.out.print(factorial(i)/(factorial(i-j)*factorial(j))+" ");
         }
         System.out.println("");
      }
     }
}
