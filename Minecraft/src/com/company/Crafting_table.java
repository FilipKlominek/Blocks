package com.company;

public class Crafting_table extends Block implements IRightClick, IDropItem {

    public Crafting_table(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public void sound() {
        System.out.println("dun");
    }

    @Override
    public String item(String item) {
        return "furnace";
    }

    @Override
    public void action() {
        //opens furnace inventory
    }
}
