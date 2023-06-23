class A{//default public class A extends Object automatically
    int x=5;//default public instance member variable
    static int y=6;//default public static member variable
    static void m1(){//default public static memeber method return nothing
        System.out.println("super class");
    }
    void m2(){//default public instance member method return nothing
        System.out.println("super class");
    }
    void m3(){//default public instance member method return nothing
        System.out.println("m3 super class");
    }
}
class B extends A{//parent(A) child(B) relation. single level inheritance
    int x=7;//default public instance member variable
    static int y=8;//default public static member variable
    static void m1(){//default public static memeber method return nothing
        System.out.println("sub class");
    }
    void m2(){//default public instance member method return nothing
        System.out.println("sub class");
    }
    void m4(){//default public instance member method return nothing
        System.out.println("m4 sub class");
    }
}
public class Q2 { // public driver class
    public static void main(String[] args){
        A a1 = new A();
        System.out.println(a1.x);//5
        System.out.println(a1.y);//6
        a1.m1();//super class
        a1.m2();//super class
        a1.m3();//m3 super class
        //a1.m4();//error: cannot find symbol

        B b1 = new B();
        System.out.println(b1.x);//7
        System.out.println(b1.y);//8
        b1.m1();//sub class
        b1.m2();//sub class
        b1.m3();//m3 super class
        b1.m4();//m4 sub class

        A a2 = new B();
        System.out.println(a2.x);//5
        System.out.println(a2.y);//6
        a2.m1();//super class
        a2.m2();//super class
        a2.m3();//m3 super class
        //a2.m4();//error: cannot find symbol

        //B b2 = new A();//error: incompatible types: A cannot be converted to B
    }
}
