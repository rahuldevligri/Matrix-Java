class A{
    int x;

    {// initialization block
        x=5;
        y=6;
    }

    int y;
}
public class Q2_Initialization_block {
    public static void main(String...args){
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.x+","+a1.y);//5,6
        System.out.println(a2.x+","+a2.y);//5,6 
    }
}
