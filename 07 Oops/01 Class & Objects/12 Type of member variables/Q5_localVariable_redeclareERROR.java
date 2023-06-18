/*
error: variable l is already defined in method main(String...)
        for(int l=0;l<=5;l++){
                ^
1 error
 */
public class Q5_localVariable_redeclareERROR {
    public static void main(String...args){
        int l;
        System.out.println(l);
        for(int l=0;l<=5;l++){

        }
    }    
}
