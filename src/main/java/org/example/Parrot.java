package org.example;

public class Parrot extends Animal{
    //cm-ben
    private int lengthOfWing;

    public Parrot(int lengthOfWing) {
        this.lengthOfWing = lengthOfWing;
    }
    public Parrot(String name, Age age, int lengthOfWing){
        super(name, age);
        this.lengthOfWing=lengthOfWing;
    }

    public void setLengthOfWing(int lengthOfWing) {
        this.lengthOfWing = lengthOfWing;
    }

    public int getLengthOfWing() {
        return lengthOfWing;
    }

    @Override
    public String toString() {
        return super.toString() + "A papagáj szárnyának a mérete(cm): " + lengthOfWing;
    }

}
