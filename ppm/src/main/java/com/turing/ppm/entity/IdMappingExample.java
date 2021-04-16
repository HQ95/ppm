package com.turing.ppm.entity;

import java.util.ArrayList;
import java.util.List;

public class IdMappingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IdMappingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNull() {
            addCriterion("STOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("STOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(Integer value) {
            addCriterion("STOCK_ID =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(Integer value) {
            addCriterion("STOCK_ID <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(Integer value) {
            addCriterion("STOCK_ID >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_ID >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(Integer value) {
            addCriterion("STOCK_ID <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_ID <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<Integer> values) {
            addCriterion("STOCK_ID in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<Integer> values) {
            addCriterion("STOCK_ID not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_ID between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_ID not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdIsNull() {
            addCriterion("ENQUIRE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEnquireIdIsNotNull() {
            addCriterion("ENQUIRE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEnquireIdEqualTo(Integer value) {
            addCriterion("ENQUIRE_ID =", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdNotEqualTo(Integer value) {
            addCriterion("ENQUIRE_ID <>", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdGreaterThan(Integer value) {
            addCriterion("ENQUIRE_ID >", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENQUIRE_ID >=", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdLessThan(Integer value) {
            addCriterion("ENQUIRE_ID <", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdLessThanOrEqualTo(Integer value) {
            addCriterion("ENQUIRE_ID <=", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdIn(List<Integer> values) {
            addCriterion("ENQUIRE_ID in", values, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdNotIn(List<Integer> values) {
            addCriterion("ENQUIRE_ID not in", values, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdBetween(Integer value1, Integer value2) {
            addCriterion("ENQUIRE_ID between", value1, value2, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ENQUIRE_ID not between", value1, value2, "enquireId");
            return (Criteria) this;
        }

        public Criteria andContAppIdIsNull() {
            addCriterion("CONT_APP_ID is null");
            return (Criteria) this;
        }

        public Criteria andContAppIdIsNotNull() {
            addCriterion("CONT_APP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContAppIdEqualTo(Integer value) {
            addCriterion("CONT_APP_ID =", value, "contAppId");
            return (Criteria) this;
        }

        public Criteria andContAppIdNotEqualTo(Integer value) {
            addCriterion("CONT_APP_ID <>", value, "contAppId");
            return (Criteria) this;
        }

        public Criteria andContAppIdGreaterThan(Integer value) {
            addCriterion("CONT_APP_ID >", value, "contAppId");
            return (Criteria) this;
        }

        public Criteria andContAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONT_APP_ID >=", value, "contAppId");
            return (Criteria) this;
        }

        public Criteria andContAppIdLessThan(Integer value) {
            addCriterion("CONT_APP_ID <", value, "contAppId");
            return (Criteria) this;
        }

        public Criteria andContAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("CONT_APP_ID <=", value, "contAppId");
            return (Criteria) this;
        }

        public Criteria andContAppIdIn(List<Integer> values) {
            addCriterion("CONT_APP_ID in", values, "contAppId");
            return (Criteria) this;
        }

        public Criteria andContAppIdNotIn(List<Integer> values) {
            addCriterion("CONT_APP_ID not in", values, "contAppId");
            return (Criteria) this;
        }

        public Criteria andContAppIdBetween(Integer value1, Integer value2) {
            addCriterion("CONT_APP_ID between", value1, value2, "contAppId");
            return (Criteria) this;
        }

        public Criteria andContAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CONT_APP_ID not between", value1, value2, "contAppId");
            return (Criteria) this;
        }

        public Criteria andQuoteIdIsNull() {
            addCriterion("QUOTE_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuoteIdIsNotNull() {
            addCriterion("QUOTE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteIdEqualTo(Integer value) {
            addCriterion("QUOTE_ID =", value, "quoteId");
            return (Criteria) this;
        }

        public Criteria andQuoteIdNotEqualTo(Integer value) {
            addCriterion("QUOTE_ID <>", value, "quoteId");
            return (Criteria) this;
        }

        public Criteria andQuoteIdGreaterThan(Integer value) {
            addCriterion("QUOTE_ID >", value, "quoteId");
            return (Criteria) this;
        }

        public Criteria andQuoteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUOTE_ID >=", value, "quoteId");
            return (Criteria) this;
        }

        public Criteria andQuoteIdLessThan(Integer value) {
            addCriterion("QUOTE_ID <", value, "quoteId");
            return (Criteria) this;
        }

        public Criteria andQuoteIdLessThanOrEqualTo(Integer value) {
            addCriterion("QUOTE_ID <=", value, "quoteId");
            return (Criteria) this;
        }

        public Criteria andQuoteIdIn(List<Integer> values) {
            addCriterion("QUOTE_ID in", values, "quoteId");
            return (Criteria) this;
        }

        public Criteria andQuoteIdNotIn(List<Integer> values) {
            addCriterion("QUOTE_ID not in", values, "quoteId");
            return (Criteria) this;
        }

        public Criteria andQuoteIdBetween(Integer value1, Integer value2) {
            addCriterion("QUOTE_ID between", value1, value2, "quoteId");
            return (Criteria) this;
        }

        public Criteria andQuoteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("QUOTE_ID not between", value1, value2, "quoteId");
            return (Criteria) this;
        }

        public Criteria andContIdIsNull() {
            addCriterion("CONT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContIdIsNotNull() {
            addCriterion("CONT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContIdEqualTo(Integer value) {
            addCriterion("CONT_ID =", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdNotEqualTo(Integer value) {
            addCriterion("CONT_ID <>", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdGreaterThan(Integer value) {
            addCriterion("CONT_ID >", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONT_ID >=", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdLessThan(Integer value) {
            addCriterion("CONT_ID <", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdLessThanOrEqualTo(Integer value) {
            addCriterion("CONT_ID <=", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdIn(List<Integer> values) {
            addCriterion("CONT_ID in", values, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdNotIn(List<Integer> values) {
            addCriterion("CONT_ID not in", values, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdBetween(Integer value1, Integer value2) {
            addCriterion("CONT_ID between", value1, value2, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CONT_ID not between", value1, value2, "contId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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