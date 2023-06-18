
//Q4-->Write a program to print first N natural odd numbers using loop.
import java.util.Scanner;
public class Q4_N_Odd_Num {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt(),i=1;
        while(i<=n)
        {
            System.out.println(2*i-1);
            i++;
        } 
        /*do-while loop-->
        do
        {
            System.out.println(2*i-1);
        }while(i<=n);
        */

        /*for loop-->
        for(i=1;i<=n;i++)
        {
            System.out.println(2*i-1);
        }
       */
    }
}
