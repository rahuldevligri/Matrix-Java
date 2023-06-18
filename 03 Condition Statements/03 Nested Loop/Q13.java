/*
    5
   456
  34567
 2345678
123456789   
*/
import java.util.Scanner;
public class Q13
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        for(int i=num;i>=1;i--)
        {
            for(int j=1;j<=(num*2)-i;j++)
            {
                if(j>=i && j<=num*num-i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
        System.out.println();      
        }
    }
}