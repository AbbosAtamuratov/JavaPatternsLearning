package iOSGame;

import BaseInterfaces.*;

public class iOSGAmeTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDev() {
        return new SwiftDeveloper();
    }

    @Override
    public Tester getTester() {
        return new BetaTester();
    }

    @Override
    public ProjMngr getPM() {
        return new iOSPM();
    }
}
