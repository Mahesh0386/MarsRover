package test;

import main.Position;
import org.junit.Test;

import main.Command;
import main.Coordinates;

import static org.junit.Assert.assertEquals;

public class CommandTest {

    @Test
    public void moveOneUnitForward_whenCommandIsForward_roverFacingNorth() {
        Command command = new Command();
        Position currentPosition = new Position("N", new Coordinates(1, 1));
        Position endPosition = command.moveForward(currentPosition);

        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(2, endPosition.getCoordinates().getY());
    }
}

