import Classes.*;
public class Sprintrunner {
    public static void main(String[] args) {
        // Допустим у нас есть задача, которую надо
        // выполнить. Зададим классы и пройдёмся по всему циклу работ.
        // При обычном подходе код был бы таким:

        Job job = new Job();
        job.doIt();
        BugTracker beetle = new BugTracker();
        beetle.activate();
        Developer dev = new Developer();
        dev.doTheJob(beetle);

        beetle.deactivate();
        dev.doTheJob(beetle);

        // Это довольно громоздкий и нечитабельный код.
        // Упростить и сделать его более читабельным
        // поможет шаблон Фасад
        System.out.println("\nNow using facade");
        Workflow wf = new Workflow();
        wf.solveProblems();


    }
}
