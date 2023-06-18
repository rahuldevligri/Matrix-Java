//Q4->Find Maximum between Four Number.

public class Q4_Max4 {
    
    public static void main(String args[])
    {
        int a=10,b=20,c=30,d=40,max;
        if(a>b)
        {
            if(a>c)
            {
                if(a>d)
                    max=a;
                else
                    max=d;    
            }
            else
            {
                if(c>d)
                    max=c;
                else
                    max=d;
            }
        }
        else
        {
            if(b>c)
            {
                if(b>d)
                    max=b;
                else
                    max=d;    
            }
            else
            {
                if(c>d)
                    max=c;
                else
                    max=d;
            }
        }
        System.out.println("Max is " + max);
    }
}
