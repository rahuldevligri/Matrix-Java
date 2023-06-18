//Q--> 1 -1  1 -1  1.....
import java.util.Scanner;
public class Q6_2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        int term,cnt;
        term=cnt=1;
        while(cnt<=n)
        {
            System.out.println  (term);
            term=-term;
            cnt++;
        }
    }
}
