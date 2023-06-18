class Date{// user define datatype
    private int day;
    private int month;
    private int year;
    
    void setDate(int d, int m, int y){
        if(d>=1&&d<=31||m>=1&&m<=12){
            day=d;
            month=m;
            year=y;
        }
        else{
            System.out.println("Invalid Data!..");
        }
    }

    int getDay(){
        return day;
    }
    int getMonth(){
        return month;
    }
    int getYear(){
        return year;
    }

}
public class Q2 {//driver class
    public static void main(String[] args){
        Date dob,doj; //pointer/reference
        
        //new Object Created...
        dob = new Date();
        doj = new Date();

        dob.setDate(1, 1, 2000);

        doj.setDate(2, 2, 2020);

        System.out.println("DOB is "+dob.getDay()+"/"+dob.getMonth()+"/"+dob.getYear());
       System.out.println("DOJ is "+doj.getDay()+"/"+doj.getMonth()+"/"+doj.getYear());

    }    
}
