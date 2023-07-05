//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
import java.util.Scanner;
public class Q1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row and coloum: ");
        int row=sc.nextInt();
        int coloum=sc.nextInt();
        int i=1,j=1;
        while(i<=row)
        {
            j=1;
            while(j<=coloum)
            {
                System.out.print(j+"\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
