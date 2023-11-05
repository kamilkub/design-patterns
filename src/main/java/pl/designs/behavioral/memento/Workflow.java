package pl.designs.behavioral.memento;


import java.util.Arrays;
import java.util.LinkedList;

public class Workflow {

    private LinkedList<String> steps;

    private String name;

    public Workflow(String name) {
        this.name = name;
        this.steps = new LinkedList<>();
    }

    public Workflow(String name, String ...steps) {
        this.name = name;
        this.steps = new LinkedList<>();

        if(steps != null && steps.length > 0) {
            this.steps.addAll(Arrays.asList(steps));
        }
    }

    public void addStep(String step) {
        this.steps.add(step);
    }

    public void removeStep(String step) {
        this.steps.remove(step);
    }

    public String[] getSteps() {
        return this.steps.toArray(String[]::new);
    }

    public String getName() {
        return this.name;
    }
}
