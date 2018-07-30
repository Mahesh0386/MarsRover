package test;

import main.Position;
import org.junit.Before;
import org.junit.Test;

import main.command.RightCommand;
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

        Position endPosition = command.executeCommand(currentPosition);
        assertEquals("S", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }

    @Test
    public void turnRight_shouldTurnNorth_whenDirectionIsWest() {
        Position currentPosition = new Position("W",new Coordinates(0,0));

        Position endPosition = command.executeCommand(currentPosition);
        assertEquals("N", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }

    @Test
    public void turnRight_shouldTurnWest_whenDirectionIsSuth() {
        Position currentPosition = new Position("S",new Coordinates(0,0));

        Position endPosition = command.executeCommand(currentPosition);
        assertEquals("W", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }

    @Test
    public void turnRight_shouldTurnEast_whenDirectionIsNorth() {
        Position currentPosition = new Position("N",new Coordinates(0,0));

        Position endPosition = command.executeCommand(currentPosition);
        assertEquals("E", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }
}

