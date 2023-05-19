import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){ passenger = new Passenger("Harry", 2);}

    @Test
    public void passengerHasName(){
        assertEquals("Harry", passenger.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test public void canSetPassengerName(){
        passenger.setName("Tim");
        assertEquals("Tim", passenger.getName());
    }

    @Test public void canSetPassengerBags(){
        passenger.setNumberOfBags(1);
        assertEquals(1, passenger.getNumberOfBags());
    }

}
