//Initialize at declare and Initialization block
//initialization -> top to bottom

class A{
    int x=2;//Initialize at declare

    {// initialization block
        x=5;
        y=6;
    }

    int y=3;//Initialize at declare
}
public class Q2_Initialize_at_declare_and_Initialization_block {
    public static void main(String...args){
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.x+","+a1.y);//5,3
        System.out.println(a2.x+","+a2.y);//5,3 
    }
}
