//Write a program to sort a String using selection sort.
import java.util.Scanner;
public class sortingUsingStringArray {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Student: ");
        int cnt = sc.nextInt();

        String[] student = new String[cnt];
        sc.nextLine();
        for(int i=0;i<student.length;i++){
            student[i] = sc.nextLine();
        }
        for(int i=0;i<student.length-1;i++){
            for(int j=i+1;j<student.length;j++){
                if(student[i].compareTo(student[j])>0){
                    String temp = student[i];
                    student[i]=student[j];
                    student[j]=temp;
                }
            }
        }
        for(int i=0;i<student.length;i++){
            System.out.println(student[i]);
        }
    }
}
