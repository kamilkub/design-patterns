package pl.designs.creational.singleton;

import java.util.Objects;

public class LazySingletonPattern {

    private static volatile LazySingletonPattern INSTANCE;

    private LazySingletonPattern() {}

    public static synchronized LazySingletonPattern getInstance() {
        if(Objects.isNull(INSTANCE)) {
            INSTANCE = new LazySingletonPattern();
        }

        return INSTANCE;
    }
}
