class A{
    int x=5;
}
public class Q1_Initialize_at_declare {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.x); //5
        System.out.println(a2.x);//5

    }
}
 