/*
JVM load program in memory while loading it'll create
String objects of all the literals.
*/
public class opposite_String {
    public static void main(String[] args){
        String s="Rahul";
        
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }    
}
