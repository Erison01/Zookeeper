package com.zookeeper;

import com.sun.source.tree.BreakTree;

public class Mammal {
    protected int energyLevel;

    public Mammal() {
        energyLevel = 100;
    }
    public void displayEnergy(){
        System.out.println("energy level " +energyLevel);

    }


}
