package cj.netos.screen.model;

/**
 * Table: popup_rule
 */
public class PopupRule {
    /**
     * Column: code
     */
    private String code;

    /**
     * Column: name
     * Remark: 规则名
     */
    private String name;

    /**
     * Column: args
     * Remark: 每个code对应的参数，可以为空
     */
    private String args;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args == null ? null : args.trim();
    }
}