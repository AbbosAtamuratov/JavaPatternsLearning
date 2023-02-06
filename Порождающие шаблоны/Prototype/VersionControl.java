import Classes.*;
public class VersionControl {
    public static void main(String[] args) {
        // Задаём экземпляр класса проекта и печатаем
        Project master  = new Project("1", "Master Project", "some code in C++");
        System.out.println(master);

        // Теперь копируем его через метод класса проекта
        Project masterDuplicate = (Project) master.copy();
        System.out.println("\n==================================\n");
        System.out.println(masterDuplicate);

        // вроде всё работет однако, данный способ не годится, т.к. в классе-клиенте нам
        // приходится кастовать (приводить) к нужному нам типу, поэтому воспользуемся фабрикой

        ProjectFactory pf = new ProjectFactory(master);
        Project masterClone = pf.cloneProject();
        System.out.println("\n==================================\n");
        System.out.println(masterClone);

    }
}
