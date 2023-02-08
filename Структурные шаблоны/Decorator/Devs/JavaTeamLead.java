package Devs;

public class JavaTeamLead extends DevDecorator{
    public JavaTeamLead(Dev developer) {
        super(developer);
    }

    public String sendWeekReport(){ return "Sending report..."; }

    @Override
    public String doTheJob() {
        return super.doTheJob() + sendWeekReport();
    }
}
