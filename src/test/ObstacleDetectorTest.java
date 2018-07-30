package test;

import main.Coordinates;
import main.Obstacles;
import main.Position;
import main.command.ForwardCommand;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ObstacleDetectorTest {

    private ForwardCommand command;
    private List<Obstacles> obstaclesList;

    @Before
    public void setUp() {
        command = new ForwardCommand();
        obstaclesList = new ArrayList<>();
        obstaclesList.add(new Obstacles(2,2));
        obstaclesList.add(new Obstacles(1,3));
    }

    @Test
    public void moveForward_shouldReturnLastPossiblePosition_andReportObstacle()
    {
        Position currentPosition = new Position("N",new Coordinates(1,2));
        Position endPosition =  command.executeCommand(obstaclesList,currentPosition);
        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(2,endPosition.getCoordinates().getY());
        assertEquals("Obstacle Found!",ForwardCommand.isObstacleFound);

    }
}
