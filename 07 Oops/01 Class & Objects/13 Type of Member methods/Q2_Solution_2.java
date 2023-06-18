/*
error: static method can't access instance variable...
solution-2: access the variable by creating object.
*/
public class Q2_Solution_2{
    int x;
    public static void main(String[] args){
        Q2_Solution_2 a1 = new Q2_Solution_2();
        System.out.println(a1.x);//0
    }
}