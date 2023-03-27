package checkers;

import request.Request;

public class MaliciousRequestCheck extends SecurityCheck {
    @Override
    protected boolean doCheck(Request request) {
        return true;
    }
}
