package com.company;

public class Stone extends Block implements IDropItem {

    public Stone(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public void sound() {
        System.out.println("dun");
    }

    @Override
    public String item(String item) {
        return "cobblestone";
    }
}
