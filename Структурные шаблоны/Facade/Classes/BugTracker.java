package Classes;

public class BugTracker {
    private boolean sprint;

    public boolean isSprint() { return sprint; }

    public void activate(){
        System.out.println("Activating sprint...");
        sprint = true;
    }

    public void deactivate(){
        System.out.println("Terminating sprint...");
        sprint = false;
    }
}
