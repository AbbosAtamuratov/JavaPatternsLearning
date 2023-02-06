package Website;

import BaseInterfaces.Tester;

public class ManualTester implements Tester {
    private final String type = "Manual";
    @Override
    public void testCode(){ System.out.printf("%s tester tests code...\n", type); }
}
