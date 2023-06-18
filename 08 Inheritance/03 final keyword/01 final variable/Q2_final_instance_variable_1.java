//new will not initialize final instance variable...
class A{
    final int x;//error: variable x not initialized in the default constructor
}
public class Q2_final_instance_variable_1 {
    public static void main(String[] args){
        A a1 = new A();
        a1.x=5;//error: cannot assign a value to final variable x
    }
}
