package checkers;

import request.Request;

public class IpCheck extends SecurityCheck {
    @Override
    protected boolean doCheck(Request request) {
        return true;
    }
}
