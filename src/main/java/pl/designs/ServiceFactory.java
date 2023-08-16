package pl.designs;

public class ServiceFactory {


}


interface Strategy {

}

interface Factory {
    Strategy createStrategy();
}


interface Condition {
    boolean checkCondition();
}

class StrategyOne implements Strategy {
}


class FirstCondition implements Condition {

    @Override
    public boolean checkCondition() {
        return false;
    }
}

class SecondCondition implements Condition {

    @Override
    public boolean checkCondition() {
        return true;
    }
}




