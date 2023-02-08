package Devs;

public class JavaDev implements Dev{
    private final String lang = "Java";
    @Override
    public String doTheJob() {
        return String.format("Writing %s code...\n", lang);
    }
    @Override
    public String getLang() {
        return lang;
    }
}
