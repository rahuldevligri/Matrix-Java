public class equalsIgnoreCase {
    public static void main(String[] args){
        String s1 = new String("rahul");
        String s2 = new String("RAHUL");

        //case sensitive
        System.out.println(s1.equals(s2));//false
        
        //case insensitive
        System.out.println(s1.equalsIgnoreCase(s2));//true

    }
    
}
