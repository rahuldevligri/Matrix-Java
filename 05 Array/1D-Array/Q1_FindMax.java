//Q1=> Find max in an array
import java.util.Scanner;
public class Q1_FindMax {
    public static void main(String args[])

    {
        Scanner sc = new Scanner(System.in);
        
        //aray size input
        System.out.println("Enter how many Number: ");
        int num=sc.nextInt();
        
        //array Create
        int []a = new int[num];
       
        // array input
        for (int i=0;i<num;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }

        //finding max 
        int max=a[0];
        for(int i=1;i<num;i++)//for(int i=1;i<a.length;i++)--> num ki jgh a.lenght likh skte hai...
        {
            if(a[i]>max)
                max=a[i];
        }
        
        //output
        System.out.println("Max is " + max);

    }
}
