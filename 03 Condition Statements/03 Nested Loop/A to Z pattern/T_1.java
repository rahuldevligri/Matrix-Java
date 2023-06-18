/* 
 *       *
 *       *
 * * * * *
 *       *
 *       *
*/
import java.util.Scanner;
public class T_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int i=1,j,mid=(num+1)/2;
        while(i<=num)
        {
           j=1;
            while(j<=num)
            {
                if(i==1 || j==mid )
                    System.out.print("* ");
                else
                    System.out.print("  ");
                j++;

            }
            System.out.println();
            i++;
        }
    }
    
}
