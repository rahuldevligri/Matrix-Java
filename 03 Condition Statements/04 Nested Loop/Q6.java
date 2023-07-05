/* 
54321
4321
321
21
1
*/
import java.util.Scanner;
public class Q6 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int i=1,j=num;
        while(i<=num)
        {
            j=(num+1)-i;
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
