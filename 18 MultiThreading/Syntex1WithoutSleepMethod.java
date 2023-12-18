class MyThread extends Thread{
    public void run(){
        System.out.println("CT started...");
        for(int i=1;i<=5;i++){
            System.out.println("CT "+i);
        }
        System.out.println("CT Stopped...");
    }
}
public class Syntex1WithoutSleepMethod {
    public static void main(String...args){
        System.out.println("MT started...");
        MyThread t1 = new MyThread();
        t1.start();
        for(int i=1;i<=5;i++){
            System.out.println("MT "+i);
        }
        System.out.println("MT Stopped...");

    }
}
