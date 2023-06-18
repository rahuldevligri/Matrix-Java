/* 
 ****
*
*
*
 **** 
*/
import java.util.Scanner;
public class C_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        for(int row=1;row<=num;row++)
        {
            for(int coloum=1;coloum<=num;coloum++)
            {
                if((row==1 && coloum==1) ||(row==num && coloum==1))
                    System.out.print((char)32);
               else if(coloum==1 || row==num || row==1 )
                   System.out.print((char)42); //42 is an unicode of *
                else
                    System.out.print((char)32); // 32 is an unicode of space
            }
            System.out.println();
        }
    }    
}
