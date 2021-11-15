package com.company;

public class Glass extends Block {

    public Glass(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public void sound() {
        System.out.println("clank");
    }
}
