interface A{
    float PI = 3.141f;//by default = public static
    //to help sub classes
    static int sum(int a, int b){//by default scope = public 
        return (a+b);
    }
}
