package Website;

import BaseInterfaces.Developer;

public class PhpDev implements Developer {
    private final String language = "PHP";
    @Override
    public void writeCode() { System.out.printf("%s developer codes in %s...\n", language, language); }
}
