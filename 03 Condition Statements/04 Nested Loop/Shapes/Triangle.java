/*
----*
---*-*
--*---*
-*-----*
*********
*/
import java.util.Scanner;
public class Triangle 
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        for(int row=num;row>=1;row--)
        {
            for(int coloum=1;coloum<=2*num-1;coloum++)
            {
                if(coloum==row||coloum==2*num-row||row==1)
                    System.out.print((char)42); // 43 is an unicode of *
                else
                    System.out.print((char)32); // 32 is an unicode of space
            }
            System.out.println();
        }
    }
}
