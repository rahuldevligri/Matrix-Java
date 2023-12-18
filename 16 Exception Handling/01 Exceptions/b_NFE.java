public class b_NFE {
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
C:\rahul>java NFE

C:\rahul>java NFE 5 abc
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:786)
        at NFE.main(NFE.java:5)
 */
