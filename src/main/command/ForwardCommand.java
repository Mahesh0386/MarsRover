package main.command;

import main.Obstacles;
import main.Position;

import java.util.List;

import static main.CoordinateManipulator.*;

public class ForwardCommand implements IObstacles {


    public Position executeCommand( List<Obstacles> obstaclesList,Position currentPosition)
    {
        ObstacleDetector obstacleDetector = new ObstacleDetector();

        switch (currentPosition.getDirectionFacing()) {
            case "N":
                if(obstacleDetector.isObstaclesFound(obstaclesList, currentPosition)){
                    System.out.println(ObstacleDetector.isObstacleReporting);
                    return currentPosition;
                }
                else{
                return new Position(
                        currentPosition.getDirectionFacing(),
                        incrementYCoordinate(currentPosition.getCoordinates()));
                }
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



}
