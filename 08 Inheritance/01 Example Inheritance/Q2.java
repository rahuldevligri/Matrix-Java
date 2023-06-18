class A{//super or parent class or base class
    private int x;
    void setx(int x1){
        x=x1;
    }
    void displayx(){
        System.out.print(x);//5
    }
}
class B extends A{// sub class or child or derived
    private int y;
    void sety(int y1){
        y=y1;
    }
    void displayy(){
        System.out.print(","+y);//10
    }
}
public class Q2{
    public static void main(String[] args){
        B b1 = new B();
        //b1.x=5; error as x is private
        //b1.y=10; error as y is private
        b1.setx(5);
        b1.sety(10);
        b1.displayx();
        b1.displayy();
    }
}