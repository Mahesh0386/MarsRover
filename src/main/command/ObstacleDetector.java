package main.command;

import main.Obstacles;
import main.Position;

import java.util.List;

public class ObstacleDetector {

    public boolean isObstaclesFound(List<Obstacles> obstaclesList, Position currentPosition) {
        boolean isObstaclesFound = false;
        Position currentPos = currentPosition;
        for (Obstacles obstacle : obstaclesList) {
            if ((currentPos.getCoordinates().getX() == obstacle.getX()) &&
                    (currentPos.getCoordinates().getY()+1 == obstacle.getY())) {
                currentPos = currentPosition;
                isObstaclesFound = true;
            }
        }
        return isObstaclesFound;
    }
}
