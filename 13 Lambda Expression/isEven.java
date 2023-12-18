interface A{
    boolean even(int n);
}
public class isEven {
    public static void main(String[] args){
        A a1 = (n)->n%2==0;
        System.out.println(a1.even(5));
    }
}
