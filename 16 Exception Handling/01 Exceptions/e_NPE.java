class A{//scope = default public
    void m1(){//instance member method, scope = default public
        System.out.println("Hello");
    }
}
public class e_NPE {
    public static void main(String...args){
        A a1=null;
        a1.m1();//NullPointerException
    }
}
/*
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "A.m1()" because "<local1>" is null
        at e_NPE.main(e_NPE.java:9)
*/

