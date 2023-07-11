class A{
    void m1(){
        class B{
            void m2(){
                System.out.println("Hello");
            }
        }
        B b1 = new B();
        b1.m2();
    }
    public static void main(String[] args){
        A a1 = new A();
        a1.m1();
    }
}

