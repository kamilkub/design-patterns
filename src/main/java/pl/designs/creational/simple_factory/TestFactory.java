package pl.designs.creational.simple_factory;

public class TestFactory {

    public static Test create(String type) {
        switch(type) {
            case "e2e":
                return new EndToEndTest();
            case "integration":
                return new IntegrationTest();
            default:
                return null;
        }
    }
}


abstract class Test {}
final class EndToEndTest extends Test {}
final class IntegrationTest extends Test {}
