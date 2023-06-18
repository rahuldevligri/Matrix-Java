class A{
    //instance member variable

    //scope wuthin a classs
    private int x,y;

    // constructor
    //when object creates it invoke automatically...
    //inka return type nhi hota.....
    A(int x,int y1){ //x and y1 are local variable
        this.x=x; //override instance variable
        y=y1; // both are having different name
    }

    //public memeber method 
    //return type-> void means it returns nothing
    public void display(){ //memeber method
        System.out.println(x+","+y);
    }

    //member method 
    //bydefault default public
    //return type-> void means it returns nothing
    void swap(){
        int t=x;
        x=y;
        y=t;
        System.out.println("after swap "+x+","+y);
    }
}
public class Q4_NoNameObjectCallMethod {
    public static void main(String[] args){//driver class
        new A(5,6);//new object create but no method invoke..
        new A(5,6).display();//new object create and only 1 method invoke..
        new A(1,2).swap();//new object create only 1 method invoke...
    }
}
