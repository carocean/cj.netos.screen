package cj.netos.screen.model;

/**
 * Table: current_screen
 */
public class CurrentScreen {
    /**
     * Column: id
     */
    private String id;

    /**
     * Column: show_subject
     * Remark: 当前展示主题编号
     */
    private String showSubject;

    /**
     * Column: use_rule
     * Remark: 弹屏规则
     */
    private String useRule;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getShowSubject() {
        return showSubject;
    }

    public void setShowSubject(String showSubject) {
        this.showSubject = showSubject == null ? null : showSubject.trim();
    }

    public String getUseRule() {
        return useRule;
    }

    public void setUseRule(String useRule) {
        this.useRule = useRule == null ? null : useRule.trim();
    }
}