package Developers;

public class CppDev implements Dev{

    private final String lang = "C++";

    @Override
    public void writeCode() { System.out.printf("%s developer is coding in %s...\n", lang, lang); }
}
