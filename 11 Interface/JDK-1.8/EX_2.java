interface A{
    //abstract method -> compulsory to override
    void m1();
    void m2();

    //default method -> optional to override
    default void m3(){}
    default void m4(){
        System.out.println("Hello");
    }
}
