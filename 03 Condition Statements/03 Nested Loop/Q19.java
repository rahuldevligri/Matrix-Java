/* 
1
26
370
4813
59245
*/
import java.util.Scanner;
public class Q19 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        for(int i=1,cnt=1;i<=num;cnt++,i++)
        {
            if(cnt==10)
                {
                    cnt=0;
                }
            for(int j=1;j<=i;j++)
            {                
            }
            System.out.print(cnt);
            System.out.println();
        }
    }
    
}
