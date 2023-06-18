//Q2-> Left rotate an array by 1
import java.util.Scanner;
public class Q2_LeftRotateby1 
{
    public static void main(String args[])
    { Scanner sc = new Scanner(System.in);
        
        //aray size input
        System.out.println("Enter how many Number: ");
        int n=sc.nextInt();
        
        //array Create
        int []a = new int[n];

        // array input
        for (int i=0;i<n;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        //left rotate by 1
        int t=a[0];

        //shift by one
        for(int i=1;i<n;i++)
            a[i-1]=a[i];
        a[n-1]=t;

        //output
        for(int i=0;i<n;i++)
            System.out.println(a[i]+"\t");
    }
}
