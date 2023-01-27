package DeveloperFactory;

import Developers.*;

public class PythonDevFactory implements DevFactory{
    @Override
    public Dev createADev() {
        return new PythonDev();
    }
}
