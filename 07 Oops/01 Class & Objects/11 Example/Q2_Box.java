import java.util.Scanner;
class Box{
    private int feet,inches;//instance member variable
    Box(){//default const...
        feet=inches=0;
    } 
    Box(int feet, int inches){ //parameterized const..
       this.feet=feet;
       this.inches=inches;
    }
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Feet: ");
        feet = sc.nextInt();
        System.out.print("Enter Inches: ");
        while(true){
            inches = sc.nextInt();
            if(inches >= 0 && inches <= 11)
                break;
            else
                System.out.print("Invalid Enter again: ");

        }
    }
    void display(){
        System.out.println(feet+"\'"+inches+"\"");
    }
    Box sum(Box b2){
        //Logic-1
         
        Box t = new Box();
        t.feet=this.feet+b2.feet;
        t.inches=this.inches+b2.inches;
        if(t.inches>=12){
            t.inches-=12;
            t.feet++;
        }
        return t;
        

        //Logic-2
        /*
        Box t = new Box(this.feet+b2.feet+(this.inches+b2.inches)/12,(this.inches+b2.inches)%12);
        return t;
        */

        //Logic-3
        // return new Box(this.feet+b2.feet+(this.inches+b2.inches)/12,(this.inches+b2.inches)%12);
    }
}
public class Q2_Box {
    public static void main(String...args){
        Box b1,b2,b3;

        //for test
        b1=new Box(5,9);
        b2=new Box(6,11);

        //OR
        // b1 = new Box();
        // b2 = new Box();
        // b1.getdata();
        // b2.getdata();

        b3=b1.sum(b2);
        System.out.print("Sum is ");
        b3.display();
        
    }
}
