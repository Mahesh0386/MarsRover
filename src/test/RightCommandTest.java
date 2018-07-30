package test;

import main.BackwardCommand;
import main.Position;
import org.junit.Before;
import org.junit.Test;

import main.RightCommand;
import main.Coordinates;

import static org.junit.Assert.assertEquals;

public class RightCommandTest {

    private RightCommand command;

    @Before
    public void setUp() {
        command = new RightCommand();
    }


    @Test
    public void turnRight_shouldTurnSouth_whenDirectionIsEast() {
        Position currentPosition = new Position("E",new Coordinates(0,0));

        Position endPosition = command.turnRight(currentPosition);
        assertEquals("S", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }

    @Test
    public void turnRight_shouldTurnNorth_whenDirectionIsWest() {
        Position currentPosition = new Position("W",new Coordinates(0,0));

        Position endPosition = command.turnRight(currentPosition);
        assertEquals("N", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }

    @Test
    public void turnRight_shouldTurnWest_whenDirectionIsSuth() {
        Position currentPosition = new Position("S",new Coordinates(0,0));

        Position endPosition = command.turnRight(currentPosition);
        assertEquals("W", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }

    @Test
    public void turnRight_shouldTurnEast_whenDirectionIsNorth() {
        Position currentPosition = new Position("N",new Coordinates(0,0));

        Position endPosition = command.turnRight(currentPosition);
        assertEquals("E", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }
}

