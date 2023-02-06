package DeveloperFactory;

import Developers.*;

public class CSharpDevFactory implements DevFactory{
    @Override
    public Dev createADev() {
        return new CSharpDev();
    }
}
