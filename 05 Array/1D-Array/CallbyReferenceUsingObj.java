class CallbyReferenceUsingObj{
    int number=10;
    
    // pass object as parameter
    public static void add(CallbyReferenceUsingObj oj){
        oj.number = oj.number+1;  // increment variable by 1
        System.out.println("value in method: "+oj.number);
    }
        
    public static void main(String[] args) {
        // oj is an object of class CallbyReferenceUsingObj
        CallbyReferenceUsingObj oj=new CallbyReferenceUsingObj(); 
        
        System.out.println("value before method call: "+oj.number);
        add(oj); // pass object of the class CallbyReferenceUsingObj
        System.out.println("value after method call: "+oj.number);
    }
}
