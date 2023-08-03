package pl.designs.structural.bridge;

public interface Animal {

    boolean canEat();
    boolean canSleep();
    void setCanHunt(boolean canHunt);
    boolean canHunt();
    void setCanWalk(boolean canWalk);
    boolean canWalk();

}
