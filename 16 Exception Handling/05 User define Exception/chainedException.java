class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}
class FeesException extends Exception{
    FeesException(String msg){
        super(msg);
    }
}
class AdmissionFaildException extends Exception{
    AdmissionFaildException(String msg){
        super(msg);
    }
}
class AdmissionOP{
    private int age,fees;
    void setData(int age, int fees) throws AdmissionFaildException{
        if(age<0){
            AgeException e1 = new AgeException("Invalid Age");
            AdmissionFaildException e2 = new AdmissionFaildException("Admission Faild");
            e2.initCause(e1);
            throw e2;
        }
        else if(fees < 10_000){
            FeesException e1 = new FeesException("Fees Not Complete");
            AdmissionFaildException e2 = new AdmissionFaildException("Admission Faild");
            e2.initCause(e1);
            throw e2;
        }
        else{
            this.age = age;
            this.fees = fees;
        }
    }
    void display(){
        System.out.println("Your admission is confirmed");
        System.out.println("Age: "+age);
        System.out.println("Fees: "+fees);
    }
}
public class chainedException {
    public static void main(String...args){
        AdmissionOP a1 = new AdmissionOP();
        try{
            a1.setData(22, 5000);
            a1.display();
        }
        catch(AdmissionFaildException e){
            System.out.println(e.getMessage());
            System.out.println("due to "+e.getCause());
        }
    }
}
