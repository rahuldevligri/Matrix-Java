/*
卐----卐 卐 卐 
卐----卐-----
卐 卐 卐 卐 卐 
------卐----卐 
卐 卐 卐----卐  
*/
import java.util.Scanner;
public class Swastika
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Odd Number: ");
        int num=sc.nextInt();
        int  mid=(num+1)/2; 
        for(int row=1;row<=num;row++)
        {
            for(int coloum=1;coloum<=num;coloum++)
            {
                if(row==mid||coloum==mid||row==1&&coloum>=mid||coloum==num&&row>=mid||coloum==1&&row<=mid||row==num&&coloum<=mid)
                    System.out.print((char)42); // 43 is an unicode of *
                else
                    System.out.print((char)32); // 32 is an unicode of space
            }
            System.out.println();
        }
    }
}
/*
*---*-*-*
*---*----
*-*-*-*-*
----*---*
*-*-*---*
*/