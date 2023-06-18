//3rd type -> constructor ke ander bhi initalized kr skte hai
class A{
    final int x;
    A(){
        x=5;
    }
}
public class Q3_TypeOfInitialization_final_instance_variable_3 {
    public static void main(String[] args){
        A a1 = new A();
        System.out.println(a1.x);
    }
}
