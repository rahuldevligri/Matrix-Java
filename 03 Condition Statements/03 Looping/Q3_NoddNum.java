//Q3-->Write a program to print first N natural odd numbers using loop.
import java.util.Scanner;
public class Q3_NoddNum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt(),term,cnt;
        term = cnt = 1;
        while(cnt<=n)
        {
            System.out.println(term);
            term+=2;
            cnt++;
        } 
        /*do-while loop-->
        do
        {
            System.out.println(term);
            term+=2;
            cnt++;
        }while(cnt<=n);
        */

        /*for loop-->
        for(int i=cnt;i<=n;i++)
        {
            System.out.println(term);
            term+=2;
        }
       */
    }
}
