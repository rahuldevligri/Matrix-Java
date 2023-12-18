class A{
    int x,y;
    A(int x,int y){
        this.x = x;
        this.y = y;
    }

    boolean equals(A o){
        return (x==o.x && y==o.y);
    }

   /*
    public boolean equals(Object o){
        return (x==((A)o).x && y==((A)o).y);
    }
    */
   
}
public class equalsMethod {
    public static void main(String...args){
        A a1 = new A(5,6);
        A a2 = new A(5,6);
        if(a1.equals(a2))//content compare
        System.out.println("equal");
    else
        System.out.println("no equal");

        String s1 = new String("Rahul");
        String s2 = new String("Rahul");

        if(s1.equals(s2))//content compare
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");


    }
}
