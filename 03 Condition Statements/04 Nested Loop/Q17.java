/*
________________________________________________ 
|row|space coloum | num | row | space | coloum | row = 1 to num; | space = 1 to 4;   | coloum = 1 to 9
| 1 |123456789    |  5  |  1  |   4   |  1 - 1 | row <= num;     | space <= num-row; | coloum <= 2*row-1;
| 2 |-1234567     |     |  2  |   3   |  1 - 3 | row++;          | space++;          | coloum++;
| 3 |--12345      |     |  3  |   2   |  1 - 5 |
| 4 |---123       |     |  4  |   1   |  1 - 7 |
| 5 |----1        |     |  5  |       |  1 - 9 |
|___|_____________|_____|_____|_______|________|

*/
import java.util.Scanner;
public class Q17
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        for(int row=num;row>=1;row--)
        {
            for(int space=1;space<=num-row;space++)
                System.out.print((char)32);
            for(int coloum=1;coloum<=2*row-1;coloum++)
                System.out.print(coloum);
        System.out.println();      
        }
    }
}