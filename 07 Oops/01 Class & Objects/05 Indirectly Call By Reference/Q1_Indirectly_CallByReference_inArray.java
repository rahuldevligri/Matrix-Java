public class Q8_Indirectly_CallByReference_inArray {
    public static void main(String[] args){
        int[] a = new int[]{10,20,30,40,50};
        Q8_Indirectly_CallByReference_inArray rev = new Q8_Indirectly_CallByReference_inArray();
        rev.reverse(a); 
        for(int x:a){
            System.out.print(x+"\t");
        }
    }
    public void reverse(int[] b){
        // b=null;//b me changes krne se a me koi changes nhi hoga..
        // System.out.println(b);// a ki copy b me store hui hai...
        for(int i=0,j=b.length-1;i<j;i++,j--){
            int temp = b[i];
            b[i]=b[j];
            b[j]=temp;
        }
    }
}
