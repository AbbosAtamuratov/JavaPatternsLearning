package Developers;

public class JavaDev implements Dev{

    private final String lang = "Java";

    @Override
    public void writeCode() { System.out.printf("%s developer is coding in %s...\n", lang, lang); }
}
