/*Unchecked Exception -> AE, AIOOBE, NPE, NPE
in unchecked exception catch & throws both are optional. 
 */
class AgeOP
{
    private int age;
    void setAge(int age) //throws ArithmeticException
    {
        if(age<0)
        {
            throw new ArithmeticException("Invalid Age");
        }
        else
        {
            this.age = age;
            System.out.println("Success");
        }
    }
    public void display() {
        System.out.println("Age: "+age+" is valid");
    } 
}
public class uncheckedExceptionn {
    public static void main(String...args){
        AgeOP a1 = new AgeOP();
        AgeOP a2 = new AgeOP();
        try{
            a1.setAge(19);
            a1.display();

            a2.setAge(-19);
            a2.display();
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
}
