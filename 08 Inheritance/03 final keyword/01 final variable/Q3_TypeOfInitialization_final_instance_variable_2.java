//2nd type -> alag se block bna ke initalized kr de
class A{
    final int x;
    {
        x=5;
    }
}
public class Q3_TypeOfInitialization_final_instance_variable_2 {
    public static void main(String[] args){
        A a1 = new A();
        System.out.println(a1.x);
    }
}
