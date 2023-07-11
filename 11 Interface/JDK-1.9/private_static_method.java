interface A{
    private static void m(){
        System.out.println("only for m1 and m2");
    }
    static void m1(){
        m();
        //------
        //-----
    }
    static void m2(){
        m();
        //------;
        //-----;
    }
}
