public class substring_charAt {
    public static void main(String[] args){
        String s1 = "matrix";
        for(int i=0; i<=s1.length();i++){
            System.out.println(s1);
            s1=s1.substring(1)+s1.charAt(0);
        }
    }
}
