/* 
 * * * * *
 * * * *
 * * *
 * *
 *  
*/
import java.util.Scanner;
public class Q9 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int i=num,j;
        while(i>=1)
        {
            j=1;
            while(j<=i)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
    
}
