class Data{
    int x,y; //default public
}
public class Q9_Indirectly_CallByReference_inObject {
    public static void main(String[] args){
        Data d1=new Data();
        d1.x=5;
        d1.y=6;
        Q9_Indirectly_CallByReference_inObject a1 = new Q9_Indirectly_CallByReference_inObject();
        System.out.println("Before swap values are "+d1.x+","+d1.y);
        a1.swap(d1);
        System.out.println("After swap values are "+d1.x+","+d1.y);
    }
    public void swap(Data d2){
        // d2=null;// d2 me null store krne pr d1 me koi changes nhi aayega...
        d2.x=d2.x+d2.y;
        d2.y=d2.x-d2.y;
        d2.x=d2.x-d2.y;
    }
}
