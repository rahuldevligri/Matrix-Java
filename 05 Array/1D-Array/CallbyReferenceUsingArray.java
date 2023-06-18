class CallbyReferenceUsingArray{
    
    // pass array of type int as a parameter
    public static void add(int[] number){
        number[0] = number[0]+1;  // increment first element of an array by 1
        System.out.println("value in method: "+number[0]);
    } 
    public static void main(String[] args) {
        int[] num=new int[1]; // create an array of size 1
        num[0]=10; // assign value to fist element of an array
        System.out.println("value before method call: "+num[0]);
        add(num);
        System.out.println("value after method call: "+num[0]);
        
    }
}
