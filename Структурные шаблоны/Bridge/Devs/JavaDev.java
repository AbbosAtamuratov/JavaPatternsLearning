package Devs;

public class JavaDev implements Dev{
    private final String lang = "Java" ;
    @Override
    public void code() {
        System.out.println(String.format("%s developer codes in %s", lang, lang));
    }
}
