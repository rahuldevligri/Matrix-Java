public class Q1_WeekDays {
    public static void main(String args[])
    {
        int n=4;
        String day;
        switch(n)
        {
            case 1:
                day="Sunday";
                break;
            case 2:
                day="Monday";
                break;
            case 3:
                day="Tuesday";
                break;
            case 4:
                day="Wednesday";
                break;
            case 5:
                day="Thursday";
                break;
            case 6:
                day="Friday";
                break;
            case 7:
                day="Saturday";
                break;
            default:
                day="Invalid day";
        }
        System.out.println(day);
    }
}
