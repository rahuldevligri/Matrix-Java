/*
final variable can be initialized while declare or it can be initialize later also.
 */
public class Q1_final_local_variable_2 {
    public static void main(String[] args){
        final float PI;//uninitialized
        PI = 3.141f;// 1st value copy allowed
        PI = 50;//2nd value copy error
    //error: variable PI might already have been assigned

    }    
}
