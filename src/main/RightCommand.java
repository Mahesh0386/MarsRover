package main;

public class RightCommand {

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
