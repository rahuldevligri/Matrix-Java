class A{
    int x;
    static int y;
}
public class Q1 {
    public static void main(String...args){
        //JVM will provide memory while loading the class in memory
        //default value of static memeber variable = 0
        System.out.println(A.y);//0

        A a1 = new A();
        A a2 = new A();
        A a3 = new A();

        //instance memeber variable
        //also called object variable
        a1.x=5;
        a2.x=6;
        a3.x=7;

        //static member variable
        //its not a good way to use static variable because values are overlap
        a1.y=10;
        a2.y=11;
        a3.y=12;

        System.out.println(a1.x+","+a1.y);//5,12
        System.out.println(a2.x+","+a2.y);//6,12
        System.out.println(a3.x+","+a3.y);//7,12

        A.y=13; //static variable is a class variable so it is a good way to use it
        System.out.println(A.y);//13

        //A.x=9; error its not specifi which object's x is this... 
    }
}
