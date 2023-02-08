package Classes;

public class Developer {
    public void doTheJob(BugTracker bt){
        if (bt.isSprint())
            System.out.println("Developer is fixing bugs...");
        else
            System.out.println("Developer is surfing Reddit...");
    }
}
