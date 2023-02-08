import Devs.*;

public class TaskRunner {
    public static void main(String[] args) {
        // Зададим интерфейс девелопера и реализацию к нему с методом doTheJob и выведем в консоль
        Dev jDev = new JavaDev();
        System.out.println("Java developer strats working...");
        System.out.println(jDev.doTheJob());
        // Теперь мы хотим чтобы этот метод выполнял не наш класс, а другая сущность
        // например тимлид или сеньор, и понятное дело, что у них этот метод должен быть
        // чуть более сложным. И чтобы это удобно и по красоте реализовать
        // нам поможет шаблон Декоратор
        System.out.println("Senior enters the room...");
        Dev seniorJD = new SeniorJavaDev(jDev);
        System.out.println(seniorJD.doTheJob());
        // А теперь сделаем более высокого уровня с помощью дeкоратора
        System.out.println("Big boy is in the house...");
        Dev javaTL = new JavaTeamLead(seniorJD);
        System.out.println(javaTL.doTheJob());
        // Таким образом можно создавать сущности всё более и более высокого уровня
    }
}
