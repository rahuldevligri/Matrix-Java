import java.util.Scanner;
class Date{
    private int day,month,year;

    public void setData(String sms){
        Scanner sc = new Scanner(System.in);
        System.out.println(sms);
        System.out.println("Enter Date: ");
        day = sc.nextInt();
        System.out.println("Enter Month: ");
        month = sc.nextInt();
        System.out.println("Enter Year: ");
        year = sc.nextInt();
        
    }
    public void Display(String msg){
        System.out.println(msg+day+"/"+month+"/"+year);
    }
}
public class Q3_TestData {
    public static void main(String[] args){
        Date dob = new Date();
        Date doj = new Date();
        dob.setData("Enter DOB Data...");
        doj.setData("Enter DOJ Data...");
        dob.Display("DOB is: ");
        doj.Display("DOJ is: ");
    }
}
