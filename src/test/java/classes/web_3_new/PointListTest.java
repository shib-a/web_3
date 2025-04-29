package classes.web_3_new;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PointListTest {
    @Test
    public void testHit() {
        PointList pointList = new PointList();
        assertTrue(pointList.validateHit(0,0,1));
        assertFalse(pointList.validateHit(100,100,1));
        assertTrue(pointList.validateHit(-1,-1,2));
    }
}

