class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}
class AgeOP
{
    private int age;
    void setAge(int age) throws AgeException
    {
        if(age<0)
        {
            throw new AgeException("Invalid Age");
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
public class userDefineAgeException {
    public static void main(String...args){
        AgeOP a1 = new AgeOP();
        AgeOP a2 = new AgeOP();
        try{
            a1.setAge(19);
            a1.display();

            a2.setAge(-19);
            a2.display();
        }
        catch(AgeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
}
