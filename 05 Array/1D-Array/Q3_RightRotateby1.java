//Q2-> Left rotate an array by 1
import java.util.Scanner;
public class Q3_RightRotateby1 
{
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);
        
        //aray size input
        System.out.println("Enter how many Number: ");
        int n=sc.nextInt();
        System.out.println(n);
        //array Create
        int []a = new int[n];

        // array input
        for (int i=0;i<n;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        //Right rotate by 1
        int t=a[n-1];//50
        
        //shift by one
        for(int i=n-2;i>=0;i--)
            a[i+1]=a[i];
        
        a[0]=t; //50
        
        //output
        for(int i=0;i<n;i++)
            System.out.println(a[i]+"\t");
    }
}
