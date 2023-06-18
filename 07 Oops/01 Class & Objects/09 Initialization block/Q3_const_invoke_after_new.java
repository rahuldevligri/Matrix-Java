//Initialize at declare and Initialization block
//initialization -> top to bottom
//const class me top pe ho ya bottom me always new ke baad end me invoke hoga...

class A{
    A(){
        x=10;
        y=20;
    }

    // System.out.println("A class"); <-class me direct coding krna allowed nhi hai..
       
    int x=2;//Initialize at declare

    {// initialization block
        x=5;
        y=6;
    }

    int y=3;//Initialize at declare

//     A(){
//         x=10;
//         y=20;
//     }
}
public class Q3_const_invoke_after_new {
    public static void main(String...args){
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.x+","+a1.y);//10,20
        System.out.println(a2.x+","+a2.y);//10,20 
    }
}
