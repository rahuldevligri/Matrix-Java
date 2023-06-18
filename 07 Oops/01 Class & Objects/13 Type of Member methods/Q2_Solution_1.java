/*
error: static method can't access instance variable...
solution-1: declare the variable as static.
*/
public class Q2_Solution_1{
    static int x;
    public static void main(String[] args){
        System.out.println(x);//0
    }
}