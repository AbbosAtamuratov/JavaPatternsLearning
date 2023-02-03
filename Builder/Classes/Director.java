package Classes;

public class Director {
    WebsiteBuilder wb;

    public void setWb(WebsiteBuilder wb) {
        this.wb = wb;
    }

    public BetterWebsite buildMeAPage(){
        wb.creatWebsite();
        wb.buildName();
        wb.buildCMS();
        wb.buildPrice();

        BetterWebsite site = wb.getWebsite();

        return site;
    }
}
