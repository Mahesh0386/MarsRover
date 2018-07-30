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
        Position finalPosition = new Position(currentPosition.getDirectionFacing(),
                currentPosition.getCoordinates());

        switch(currentPosition.getDirectionFacing())
        {
            case "N":
            {
                finalPosition.setDirection("W");
                return finalPosition;
            }
            case "S":
            {
                finalPosition.setDirection("E");
                return finalPosition;
            }
            case "W":
            {
                finalPosition.setDirection("S");
                return finalPosition;
            }
            case "E":
            {
                finalPosition.setDirection("N");
                return finalPosition;
            }
            default:
                return finalPosition;

        }


    }

    public Position turnRight(Position currentPosition) {
        Position finalPosition = new Position(currentPosition.getDirectionFacing(),
                currentPosition.getCoordinates());

        switch(currentPosition.getDirectionFacing())
        {
            case "N":
            {
                finalPosition.setDirection("E");
                return finalPosition;
            }
            case "S":
            {
                finalPosition.setDirection("W");
                return finalPosition;
            }
            case "W":
            {
                finalPosition.setDirection("N");
                return finalPosition;
            }
            case "E":
            {
                finalPosition.setDirection("S");
                return finalPosition;
            }
            default:
                return finalPosition;

        }

    }
}
