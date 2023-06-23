class A{
    A(){}
    void m1(){
        System.out.println("Super");
    }
}
class B extends A{
    B(){}
    void m1(){
        System.out.println("Sub");
    }
}
public class Q1_childReference_parentObject_Example {
    public static void main(String[] args){
        //reference = parent
        //object = parent
        A a = new A();
        a.m1();//super

        //reference = child
        //object = child
        B b = new B();
        b.m1();//sub

        //reference = parent
        //object = child
        A a1 = new B();
        a1.m1();//sub

        //reference = child
        //object = parent
        B b1 = new A();
        b1.m1();//error: incompatible types: A cannot be converted to B
    }
}