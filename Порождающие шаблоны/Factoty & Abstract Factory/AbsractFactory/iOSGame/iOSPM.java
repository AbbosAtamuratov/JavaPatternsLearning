package iOSGame;

import BaseInterfaces.ProjMngr;

public class iOSPM implements ProjMngr {
    private final String project = "iOS Game";
    @Override
    public void manageProject(){ System.out.printf("Project manager manages %s project...\n", project); }
}
