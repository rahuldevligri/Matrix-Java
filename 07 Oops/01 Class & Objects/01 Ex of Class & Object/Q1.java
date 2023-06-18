class Date{// user define datatype
    //default public
    int day;
    int month;
    int year;
}
public class Q1 {//driver class
    public static void main(String[] args){
        Date dob,doj; //pointer/reference
        
        //new Object Created...
        dob = new Date();
        doj = new Date();

        dob.day =1;
        dob.month=1;
        dob.year=2000;

        doj.day =2;
        doj.month=2;
        doj.year=2020;

        System.out.println("DOB is "+dob.day+"/"+dob.month+"/"+dob.year);
        System.out.println("DOJ is "+doj.day+"/"+doj.month+"/"+doj.year);

    }    
}
