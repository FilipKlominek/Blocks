package com.company;

public abstract class Block {

    public Block(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private final int x;
    private final int y;
    private final int z;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    abstract public void sound();
}
