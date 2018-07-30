package test;

import main.Position;
import org.junit.Before;
import org.junit.Test;

import main.Command;
import main.Coordinates;

import static org.junit.Assert.assertEquals;

public class CommandTest {

    private Command command;

    @Before
    public void setUp() {
        command = new Command();
    }

    @Test
    public void moveForward_shouldIncrementY_whenRoverFacingNorth() {
        Position currentPosition = new Position("N", new Coordinates(1, 1));
        Position endPosition = command.moveForward(currentPosition);

        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(2, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldDecrementY_whenRoverFacingSouth() {

        Position currentPosition = new Position("S", new Coordinates(1, 1));
        Position endPosition = command.moveForward(currentPosition);

        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldIncrementX_whenRoverFacingEast() {
        Position currentPosition = new Position("E", new Coordinates(1, 1));
        Position endPosition = command.moveForward(currentPosition);

        assertEquals(2, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldDecrementX_whenRoverFacingWest() {
        Position currentPosition = new Position("W", new Coordinates(1, 1));
        Position endPosition = command.moveForward(currentPosition);

        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldReturnCurrentPosition_whenRoverFacingDirectionIsInvalid() {
        Position currentPosition = new Position("invalid direction", new Coordinates(1, 1));
        Position endPosition = command.moveForward(currentPosition);

        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());
    }


    @Test
    public void moveBackward_shouldDecrementY_whenRoverFacingNorth() {

        Position currentPosition = new Position("N", new Coordinates(1, 1));
        Position endPosition = command.moveBackward(currentPosition);

        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());

    }

}

