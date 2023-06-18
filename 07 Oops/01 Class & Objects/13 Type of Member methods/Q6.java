class A{
    static int sum(int a,int b){
        return (a+b);
    }
    static float avg(int a, int b){
        return ((a+b)/2.0f);
    }
}
public class Q6 {
    public static void main(String[] args){
        System.out.println(A.sum(5, 6));//11
        System.out.println(A.avg(5, 6));//5.5
    }    
}
