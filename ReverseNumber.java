public class ReverseNumber {
    public static void main(String[] args) {
        int number= 2445;
        System.out.println("reverse of the number "+number+" is= "+ReverNum(number));
    }
    /*function description examples 125.. res=0
    125/10 rem=5; res=0*10+5=5; n=125/10=12;
    12/10 rem=2; res=5*10+2=52; n=12/10=1;
    1/10 rem=1; res=52*10+1=521 n=1/10=0;     * 
     */
    public static int ReverNum(int n){
        int res=0,rem;
        while(n!=0){
            rem=n%10;
            res=(res*10)+rem;
            n=n/10;
        }
        return res;
    } 
    
}
