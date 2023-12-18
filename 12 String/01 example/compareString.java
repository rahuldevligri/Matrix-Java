public class compareString {
    public static void main(String[] args){
        String s1 = new String("Rahul");
        String s2 = new String("Rahul");

        //wrong
        if(s1==s2)// == compare address of s1 and s2
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

        //correct
         if(s1.equals(s2))// equals() compare content of s1 and s2
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

    }
}
