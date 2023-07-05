/* 
 * * * * *
 * 
 * * * * *
 * 
 * * * * * 
*/
import java.util.Scanner;
public class E_2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int i=1,j;
        while(i<=num)
        {
            j=1;
            System.out.print("* ");
            while(j<=num-1)
            {
               if(i%2!=0)
                   System.out.print("* ");
               j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
