public class Q2_MonthDays 
{
    public static void main(String args[])
    {
        int n=7;
        String day;
        switch(n)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day="31 days";
                break;
            case 2:
                day="28 or 29 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day="30 days";
                break;
            default:
                day="Invalid day";    
        }
        System.out.println(day);
    }
}
