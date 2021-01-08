package cj.netos.screen.model;

import java.util.ArrayList;
import java.util.List;

public class CurrentScreenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public CurrentScreenExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShowSubjectIsNull() {
            addCriterion("show_subject is null");
            return (Criteria) this;
        }

        public Criteria andShowSubjectIsNotNull() {
            addCriterion("show_subject is not null");
            return (Criteria) this;
        }

        public Criteria andShowSubjectEqualTo(String value) {
            addCriterion("show_subject =", value, "showSubject");
            return (Criteria) this;
        }

        public Criteria andShowSubjectNotEqualTo(String value) {
            addCriterion("show_subject <>", value, "showSubject");
            return (Criteria) this;
        }

        public Criteria andShowSubjectGreaterThan(String value) {
            addCriterion("show_subject >", value, "showSubject");
            return (Criteria) this;
        }

        public Criteria andShowSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("show_subject >=", value, "showSubject");
            return (Criteria) this;
        }

        public Criteria andShowSubjectLessThan(String value) {
            addCriterion("show_subject <", value, "showSubject");
            return (Criteria) this;
        }

        public Criteria andShowSubjectLessThanOrEqualTo(String value) {
            addCriterion("show_subject <=", value, "showSubject");
            return (Criteria) this;
        }

        public Criteria andShowSubjectLike(String value) {
            addCriterion("show_subject like", value, "showSubject");
            return (Criteria) this;
        }

        public Criteria andShowSubjectNotLike(String value) {
            addCriterion("show_subject not like", value, "showSubject");
            return (Criteria) this;
        }

        public Criteria andShowSubjectIn(List<String> values) {
            addCriterion("show_subject in", values, "showSubject");
            return (Criteria) this;
        }

        public Criteria andShowSubjectNotIn(List<String> values) {
            addCriterion("show_subject not in", values, "showSubject");
            return (Criteria) this;
        }

        public Criteria andShowSubjectBetween(String value1, String value2) {
            addCriterion("show_subject between", value1, value2, "showSubject");
            return (Criteria) this;
        }

        public Criteria andShowSubjectNotBetween(String value1, String value2) {
            addCriterion("show_subject not between", value1, value2, "showSubject");
            return (Criteria) this;
        }

        public Criteria andUseRuleIsNull() {
            addCriterion("use_rule is null");
            return (Criteria) this;
        }

        public Criteria andUseRuleIsNotNull() {
            addCriterion("use_rule is not null");
            return (Criteria) this;
        }

        public Criteria andUseRuleEqualTo(String value) {
            addCriterion("use_rule =", value, "useRule");
            return (Criteria) this;
        }

        public Criteria andUseRuleNotEqualTo(String value) {
            addCriterion("use_rule <>", value, "useRule");
            return (Criteria) this;
        }

        public Criteria andUseRuleGreaterThan(String value) {
            addCriterion("use_rule >", value, "useRule");
            return (Criteria) this;
        }

        public Criteria andUseRuleGreaterThanOrEqualTo(String value) {
            addCriterion("use_rule >=", value, "useRule");
            return (Criteria) this;
        }

        public Criteria andUseRuleLessThan(String value) {
            addCriterion("use_rule <", value, "useRule");
            return (Criteria) this;
        }

        public Criteria andUseRuleLessThanOrEqualTo(String value) {
            addCriterion("use_rule <=", value, "useRule");
            return (Criteria) this;
        }

        public Criteria andUseRuleLike(String value) {
            addCriterion("use_rule like", value, "useRule");
            return (Criteria) this;
        }

        public Criteria andUseRuleNotLike(String value) {
            addCriterion("use_rule not like", value, "useRule");
            return (Criteria) this;
        }

        public Criteria andUseRuleIn(List<String> values) {
            addCriterion("use_rule in", values, "useRule");
            return (Criteria) this;
        }

        public Criteria andUseRuleNotIn(List<String> values) {
            addCriterion("use_rule not in", values, "useRule");
            return (Criteria) this;
        }

        public Criteria andUseRuleBetween(String value1, String value2) {
            addCriterion("use_rule between", value1, value2, "useRule");
            return (Criteria) this;
        }

        public Criteria andUseRuleNotBetween(String value1, String value2) {
            addCriterion("use_rule not between", value1, value2, "useRule");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}