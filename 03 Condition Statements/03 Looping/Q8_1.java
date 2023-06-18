//Q-> 9 99 999 9999 .....
//9*10+9=99
//99*10+9=999
    import java.util.Scanner;
    public class Q8_1
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a Number: ");
            int n=sc.nextInt();
            int term=9,cnt=1;
            while(cnt<=n)
            {
                System.out.println(term);
                term=term*10+9;
                cnt++;
            }
        }
    }
    