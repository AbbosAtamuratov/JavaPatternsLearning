package BankApp;

import BaseInterfaces.Tester;

public class QATester implements Tester {
    private final String type = "QA";
    @Override
    public void testCode() { System.out.printf("%s tester tests code...\n", type); }
}
