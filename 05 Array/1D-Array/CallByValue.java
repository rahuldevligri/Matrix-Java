class sum
{
    int num = 5;
    public int add(int x)
    {
        x+=num;
        System.out.println("x in add method "+x);
        return x;
    }
}

public class CallByValue 
{
    public static void main(String args[])
    {
        int a=10;
        sum obj = new sum();
        System.out.println("a in main before call"+a);
        obj.add(a);
        System.out.println("a in main after call "+a);
       // obj.show(a);

    }
}
