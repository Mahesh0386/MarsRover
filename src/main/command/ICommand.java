package main.command;

import main.Position;

public interface ICommand{

    Position executeCommand(Position currentPosition);
}
