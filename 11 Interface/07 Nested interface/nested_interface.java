//nested interface
class A {
    interface B{
        void m1();
        void m2();
    }
}
class C implements A.B{
    public void m1(){
        System.out.println("m1 of C");
    }
    public void m2(){
        System.out.println("m2 of C");
    }
}
public class nested_interface {
    public static void main(String[] args){
        A.B b1 = new C();
        b1.m1();
        b1.m2();
    }
}
