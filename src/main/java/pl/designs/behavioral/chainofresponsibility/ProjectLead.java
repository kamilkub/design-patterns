package pl.designs.behavioral.chainofresponsibility;

//A concrete handler
public class ProjectLead extends Employee {


    public ProjectLead(LeaveApprover successor) {
        super("ProjectLead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        if(application.getNoOfDays() <= 2 &&
                application.getType().equals(LeaveApplication.Type.Sick)) {
            application.approve(getApproverRole());
            return true;
        }

        return false;
    }
}
