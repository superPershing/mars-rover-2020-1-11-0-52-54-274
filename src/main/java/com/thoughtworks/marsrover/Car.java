package com.thoughtworks.marsrover;

public class Car {
    private Location location;

    public Car(Location location) {
        this.location = location;
    }

    public void process(String command) {
        process(CommandFactory.buildBy(command));
    }

    private void process(Command command) {
        location = command.apply(location);
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Car{" +
                "location=" + location +
                '}';
    }
}
