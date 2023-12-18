/* Checked Exception -> IOException
in checked exception catch & throws any one is compulsory... 
*/
//error: unreported exception IOException; must be caught or declared to be thrown
import java.io.IOException;
class AgeOP
{
    private int age;
    void setAge(int age) //throws IOException
    {
        if(age<0)
        {
            throw new IOException("Invalid Age");
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
public class checkedExceptionn {
    public static void main(String...args){
        AgeOP a1 = new AgeOP();
        AgeOP a2 = new AgeOP();
        try{
            a1.setAge(19);
            a1.display();

            a2.setAge(-19);
            a2.display();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
}
