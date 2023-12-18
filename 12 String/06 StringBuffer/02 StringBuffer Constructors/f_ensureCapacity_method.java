public class f_ensureCapacity_method {
    public static void main(String[] args){
        StringBuffer sb6 = new StringBuffer(100);
        sb6.ensureCapacity(80);//80 is lower then 100
        System.out.println(sb6.capacity());//100

        sb6.ensureCapacity(120);//120 is higher then 100
        System.out.println(sb6.capacity());//202
    }
}
