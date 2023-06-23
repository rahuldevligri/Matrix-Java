import java.io.Console;
class Student{ //extends Object automatically
    //private instance member variables
    private int roll,sub1,sub2;
    private String name;
    private float per;

    public Student(){} //default constructor
    
    public void getdata(){//public instance member method, return type void
        Console con = System.console();
        System.out.print("Enter roll ");
        roll = Integer.parseInt(con.readLine());
        System.out.print("Enter name ");
        name=con.readLine();
        System.out.print("Enter Marks in 2 Subjects ");
        sub1=Integer.parseInt(con.readLine());
        sub2=Integer.parseInt(con.readLine());
    }
    //parameterrized constructor
    public Student(int roll,String name,int sub1,int sub2){
        this.roll = roll;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
    //public instance method calculate percentage
    public void calc_per(){
        per=(sub1+sub2)/2.0f;
    }
    //overriding toString() of Object class
    public String toString(){
        return (roll+"\t"+name+"\t"+sub1+"\t"+sub2+"\t"+per+"%");
    }
}
public class Q5_replacementOf_display_method {
    public static void main(String[] args){
        Student s1 = new Student(101,"Rahul",70,80);
        Student s2 = new Student(102,"Rohit",80,90);
        s1.calc_per();
        s2.calc_per();
        System.out.println("Roll\tName\tSub1\tSub2\tPer");
        System.out.println(s1);
        System.out.println(s2);
    }
}
/* output
Roll    Name    Sub1    Sub2    Per
101     Rahul   70      80      75.0%
102     Rohit   80      90      85.0%
 */