import org.junit.Test;

/**
 * @author Vladislav Osada
 * @date 16.04.2023 14:00
 */
public class RunnerTest {

    @Test(timeout = 1000)
    public void runShouldOneSecond(){
        Runner.run();
    }
}
