//term-> 1 2 3 4 1 2 3 4 1 ....... 
//cnt--> 1 2 3 4 5 6 7 8 9 ....N <--input
import java.util.Scanner;
public class Q5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();
        
        //logic-1-->
        /* 
        int term,cnt;
        term=cnt=1;
        while(cnt<=num)
        {
            System.out.println(term);
            term++;
            cnt++;
            if(term==5)
                term=1;
        }
        */ 

        //logic-2-->
        int i=0;
        while(i<num)
            System.out.println(i++%4+1);

    }
}
