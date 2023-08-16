package pl.designs.creational.factory_method.factory;

import pl.designs.creational.factory_method.animals.Animal;
import pl.designs.creational.factory_method.animals.Dog;

public class DogCreator extends AnimalCreator{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
