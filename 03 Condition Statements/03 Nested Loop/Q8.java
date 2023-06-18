/* 
1
21
321
4321
54321
*/
import java.util.Scanner;
public class Q8 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int i=1,j;
        while(i<=num)
        {
            j=i;
            while(j>=1)
            {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
    }
    
}
