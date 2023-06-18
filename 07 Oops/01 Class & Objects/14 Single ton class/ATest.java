// default zero argument constructor ko private isleyai kiya taki class ke bahar koi class A ka object na create kr sake.
//privae constructor class ke bahar call nhi hota hai..
class A{
    private static A obj = null;
    private A(){}//
    static A getObject(){
        if(obj==null){
            obj=new A();
        }
        return obj;
    }
}
public class ATest{
    public static void main(String[] args){
        //A a1 = new A();
        A a1 = A.getObject();
        A a2 = A.getObject();
        System.out.println(a1==a2);//true
    }
}