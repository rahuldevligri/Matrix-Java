import java.util.Scanner;
class Arr{
    private int[] a;
    private int size;

    //for user....
    public void getArray(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        size=sc.nextInt();
        a = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" element ");
            a[i]=sc.nextInt();
        }
        sc.close();
    }

    //for test....
    public void setArray(int ... x){
        a=x;
        size=x.length;
    }
    public void Sort(){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(a[j]<a[i]){
                    a[i]+=a[j];
                    a[j]=a[i]-a[j];
                    a[i]-=a[j];
                }
            }
        }
    }
    public void Reverse(){
        for(int i=0,j=size-1;i<j;i++,j--){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
        }
    }
    public void Display(){
        for(int x:a){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
public class Q5_Sort_Reverse_Display {
   public static void main(String[] args){
    Arr ar = new Arr();
   // ar.setArray(5,1,2,4,3); //for test
    ar.getArray(); //for user
    System.out.println("Sorted Array...");
    ar.Sort();
    ar.Display();
    System.out.println("Reversed Array...");
    ar.Reverse();
    ar.Display();
   } 
}
