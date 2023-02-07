import Programs.*;
import Devs.*;

public class ProgramCreator {
    public static void main(String[] args) {
        // наша задача сделать так, чтобы можно было разрабатывать любые программы на любых языках
        // зададим классы программ и разработчиков, таким образов как это сделано
        // в соответствующих пакетах
        Program[] programs = {
                new BankingApp(new JavaDev()),
                new StonksApp(new CppDev())
        };
        // таким образом мы можем переставлять разработчиков в программах и добавлять как новые программы и
        // разработчиков, не сломав код  в мейне из-за жёсткой привязки класса программы к классу разраба
        for (Program p: programs) {
            p.developProgram();
            System.out.println();
        }
    }
}
