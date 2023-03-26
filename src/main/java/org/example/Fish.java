package org.example;

public class Fish extends Animal{
    // Köbcentiméterben van megadva
    private int aquariumSize;

    public Fish(int aquariumSize) {
        this.aquariumSize = aquariumSize;
    }

    public Fish(String name, Age age, int aquariumSize){
        super(name, age);
        this.aquariumSize=aquariumSize;

    }
    public void setAquariumSize(int aquariumSize) {
        this.aquariumSize = aquariumSize;
    }

    public int getAquariumSize() {
        return aquariumSize;
    }

    @Override
    public String toString() {
        return super.toString() + "A hal akváriumának a mérete(köbcentiméterben): " + aquariumSize;
    }
}
