class A{//super or parent class or base class
    int x;//data is public so not secured
}
class B extends A{// sub class or child or derived
    int y; //extends is a keyword
}
public class Q1{
    public static void main(String[] args){
        B b1 = new B();
        b1.x=5;
        b1.y=10;
        System.out.println(b1.x+","+b1.y); //5,10
    }
}