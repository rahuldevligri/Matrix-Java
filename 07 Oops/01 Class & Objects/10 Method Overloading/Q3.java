/*
if more than one match with upcast & same family then it will call the method which is near.
byte > short > int > long > float > double
*/
public class Q3 {
    float sum(float a, float b){
        System.out.println("Float method");
        return a+b;
    } 

    double sum(double a, double b){
        System.out.println("long method");
        return a+b;
    } 
    public static void main(String...args){
        Q3 a1 =  new Q3();
        System.out.println(a1.sum(5,6));
        /* output
           Float method
           11.0
         */
    }
}
