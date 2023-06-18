class A{
    int x;
    static int y;
    void m1(){
        this.x=5;
        y=6;
        //this.y=6; no need for this.
        //super keyword used 
    }
    static void m2(){
        //this.x=5; 
        y=6;
        //not use super keyword
      A obj = new A();
      obj.x=9;
    }
}
public class Q1{
    public static void main(String...args){
        A a1 = new A();
        A a2 = new A();
        a1.m1();
        //A.m1 error
        a2.m2();
        A.m2();

    }
}