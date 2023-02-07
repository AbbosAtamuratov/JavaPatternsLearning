package Devs;

public class CppDev implements Dev{
    private final String lang = "C++" ;
    @Override
    public void code() {
        System.out.println(String.format("%s developer codes in %s", lang, lang));
    }
}
