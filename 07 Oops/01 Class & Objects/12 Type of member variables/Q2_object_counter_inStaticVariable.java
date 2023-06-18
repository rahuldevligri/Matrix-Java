//object counter in static memeber variable or class variable
class A{
    static int cnt; // default value 0
    A(){
        cnt++;
    }
}
public class Q2_object_counter_inStaticVariable {
    public static void main(String[] args){
        System.out.println(A.cnt); //0
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        System.out.println(A.cnt); //3

    }
}
