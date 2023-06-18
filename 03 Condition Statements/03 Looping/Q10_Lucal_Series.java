/*Lucal Series = Sum of previous three term.
terms->   0    0   1     1    2    4    7     13......
         t1 + t2 + t3 = sum   ^    ^
              t1 + t2 + t3 = sum   |
                   t1 + t2 + t3 = sum                       
cnt->   1     2     3    4    5    6    7     8......N
*/

import java.util.Scanner;
public class Q10_Lucal_Series {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("***Fibbonachi Series***");
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        int t1=0,t2=0,t3=1,cnt=1,sum=0;
        while(cnt<=n)
        {
            System.out.println(t1);
            sum=t1+t2+t3;
            t1=t2;
            t2=t3;
            t3=sum;
            cnt++;
        }
    }
    
}
