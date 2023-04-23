import org.junit.Test;

/**
 * @author Vladislav Osada
 * @date 16.04.2023 13:57
 */
public class MyMathTest {

    @Test(expected = ArithmeticException.class)
    public void shouldExceptionZero(){
        MyMath.divide(10,1);
    }
}
