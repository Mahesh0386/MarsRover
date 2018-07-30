package main;

public class Command {

    public Position moveForward(Position currentPosition) {
        Position finalPosition;

        finalPosition = new Position(
                currentPosition.getDirectionFacing(),
                new Coordinates(
                        currentPosition.getCoordinates().getX(),
                        currentPosition.getCoordinates().getY() + 1));

        if (currentPosition.getDirectionFacing().equals("S")) {

            finalPosition = new Position(
                    currentPosition.getDirectionFacing(),
                    new Coordinates(
                            currentPosition.getCoordinates().getX(),
                            currentPosition.getCoordinates().getY() - 1));
        }

        if (currentPosition.getDirectionFacing().equals("E")) {

            finalPosition = new Position(
                    currentPosition.getDirectionFacing(),
                    new Coordinates(
                            currentPosition.getCoordinates().getX() + 1,
                            currentPosition.getCoordinates().getY()));
        }

        if (currentPosition.getDirectionFacing().equals("W")) {

            finalPosition = new Position(
                    currentPosition.getDirectionFacing(),
                    new Coordinates(
                            currentPosition.getCoordinates().getX() - 1,
                            currentPosition.getCoordinates().getY()));
        }

        return finalPosition;
    }
}
