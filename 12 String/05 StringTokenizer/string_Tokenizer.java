/* StringTokenizer class
1. just like split method of string
2. multiple seperators are allowed
*/
import java.util.StringTokenizer;
public class string_Tokenizer {
    public static void main(String[] args){
        String s1 = "Mohan,Das:Karam,Chand,Gandhi";
        StringTokenizer st = new StringTokenizer(s1,",:");
        System.out.println(st.countTokens());//5
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            System.out.println(t);
        }
    }
}
