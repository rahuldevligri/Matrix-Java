class MyMath{
    static int sum(int a, int b){
        return (a+b);
    }
    static float avg(int a, int b){
        return((a+b)/2.0f);
    }
}
public class Q4 {
    public static void main(String[] args){
        System.out.println(MyMath.sum(5,6));
        System.out.println(MyMath.avg(5, 6));
    }
}
