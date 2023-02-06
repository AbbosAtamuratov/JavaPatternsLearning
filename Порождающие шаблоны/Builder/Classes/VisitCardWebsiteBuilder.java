package Classes;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() { site.setName("Visit Card"); }

    @Override
    void buildCMS() { site.setCms(Cms.WORDPRESS); }

    @Override
    void buildPrice() { site.setPrice(400); }
}
