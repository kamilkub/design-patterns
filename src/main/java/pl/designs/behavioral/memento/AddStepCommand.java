package pl.designs.behavioral.memento;

public class AddStepCommand extends AbstractWorkFlowCommand {

    private WorkflowDesigner workflowDesigner;
    private String step;

    public AddStepCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }


    @Override
    public void execute() {
        this.memento = workflowDesigner.getMemento();
        receiver.addStep(step);
    }

}
