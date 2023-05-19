import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){pilot = new Pilot("Sheila", CabinCrewRanks.CAPTAIN, "3233");}

    @Test
    public void hasName(){
        assertEquals("Sheila", pilot.getName());
    }

    @Test
    public void canSetName(){
        pilot.setName("Henry");
        assertEquals("Henry", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(CabinCrewRanks.CAPTAIN, pilot.getCabinCrewRanks());
    }

    @Test
    public void canSetRank(){
        pilot.setCabinCrewRanks(CabinCrewRanks.FIRST_OFFICER);
        assertEquals(CabinCrewRanks.FIRST_OFFICER, pilot.getCabinCrewRanks());
    }

    @Test
    public void hasLicense(){
        assertEquals("3233", pilot.getPilotLicenceNumber());
    }

    @Test
    public void canSetLicense(){
        pilot.setPilotLicenceNumber("9655");
        assertEquals("9655", pilot.getPilotLicenceNumber());
    }

    @Test
    public void canFly(){
        assertEquals("We're in the air!", pilot.pilotIsFlying());
    }

}
