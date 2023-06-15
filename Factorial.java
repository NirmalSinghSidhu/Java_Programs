public class Factorial {
    public static void main(String[] args) {
        int f1= Factorial.fact1(4);
        System.out.println(f1);
        Factorial.fact2(5);
        int f2= Factorial.fact4(7);
        System.out.println(f2);
        Factorial.fact3(3);
    }
    //below are the different methods to calculate the factorial of the given number
    public static int fact1(int n){
        int f=1,i=1;
        while(i<=n){
            f=f*i;
            i++;
        }
        return f;
    }
    public static void fact2(int n){
        int f=1;
        int i=1;
        do{
            f=f*i;
            i++;
        }
        while(i<=n);
        System.out.println("factorial==="+f);
    }
    public static void fact3(int n){
      int f=1;
        for(int p=1;p<=n;p++){
            f=f*p;
        }
        System.out.println(f);
    }
    public static int fact4(int n){
        if(n<=0){
            return 1;
        }else
        {
        return Factorial.fact4(n-1)*n;
    }
}
}
