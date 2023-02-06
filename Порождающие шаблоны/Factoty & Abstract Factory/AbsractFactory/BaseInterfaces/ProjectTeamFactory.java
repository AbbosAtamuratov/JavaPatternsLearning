package BaseInterfaces;

import BaseInterfaces.Developer;
import BaseInterfaces.ProjMngr;
import BaseInterfaces.Tester;

public interface ProjectTeamFactory {
    Developer getDev();
    Tester getTester();
    ProjMngr getPM();
}
