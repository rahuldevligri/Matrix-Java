//Q8-> Find Second Maximum between Three Number using if else if.
public class Q8_2ndMaxOf3No {
    public static void main(String args[])
    {
        int a=10,b=20,c=30,max,smax;
        if(a>b)
        {
            max=a;
            smax=b;
        }
        else
        {
           max=b;
           smax=a;
        }
        if(c>max)
            smax=max;
        else if(c>smax)
            smax=c;
    System.out.println("Second Max is " + smax);
    }
}
