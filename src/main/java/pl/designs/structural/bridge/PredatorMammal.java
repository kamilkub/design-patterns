package pl.designs.structural.bridge;

public class PredatorMammal extends BaseMammal {


    public PredatorMammal(Animal animal) {
        super.animal = animal;
        super.animal.setCanHunt(true);
        super.animal.setCanWalk(true);
    }

    public boolean canHunt(){
        return super.animal.canHunt();
    }


}
