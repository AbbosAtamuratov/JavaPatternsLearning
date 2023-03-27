package checkers;

import request.Request;

public class SecurityCheckRunner {
    private SecurityCheck securityCheckChain;

    public SecurityCheckRunner() {
        // Create the chain of responsibility
        securityCheckChain = new IpCheck();
        securityCheckChain.setNextCheck(new PermissionCheck());
        securityCheckChain.setNextCheck(new MaliciousRequestCheck());
    }

    public boolean runSecurityChecks(Request request) {
        // Start the chain of responsibility
        return securityCheckChain.check(request);
    }
}
