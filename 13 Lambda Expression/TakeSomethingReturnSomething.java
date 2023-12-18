interface A{
    int sum(int a, int b);
}
public class TakeSomethingReturnSomething {
    public static void main(String...args){
        A a1 = (a,b)->a+b;
        System.out.println(a1.sum(5,6));
    }
}
