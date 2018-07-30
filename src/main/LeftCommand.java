package main;

public class LeftCommand {

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
}
