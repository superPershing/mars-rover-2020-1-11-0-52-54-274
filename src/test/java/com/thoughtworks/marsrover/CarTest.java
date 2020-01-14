package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void should_move_ahead() {
        Location location = new Location(0, 0, Direction.N);
        Car car = new Car(location);

        car.process("M");
        car.process("M");
        car.process("M");

        assertEquals(0, car.getLocation().getX());
        assertEquals(3, car.getLocation().getY());
        assertEquals(Direction.N, car.getLocation().getDirection());
    }

    @Test
    public void should_turn_left() {
        Location location = new Location(0, 0, Direction.N);
        Car car = new Car(location);

        car.process("L");
        car.process("M");
        car.process("M");
        car.process("M");

        assertEquals(-3, car.getLocation().getX());
        assertEquals(0, car.getLocation().getY());
        assertEquals(Direction.W, car.getLocation().getDirection());

    }

    @Test
    public void should_turn_right() {
        Location location = new Location(0, 0, Direction.N);
        Car car = new Car(location);

        car.process("R");
        car.process("M");
        car.process("M");
        car.process("M");

        assertEquals(3, car.getLocation().getX());
        assertEquals(0, car.getLocation().getY());
        assertEquals(Direction.E, car.getLocation().getDirection());

    }
}