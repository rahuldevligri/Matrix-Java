public class StringConstructors {
    public static void main(String[] args){
        //Constructors

        //Default COnstructor
        String s1=new String();
        System.out.println(s1);//No output
        System.out.println(s1.length());//0

        //copy Constructor
        String s2=new String("abc");
        System.out.println(s2);//abc
        System.out.println(s2.length());//3

        //convert character into String
        char ch[]={'a','b','c','d','e','f','g'};
        String s3=new String(ch);
        System.out.println(s3);//abcdefg

        String s4=new String(ch,2,3);
                        //char , start  , count 
        System.out.println(s4);//cde

        char ch2[]="matrix".toCharArray();
        for(char c:ch2)
            System.out.println(c);
        
        byte[] b2="matrix".getBytes();
        for(byte b:b2)
            System.out.println(b);
    }
}