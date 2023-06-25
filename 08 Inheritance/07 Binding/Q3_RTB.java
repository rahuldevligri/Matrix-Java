import java.util.Scanner;
class Shape{
    final float PI = 3.131f;

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
public class Q3_RTB {
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
        s1.getdata();//error: cannot find symbol
        s1.calc_area();//error: cannot find symbol
        s1.display();//error: cannot find symbol
    }
}
