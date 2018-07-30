package test.command;

import main.Coordinates;
import main.Obstacles;
import main.command.ForwardCommand;
import main.Position;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ForwardCommandTest {

    private ForwardCommand command;

    @Before
    public void setUp() {
        command = new ForwardCommand();
    }

    @Test
    public void moveForward_shouldIncrementY_whenRoverFacingNorth() {
        Position currentPosition = new Position("N", new Coordinates(1, 1));
        Position endPosition = command.executeCommand(currentPosition);

        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(2, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldDecrementY_whenRoverFacingSouth() {

        Position currentPosition = new Position("S", new Coordinates(1, 1));
        Position endPosition = command.executeCommand(currentPosition);

        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldIncrementX_whenRoverFacingEast() {
        Position currentPosition = new Position("E", new Coordinates(1, 1));
        Position endPosition = command.executeCommand(currentPosition);

        assertEquals(2, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldDecrementX_whenRoverFacingWest() {
        Position currentPosition = new Position("W", new Coordinates(1, 1));
        Position endPosition = command.executeCommand(currentPosition);

        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldReturnCurrentPosition_whenRoverFacingDirectionIsInvalid() {
        Position currentPosition = new Position("invalid direction", new Coordinates(1, 1));
        Position endPosition = command.executeCommand(currentPosition);

        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());
    }

    @Test
    public void isObstacleFound_shouldReturnLastPossiblePosition_andReportObstacle()
    {
        List<Obstacles> ObstaclesList = new ArrayList<>();
        ObstaclesList.add(new Obstacles(1,2));
        ObstaclesList.add(new Obstacles(2,3));
        Position currentPosition = new Position("N",new Coordinates(1,1));
        boolean isObstacle =  command.isObstaclesFound(ObstaclesList,currentPosition);
        assertEquals(1, currentPosition.getCoordinates().getX());
        assertEquals(1,currentPosition.getCoordinates().getY());
        assertTrue(isObstacle);

    }


}
