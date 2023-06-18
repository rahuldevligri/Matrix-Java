//Q->term-> 1 0 1 0 1....
//   cnt.-> 1 2 3 4 5...N      
import java.util.Scanner;
public class Q7_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        int term=1,cnt=1;
        while(cnt<=n)
        {
            System.out.println(term);
            term=1-term;
            cnt++;
        }
    }
}
