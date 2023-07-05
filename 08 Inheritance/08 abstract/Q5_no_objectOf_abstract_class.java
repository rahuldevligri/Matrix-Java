abstract class A{
    abstract void m1();
}
class B extends A{
    void m1(){
        System.out.println("m1");
    }
}
public class Q5_no_objectOf_abstract_class {
    public static void main(String[] args){
        A a1 = new A();//error: A is abstract; cannot be instantiated
        //     ^
    }
}
