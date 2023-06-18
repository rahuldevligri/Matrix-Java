class A{
    int sum(int a,int b){
        return (a+b);
    }
    float avg(int a, int b){
        return ((a+b)/2.0f);
    }
}
public class Q5 {
    public static void main(String[] args){
        A a1 = new A();//memory = 0byte
        System.out.println(a1.sum(5, 6));//11
        System.out.println(a1.avg(5, 6));//5.5
    }    
}
