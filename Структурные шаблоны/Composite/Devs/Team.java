package Devs;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Dev> devs = new ArrayList<>();
    public void addDev (Dev d){
        devs.add(d);
        System.out.println("Developer accepted to the Team");
    }

    public void removeDev(Dev d){
        devs.remove(d);
        System.out.printf("%s developer was fired\n", d.getLang());
    }

    public void workOnProject(){
        System.out.println("Work in progress");
        devs.forEach(d -> d.code());
    }
}
