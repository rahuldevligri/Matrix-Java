// Abstract Class & method
/*
1. abstract method ki body nahi hoti only declare hote hai...
2. abstract method ko call nhi kar skte...
3. jis class me 1 method bhi abstract ho hame us class ko bhi abstract krna hota hai...
4. abstract class ke reference bn jatae hai but object nhi bnte...

*/
/*
RTB me jis class ka object hota hai us class ke method call hote hai.
*/
import java.util.Scanner;

abstract class Shape{
    final float PI = 3.131f;

    abstract void getdata();
    abstract void calc_area();
    abstract void display();

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
public class Q1_abstract_class_and_method {
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
