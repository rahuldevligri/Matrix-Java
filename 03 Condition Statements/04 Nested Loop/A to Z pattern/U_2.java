/* 
 *       *
 *       *
 *       *
 *       *
   * * *  
*/
import java.util.Scanner;
public class U_2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int i=1,j,mid=(num+1)/2;
        while(i<=num)
        {
            if(i==num)
                j=num-1;
            else
                j=num;
            while(j>=1)
            {
                if(j==1 ||j==num )
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
