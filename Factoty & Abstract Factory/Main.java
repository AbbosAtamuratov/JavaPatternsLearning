import Developers.*;
import DeveloperFactory.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Это обычный подход
        Dev csh = new CSharpDev();
        Dev py = new PythonDev(); // добавлено позже
        List<Dev> devs = new ArrayList<>();
        devs.add(csh); devs.add(py);

        devs.forEach(i-> i.writeCode());

        // Такой подход не годится, так как если нам поадобится добавить ещё класс,
        // то придётся создавать новый экземпляр класса в мейне, что неудобно

        // И вот тут поможет паттерн Фабрика
        // тепреь те же действия преобразуются в код
        DevFactory df = new JavaDevFactory();
        Dev dev1 = df.createADev();
        devs.add(dev1); // таким образом мы добавили java разраба вызвав нужную фабрику
        /*Таким образом если нам надо зарефакторить код, нам достаточно поменять имя фабрики*/
        DevFactory dF = new CppDevFactory(); //По сути изменилась только эта строка
        Dev dev2 = df.createADev();
        devs.add(dev2);

        // код можно сделать ещё более гибким, это полезно если нужно сделать интерактив
    }
}
