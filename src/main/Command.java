package main;

import static main.CoordinateManipulator.*;

public class Command {

    public Position moveBackward(Position currentPosition) {


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

    public Position turnLeft(Position currentPosition) {
        Position resPosition = new Position(currentPosition.getDirectionFacing(),
                currentPosition.getCoordinates());

        switch(currentPosition.getDirectionFacing())
        {
            case "N":
            {
                resPosition.setDirection("W");
                return resPosition;
            }
            case "S":
            {
                resPosition.setDirection("E");
                return resPosition;
            }
            case "W":
            {
                resPosition.setDirection("S");
                return resPosition;
            }
            case "E":
            {
                resPosition.setDirection("N");
                return resPosition;
            }
            default:
                return resPosition;

        }


    }

    public Position turnRight(Position currentPosition) {
        Position resPosition = new Position(currentPosition.getDirectionFacing(),
                currentPosition.getCoordinates());

        switch(currentPosition.getDirectionFacing())
        {
            case "N":
            {
                resPosition.setDirection("E");
                return resPosition;
            }
            case "S":
            {
                resPosition.setDirection("W");
                return resPosition;
            }
            case "W":
            {
                resPosition.setDirection("N");
                return resPosition;
            }
            case "E":
            {
                resPosition.setDirection("S");
                return resPosition;
            }
            default:
                return resPosition;

        }

    }
}
