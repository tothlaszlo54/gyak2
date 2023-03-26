package org.example;

public class Dog extends Animal {

    private String chipID;

    public Dog(String name, Age age, String chipID){
        super(name, age);
        this.chipID=chipID;
    }

    public Dog(String chipID) {
        this.chipID = chipID;
    }

    public void setChipID(String chipID) {
        this.chipID = chipID;
    }

    public String getChipID() {
        return chipID;
    }

    @Override
    public String toString() {
        return super.toString() + "A kutya chip azonosítója: " + chipID;
    }
}
