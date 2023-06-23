//overriding toString() of Object class...
class A{ //extends Object automatically
    private int x,y;
    public A(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){ //replacement of display method....
        return (x+","+y);
    }
}
public class Q4_overriding_toString_Object_class {
    public static void main(String[] args){
        A a = new A(5,6);
        //System.out.println(a);both are same
        System.out.println(a.toString());//5,6
    }    
}
