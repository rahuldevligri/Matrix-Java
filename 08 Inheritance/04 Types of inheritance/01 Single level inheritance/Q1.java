//single level inheritance & overriding...
import java.util.Scanner;
class A{
    private int x;
    A(){
        x=0;
    }
    A(int x1){
        x=x1;
    }
    void setdata(int x1){
        x=x1;
    }
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valu of x");
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
    void setdata(int x1,int y1){//method overloading name same & argument different...
        setdata(x1);
        y=y1;
    }
    void getdata(){//method overriding same name & same argument...
        super.getdata();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of y ");
        y = sc.nextInt();
    }
    void display(){//method overriding
        System.out.println(","+y);
        super.display();
    }
}
public class Q1 {
    public static void main(String[] args){
        B b1 = new B();
        b1.setdata(5, 10);
        b1.display();

        B b2 = new B(5,10);
        b2.display();

        B b3 = new B();
        b3.getdata();
        b3.display();
    }
}
