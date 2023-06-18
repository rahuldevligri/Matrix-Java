public class Q11_WeekDays {
    public static void main(String args[])
    {
        int n=6;
        String day;
            if(n==1)
                day="Sunday";
            else if(n==2)
                day="Monday";
            else if(n==3)
                day="Tuesday";
            else if (n==4)
                day="Wednesday";
            else if(n==5)
                day="Thursday";
            else if(n==6)
                day="Friday";
            else
                day="Invalid day";
        System.out.println(day);
    }
}
