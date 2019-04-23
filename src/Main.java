import com.btrace.script.SimpleScript;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Main started");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
                try {
                    Thread.sleep(3000);
                }catch(InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        });

        thread.run();
    }
}
