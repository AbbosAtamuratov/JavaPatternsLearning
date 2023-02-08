package Devs;

public class SeniorJavaDev extends DevDecorator{
    public SeniorJavaDev(Dev developer) {
        super(developer);
    }

    public String reviewCode(){ return String.format("Reviewing %s code..\n", developer.getLang()); }

    @Override
    public String doTheJob() {
        return super.doTheJob() + reviewCode();
    }
}
