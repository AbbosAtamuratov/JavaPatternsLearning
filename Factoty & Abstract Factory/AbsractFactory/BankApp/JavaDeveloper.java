package BankApp;

import BaseInterfaces.Developer;

public class JavaDeveloper implements Developer {
    private final String language = "Java";
    @Override
    public void writeCode() { System.out.printf("%s developer codes in %s...\n", language, language); }
}
