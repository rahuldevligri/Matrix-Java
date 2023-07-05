abstract class A{
    abstract void m1();
}
class B extends A{
    void m1(){
        System.out.println("m1");
    }
}
public class Q6 {
    public static void main(String[] args){
        A a1 = new B();//Run Time Binding....
        a1.m1();//m1
    }
}
