import java.util.Scanner;
class Swap{
    private int a,b;
    public void Setter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        a=sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        b=sc.nextInt();
        sc.close();
        System.out.println("Before Swap.....");
        System.out.println("a=["+a+"] "+"b=["+b+"]");
    }
    public void Swapping(){
        a=a^b;
        b=a^b;
        a=a^b;
    }
    public void Display(){
        System.out.println("a=["+a+"] "+"b=["+b+"]");
    }
}
public class Q4_Swap {
    public static void main(String[] args){
        System.out.println("*_*_*_Swapping_Program_*_*_*");
        Swap  sp = new Swap();

        sp.Setter(); 
        sp.Swapping();
        System.out.println("After Swap.....");
        sp.Display();
    }
}
