class A{//scope = default public
    void m1(){//instance member method, scope = default public
        System.out.println("Hello");
    }
    static void m2(){//static member method, scope = default public
        System.out.println("Bye");
    }
}
public class f_static_instance_method {
    public static void main(String...args){
        A a1=null;
        a1.m1();//NullPointerException
        a1.m2();//No Exception
    }
}

