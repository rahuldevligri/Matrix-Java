class A{
    private int x,y;
    public A(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class Q1_HashCode {
    public static void main(String[] args){
        A a = new A(5,6);
        System.out.println(a);//A@7a81197d
    }    
}
