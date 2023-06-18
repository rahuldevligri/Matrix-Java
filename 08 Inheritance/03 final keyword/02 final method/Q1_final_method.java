//final method can not be override.
class A{
    final void m1(){
        System.out.println("A class method");
    }
}
class B extends A{
    final void m1(){
        System.out.println("B class method");
    }
}
public class Q1_final_method {
    B b1 = new B();
    b1.m1();
    A a1 = new A();
    a1.m1();
}
