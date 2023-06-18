//how to create new object without without giving them name.

/*output->  Constructor call
            Constructor call
            Constructor call
objects create but object ka koi naam nhi hai is leyai 
baadme object ki class ke method ko apn cll nhi kr skte ...
 */
class A{
    A(){
        System.out.println("Constructor call");
    }
}
public class Q3_without_Making_Reference_Variable_Object_Creating {
    public static void main(String[] args){
        new A();
        new A();
        new A();
        //new keyword creates object
        //A() <- constructor call...
    } 
}

