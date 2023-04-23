import org.junit.*;

/**
 * @author Vladislav Osada
 * @date 16.04.2023 13:43
 */
public class VectorTest {
    private final double EPS = 1e-9;
    private static Vector vector;

    @BeforeClass
    public static void createNewVector() {
        System.out.println("Before method");
        vector = new Vector();
    }

    @After
    public void InitVector() {
        System.out.println("after Method");
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        System.out.println("test method");
        //EPS(1e-9) 0.00000...0001
        Assert.assertEquals(0, vector.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        System.out.println("test method");
        Assert.assertEquals(0, vector.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        System.out.println("test method");
        Assert.assertEquals(0, vector.getY(), EPS);
    }

}
