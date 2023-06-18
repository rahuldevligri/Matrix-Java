public class Q1_diff_Between_local_and_instance_variable_using_this_keyword {
    int x=5;//member instance variable
    void m1(){
        int x=10;//local variable
        System.out.println(x);//10
        System.out.println(this.x);//5
    }
    public static void main(String[] args){
        Q1_diff_Between_local_and_instance_variable_using_this_keyword a1 = new Q1_diff_Between_local_and_instance_variable_using_this_keyword();
        a1.m1();
    }
}
