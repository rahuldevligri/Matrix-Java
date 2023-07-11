abstract class A{
    abstract void m1();
}
public class Q1{
    public static void main(String[] args){
        new A(){
            void m1(){
                System.out.print("Hello");
            }
        }.m1();
    }
}

