public class d_chatAt {
    public static void main(String[] args){
        StringBuffer sb4 = new StringBuffer("matrix");
        for(int i=0;i<sb4.length();i++)
            System.out.print(sb4.charAt(i));//matrix

        System.out.println();

        for(int i=sb4.length()-1;i>=0;i--)
            System.out.print(sb4.charAt(i));//xirtam

        sb4.reverse();  
        System.out.println(sb4);//xirtamxirtam
    }
}
