package pl.designs.singleton;

public class SingletonPattern {

    private static final SingletonPattern INSTANCE = new SingletonPattern();

    private SingletonPattern(){}

    public static SingletonPattern getInstance(){
        return INSTANCE;
    }

}
