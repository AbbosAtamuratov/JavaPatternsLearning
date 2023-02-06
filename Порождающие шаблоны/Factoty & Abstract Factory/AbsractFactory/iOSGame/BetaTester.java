package iOSGame;

import BaseInterfaces.Tester;

public class BetaTester implements Tester {
    private final String type = "Beta";
    @Override
    public void testCode() { System.out.printf("%s tester tests code...\n", type); }
}
