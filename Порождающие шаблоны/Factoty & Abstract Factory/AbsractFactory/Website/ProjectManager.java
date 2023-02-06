package Website;

import BaseInterfaces.ProjMngr;

public class ProjectManager implements ProjMngr {
    private final String project = "Website";
    @Override
    public void manageProject(){ System.out.printf("Project manager manages %s project...\n", project); }
}
