package main.command;

import main.Obstacles;
import main.Position;

import java.util.List;

public class ObstacleDetector {

    public static String isObstacleReporting = "No";
    public boolean isObstaclesFound(List<Obstacles> obstaclesList, Position currentPosition) {
        boolean isObstaclesFound = false;

        if(currentPosition.getDirectionFacing().equals("N")){
                for (Obstacles obstacle : obstaclesList) {
                    if ((currentPosition.getCoordinates().getX() == obstacle.getX()) &&
                            (currentPosition.getCoordinates().getY() + 1 == obstacle.getY())) {
                        isObstaclesFound = true;
                        isObstacleReporting = "Obstacle Found!";

                    }
                }
            }

        else if(currentPosition.getDirectionFacing().equals("S")){
                for (Obstacles obstacle : obstaclesList) {
                    if ((currentPosition.getCoordinates().getX() == obstacle.getX()) &&
                            (currentPosition.getCoordinates().getY() - 1 == obstacle.getY())) {
                        isObstaclesFound = true;
                        isObstacleReporting = "Obstacle Found!";

                    }
                }
            }
        else if(currentPosition.getDirectionFacing().equals("W")){
                for (Obstacles obstacle : obstaclesList) {
                    if ((currentPosition.getCoordinates().getX() - 1 == obstacle.getX()) &&
                            (currentPosition.getCoordinates().getY()  == obstacle.getY())) {
                        isObstaclesFound = true;
                        isObstacleReporting = "Obstacle Found!";

                    }
                }
            }
        else if(currentPosition.getDirectionFacing().equals("E")){
                for (Obstacles obstacle : obstaclesList) {
                    if ((currentPosition.getCoordinates().getX() + 1 == obstacle.getX()) &&
                            (currentPosition.getCoordinates().getY() == obstacle.getY())) {
                        isObstaclesFound = true;
                        isObstacleReporting = "Obstacle Found!";

                    }
                }
            }

        return isObstaclesFound;
    }
}
