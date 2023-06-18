/* 
11111
2222
333
44
5
*/
import java.util.Scanner;
public class Q7 {
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
                System.out.print(6-i);
                j++;
            }
            System.out.println();
            i--;
        }
        
        // int i=1,j=num;
        // while(i<=num)
        // {
        //     j=(num+1)-i;
        //     while(j>=1)
        //     {
        //         System.out.print(i);
        //         j--;
        //     }
        //     System.out.println();
        //     i++;
        // }
    }
    
}
