class A{
    private int x,y;
    A(int x1,int y1){
        x=x1;
        y=y1;
    }
    // void setData(int x1,int y1){
    //     x=x1;
    //     y=y1;
    // } 
    void display(){
        System.out.println(x+","+y);
    }
}
public class Q1_noNeedToCreate_setdataMethod {
    public static void main(String[] args){
        A a1 = new A(5,6);
       // a1.setData(5,6);
        a1.display();  
    }
}
