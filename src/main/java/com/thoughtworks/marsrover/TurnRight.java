package com.thoughtworks.marsrover;

public class TurnRight extends Command {
    @Override
    public Location apply(Location oldLocation) {
        return new Location(oldLocation.getX(), oldLocation.getY(),
                Direction.fromCode((oldLocation.getDirection().getCode() + 3) % 4));
    }
}
