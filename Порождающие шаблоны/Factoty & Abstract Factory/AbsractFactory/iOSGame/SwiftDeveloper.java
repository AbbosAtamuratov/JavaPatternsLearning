package iOSGame;

import BaseInterfaces.Developer;

public class SwiftDeveloper implements Developer {
    private final String language = "Swift";
    @Override
    public void writeCode() { System.out.printf("%s developer codes in %s...\n", language, language); }
}
