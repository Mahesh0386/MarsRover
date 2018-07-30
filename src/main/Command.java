package main;

public class Command {

    public Position moveForward(Position currentPosition) {

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

    private Coordinates decrementXCoordinate(Coordinates currentCoordinates) {
        return new Coordinates(
                currentCoordinates.getX() - 1,
                currentCoordinates.getY());
    }

    private Coordinates incrementXCoordinate(Coordinates currentCoordinates) {
        return new Coordinates(
                currentCoordinates.getX() + 1,
                currentCoordinates.getY());
    }

    private Coordinates decrementYCoordinate(Coordinates currentCoordinates) {
        return new Coordinates(
                currentCoordinates.getX(),
                currentCoordinates.getY() - 1);
    }

    private Coordinates incrementYCoordinate(Coordinates currentCoordinates) {
        return new Coordinates(
                currentCoordinates.getX(),
                currentCoordinates.getY() + 1);
    }
}
