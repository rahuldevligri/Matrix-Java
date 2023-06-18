class A{
    int x;
    static void m1(){
        A a1= new A();
        a1.x = 5;
        System.out.println(a1.x);
    }
}
public class Q3 {
    public static void main(String[] args){
        A.m1();
    }
}
