package Developers;

public class PythonDev implements Dev{

    private final String lang = "Python";

    @Override
    public void writeCode() { System.out.printf("%s developer is coding in %s...\n", lang, lang); }
}
