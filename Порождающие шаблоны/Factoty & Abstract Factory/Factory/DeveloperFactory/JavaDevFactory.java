package DeveloperFactory;

import Developers.*;

public class JavaDevFactory implements DevFactory{
    @Override
    public Dev createADev() {
        return new JavaDev();
    }
}
