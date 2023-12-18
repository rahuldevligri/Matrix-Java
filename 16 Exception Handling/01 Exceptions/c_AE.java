public class c_AE {
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
}
/*
C:\rahul>java AE

C:\rahul>java AE 5 0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at AE.main(AE.java:7)
*/
