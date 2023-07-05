/* 
    *
   * *
  *****
 *     *
*       *
*/
import java.util.Scanner;
public class A_3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int mid=(num+1)/2;
        for(int row=1;row<=num;row++)
        {
            for(int space=1;space<=num-row;space++)
                System.out.print((char)32); // 32 is an unicode of space
            for(int coloum=1;coloum<=2*row-1;coloum++)
            {
               if(coloum==1 || row==mid || coloum==2*row-1)
                   System.out.print((char)65); //65 is an unicode of A
                else
                    System.out.print((char)32); // 32 is an unicode of space
            }
            System.out.println();
        }
    }    
}
