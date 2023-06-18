import java.util.Scanner;
class Complex{
    private int real,imag;//private instance member variable 
    
    Complex(){} //default constructor

    Complex(int real, int imag){//parameterized constructor
        this.real=real;
        this.imag=imag;
    }
    void getdata(){//memeber method 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real:");
        real=sc.nextInt();
        System.out.println("Enter img:");
        imag=sc.nextInt();
    }
    void display(){//member method
        if(imag>0)
            System.out.println(real+"s+"+imag+"i");
        else
        System.out.println(real+""+imag+"i");
    }
    Complex sum(Complex c){
        /*
        Complex t = new Complex();
        t.real=this.real+c.real;
        t.imag=this.imag+c.imag;
        return t;
        */
        // OR
        /*
        Complex t = new Complex(this.real+c.real,this.imag+c.imag);
        return t;
        */
        //OR   annonymous object
        return new Complex(this.real+c.real,this.imag+c.imag); 
    }
    Complex mult(Complex c){
        Complex t = new Complex();
        t.real=this.real*c.real - this.imag*c.imag;
        t.imag=this.real*c.imag + c.real*this.imag;
        return t;
    }
}
public class Q1_Add_and_Multi_two_complexNumbers {
    public static void main(String...args){
        Complex c1,c2,c3,c4;
        
        // c1=new Complex(5,4);
        // c2=new Complex(3,2);
        
        //OR
        c1=new Complex();
        c2=new Complex();
        c1.getdata();
        c2.getdata();
        
        c3=c1.sum(c2);
        System.out.print("Sum is ");
        c3.display();

        c4=c1.mult(c2);
        System.out.print("Product is ");
        c4.display();
    }
}
