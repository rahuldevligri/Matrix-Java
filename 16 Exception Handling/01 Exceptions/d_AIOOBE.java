public class d_AIOOBE {
    public static void main(String[] args){
        int a,b,c;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);

        c=a/b; /*it will throw an object of ArithmeticException class 
if b is 0 and we are not using catch block so program will terminate.*/

        System.out.println("Result: "+c);
        int[] arr={10,20,30};
        System.out.println(arr[3]);

        System.out.println("This will never print");
    }    
}/*
C:\rahul>javac AIOOBE.java

C:\rahul>java AIOOBE 5 2
Result: 2
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        at d_AIOOBE.main(d_AIOOBE.java:12)
*/
