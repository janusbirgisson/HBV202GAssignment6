package is.hi.hbv202g.ass6;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarOwnerTest {

    public static final String BEETLE = "Beetle";
    public static final String JOHN_DOE = "John Doe";

    @Test
    public void getName() {
        Car car=new Car(BEETLE);
        CarOwner carOwner = new CarOwner(JOHN_DOE, car);
        assertEquals(JOHN_DOE, carOwner.getName());
    }

}