import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Reece", CabinCrewRanks.CAPTAIN);}

    @Test
    public void hasName(){
        assertEquals("Reece", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(CabinCrewRanks.CAPTAIN, cabinCrewMember.getCabinCrewRanks());
    }

    @Test
    public void canSetName(){
        cabinCrewMember.setName("Tim");
        assertEquals("Tim", cabinCrewMember.getName());
    }

    @Test
    public void canSetRank(){
        cabinCrewMember.setCabinCrewRanks(CabinCrewRanks.FIRST_OFFICER);
        assertEquals(CabinCrewRanks.FIRST_OFFICER, cabinCrewMember.getCabinCrewRanks());
    }





}

