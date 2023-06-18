import java.util.Scanner;
class Q4_LeftRotatebyM
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //array size input
        System.out.println("Enter how many elements in an array: ");
        int n=sc.nextInt();
        
        //how many time size input
        System.out.println("Enter how many time you want to rotate: ");
        int m=sc.nextInt();

        //create array
        int []a = new int[n];
        int []t= new int[m];

        //input in a array
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        //Left Rotate by M
        for(int i=0;i<m;i++)
            t[i]=a[i];
        
        //Shift by M
        for(int i=m;i<n;i++)
            a[i-m]=a[i];
        
        // t[0,1,2] store in a[7,8,9]
        for(int i=n-m;i<n;i++)
            a[i]=t[(i-(n-m))];

        //output
        for(int i=0;i<n;i++)
            System.out.println(a[i]+" ");
    }
}
