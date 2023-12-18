class A{//scope = default public
    void m1(){//instance member method, scope = default public
        System.out.println("Hello");
    }
}
public class b_CTE {
    public static void main(String...args){
        A a1;
        a1.m1();//compile time error not an exception
    }
}
/*
b_CTE.java:9: error: variable a1 might not have been initialized
        a1.m1();//compile time error not an exception
*/
