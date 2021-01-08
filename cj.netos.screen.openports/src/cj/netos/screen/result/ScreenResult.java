package cj.netos.screen.result;

import cj.netos.screen.model.PopupRule;
import cj.netos.screen.model.ScreenSubject;

public class ScreenResult {
    PopupRule rule;
    ScreenSubject subject;

    public PopupRule getRule() {
        return rule;
    }

    public void setRule(PopupRule rule) {
        this.rule = rule;
    }

    public ScreenSubject getSubject() {
        return subject;
    }

    public void setSubject(ScreenSubject subject) {
        this.subject = subject;
    }
}
