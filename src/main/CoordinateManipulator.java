package main;

public class CoordinateManipulator {

    public static Coordinates decrementXCoordinate(Coordinates currentCoordinates) {
        return new Coordinates(
                currentCoordinates.getX() - 1,
                currentCoordinates.getY());
    }

    public static Coordinates incrementXCoordinate(Coordinates currentCoordinates) {
        return new Coordinates(
                currentCoordinates.getX() + 1,
                currentCoordinates.getY());
    }

    public static Coordinates decrementYCoordinate(Coordinates currentCoordinates) {
        return new Coordinates(
                currentCoordinates.getX(),
                currentCoordinates.getY() - 1);
    }

    public static Coordinates incrementYCoordinate(Coordinates currentCoordinates) {
        return new Coordinates(
                currentCoordinates.getX(),
                currentCoordinates.getY() + 1);
    }
}
