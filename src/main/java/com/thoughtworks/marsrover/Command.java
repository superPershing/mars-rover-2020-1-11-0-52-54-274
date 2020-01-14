package com.thoughtworks.marsrover;

public abstract class Command {
    public abstract Location apply(Location oldLocation);
}
