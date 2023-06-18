class CallbyReferenceUsingString {
    
    // pass an object of StringBuilder as a parameter
    public static void change(StringBuilder s){
        s.append(" world!"); // add word in s
        System.out.println("value in method: "+s.toString());
    }

    public static void main(String[] args) {
        StringBuilder obj=new StringBuilder("Hello");
        
        System.out.println("value before method call: "+obj.toString());
        change(obj);
        System.out.println("value after method call: "+obj.toString());
        
    }
}