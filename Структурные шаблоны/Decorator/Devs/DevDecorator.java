package Devs;

public class DevDecorator implements Dev{
    Dev developer;

    public DevDecorator(Dev developer) {
        this.developer = developer;
    }

    @Override
    public String doTheJob() {
        return developer.doTheJob();
    }

    @Override
    public String getLang() {
        return developer.getLang();
    }
}
