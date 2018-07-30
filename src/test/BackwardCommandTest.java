package test;

import main.command.BackwardCommand;
import main.Coordinates;
import main.Position;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackwardCommandTest {

    private BackwardCommand command;

    @Before
    public void setUp() {
        command = new BackwardCommand();
    }

    @Test
    public void moveBackward_shouldDecrementY_whenRoverFacingNorth() {

        Position currentPosition = new Position("N", new Coordinates(1, 1));
        Position endPosition = command.executeCommand(currentPosition);

        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());

    }

    @Test
    public void moveBackward_shouldDecrementY_whenRoverFacingSouth() {

        Position currentPosition = new Position("S", new Coordinates(1, 1));
        Position endPosition = command.executeCommand(currentPosition);

        assertEquals(2, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());

    }

    @Test
    public void moveBackward_shouldDecrementX_whenRoverFacingEast() {

        Position currentPosition = new Position("E", new Coordinates(1, 1));
        Position endPosition = command.executeCommand(currentPosition);

        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());

    }

    @Test
    public void moveBackward_shouldIncrementX_whenRoverFacingWest() {

        Position currentPosition = new Position("W", new Coordinates(1, 1));
        Position endPosition = command.executeCommand(currentPosition);

        assertEquals(2, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());

    }

}