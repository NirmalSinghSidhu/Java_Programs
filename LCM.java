public class LCM {
    public static void LcmCalcu(int a,int b){
        int gcd=1;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
            gcd=i;
            }
        }
        int lcm=(a*b)/gcd;
        System.out.println("LCM of numbers "+a+" and "+b+" is .."+lcm);
    }
    public static void main(String[] args) {
        int a=43;
        int b=12;
        LCM.LcmCalcu(a, b);
    }
    
}
