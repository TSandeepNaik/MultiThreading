package BeforeMultiThreading;

public class Demo1 {
    public static void main(String[] args) {

        System.out.println("first part");
        for(int i=0; i<=10; i++){
            System.out.println("value of i is :"+i);
        }

        System.out.println("second part");
        for(int j=10; j>=0; j--){
            System.out.println("value of j is :"+j);
        }
    }
}
