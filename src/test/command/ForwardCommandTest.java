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
    private  List<Obstacles> obstaclesList;
    Position currentPosition;

    @Before
    public void setUp() {
        command = new ForwardCommand();
        obstaclesList = new ArrayList<>();
        obstaclesList.add(new Obstacles(2,2));
        obstaclesList.add(new Obstacles(1,3));
        currentPosition = new Position("N", new Coordinates(1, 1));
    }

    @Test
    public void moveForward_shouldIncrementY_whenRoverFacingNorth() {
        Position endPosition = command.executeCommand(obstaclesList, currentPosition);
        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(2, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldDecrementY_whenRoverFacingSouth() {
        currentPosition.setDirection("S");
        Position endPosition = command.executeCommand(obstaclesList,currentPosition);
        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldIncrementX_whenRoverFacingEast() {
        currentPosition.setDirection("E");
        Position endPosition = command.executeCommand(obstaclesList,currentPosition);

        assertEquals(2, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldDecrementX_whenRoverFacingWest() {
        currentPosition.setDirection("W");
        Position endPosition = command.executeCommand(obstaclesList,currentPosition);

        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveForward_shouldReturnCurrentPosition_whenRoverFacingDirectionIsInvalid() {
        currentPosition.setDirection("X");
        Position endPosition = command.executeCommand(obstaclesList,currentPosition);

        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(1, endPosition.getCoordinates().getY());
    }

}
