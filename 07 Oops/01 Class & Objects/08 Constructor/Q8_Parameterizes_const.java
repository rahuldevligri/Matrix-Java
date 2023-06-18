/*jis class me khud ka const.nhi hota 
const. will add default const. automatically...

*/
class A{
    A(int n){
        System.out.println("Parameterized Const..");
    }
}
public class Q8_Parameterizes_const {
    public static void main(String[] args){
//        A a1 = new A(); //error
/*
error: constructor A in class A cannot be applied to given types;
        A a1 = new A();
               ^
    required: int
    found:    no arguments
    reason: actual and formal argument lists differ in length
1 error
*/
        A a1=new A(5);//Parameterized Const..
    }
}
