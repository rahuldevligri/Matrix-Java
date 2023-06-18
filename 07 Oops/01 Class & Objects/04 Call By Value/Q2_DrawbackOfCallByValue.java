//any changes made in formal parameters will not reflected in actual parameter...
//scope of local variable with in the method or block...
//method can return max. 1 value...
public class Q7_DrawbackOfCallByValue {
    
    public static void main(String[] args){
        int a=5,b=6;//local variable
        //a and b is actual parameter
        Q7_DrawbackOfCallByValue sw = new Q7_DrawbackOfCallByValue();
        sw.swap(a,b);
        System.out.println("in Main a="+a+" b= "+b);
    }
    public  void swap(int x,int y){
        //x and y is formal parameter
        //local variable x and y
        int temp=x;
        x=y;
        y=temp;
        System.out.println("in Swap x="+x+" y= "+y);
    }
}
