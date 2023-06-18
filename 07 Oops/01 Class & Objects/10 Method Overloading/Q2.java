/*
Rules of method calling->
1. Exact Match.
2. Match with upcast.
3. if more than one match using upcast then priority will be given to same family.
   Integer Family = byte, short, int, long
   Float Family = float, double
4. if more than one match with upcast & same family then it will call the method which is near.
    byte > short > int > long > float > double

*/
public class Q2 {
    float sum(float a, float b){
        System.out.println("Float method");
        return a+b;
    } 
    float sum(long a, long b){
        System.out.println("long method");
        return a+b;
    } 
    public static void main(String...args){
        Q2 a1 =  new Q2();
        System.out.println(a1.sum(5,6));
        /* output
           long method
           11.0
         */
    }
}
