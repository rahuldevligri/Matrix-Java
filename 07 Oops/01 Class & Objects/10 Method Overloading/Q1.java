//no overloading because there is onlu one method...
/*
output -> 
11.0
11.0
*/
public class Q1 {
    float sum(float a, float b){
        return a+b;
    }    
    public static void main(String...args){
        Q1 a1 =  new Q1();

        System.out.println(a1.sum(5,6));//upcast
        System.out.println(a1.sum(5.0f,6.0f));//exact match
        // System.out.println(a1.sum(5,6,7));//error
        // System.out.println(a1.sum(5.0,6.0));//downcast is not allowed...
    }
}
