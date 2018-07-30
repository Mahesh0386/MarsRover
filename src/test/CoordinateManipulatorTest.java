package test;

import main.CoordinateManipulator;
import main.Coordinates;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoordinateManipulatorTest {

    @Test
    public void decrementXCoordinate_shouldDecrementXCoordinate()
    {
        Coordinates currentCoordinates = new Coordinates(1,1);
        CoordinateManipulator coordinateManipulator = new CoordinateManipulator();
        Coordinates resultantCoordinates = coordinateManipulator.decrementXCoordinate(currentCoordinates);

        assertEquals(0,resultantCoordinates.getX());
        assertEquals(1,resultantCoordinates.getY());
    }

}


