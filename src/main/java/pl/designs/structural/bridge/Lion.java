package pl.designs.structural.bridge;

public class Lion implements Animal {

    private boolean canHunt = false;
    private boolean canWalk = false;

    @Override
    public boolean canEat() {
        return true;
    }

    @Override
    public boolean canSleep() {
        return true;
    }

    @Override
    public void setCanHunt(boolean canHunt) {
        this.canHunt = canHunt;
    }

    @Override
    public boolean canHunt() {
        return this.canHunt;
    }

    @Override
    public void setCanWalk(boolean canWalk) {
            this.canWalk = canWalk;
    }

    @Override
    public boolean canWalk() {
        return this.canWalk;
    }
}
