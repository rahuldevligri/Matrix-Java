
 interface A{
    int fact(int n);
}
public class FactOf5 {
    public static void main(String...args){
        A a1 = (n)->{
            int f = 1;
            for(int i=n;i>=1;i--)
                f=f*i;
            return f;
        };
        System.out.println(a1.fact(5));
    }
}
