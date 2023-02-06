package View;

import DeveloperFactory.*;

public class DevPicker {

    public DevFactory chooseLanguage(String inp_lang) {

        if (inp_lang.equalsIgnoreCase("C++"))
            return new CppDevFactory();
        else if (inp_lang.equalsIgnoreCase("C#"))
            return new CSharpDevFactory();
        else if (inp_lang.equalsIgnoreCase("Java"))
            return new JavaDevFactory();
        else if (inp_lang.equalsIgnoreCase("Php"))
            return new PhpDevFactory();
        else if (inp_lang.equalsIgnoreCase("Python"))
            return new PythonDevFactory();
        else if (inp_lang.equalsIgnoreCase("Swift"))
            return new SwiftDevFactory();
        else {
            throw new RuntimeException(inp_lang + " Developer not found");
        }
    }

}
