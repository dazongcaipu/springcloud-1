package com.example.servicemedia.model.entity;

import java.util.ArrayList;
import java.util.List;

public class MediaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MediaExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMediaNameIsNull() {
            addCriterion("media_name is null");
            return (Criteria) this;
        }

        public Criteria andMediaNameIsNotNull() {
            addCriterion("media_name is not null");
            return (Criteria) this;
        }

        public Criteria andMediaNameEqualTo(String value) {
            addCriterion("media_name =", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameNotEqualTo(String value) {
            addCriterion("media_name <>", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameGreaterThan(String value) {
            addCriterion("media_name >", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameGreaterThanOrEqualTo(String value) {
            addCriterion("media_name >=", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameLessThan(String value) {
            addCriterion("media_name <", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameLessThanOrEqualTo(String value) {
            addCriterion("media_name <=", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameLike(String value) {
            addCriterion("media_name like", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameNotLike(String value) {
            addCriterion("media_name not like", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameIn(List<String> values) {
            addCriterion("media_name in", values, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameNotIn(List<String> values) {
            addCriterion("media_name not in", values, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameBetween(String value1, String value2) {
            addCriterion("media_name between", value1, value2, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameNotBetween(String value1, String value2) {
            addCriterion("media_name not between", value1, value2, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaPathIsNull() {
            addCriterion("media_path is null");
            return (Criteria) this;
        }

        public Criteria andMediaPathIsNotNull() {
            addCriterion("media_path is not null");
            return (Criteria) this;
        }

        public Criteria andMediaPathEqualTo(String value) {
            addCriterion("media_path =", value, "mediaPath");
            return (Criteria) this;
        }

        public Criteria andMediaPathNotEqualTo(String value) {
            addCriterion("media_path <>", value, "mediaPath");
            return (Criteria) this;
        }

        public Criteria andMediaPathGreaterThan(String value) {
            addCriterion("media_path >", value, "mediaPath");
            return (Criteria) this;
        }

        public Criteria andMediaPathGreaterThanOrEqualTo(String value) {
            addCriterion("media_path >=", value, "mediaPath");
            return (Criteria) this;
        }

        public Criteria andMediaPathLessThan(String value) {
            addCriterion("media_path <", value, "mediaPath");
            return (Criteria) this;
        }

        public Criteria andMediaPathLessThanOrEqualTo(String value) {
            addCriterion("media_path <=", value, "mediaPath");
            return (Criteria) this;
        }

        public Criteria andMediaPathLike(String value) {
            addCriterion("media_path like", value, "mediaPath");
            return (Criteria) this;
        }

        public Criteria andMediaPathNotLike(String value) {
            addCriterion("media_path not like", value, "mediaPath");
            return (Criteria) this;
        }

        public Criteria andMediaPathIn(List<String> values) {
            addCriterion("media_path in", values, "mediaPath");
            return (Criteria) this;
        }

        public Criteria andMediaPathNotIn(List<String> values) {
            addCriterion("media_path not in", values, "mediaPath");
            return (Criteria) this;
        }

        public Criteria andMediaPathBetween(String value1, String value2) {
            addCriterion("media_path between", value1, value2, "mediaPath");
            return (Criteria) this;
        }

        public Criteria andMediaPathNotBetween(String value1, String value2) {
            addCriterion("media_path not between", value1, value2, "mediaPath");
            return (Criteria) this;
        }

        public Criteria andMediaEndNameIsNull() {
            addCriterion("media_end_name is null");
            return (Criteria) this;
        }

        public Criteria andMediaEndNameIsNotNull() {
            addCriterion("media_end_name is not null");
            return (Criteria) this;
        }

        public Criteria andMediaEndNameEqualTo(String value) {
            addCriterion("media_end_name =", value, "mediaEndName");
            return (Criteria) this;
        }

        public Criteria andMediaEndNameNotEqualTo(String value) {
            addCriterion("media_end_name <>", value, "mediaEndName");
            return (Criteria) this;
        }

        public Criteria andMediaEndNameGreaterThan(String value) {
            addCriterion("media_end_name >", value, "mediaEndName");
            return (Criteria) this;
        }

        public Criteria andMediaEndNameGreaterThanOrEqualTo(String value) {
            addCriterion("media_end_name >=", value, "mediaEndName");
            return (Criteria) this;
        }

        public Criteria andMediaEndNameLessThan(String value) {
            addCriterion("media_end_name <", value, "mediaEndName");
            return (Criteria) this;
        }

        public Criteria andMediaEndNameLessThanOrEqualTo(String value) {
            addCriterion("media_end_name <=", value, "mediaEndName");
            return (Criteria) this;
        }

        public Criteria andMediaEndNameLike(String value) {
            addCriterion("media_end_name like", value, "mediaEndName");
            return (Criteria) this;
        }

        public Criteria andMediaEndNameNotLike(String value) {
            addCriterion("media_end_name not like", value, "mediaEndName");
            return (Criteria) this;
        }

        public Criteria andMediaEndNameIn(List<String> values) {
            addCriterion("media_end_name in", values, "mediaEndName");
            return (Criteria) this;
        }

        public Criteria andMediaEndNameNotIn(List<String> values) {
            addCriterion("media_end_name not in", values, "mediaEndName");
            return (Criteria) this;
        }

        public Criteria andMediaEndNameBetween(String value1, String value2) {
            addCriterion("media_end_name between", value1, value2, "mediaEndName");
            return (Criteria) this;
        }

        public Criteria andMediaEndNameNotBetween(String value1, String value2) {
            addCriterion("media_end_name not between", value1, value2, "mediaEndName");
            return (Criteria) this;
        }

        public Criteria andMediaTimeIsNull() {
            addCriterion("media_time is null");
            return (Criteria) this;
        }

        public Criteria andMediaTimeIsNotNull() {
            addCriterion("media_time is not null");
            return (Criteria) this;
        }

        public Criteria andMediaTimeEqualTo(String value) {
            addCriterion("media_time =", value, "mediaTime");
            return (Criteria) this;
        }

        public Criteria andMediaTimeNotEqualTo(String value) {
            addCriterion("media_time <>", value, "mediaTime");
            return (Criteria) this;
        }

        public Criteria andMediaTimeGreaterThan(String value) {
            addCriterion("media_time >", value, "mediaTime");
            return (Criteria) this;
        }

        public Criteria andMediaTimeGreaterThanOrEqualTo(String value) {
            addCriterion("media_time >=", value, "mediaTime");
            return (Criteria) this;
        }

        public Criteria andMediaTimeLessThan(String value) {
            addCriterion("media_time <", value, "mediaTime");
            return (Criteria) this;
        }

        public Criteria andMediaTimeLessThanOrEqualTo(String value) {
            addCriterion("media_time <=", value, "mediaTime");
            return (Criteria) this;
        }

        public Criteria andMediaTimeLike(String value) {
            addCriterion("media_time like", value, "mediaTime");
            return (Criteria) this;
        }

        public Criteria andMediaTimeNotLike(String value) {
            addCriterion("media_time not like", value, "mediaTime");
            return (Criteria) this;
        }

        public Criteria andMediaTimeIn(List<String> values) {
            addCriterion("media_time in", values, "mediaTime");
            return (Criteria) this;
        }

        public Criteria andMediaTimeNotIn(List<String> values) {
            addCriterion("media_time not in", values, "mediaTime");
            return (Criteria) this;
        }

        public Criteria andMediaTimeBetween(String value1, String value2) {
            addCriterion("media_time between", value1, value2, "mediaTime");
            return (Criteria) this;
        }

        public Criteria andMediaTimeNotBetween(String value1, String value2) {
            addCriterion("media_time not between", value1, value2, "mediaTime");
            return (Criteria) this;
        }

        public Criteria andMediaSizeIsNull() {
            addCriterion("media_size is null");
            return (Criteria) this;
        }

        public Criteria andMediaSizeIsNotNull() {
            addCriterion("media_size is not null");
            return (Criteria) this;
        }

        public Criteria andMediaSizeEqualTo(String value) {
            addCriterion("media_size =", value, "mediaSize");
            return (Criteria) this;
        }

        public Criteria andMediaSizeNotEqualTo(String value) {
            addCriterion("media_size <>", value, "mediaSize");
            return (Criteria) this;
        }

        public Criteria andMediaSizeGreaterThan(String value) {
            addCriterion("media_size >", value, "mediaSize");
            return (Criteria) this;
        }

        public Criteria andMediaSizeGreaterThanOrEqualTo(String value) {
            addCriterion("media_size >=", value, "mediaSize");
            return (Criteria) this;
        }

        public Criteria andMediaSizeLessThan(String value) {
            addCriterion("media_size <", value, "mediaSize");
            return (Criteria) this;
        }

        public Criteria andMediaSizeLessThanOrEqualTo(String value) {
            addCriterion("media_size <=", value, "mediaSize");
            return (Criteria) this;
        }

        public Criteria andMediaSizeLike(String value) {
            addCriterion("media_size like", value, "mediaSize");
            return (Criteria) this;
        }

        public Criteria andMediaSizeNotLike(String value) {
            addCriterion("media_size not like", value, "mediaSize");
            return (Criteria) this;
        }

        public Criteria andMediaSizeIn(List<String> values) {
            addCriterion("media_size in", values, "mediaSize");
            return (Criteria) this;
        }

        public Criteria andMediaSizeNotIn(List<String> values) {
            addCriterion("media_size not in", values, "mediaSize");
            return (Criteria) this;
        }

        public Criteria andMediaSizeBetween(String value1, String value2) {
            addCriterion("media_size between", value1, value2, "mediaSize");
            return (Criteria) this;
        }

        public Criteria andMediaSizeNotBetween(String value1, String value2) {
            addCriterion("media_size not between", value1, value2, "mediaSize");
            return (Criteria) this;
        }

        public Criteria andMediaTypeIsNull() {
            addCriterion("media_type is null");
            return (Criteria) this;
        }

        public Criteria andMediaTypeIsNotNull() {
            addCriterion("media_type is not null");
            return (Criteria) this;
        }

        public Criteria andMediaTypeEqualTo(String value) {
            addCriterion("media_type =", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotEqualTo(String value) {
            addCriterion("media_type <>", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeGreaterThan(String value) {
            addCriterion("media_type >", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("media_type >=", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLessThan(String value) {
            addCriterion("media_type <", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLessThanOrEqualTo(String value) {
            addCriterion("media_type <=", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLike(String value) {
            addCriterion("media_type like", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotLike(String value) {
            addCriterion("media_type not like", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeIn(List<String> values) {
            addCriterion("media_type in", values, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotIn(List<String> values) {
            addCriterion("media_type not in", values, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeBetween(String value1, String value2) {
            addCriterion("media_type between", value1, value2, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotBetween(String value1, String value2) {
            addCriterion("media_type not between", value1, value2, "mediaType");
            return (Criteria) this;
        }

        public Criteria andRelationIdIsNull() {
            addCriterion("relation_id is null");
            return (Criteria) this;
        }

        public Criteria andRelationIdIsNotNull() {
            addCriterion("relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelationIdEqualTo(Integer value) {
            addCriterion("relation_id =", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotEqualTo(Integer value) {
            addCriterion("relation_id <>", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThan(Integer value) {
            addCriterion("relation_id >", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation_id >=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThan(Integer value) {
            addCriterion("relation_id <", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThanOrEqualTo(Integer value) {
            addCriterion("relation_id <=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdIn(List<Integer> values) {
            addCriterion("relation_id in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotIn(List<Integer> values) {
            addCriterion("relation_id not in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdBetween(Integer value1, Integer value2) {
            addCriterion("relation_id between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("relation_id not between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationTableIsNull() {
            addCriterion("relation_table is null");
            return (Criteria) this;
        }

        public Criteria andRelationTableIsNotNull() {
            addCriterion("relation_table is not null");
            return (Criteria) this;
        }

        public Criteria andRelationTableEqualTo(String value) {
            addCriterion("relation_table =", value, "relationTable");
            return (Criteria) this;
        }

        public Criteria andRelationTableNotEqualTo(String value) {
            addCriterion("relation_table <>", value, "relationTable");
            return (Criteria) this;
        }

        public Criteria andRelationTableGreaterThan(String value) {
            addCriterion("relation_table >", value, "relationTable");
            return (Criteria) this;
        }

        public Criteria andRelationTableGreaterThanOrEqualTo(String value) {
            addCriterion("relation_table >=", value, "relationTable");
            return (Criteria) this;
        }

        public Criteria andRelationTableLessThan(String value) {
            addCriterion("relation_table <", value, "relationTable");
            return (Criteria) this;
        }

        public Criteria andRelationTableLessThanOrEqualTo(String value) {
            addCriterion("relation_table <=", value, "relationTable");
            return (Criteria) this;
        }

        public Criteria andRelationTableLike(String value) {
            addCriterion("relation_table like", value, "relationTable");
            return (Criteria) this;
        }

        public Criteria andRelationTableNotLike(String value) {
            addCriterion("relation_table not like", value, "relationTable");
            return (Criteria) this;
        }

        public Criteria andRelationTableIn(List<String> values) {
            addCriterion("relation_table in", values, "relationTable");
            return (Criteria) this;
        }

        public Criteria andRelationTableNotIn(List<String> values) {
            addCriterion("relation_table not in", values, "relationTable");
            return (Criteria) this;
        }

        public Criteria andRelationTableBetween(String value1, String value2) {
            addCriterion("relation_table between", value1, value2, "relationTable");
            return (Criteria) this;
        }

        public Criteria andRelationTableNotBetween(String value1, String value2) {
            addCriterion("relation_table not between", value1, value2, "relationTable");
            return (Criteria) this;
        }

        public Criteria andMediaUrlpathIsNull() {
            addCriterion("media_urlpath is null");
            return (Criteria) this;
        }

        public Criteria andMediaUrlpathIsNotNull() {
            addCriterion("media_urlpath is not null");
            return (Criteria) this;
        }

        public Criteria andMediaUrlpathEqualTo(String value) {
            addCriterion("media_urlpath =", value, "mediaUrlpath");
            return (Criteria) this;
        }

        public Criteria andMediaUrlpathNotEqualTo(String value) {
            addCriterion("media_urlpath <>", value, "mediaUrlpath");
            return (Criteria) this;
        }

        public Criteria andMediaUrlpathGreaterThan(String value) {
            addCriterion("media_urlpath >", value, "mediaUrlpath");
            return (Criteria) this;
        }

        public Criteria andMediaUrlpathGreaterThanOrEqualTo(String value) {
            addCriterion("media_urlpath >=", value, "mediaUrlpath");
            return (Criteria) this;
        }

        public Criteria andMediaUrlpathLessThan(String value) {
            addCriterion("media_urlpath <", value, "mediaUrlpath");
            return (Criteria) this;
        }

        public Criteria andMediaUrlpathLessThanOrEqualTo(String value) {
            addCriterion("media_urlpath <=", value, "mediaUrlpath");
            return (Criteria) this;
        }

        public Criteria andMediaUrlpathLike(String value) {
            addCriterion("media_urlpath like", value, "mediaUrlpath");
            return (Criteria) this;
        }

        public Criteria andMediaUrlpathNotLike(String value) {
            addCriterion("media_urlpath not like", value, "mediaUrlpath");
            return (Criteria) this;
        }

        public Criteria andMediaUrlpathIn(List<String> values) {
            addCriterion("media_urlpath in", values, "mediaUrlpath");
            return (Criteria) this;
        }

        public Criteria andMediaUrlpathNotIn(List<String> values) {
            addCriterion("media_urlpath not in", values, "mediaUrlpath");
            return (Criteria) this;
        }

        public Criteria andMediaUrlpathBetween(String value1, String value2) {
            addCriterion("media_urlpath between", value1, value2, "mediaUrlpath");
            return (Criteria) this;
        }

        public Criteria andMediaUrlpathNotBetween(String value1, String value2) {
            addCriterion("media_urlpath not between", value1, value2, "mediaUrlpath");
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