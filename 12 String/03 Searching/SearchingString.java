//Write a program to search a string?
//not a case sensitive because both strings are converted to toLoverCase()
import java.io.Console;
public class SearchingString {
    public static void main(String[] args){
        Console con = System.console();
        String s1,s2;
        System.out.print("Enter a line: ");
        s1=con.readLine().toLowerCase();
        System.out.print("Enter substring to search: ");
        s2=con.readLine().toLowerCase();

        int pos=0,cnt=0;
        while((pos=s1.indexOf(s2,pos))!=-1){
            pos++;
            System.out.println("Found at pos "+pos);
            cnt++;
        }
        System.out.print("Found "+cnt+" times");
    }    
}
