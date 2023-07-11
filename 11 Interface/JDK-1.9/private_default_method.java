interface A{
    private default void m(){
        System.out.println("only for m1 and m2");
    }
    default void m1(){
        m();
        //------
        //-----
    }
    default void m2(){
        m();
        //------;
        //-----;
    }
}
