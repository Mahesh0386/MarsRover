package test;

import main.Coordinates;
import main.Obstacles;
import main.Position;
import main.command.ForwardCommand;
import main.command.ObstacleDetector;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ObstacleDetectorTest {

    private ObstacleDetector command;
    private List<Obstacles> obstaclesList;

    @Before
    public void setUp() {
        command = new ObstacleDetector();
        obstaclesList = new ArrayList<>();
        obstaclesList.add(new Obstacles(2,2));
        obstaclesList.add(new Obstacles(1,3));

    }

    @Test
    public void isObstaclesFound_shouldReturnCurrentPosition_WhenFacingNorthAndForwardCommand()
    {
        Position currentPosition = new Position("N",new Coordinates(1,2));
        boolean isObstacleFound =  command.isObstaclesFound(obstaclesList,currentPosition);
        assertEquals(1, currentPosition.getCoordinates().getX());
        assertEquals(2,currentPosition.getCoordinates().getY());
        assertEquals("Obstacle Found!",ObstacleDetector.isObstacleReporting);
        assertTrue(isObstacleFound);

    }
    @Test
    public void isObstaclesFound_shouldReturnCurrentPosition_WhenFacingSouthAndForwardCommand()
    {

        Position currentPosition = new Position("S",new Coordinates(1,2));
        obstaclesList.add(new Obstacles(1,1));
        boolean isObstacleFound =  command.isObstaclesFound(obstaclesList,currentPosition);
        assertEquals(1, currentPosition.getCoordinates().getX());
        assertEquals(2,currentPosition.getCoordinates().getY());
        assertEquals("Obstacle Found!",ObstacleDetector.isObstacleReporting);
        assertTrue(isObstacleFound);

    }
    @Test
    public void isObstaclesFound_shouldReturnCurrentPosition_WhenFacingEastAndForwardCommand()
    {
        Position currentPosition = new Position("E",new Coordinates(1,2));
        obstaclesList.add(new Obstacles(2,1));
        boolean isObstacleFound =  command.isObstaclesFound(obstaclesList,currentPosition);
        assertEquals(1, currentPosition.getCoordinates().getX());
        assertEquals(2,currentPosition.getCoordinates().getY());
        assertEquals("Obstacle Found!",ObstacleDetector.isObstacleReporting);
        assertTrue(isObstacleFound);

    }

    @Test
    public void isObstaclesFound_shouldReturnCurrentPosition_WhenFacingWestAndForwardCommand()
    {
        Position currentPosition = new Position("W",new Coordinates(1,2));
        obstaclesList.add(new Obstacles(0,2));
        boolean isObstacleFound =  command.isObstaclesFound(obstaclesList,currentPosition);
        assertEquals(1, currentPosition.getCoordinates().getX());
        assertEquals(2,currentPosition.getCoordinates().getY());
        assertEquals("Obstacle Found!",ObstacleDetector.isObstacleReporting);
        assertTrue(isObstacleFound);

    }
}
