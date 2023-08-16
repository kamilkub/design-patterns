package pl.designs.creational.factory_method.animals;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Miau miau!");
    }
}
