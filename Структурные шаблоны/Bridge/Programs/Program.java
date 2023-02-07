package Programs;

import Devs.*;

public abstract class Program {

    protected Dev developer;

    protected Program(Dev developer) { this.developer = developer; }

    public abstract void developProgram();
}
