package main.command;

import main.Obstacles;
import main.Position;

import java.util.List;

import static main.CoordinateManipulator.*;

public class ForwardCommand implements ICommand,IObstacles {

    public Position executeCommand(Position currentPosition) {

        switch (currentPosition.getDirectionFacing()) {
            case "N":
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

    @Override
    public boolean isObstaclesFound(List<Obstacles> ObstaclesList,Position currentPosition) {
        boolean isObstaclesFound = false;
        Position currentPos = currentPosition;
        for (Obstacles obstacle : ObstaclesList) {

            if ((currentPos.getCoordinates().getX() == obstacle.getX()) &&
                    (currentPos.getCoordinates().getY()+1 == obstacle.getY())) {
                currentPos = currentPosition;
                isObstaclesFound = true;
            }
        }
        return isObstaclesFound;
    }
}
