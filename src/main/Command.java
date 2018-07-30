package main;

public class Command {

    public Position moveForward(Position currentPosition) {
        return new Position(currentPosition.getDirectionFacing(),
                new Coordinates(currentPosition.getCoordinates().getX(),
                        currentPosition.getCoordinates().getY() + 1));
    }
}
