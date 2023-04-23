/**
 * @author Vladislav Osada
 * @date 23.04.2023 13:14
 */
public class MyThread extends Thread{

    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello from MyThread");
    }

}
