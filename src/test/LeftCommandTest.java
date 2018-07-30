package test;

import main.Coordinates;
import main.LeftCommand;
import main.Position;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeftCommandTest {

    private LeftCommand command;

    @Before
    public void setUp() {
        command = new LeftCommand();
    }

    @Test
    public void turnLeft_shouldTurnNorth_whenDirectionIsEast() {
        Position currentPosition = new Position("E", new Coordinates(1, 1));

        Position endPosition = command.turnLeft(currentPosition);
        assertEquals("N", endPosition.getDirectionFacing());
        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());
    }

    @Test
    public void turnLeft_shouldTurnWest_whenDirectionIsNorth() {
        Position currentPosition = new Position("N", new Coordinates(0, 0));

        Position endPosition = command.turnLeft(currentPosition);
        assertEquals("W", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }

    @Test
    public void turnLeft_shouldTurnEast_whenDirectionIsSouth() {
        Position currentPosition = new Position("S", new Coordinates(0, 0));

        Position endPosition = command.turnLeft(currentPosition);
        assertEquals("E", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }


    @Test
    public void turnLeft_shouldTurnSouth_whenDirectionIsEast() {
        Position currentPosition = new Position("W", new Coordinates(0, 0));

        Position endPosition = command.turnLeft(currentPosition);
        assertEquals("S", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }


}