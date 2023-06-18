/* 
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/
import java.util.Scanner;
public class Q12 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int i,j;
        for(i=num;i>=1;i--)
        {
            
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
