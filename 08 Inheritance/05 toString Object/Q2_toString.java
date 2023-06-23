class A { //extends Object automatically
    private int x,y;
    public A(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class Q2_toString {
    public static void main(String[] args){
        A a = new A(5,6);
        //System.out.println(a);both are same
        System.out.println(a.toString());//A@7a81197d
    }    
}
