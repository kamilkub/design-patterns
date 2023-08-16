package pl.designs.creational.factory_method;

import pl.designs.creational.factory_method.animals.Animal;
import pl.designs.creational.factory_method.factory.AnimalCreator;
import pl.designs.creational.factory_method.factory.CatCreator;
import pl.designs.creational.factory_method.factory.DogCreator;

public class FactoryMethodTest {

    public static void main(String[] args) {
        makeSound(new DogCreator());
        makeSound(new CatCreator());
    }

    public static void makeSound(AnimalCreator animalCreator) {
        Animal animal = animalCreator.getAnimal();
        animal.makeSound();
    }
}
