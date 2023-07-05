//print table 1 to N
import java.util.Scanner;
public class Q2_Tables {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int i=1,j=1;
        while(i<=num)
        {
            j=1;
            while(j<=10)
            {
                System.out.print(i*j+"\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
