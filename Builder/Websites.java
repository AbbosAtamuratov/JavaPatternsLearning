import Classes.*;

public class Websites {
    public static void main(String[] args) {
        // Создать сущность вебсайта с 3мя параметрами.
        // При обычном подходе мы делаем класс и заполняем его
        // либо конструктором либо сеттерами

        Website site = new Website();

        site.setName("Podcasts");
        site.setCms("Wordpress");
        site.setPrice(500);

        System.out.println(site);

        // А теперь представим что нам надо генерировать много разных
        // сайтов. Немного переделаем класс сайтов
        // Теперь для создания целевого сайта нам нужно только менять строителя
        Director dir = new Director();
        dir.setWb(new VisitCardWebsiteBuilder());
        BetterWebsite s1 = dir.buildMeAPage();
        System.out.println(s1);

        Director dir1 = new Director();
        dir1.setWb(new EShopWebsiteBuilder());
        BetterWebsite s2 = dir1.buildMeAPage();
        System.out.println(s2);
    }
}
