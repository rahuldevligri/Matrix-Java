public class e_delete_method {
    public static void main(String[] args){
        StringBuffer sb5 = new StringBuffer("matrix");
        sb5.delete(2, 5);
        System.out.println(sb5);//max

        sb5.deleteCharAt(0);
        System.out.println(sb5);//ax
    }
}
