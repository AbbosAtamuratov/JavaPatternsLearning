package BankApp;

import BaseInterfaces.ProjMngr;

public class BankAppPM implements ProjMngr {
    private final String project = "Banking App";
    @Override
    public void manageProject(){ System.out.printf("Project manager manages %s project...\n", project); }
}
