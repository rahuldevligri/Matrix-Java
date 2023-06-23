//Multi level inheritance...
import java.util.Scanner;
class A{
    private int x;
    A(){
        x=0;
    }
    A(int x1){
        x=x1;
    }
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter valu of x ");
        x=sc.nextInt();
    }
    void display(){
        System.out.print(x);
    }
}
class B extends A{
    private int y;
    B(){
        super();//optional
        y=0;
    }
    B(int x1, int y1){
        super(x1);//compulsory
        y=y1;
    }
    void getdata(){//method overriding same name & same argument...
        super.getdata();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of y ");
        y = sc.nextInt();
    }
    void display(){//method overriding
        super.display();
        System.out.print(","+y);
    }
}
class C extends B{
    private int z;
    C(){
        super();//optional
        z=0;
    }
    C(int x1,int y1,int z1){
        super(x1,y1);//compulsory
        z=z1;
    }
     void getdata(){//method overriding same name & same argument...
        super.getdata();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of z ");
        z = sc.nextInt();
    }
    void display(){//method overriding
        super.display();
        System.out.println(","+z);
    }
}

public class Q1 {
    public static void main(String[] args){
        C c1 = new C();
        c1.getdata();
        c1.display();
         
        C c2 = new C(5,10,15);
        c2.display();
    }
}
