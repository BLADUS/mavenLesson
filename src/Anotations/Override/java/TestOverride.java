/**
 * @author Vladislav Osada
 * @date 23.04.2023 13:14
 */
public class TestOverride {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("Hello from main Thread");
    }
}
