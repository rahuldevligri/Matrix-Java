//multilevel inheritance
interface A{
    void m1();
}
interface B extends A{
    void m2();
}
public class multi_level_inheritance implements A,B {

    public void m1(){

    }
    public void m2(){

    }
}
