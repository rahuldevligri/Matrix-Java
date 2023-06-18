import java.util.Scanner;
public class Q2_powerofN {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.print("Enter power: ");
        int p = sc.nextInt();
        int x=n;
        //while loop-->
        while(p>1)
        {
            x*=n;
            p--;
        }
    System.out.print(x);

        /* do-while loop-->
        do
        {
            x*=n;
            p--;
        }while(p>1);
    System.out.print(x);
        */

        /*for loop-->
        for(int i=p;i>1;i--)
        {
            x*=n;
        }
    System.out.print(x);while(p>1);
        */
    }
}
