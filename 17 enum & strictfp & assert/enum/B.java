enum month{
    jan(31),feb(28),mar(31),apr(30);
    private int days;
    month(int days){//parameterize constructor
        this.days = days;
    }
    int days(){
        return days;
    }
}
public class B {
    public static void main(String...args){
        month m1 = month.mar;
        switch(m1){
            case jan:
                System.out.println(m1.days());
                break;
            case feb:
                System.out.println(m1.days());
                break;
            case mar:
                System.out.println(m1.days());//31
                break;
            case apr:
                System.out.println(m1.days());
                break;
        }
    }
}
