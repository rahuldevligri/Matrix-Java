/*output->  Constructor call
            Constructor call
            Constructor call
jitni baar object create hoga utni baar constructor call hoga...
 */
class A{
    A(){
        System.out.println("Constructor call");
    }
}
public class Q2_create_object_with_giving_them_name {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        //A is a class and and a1,a2,a3 refer A class..
        //new keyword creates object
        //a1,a2,a3 <- reference variable
        //A() <- constructor call
    } 
}
