//Q-> 9 99 999 9999 .....
//9*10+9=99
//99*10+9=999
import java.util.Scanner;
public class Q8_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        int term=10,cnt=1;
        while(cnt<=n)
        {
            System.out.println(term-1);
            term=term*10;
            cnt++;
        }
    }
}
