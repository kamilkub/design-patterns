package pl.designs.behavioral.memento;

public abstract class AbstractWorkFlowCommand implements Command {

    protected  WorkflowDesigner.Memento memento;

    protected WorkflowDesigner receiver;

    public AbstractWorkFlowCommand(WorkflowDesigner designer) {
        this.receiver = designer;
    }

    @Override
    public void undo() {
        receiver.setMemento(memento);
    }
}
