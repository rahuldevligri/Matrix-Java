// Run Time Binding...
/*
Rule ->
1. parent ka object and child ka reference
2. instance member method...
*/
/*
RTB me jis class ka object hota hai us class ke method call hote hai.
*/
import java.util.Scanner;
class Shape{
    final float PI = 3.131f;

    //dummy define
    void getdata(){}
    void calc_area(){}
    void display(){}

}
class Circle extends Shape{
    private int r;
    private float area;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        r=sc.nextInt();
    }
    void calc_area(){
        area = PI*r*r;
    }
    void display(){
        System.out.println("Area is "+area);
    }
}
class Rectangle extends Shape{
    private int l,b,area;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length");
        l=sc.nextInt();
        System.out.print("Enter breadth");
        b=sc.nextInt();
    }
    void calc_area(){
        area = l*b;
    }
    void display(){
        System.out.println("Area is "+area);
    }
}
public class Q4_RTB_dummyDefine_Method {
    public static void main(String[] args){
        Shape s1;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shape like circle, rectangle...");
        name=sc.next();
        switch(name){
            case "circle":
                s1 = new Circle();
                break;
            case "rectangle":
                s1 = new Rectangle();
                break;
            default:
                s1 = new Circle();
        }
        //Run Time Binding...
        s1.getdata();
        s1.calc_area();
        s1.display();
    }
}
