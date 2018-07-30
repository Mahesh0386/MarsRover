package main.command;

import main.Obstacles;
import main.Position;

import java.util.List;

public interface IObstacles {

    boolean isObstaclesFound(List<Obstacles> ObstaclesList, Position currentPosition);

}
