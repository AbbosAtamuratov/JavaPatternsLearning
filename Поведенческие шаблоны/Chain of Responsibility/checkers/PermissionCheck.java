package checkers;

import request.Request;

public class PermissionCheck extends SecurityCheck {
    @Override
    protected boolean doCheck(Request request) {
        return true;
    }
}
