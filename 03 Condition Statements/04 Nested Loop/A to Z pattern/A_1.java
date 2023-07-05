/* 
    *
   * *
  *****
 *     *
*       *
*/
import java.util.Scanner;
public class A_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int mid=(num+1)/2;
        for(int row=1;row<=num;row++)
        {
            for(int space=1;space<=num-row;space++)
                System.out.print((char)32);
            for(int coloum=1;coloum<=2*row-1;coloum++)
            {
               if(coloum==1 || row==mid || coloum==2*row-1)
                   System.out.print("*");   
                else
                    System.out.print((char)32);
            }
            System.out.println();
        }
    }    
}
