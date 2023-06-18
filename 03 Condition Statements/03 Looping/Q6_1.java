//Q--> 1 -1  1 -1  1.....
import java.util.Scanner;
public class Q6_1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        int i=1;
        while(n>=1)
        {
            System.out.println(i);
            i=-i;
            n--;
        }
    }
}
