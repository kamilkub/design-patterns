package pl.designs.creational.singleton;

public class EagerSingletonPattern {

    private static final EagerSingletonPattern INSTANCE = new EagerSingletonPattern();

    private EagerSingletonPattern(){}

    public static EagerSingletonPattern getInstance(){
        return INSTANCE;
    }

}
