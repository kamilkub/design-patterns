package pl.designs.bridge;

public class BaseMammal implements Mammal {

    protected Animal animal;

    public BaseMammal() {
    }

    public BaseMammal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean canWalk() {
        return this.animal.canWalk();
    }

    public boolean canHunt(){
        return this.animal.canHunt();
    }
}
