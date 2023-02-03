package Classes;

public abstract class WebsiteBuilder {
    BetterWebsite site;

    public void creatWebsite() { this.site = new BetterWebsite(); }

    abstract void buildName();
    abstract void buildCMS();
    abstract void buildPrice();

    public BetterWebsite getWebsite() { return site; }

}
