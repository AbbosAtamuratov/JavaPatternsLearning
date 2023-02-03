package Classes;

public class EShopWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() { site.setName("E-Shop"); }

    @Override
    void buildCMS() { site.setCms(Cms.ALIFRESCO); }

    @Override
    void buildPrice() { site.setPrice(1400); }
}
