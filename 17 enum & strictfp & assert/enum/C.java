//WAP to input Day Day and display day name...
import java.util.Scanner;
enum days{sun,mon,tue,wed,thu,fri,sat};
public class C {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of the Day in 3 words: ");
        days day = days.valueOf(sc.nextLine());
        switch (day){
            case sun:
                System.out.println("1 day");
                break;
            case mon:
                System.out.println("2 day");
                break;
            case tue:
                System.out.println("3 day");
                break;
            case wed:
                System.out.println("4 day");
                break;
            case thu:
                System.out.println("5 day");
                break;
            case fri:
                System.out.println("6 day");
                break;
            case sat:
                System.out.println("7 day");
                break;
        }
    }
}
