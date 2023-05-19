import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING545);
    }

    @Test
    public void hasType() {
        assertEquals(PlaneType.BOEING545, plane.getPlaneType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(120, plane.getPlaneType().getCapacity());
    }


    @Test
    public void hasWeight() {
        assertEquals(750, plane.getPlaneType().getWeight());
    }




}