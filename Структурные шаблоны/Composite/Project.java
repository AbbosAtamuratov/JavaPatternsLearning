import Devs.*;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Dev cppDev1 = new CppDev();
        Dev cppDev2 = new CppDev();
        Dev csDev = new CSharpDev();

        team.addDev(cppDev1);
        team.addDev(cppDev2);
        team.addDev(csDev);

        team.workOnProject();

        // Итог мы создали Сущность Команда, которая состоит из разработчиков,
        // и работаем уже не с разрабами напрямую, а с сущностью более крупной
    }
}
