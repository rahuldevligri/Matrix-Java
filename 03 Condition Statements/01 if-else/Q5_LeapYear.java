//Q5->Find Year is Leap Year or Not.
public class Q5_LeapYear 
{
    public static void main(String args[])
    {
        int y=2020;
        String ans;
        if(y%100==0)
        {
            if(y%400==0)
                ans="Leap Year";
            else
                ans="Not Leap Year";
        }
        else
        {
        if(y%4==0)
            ans="Leap Year";
        else
            ans="Not Leap Year";
        }
    System.out.print("Year is "+ ans);
    }
}
