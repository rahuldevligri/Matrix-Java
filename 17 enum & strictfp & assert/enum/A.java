
enum days{sun,mon,tue,wed,thu,fri,sat}
        // 0   1   2   3   4   5   6
public class A {
    public static void main(String[]args){
        days d1 = days.mon;
        days d2 = days.tue; //or
        days d3 = days.valueOf("tue");
        System.out.println(d1);//mon
        System.out.println(d1.ordinal());//1
        System.out.println(d1.compareTo(d3));//-1
        for(days d:days.values())
            System.out.println(d);
        switch(d2){
            case sun:
                System.out.println("First");
                break;
            case mon:
                System.out.println("Second");
                break;
            case tue:
                System.out.println("Third");//third
                break;
        }
    } 
}
