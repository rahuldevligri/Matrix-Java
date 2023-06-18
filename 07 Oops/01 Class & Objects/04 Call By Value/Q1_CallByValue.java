//Example of call By Value.....
public class Q7_CallByValue {
    public static void main(String[] args){
        int a=5,b=6,ans;
        ans=add(a,b);
        System.out.println(ans);
    }
    public static int add(int x,int y){
        int sum = x+y;
        return sum;
    }
}
