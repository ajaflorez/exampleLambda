package lambda01;

public class Lambda01 {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 1 ...");
            }
        };
        Runnable r2 = () -> System.out.println("Runnable 2 ...");
        
        r1.run();
        r2.run();
    }
    
}
