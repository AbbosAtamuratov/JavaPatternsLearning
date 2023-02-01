package Developers;

public class SwiftDev implements Dev{

    private final String lang = "Swift";

    @Override
    public void writeCode() { System.out.printf("%s developer is coding in %s...\n", lang, lang); }
}
