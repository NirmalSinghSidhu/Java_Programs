 class Discount{
    public static void main(String[] args) {
        double marketprice,dis,s,amount;
        marketprice=Double.parseDouble(args[0]);
        dis=Double.parseDouble(args[1]); 
        System.out.println("marketprice .."+marketprice);
        System.out.println("discount..."+dis);
        s=100-dis;
        amount=(s*marketprice)/100;
        System.out.println("Amount to be paid.... "+amount);
    }
}