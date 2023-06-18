//object counter
class A{
    int cnt; // default value 0
    A(){
        cnt++;
    }
}
public class Q3_ObjectCounter_in_InstanceVariable {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        System.out.println(a1.cnt); //1
        System.out.println(a2.cnt); //1
        System.out.println(a3.cnt); //1


    }
}
