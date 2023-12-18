interface A {
    void sayHello();
}
public class TakeNothingReturnNothing {
    public static void main(String...args){
        A a1 = () -> System.out.println("Hello");
        a1.sayHello();//Runtime Bunding
    }

}
