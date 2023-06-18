/* 
1
123
12345
1234567
123456789
*/
import java.util.Scanner;
public class Q10 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int i=1,j=1;
        while(i<=num)
        {
            j=1;
            while(j<=i*2-1)
            {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
