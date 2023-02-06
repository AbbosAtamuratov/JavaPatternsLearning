package Developers;

public class PhpDev implements Dev{

    private final String lang = "Php";

    @Override
    public void writeCode() { System.out.printf("%s developer is coding in %s...\n", lang, lang); }
}
