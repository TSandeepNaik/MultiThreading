package AftermultiThreading;

public class NewThread extends Thread{              // we have to Thread to use its property
    NewThread(){
        start();    // running the thread
    }

    public  void  run (){   // here run the second operation in try and catch block to avoid the exception
        try{
            System.out.println("second part");
            for(int j=10; j>=0; j--){
                System.out.println("value of j is :"+j);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("exception ocuured "+e.getMessage());
        }

    }

}
