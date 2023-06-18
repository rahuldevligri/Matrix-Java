class A{
    private int x,y;

    A(){ // default zero argument constructor
        x=y=5;
    }

    A(int n){// parameterized one argument constructor
        x=y=n;
    }

    A(int x,int y){ // parameterized two argument constructor
        this.x=x;
        this.y=y;
    }

    A(int x1,int y1,int z1){ // parameterized two argument constructor
        x=x1;
        y=y1=z1;

    }
    void display(){
        System.out.println(x+","+y);
    }
}
public class Q6_diff_typeOf_constructor {
    public static void main(String...args){
        A a1 = new A();
        a1.display(); //5,5

        A a2 = new A(7);
        a2.display();//7,7

        A a3 = new A(8,9);
        a3.display();//8,9

        A a4 = new A(7,8,9);
        a4.display();//7,9
    }
    
}
