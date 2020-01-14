package com.thoughtworks.marsrover;

import java.util.HashMap;

public enum Direction {
    N(0), W(1), S(2), E(3);
    private int code;

    Direction(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    private static HashMap<Integer, Direction> hashMap = new HashMap<>();

    static {
        for (Direction d: Direction.values()) {
            hashMap.put(d.code, d);
        }
    }

    public static Direction fromCode(int code) {
        return hashMap.get(code);
    }
}
