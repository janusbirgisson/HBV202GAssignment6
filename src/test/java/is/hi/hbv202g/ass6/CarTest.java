package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    public static final String BEETLE = "Beetle";
    private Car car;



    @Before
    public void makeCarObject() {
        car = new Car(BEETLE);
    }

    @Test
    public void getName() {
        assertEquals(BEETLE, car.getName());
    }

}
