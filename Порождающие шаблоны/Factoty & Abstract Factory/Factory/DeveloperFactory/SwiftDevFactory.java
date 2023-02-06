package DeveloperFactory;

import Developers.*;

public class SwiftDevFactory implements DevFactory{
    @Override
    public Dev createADev() {
        return new SwiftDev();
    }
}
