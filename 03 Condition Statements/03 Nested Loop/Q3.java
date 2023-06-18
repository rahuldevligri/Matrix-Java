/* 
1
12
123
1234
12345
*/
import java.util.Scanner;
public class Q3 {
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
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
