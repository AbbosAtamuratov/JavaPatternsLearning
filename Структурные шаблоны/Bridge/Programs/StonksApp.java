package Programs;

import Devs.Dev;

public class StonksApp extends Program{
    @Override
    public void developProgram() {
        System.out.println("Stock Trade App development in progress..");
        developer.code();
    }

    public StonksApp(Dev developer) {
        super(developer);
    }
}
