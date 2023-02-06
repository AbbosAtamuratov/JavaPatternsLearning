import Website.*;
import BankApp.*;
import iOSGame.*;
import BaseInterfaces.*;

public class Main {
    public static void main(String[] args) {
        // Допустим нам надо сделать проект Веб Сайта
        // Обычный подход

        PhpDev phpDevTeamSimple = new PhpDev();
        ManualTester mTesterTeamSimple = new ManualTester();
        ProjectManager pMTeamSimple = new ProjectManager();

        System.out.println("Creating Site...");
        phpDevTeamSimple.writeCode();
        mTesterTeamSimple.testCode();
        pMTeamSimple.manageProject();
        System.out.println("Done\n");
        // Такой подход хорош своей простотой, однако он не подходит если нам надо
        // Смоделировать ведение нескольких разных проектов, т.к. нам надо будет
        // под каждый проект надо будет писать новых разработчиков тестеров и т.д.
        // Например нам заказали банковское приложение и браузерную игру
        // вот тут-то и пригодится паттерн Абстрактной фабрики
        // создание команд разработчиков будет выглядеть так:

        ProjectTeamFactory bankTeam = new BankingTeamFactory();
        Developer bankDev = bankTeam.getDev();
        Tester bankTester = bankTeam.getTester();
        ProjMngr bankPM = bankTeam.getPM();

        ProjectTeamFactory gameTeam = new iOSGAmeTeamFactory();
        Developer gameDev = gameTeam.getDev();
        Tester gameTester = gameTeam.getTester();
        ProjMngr gamePM = gameTeam.getPM();

        // Как видно, теперь при создании команд разработчиков
        // НЕ НУЖНО создавать конкретные экземпляры тех или иных девелоперов
        // Посмотрим теперь как работают наши команды

        System.out.println("Creating Bank App...");
        bankDev.writeCode();
        bankTester.testCode();
        bankPM.manageProject();
        System.out.println("Done\n");

        System.out.println("Creating iOS Game...");
        gameDev.writeCode();
        gameTester.testCode();
        gamePM.manageProject();
        System.out.println("Done\n");
    }
}
