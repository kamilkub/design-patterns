package pl.designs.behavioral.chainofresponsibility;

public abstract class Employee implements LeaveApprover {


    private String role;

    private LeaveApprover successor;

    public Employee(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApplication(LeaveApplication application) {
        if(!processRequest(application) && successor != null) {
            successor.processLeaveApplication(application);
        }
    }

    @Override
    public String getApproverRole() {
        return this.role;
    }

    protected abstract boolean processRequest(LeaveApplication application);
}