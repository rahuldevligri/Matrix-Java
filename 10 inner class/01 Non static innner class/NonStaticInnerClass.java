class A{
    int x = 5;//instance member
    
    class B{
        int y =6;
        void m1(){
            System.out.print(x);
            System.out.print(y);
        }
    }
    void m2(){
        System.out.print(x);
        //System.out.print(y);
        B b1 = new B();
        System.out.print(b1.y);
        b1.m1();
    }
}
public class NonStaticInnerClass {
    public static void main(String...args){
        A a1 = new A();
        System.out.print(a1.x);
        a1.m2();

        A.B b1 = a1.new B();
        //      or
        A.B b2 = new A().new B();

        System.out.print(b1.y);
        b1.m1();
    }
}