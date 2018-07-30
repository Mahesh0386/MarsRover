package test;

import main.CoordinateManipulator;
import main.Coordinates;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoordinateManipulatorTest {

    private Coordinates currentCoordinates;
    private CoordinateManipulator coordinateManipulator;
    private Coordinates resultantCoordinates;


    @Before
    public void setUp()
    {
        currentCoordinates = new Coordinates(1,1);
        coordinateManipulator = new CoordinateManipulator();
    }

    @Test
    public void decrementXCoordinate_shouldDecrementXCoordinate()
    {
        resultantCoordinates = coordinateManipulator.decrementXCoordinate(currentCoordinates);
        assertEquals(0,resultantCoordinates.getX());
        assertEquals(1,resultantCoordinates.getY());
    }

    @Test
    public void incrementXCoordinate_shouldIncrementXCoordinate()
    {
        Coordinates resultantCoordinates = coordinateManipulator.incrementXCoordinate(currentCoordinates);
        assertEquals(2,resultantCoordinates.getX());
        assertEquals(1,resultantCoordinates.getY());
    }

    @Test
    public void decrementYCoordinate_shouldDecrementYCoordinate()
    {
        Coordinates resultantCoordinates = coordinateManipulator.decrementYCoordinate(currentCoordinates);
        assertEquals(1,resultantCoordinates.getX());
        assertEquals(0,resultantCoordinates.getY());
    }

    @Test
    public void incrementYCoordinate_shouldIncrementYCoordinate()
    {
        Coordinates resultantCoordinates = coordinateManipulator.incrementYCoordinate(currentCoordinates);
        assertEquals(1,resultantCoordinates.getX());
        assertEquals(2,resultantCoordinates.getY());
    }

}


