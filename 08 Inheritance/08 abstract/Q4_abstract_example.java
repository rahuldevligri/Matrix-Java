abstract public class Q4_abstract_example {
    abstract void m1();
}
class B extends Q4_abstract_example{

}
/*
error: B is not abstract and does not override abstract method m1() in Q4
class B extends Q4{
^
1 error
*/