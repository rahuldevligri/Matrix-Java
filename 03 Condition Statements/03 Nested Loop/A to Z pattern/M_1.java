/* 
*   *
** **
* * *
*   *
*   *
*/
import java.util.Scanner;
public class M_1 {
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
               if(coloum==num || coloum==1 || row<=mid && row==coloum||row>=2&&coloum==2*row )
                   System.out.print((char)42); //42 is an unicode of *
                else
                    System.out.print((char)32); // 32 is an unicode of space
            }
            System.out.println();
        }
    }    
}
