//by default Buffer size is 16 and if we know in advance that how much size of buffer 
//we have to need we can send it into constructor.
public class c_increase_capacity_of_buffer {
    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer(100);
        System.out.println(sb1.length());//0
        System.out.println(sb1.capacity());//0 + 100 = 100
    }    
}
