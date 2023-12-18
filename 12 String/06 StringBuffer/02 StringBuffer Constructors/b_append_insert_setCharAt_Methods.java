public class b_append_insert_setCharAt_Methods {
    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer("matrix");
        System.out.println(sb1.length());//6
        System.out.println(sb1.capacity());//16 + 6 = 22
        sb1.append(" Education");
        System.out.println(sb1);//matrix Education
        sb1.insert(6," Computer");
        System.out.println(sb1);//matrix Computer Education
        sb1.setCharAt(0, 'M');
        System.out.println(sb1);//Matrix Computer Education
        System.out.println(sb1.capacity());//46
    }    
}
