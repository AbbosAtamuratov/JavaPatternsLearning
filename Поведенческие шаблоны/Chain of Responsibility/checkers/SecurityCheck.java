package checkers;

import request.Request;

public abstract class SecurityCheck {
    private SecurityCheck nextCheck;

    public void setNextCheck(SecurityCheck nextCheck) {
        this.nextCheck = nextCheck;
    }

    public boolean check(Request request) {
        if (doCheck(request)) {
            if (nextCheck != null) {
                return nextCheck.check(request);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    protected abstract boolean doCheck(Request request);
}
