//Q1-->Write a program to calculate Factorial of N using loop.
import java.util.Scanner;
class Q1_FactorialofN
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt(),fact=1;
        //while loop-->
        while(n>=2)
            fact*=n--; //there n is a postfix so 1st multiply than decrement of n vaue.
        System.out.println("Factorial of " + n + " is " + fact);

        /*do-while loop-->
        do
        {
            fact*=n--;
        }while(n>=2);
        System.out.println("Factorial of " + n + " is " + fact);
        */
        
        /*for loop-->
        for(int i=n;i>=2;i--){
            fact*=i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
        */
    }
}