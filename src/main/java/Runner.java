/**
 * @author Vladislav Osada
 * @date 16.04.2023 14:00
 */
public class Runner {
   static public void run(){
       try {
           Thread.sleep(1500);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       System.out.println("Он побежал");
        return;
    }
}
