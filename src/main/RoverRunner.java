package main;

import main.command.BackwardCommand;
import main.command.ForwardCommand;
import main.command.LeftCommand;
import main.command.RightCommand;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RoverRunner {
    public static void main(String[] args) {
        ForwardCommand forwardCommand = new ForwardCommand();
        BackwardCommand backwardCommand = new BackwardCommand();
        LeftCommand leftCommand = new LeftCommand();
        RightCommand rightCommand = new RightCommand();
        //readInput();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter current position (x,y) of the Rover. Ex: 2 3 N");
            int coordinates[] = new int[2];
            coordinates[0] = scanner.nextInt();
            coordinates[1] = scanner.nextInt();


            String direction = String.valueOf(scanner.next().charAt(0));
            System.out.println(direction);
            if ((direction.equalsIgnoreCase("N") || direction.equalsIgnoreCase("S") ||
                    direction.equalsIgnoreCase("E") || direction.equalsIgnoreCase("W"))) {
                Position position = new Position(direction, new Coordinates(coordinates[0], coordinates[1]));

                System.out.println("Detecting obstacles and Calculating maximum positions...\nPlease wait!");
                //+ generateObstacles()+ calculateMaximumCoordinates());;
                System.out.println(".\n.\n.\n.");
                System.out.println("Enter command for Rover commands");
                String roverCommands = scanner.next().toUpperCase();

                List<Obstacles> obstaclesList = new ArrayList<>();
                obstaclesList.add(new Obstacles(2, 2));
                obstaclesList.add(new Obstacles(1, 30));
                for (int i = 0; i < roverCommands.length() - 1; i++) {
                    String command = String.valueOf(roverCommands.charAt(i));
                    if (command.equalsIgnoreCase("F"))
                        position = forwardCommand.executeCommand(obstaclesList, position);
                    else if (command.equalsIgnoreCase("B"))
                        position = backwardCommand.executeCommand(position);
                    else if (command.equalsIgnoreCase("L"))
                        position = leftCommand.executeCommand(position);
                    else if (command.equalsIgnoreCase("R"))
                        position = rightCommand.executeCommand(position);
                    else {
                        System.out.println("Command is Invalid!");
                    }
                }
                System.out.println("Rover is located at : " + position.getCoordinates().getX() + "," + position.getCoordinates().getY() + " Facing : " + position.getDirectionFacing());
            } else {
                System.out.println("Enter valid direction");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input is Invalid!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
