//interface or abstract class is generally used in Dynamic Binding/RTB
import java.util.Scanner;
interface Mobile{
    void Call();
    void Sms();
}
class BSNL implements Mobile{
    public void Call(){
        System.out.println("Call Made using BSNL sim...");
    }
    public void Sms(){
        System.out.println("Sms send using BSNL sim...");
    }
}
class JIO implements Mobile{
    public void Call(){
        System.out.println("Call Made using JIO sim...");
    }
    public void Sms(){
        System.out.println("Sms send using JIO sim...");
    }
}
public class RTB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Mobile mobile;
        System.out.print("Enter 1. for BSNL\n2. for JIO\nEnter your choice: ");
        int ch = sc.nextInt();
        if(ch==1)
            mobile = new BSNL();
        else if (ch == 2)
            mobile= new JIO();
        else{
            System.out.println("Invalid choice...");
            mobile = new JIO();
        }

        mobile.Call();
        mobile.Sms();
    }
}
