package DeveloperFactory;

import Developers.*;

public class PhpDevFactory implements DevFactory{
    @Override
    public Dev createADev() {
        return new PhpDev();
    }
}
