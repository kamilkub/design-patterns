package pl.designs.creational.factory_method.factory;

import pl.designs.creational.factory_method.animals.Animal;
import pl.designs.creational.factory_method.animals.Cat;

public class CatCreator extends AnimalCreator {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
