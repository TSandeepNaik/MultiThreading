package AftermultiThreading;

public class MainClass {
    public static void main(String[] args) {
        // here crate the object for the newThread class to run that code simultaneously
        NewThread newthread = new NewThread();

        // here run the first code in try and catch block
        try{
            System.out.println("first code");
            for(int i=0; i<10; i++){
                System.out.println("i value is "+i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("exception occured :"+e.getMessage());
        }

    }
}
