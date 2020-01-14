package com.thoughtworks.marsrover;

public class MoveAhead extends Command {
    @Override
    public Location apply(Location oldLocation) {
        if (oldLocation.getDirection() == Direction.N) {
            return new Location(oldLocation.getX(), oldLocation.getY() + 1, oldLocation.getDirection());
        }
        if (oldLocation.getDirection() == Direction.E) {
            return new Location(oldLocation.getX() + 1, oldLocation.getY(), oldLocation.getDirection());
        }
        if (oldLocation.getDirection() == Direction.S) {
            return new Location(oldLocation.getX(), oldLocation.getY() - 1, oldLocation.getDirection());
        }
        if (oldLocation.getDirection() == Direction.W) {
            return new Location(oldLocation.getX() - 1, oldLocation.getY(), oldLocation.getDirection());
        }
        throw new RuntimeException();
    }
}
