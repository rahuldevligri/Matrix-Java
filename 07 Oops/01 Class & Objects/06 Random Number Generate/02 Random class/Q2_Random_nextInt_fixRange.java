import java.util.Random;
public class Q2_Random_nextInt_fixRange {    
    public static void main(String[] args){
        Random r1 = new Random();
        System.out.println("0 to 999");
        for(int i=0;i<10;i++){
            System.out.println(r1.nextInt(1000));// 0 to 999
    //                                  fix range 
        }
        System.out.println("1 to 1000");
        for(int i=0;i<10;i++){
            System.out.println(r1.nextInt(1000)+1);// 1 to 1000
    //                                  fix range 
        }
    }    
}
