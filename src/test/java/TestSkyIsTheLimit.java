import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSkyIsTheLimit {
    private int[][] buildings;

    @BeforeEach
    void setpUp() {
        buildings = new int[][] {
                {0,2,3},
                {2,5,3}};

    }

    @Test
    void testBuildings1() {
        int[][] erg = {{0,3},{5,0}};
        assertEquals(erg, SkyIsTheLimit.makeSky(buildings));
    }
}
