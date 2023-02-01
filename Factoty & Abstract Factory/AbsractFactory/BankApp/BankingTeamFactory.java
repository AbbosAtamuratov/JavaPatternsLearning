package BankApp;

import BaseInterfaces.*;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDev() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjMngr getPM() {
        return new BankAppPM();
    }
}
