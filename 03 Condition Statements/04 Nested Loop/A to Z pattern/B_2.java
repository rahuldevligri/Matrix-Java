/* 
 * * * * 
 *       *
 * * * * 
 *       *
 * * * *  
*/
import java.util.Scanner;
public class B_2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int i=1,j,mid=(num+1)/2;
        while(i<=num)
        {
            if(i==1 || i==num || i==mid)
                j=4;
            else
                j=num;
            while(j>=1)
            {
                if(j==1 || i==1 || i==num ||j==num ||i==mid )
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                j--;

            }
            System.out.println();
            i++;
        }
    }
    
}
