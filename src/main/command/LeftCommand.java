package main.command;

import main.Position;

public class LeftCommand implements ICommand {

    public Position executeCommand(Position currentPosition) {
        Position finalPosition = new Position(currentPosition.getDirectionFacing(),
                currentPosition.getCoordinates());

        switch (currentPosition.getDirectionFacing()) {
            case "N": {
                finalPosition.setDirection("W");
                return finalPosition;
            }
            case "S": {
                finalPosition.setDirection("E");
                return finalPosition;
            }
            case "W": {
                finalPosition.setDirection("S");
                return finalPosition;
            }
            case "E": {
                finalPosition.setDirection("N");
                return finalPosition;
            }
            default:
                return finalPosition;

        }


    }
}
