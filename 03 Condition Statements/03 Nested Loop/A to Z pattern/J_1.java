/* 
    *
   * *
  *****
 *     *
*       *
*/
import java.util.Scanner;
public class J_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int mid=(num+1)/2;
        for(int row=1;row<=num;row++)
        {
            for(int coloum=1;coloum<=num;coloum++)
            {
               if(coloum==mid || row==1 || (row>mid && coloum==1)||(coloum<mid && row==num))
                   System.out.print("*");   
                else
                    System.out.print((char)32);
            }
            System.out.println();
        }
    }    
}
