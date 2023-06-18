/*Fibbonachi Series = Sum of previous two term.
terms->  0    1     1    2    3    5     8     13......
         t1 + t2 = sum   ^    ^
              t1 + t2 = sum   |
                   t1 + t2 = sum                       
cnt->   1     2     3    4    5    6     7      8......N
*/

import java.util.Scanner;
public class Q9_Fibbonachi_Series {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("***Fibbonachi Series***");
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        int t1=0,t2=1,cnt=1,sum=0;
        while(cnt<=n)
        {
            System.out.println(t1);
            sum=t1+t2;
            t1=t2;
            t2=sum;
            cnt++;
        }
    }
    
}
