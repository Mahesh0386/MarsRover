package main.command;

import main.Position;

import static main.CoordinateManipulator.decrementXCoordinate;
import static main.CoordinateManipulator.incrementXCoordinate;

public class BackwardCommand implements ICommand {

    @Override
    public Position executeCommand(Position currentPosition) {

        switch (currentPosition.getDirectionFacing()) {
            case "N":
                return new Position(
                        currentPosition.getDirectionFacing(),
                        decrementXCoordinate(currentPosition.getCoordinates()));
            case "S":
                return new Position(
                        currentPosition.getDirectionFacing(),
                        incrementXCoordinate(currentPosition.getCoordinates()));
            case "E":
                return new Position(
                        currentPosition.getDirectionFacing(),
                        decrementXCoordinate(currentPosition.getCoordinates()));
            case "W":
                return new Position(
                        currentPosition.getDirectionFacing(),
                        incrementXCoordinate(currentPosition.getCoordinates()));
            default:
                return currentPosition;
        }
    }
}
