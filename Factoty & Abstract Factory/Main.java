import Developers.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Это обычный подход
        Dev cpp = new CppDev();
        Dev csh = new CSharpDev();
        Dev jv = new JavaDev();
        Dev py = new PythonDev();
        List<Dev> devs = new ArrayList<>();
        devs.add(cpp); devs.add(csh); devs.add(jv);

        devs.forEach(i-> i.writeCode());

        // Такой подход не годится, так как если нам поадобится добавить ещё класс,
        // то придётся создавать новый экземпляр класса в мейне, что неудобно


    }
}
