/*
In Java, instanceof is a keyword used for 
checking if a reference variable contains 
a given type of object reference or not.  
*/
class A{
    int x;
}
class B extends A{
    int y;
}
class C extends B{
    int z;
}
class D{
    int m;
}
public class Q1 {
    public static void main(String...args){
        B b1 = new B();
        System.out.println(b1 instanceof B);//true
        System.out.println(b1 instanceof A);//true 
        System.out.println(b1 instanceof C);//false
    //  System.out.println(b1 instanceof D);//error: incompatible types: B cannot be converted to D
    }    
}
