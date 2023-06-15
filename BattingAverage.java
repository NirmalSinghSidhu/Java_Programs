public class BattingAverage{
    public static void main(String[] args) {
        int Matches=5,totalruns=200,innings=5,notout=1;
 
        double avg;
    
        avg=totalruns/(innings-notout);
    
        System.out.println("batting average="+avg);
    
    }
}