package com.thoughtworks.marsrover;

public class TurnLeft extends Command {
    @Override
    public Location apply(Location oldLocation) {
        return new Location(oldLocation.getX(), oldLocation.getY(),
                Direction.fromCode((oldLocation.getDirection().getCode() + 1) % 4));
    }
}
