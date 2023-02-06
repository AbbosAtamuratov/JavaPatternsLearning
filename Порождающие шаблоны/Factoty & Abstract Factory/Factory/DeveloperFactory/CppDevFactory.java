package DeveloperFactory;

import Developers.*;

public class CppDevFactory implements DevFactory{
    @Override
    public Dev createADev() {
        return new CppDev();
    }
}
