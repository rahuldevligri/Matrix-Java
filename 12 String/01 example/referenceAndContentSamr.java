public class referenceAndContentSamr {
    public static void main(String[] args){
        String s1 = "Rahul";
        String s2 = "Rahul";

        System.out.println(s1==s2);//reference compare
        System.out.println(s1.equals(s2));//content compare

//1 object so there reference and content are same.
//output = true.... 
    }
}
