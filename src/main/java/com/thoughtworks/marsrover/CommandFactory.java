package com.thoughtworks.marsrover;

public class CommandFactory {
    public static Command buildBy(String s) {
        switch (s) {
            case "M":
                return new MoveAhead();
            case "L":
                return new TurnLeft();
            case "R":
                return new TurnRight();
            default:
                throw new RuntimeException();
        }
    }
}
