/*Ans
    +ve -> s1>s2
    -ve -> s1<s2
    0   -> s1=s2
*/
public class compareTo {
    public static void main(String[] args){
        String s1 = new String("ravi");
        String s2 = new String("ajay");

        System.out.println(s1.compareTo(s2));//17
        //output 17 <- s1>s2

        System.out.println("ajay".compareTo("ravi"));//-17
        /* Negative
        if s1 = "ajay" & s2 = "ravi" then output -17 <- s1<s2
        */

        System.out.println("ajay".compareTo("ajay"));//0
        /*zero
        if s1 = "ajay" & s2 = "ajay" then output 0 <- s1=s2
        */

        System.out.println("abc".compareTo("abcdefg"));//4
        /* Positive
        if s1 = "abc" & s2 = "abcdefg" then output 4
        */

        System.out.println("abcdefg".compareTo("abc"));//-4
        /*Negative
        if s1 = "abcdefg" & s2 = "abc" then output -4
         */
    }
}
