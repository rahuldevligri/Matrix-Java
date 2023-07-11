//multiple inheritance is allowed in inheritance.
interface A{//default scope = package public
    void m1();
}
interface B{
    void m1();//by default public abstract
    void m2();
}
class C implements A,B{
    public void m1(){//default scope = default public
        //super not for A and not for B.
        //super is object class.
    }
    public void m2(){}
}