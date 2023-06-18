/* 
1
22
333
4444
55555
*/
import java.util.Scanner;
public class Q4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int i=1,j=1;
        while(i<=num)
        {
            j=1;
            while(j<=i)
            {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
