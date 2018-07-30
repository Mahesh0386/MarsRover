package main.command;

import main.Obstacles;
import main.Position;

import java.util.List;

import static main.CoordinateManipulator.*;

public class ForwardCommand implements IObstacles {

    public static String isObstacleFound = "No";
    public Position executeCommand( List<Obstacles> obstaclesList,Position currentPosition)
    {
        switch (currentPosition.getDirectionFacing()) {
            case "N":
                if(!isObstaclesFound(obstaclesList, currentPosition)){
                    isObstacleFound = "Obstacle Found!";
                    System.out.println(isObstacleFound);
                    return currentPosition;
                }
                return new Position(
                        currentPosition.getDirectionFacing(),
                        incrementYCoordinate(currentPosition.getCoordinates()));
            case "S":
                return new Position(
                        currentPosition.getDirectionFacing(),
                        decrementYCoordinate(currentPosition.getCoordinates()));
            case "E":
                return new Position(
                        currentPosition.getDirectionFacing(),
                        incrementXCoordinate(currentPosition.getCoordinates()));
            case "W":
                return new Position(
                        currentPosition.getDirectionFacing(),
                        decrementXCoordinate(currentPosition.getCoordinates()));
            default:
                return currentPosition;
        }
    }

    private boolean isObstaclesFound(List<Obstacles> obstaclesList, Position currentPosition) {
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
