/*
1. Recursive constructor call not allowed.
2. When we call a constructor within constructor then we must write that statement at the top.
3. this() will become like this this.A(0)
*/

/*
output->
Hello
Bye
5
 */
class A{
    int x;
    A(){
        //this(0); error due to ercursive
        System.out.println("Hello"); //1st print
    }
    A(int x){
        this(); //must be at the top
        this.x=x;
        System.out.println("Bye");//2nd print
        //this(); error
    }
}
public class Q10_Invoke_const_inside_const {
    public static void main(String[] args){
        A a1 = new A(5);
        System.out.println(a1.x); //3rd print
    }
}
