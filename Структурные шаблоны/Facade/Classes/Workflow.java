package Classes;

public class Workflow {
    Developer dev = new Developer();
    Job job = new Job();
    BugTracker bt = new BugTracker();

    public void solveProblems(){
        job.doIt();
        bt.activate();
        dev.doTheJob(bt);
        bt.deactivate();
        dev.doTheJob(bt);
    }
}
