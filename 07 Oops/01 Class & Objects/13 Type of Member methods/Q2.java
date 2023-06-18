/*
error: static method can't access instance variable...
solution-1: declare the variable as static.
solution-2: access the variable by creating object.
*/
class A{
    int x;
    //static int x
    static void m1(){
        x=5;
        System.out.println(x);
    }
}
public class Q2 {
    public static void main(String[] args){
        A.m1();
    }
}
