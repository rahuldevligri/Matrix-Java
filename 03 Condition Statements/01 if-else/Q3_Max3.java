//Q3-> Find Maximum between Three Number.

public class Q3_Max3 {
    public static void main(String args[])
    {
        int a=10,b=20,c=5,max;
        if(a>b)
        {
            if(a>c)
                max=a;
            else
                max=c;
        }
        else
        {
            if(b>c)
                max=b;
            else
                max=c;
        }
        System.out.println("Max is " + max);
    }
}