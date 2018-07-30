package main;

public class Command {

    public Position moveForward(Position currentPosition) {
        Position finalPosition;

        finalPosition = new Position(
                currentPosition.getDirectionFacing(),
                incrementYCoordinate(currentPosition.getCoordinates()));

        if (currentPosition.getDirectionFacing().equals("S")) {

            finalPosition = new Position(
                    currentPosition.getDirectionFacing(),
                    decrementYCoordinate(currentPosition.getCoordinates()));
        }

        if (currentPosition.getDirectionFacing().equals("E")) {

            finalPosition = new Position(
                    currentPosition.getDirectionFacing(),
                    incrementXCoordinate(currentPosition.getCoordinates()));
        }

        if (currentPosition.getDirectionFacing().equals("W")) {

            finalPosition = new Position(
                    currentPosition.getDirectionFacing(),
                    decrementXCoordinate(currentPosition.getCoordinates()));
        }

        return finalPosition;
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
