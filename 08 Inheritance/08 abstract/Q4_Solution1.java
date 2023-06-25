/*
Solution-1-> class B ko static kr de..
but we cann't create object of class B
 */
abstract public class Q4_Solution1 {
    abstract void m1();
}
static class B extends Q4_Solution1 {//error: modifier static not allowed here

}

