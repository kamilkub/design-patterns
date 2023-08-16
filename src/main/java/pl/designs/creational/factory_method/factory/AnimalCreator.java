package pl.designs.creational.factory_method.factory;

import pl.designs.creational.factory_method.animals.Animal;

public abstract class AnimalCreator {

    public Animal getAnimal() {
        Animal animal = createAnimal();
        return animal;
    }

    public abstract Animal createAnimal();


}
