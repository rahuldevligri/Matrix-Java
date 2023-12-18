import java.io.Console;
public class selectionSort {
    public static void main(String[] args){
        Console con = System.console();
        System.out.print("Enter how many names: ");
        int n = Integer.parseInt(con.readLine());
        String[] s = new String[n];
        
        //input
        for(int i=0;i<n;i++){
            System.out.print("Enter name "+(i+1)+" : ");
            s[i]=con.readLine();
        }
        // sorting using selection sort
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(s[i].compareTo(s[j])>0){
                    String t = s[i];
                    s[i]=s[j];
                    s[j]=t;
                }
            }
        }

        //output
        for(String e : s){
            System.out.println(e);
        }
    }
}
