//Q6->Find Year is Leap Year or Not Using Logical operator.

public class Q6_LeapYear
    {
        public static void main(String args[])
        {
            int y=2020;
            String ans;
            //if((y%100==0 && y%400==0) || (y%100!=0 && y%4==0))
            if((y%400==0) || (y%100!=0 && y%4==0))
                    ans="Leap Year";
            else
                ans="Not Leap Year";
        System.out.print("Year is "+ ans);
        }
    }
    
