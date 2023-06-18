import java.util.Scanner;
class Student{
    private int total=0,rollno=0;
    private int[] subject = new int[5];
    private float per;
    private String name;

    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll no: ");
        rollno = sc.nextInt();
        System.out.println("Enter Student Name: ");
        sc.nextLine();
        name = sc.nextLine();
        for(int i=0;i<subject.length;i++){
            System.out.println("Enter Subject "+(i+1)+"Marks ");
            subject[i]=sc.nextInt();
        }
    }
    public void Percentage(){
        for(int x: subject){
            total+=x;
        }
        per=(float)(total / subject.length);
    }
    public void Display(){
        System.out.println(rollno+"\t"+name+"\t"+subject[0]+"\t"+subject[1]+"\t"+subject[3]+"\t"+subject[4]+"\t"+per+"\t");
    }
}
public class Q6_StudentDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total No of Student: ");
        int std=sc.nextInt();
        Student s[] = new Student[std];//Array of references not objects
        for(int i=0;i<s.length;i++){
            s[i] = new Student();//new object created
            s[i].getData();
            s[i].Percentage();
        }
        System.out.println("Roll\tName\tSub1\tSub2\tSub3\tSub4\tSub5\tPer");
        for(int i=0;i<s.length;i++){
            s[i].Display();
        }
    }
}

// public class Q6_StudentDetails {
//     public static void main(String[] args){
//         Student s1 = new Student();
//         Student s2 = new Student();
//         s1.getData();
//         s1.Percentage();
// System.out.println("Roll\tName\tSub1\tSub2\tSub3\tSub4\tSub5\tPer");
//         s1.Display();

//         s2.getData();
//         s2.Percentage();
// System.out.println("Roll\tName\tSub1\tSub2\tSub3\tSub4\tSub5\tPer");
//         s2.Display();

//     }
// }
