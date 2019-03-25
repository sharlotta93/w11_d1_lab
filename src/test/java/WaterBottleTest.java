import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle();
    }

    @Test
    public void hasStartVolume() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void hasDrinkingFunction() {
        assertEquals(90, bottle.drink());
    }

    @Test
    public void hasEmptyFunction() {
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void hasFillFunction() {
        bottle.empty();
        assertEquals(100, bottle.fill());
    }

}
