package Devs;

public abstract class Dev {
    // В видео чел делает не абстрактный класс, как я, а интерфейс.
    // Мне показалось что через абстрактный класс удобнее, потому что не
    // нужно каждый раз одни и те же методы переписывать,
    // достаточно всего лишь конструктор прописать в наследниках
    private String lang;

    protected void code(){
        System.out.println(String.format("%s developer codes in %s", lang, lang));
    }
    protected void setLang(String lang) {
        this.lang = lang;
    }

    public String getLang() { return lang; }
}
