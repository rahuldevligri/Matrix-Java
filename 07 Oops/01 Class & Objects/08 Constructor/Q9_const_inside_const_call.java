/*
how to call both const. without making 2nd object.?
 */
/*
error->
1st error-> A(5);
error: cannot find symbol
        A(5);
        ^
  symbol:   method A(int)
  location: class A
1 error
 
2nd error->this(5);
error: call to this must be first statement in constructor
       this(5);
           ^

3rd error: this();
 error: recursive constructor invocation
    A(){
    ^
           */
/*step-1-> jab bhi 1 const. me 2nd call krna chate ho to usse this ke naam se call kr le...
step-2-> call to this must be first statement in constructor.. 
step-3-> default wale ko parameterrize wala call nhi krna chchhiye wrna recursive call ho jayegi...
*/
/*
output->
Parameterized
Default
 */
class A{
    A(){ 
        this(5);
        System.out.println("Default");//2nd print
       // A(5);<- error_1: can't find symbol
       //this(5);<- error_2: call to this must be first statement in constructor
    }
    A(int x){
        //this();<- error_3: recursive constructor invocation
        System.out.println("Parameterized");//1st print
    }
}
public class Q9_const_inside_const_call {
    public static void main(String...args){
        A a1 = new A();
    }
}
