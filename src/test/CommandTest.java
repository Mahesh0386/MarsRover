package test;

import main.Position;
import org.junit.Test;

import main.Command;
import main.Coordinates;

import static org.junit.Assert.assertEquals;

public class CommandTest {

    @Test
    public void moveForward_shouldIncrementY_whenRoverFacingNorth() {
        Command command = new Command();
        Position currentPosition = new Position("N", new Coordinates(1, 1));
        Position endPosition = command.moveForward(currentPosition);

        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(2, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldDecrementY_whenRoverFacingSouth() {

        Command command = new Command();
        Position currentPosition = new Position("S", new Coordinates(1, 1));
        Position endPosition = command.moveForward(currentPosition);

        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldIncrementX_whenRoverFacingEast() {
        Command command = new Command();
        Position currentPosition = new Position("E", new Coordinates(1, 1));
        Position endPosition = command.moveForward(currentPosition);

        assertEquals(2, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldDecrementX_whenRoverFacingWest() {
        Command command = new Command();
        Position currentPosition = new Position("W", new Coordinates(1, 1));
        Position endPosition = command.moveForward(currentPosition);

        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());
    }
}

