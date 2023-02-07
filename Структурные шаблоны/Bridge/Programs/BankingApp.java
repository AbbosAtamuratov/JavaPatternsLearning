package Programs;

import Devs.Dev;

public class BankingApp extends Program{
    public BankingApp(Dev developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Banking App development in progress..");
        developer.code();
    }
}
