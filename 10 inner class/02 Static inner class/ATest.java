class Student{
    static int x =5;
}
public class ATest{
    public static void main(String args[]){
        Student s = new Student(){
            static int x = 10;
        };
        System.out.println(s.x);
    }
}