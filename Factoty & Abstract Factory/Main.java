import Developers.*;
import DeveloperFactory.*;
import View.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Это обычный подход
        Dev csh = new CSharpDev();
        Dev py = new PythonDev(); // добавлено позже
        List<Dev> devs = new ArrayList<>();
        devs.add(csh); devs.add(py);


        // Такой подход не годится, так как если нам поадобится добавить ещё класс или, не дай божЕ, зарефакторить,
        // то придётся создавать новый экземпляр класса в мейне, что неудобно

        // И вот тут поможет паттерн Фабрика
        // тепреь те же действия преобразуются в код
        DevFactory df = new JavaDevFactory();
        Dev dev1 = df.createADev();
        devs.add(dev1); // таким образом мы добавили java разраба вызвав нужную фабрику
        /*Таким образом если нам надо зарефакторить код, нам достаточно поменять имя фабрики*/
        DevFactory dF = new CppDevFactory(); //По сути изменилась только эта строка
        Dev dev2 = dF.createADev();
        devs.add(dev2);

        // код можно сделать ещё более гибким, это полезно если нужно сделать интерактив
        // Тут можно использовать статик-метод в мейне, а можно отдельный модуль написать
        // Я пошёл через модуль... теперь можно задать девелопера так...
        DevPicker dp = new DevPicker();
        DevFactory dff = dp.chooseLanguage("php");
        Dev dev3 = dff.createADev();
        Dev dev4 = dp.chooseLanguage("SWIFT").createADev(); // или даже так
        devs.add(dev3); devs.add(dev4);


        // А вот и все разрабы
        devs.forEach(i-> i.writeCode());
    }
}
