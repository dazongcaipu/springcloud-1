package com.example.servicemedia.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrExample() {
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

        public Criteria andRoleidIsNull() {
            addCriterion("roleID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleID not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("telphone is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("telphone =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("telphone <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("telphone >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("telphone >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("telphone <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("telphone <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("telphone like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("telphone not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("telphone in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("telphone not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("telphone between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("telphone not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRecorddateIsNull() {
            addCriterion("recordDate is null");
            return (Criteria) this;
        }

        public Criteria andRecorddateIsNotNull() {
            addCriterion("recordDate is not null");
            return (Criteria) this;
        }

        public Criteria andRecorddateEqualTo(Date value) {
            addCriterion("recordDate =", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateNotEqualTo(Date value) {
            addCriterion("recordDate <>", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateGreaterThan(Date value) {
            addCriterion("recordDate >", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateGreaterThanOrEqualTo(Date value) {
            addCriterion("recordDate >=", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateLessThan(Date value) {
            addCriterion("recordDate <", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateLessThanOrEqualTo(Date value) {
            addCriterion("recordDate <=", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateIn(List<Date> values) {
            addCriterion("recordDate in", values, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateNotIn(List<Date> values) {
            addCriterion("recordDate not in", values, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateBetween(Date value1, Date value2) {
            addCriterion("recordDate between", value1, value2, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateNotBetween(Date value1, Date value2) {
            addCriterion("recordDate not between", value1, value2, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecordpersonIsNull() {
            addCriterion("recordPerson is null");
            return (Criteria) this;
        }

        public Criteria andRecordpersonIsNotNull() {
            addCriterion("recordPerson is not null");
            return (Criteria) this;
        }

        public Criteria andRecordpersonEqualTo(String value) {
            addCriterion("recordPerson =", value, "recordperson");
            return (Criteria) this;
        }

        public Criteria andRecordpersonNotEqualTo(String value) {
            addCriterion("recordPerson <>", value, "recordperson");
            return (Criteria) this;
        }

        public Criteria andRecordpersonGreaterThan(String value) {
            addCriterion("recordPerson >", value, "recordperson");
            return (Criteria) this;
        }

        public Criteria andRecordpersonGreaterThanOrEqualTo(String value) {
            addCriterion("recordPerson >=", value, "recordperson");
            return (Criteria) this;
        }

        public Criteria andRecordpersonLessThan(String value) {
            addCriterion("recordPerson <", value, "recordperson");
            return (Criteria) this;
        }

        public Criteria andRecordpersonLessThanOrEqualTo(String value) {
            addCriterion("recordPerson <=", value, "recordperson");
            return (Criteria) this;
        }

        public Criteria andRecordpersonLike(String value) {
            addCriterion("recordPerson like", value, "recordperson");
            return (Criteria) this;
        }

        public Criteria andRecordpersonNotLike(String value) {
            addCriterion("recordPerson not like", value, "recordperson");
            return (Criteria) this;
        }

        public Criteria andRecordpersonIn(List<String> values) {
            addCriterion("recordPerson in", values, "recordperson");
            return (Criteria) this;
        }

        public Criteria andRecordpersonNotIn(List<String> values) {
            addCriterion("recordPerson not in", values, "recordperson");
            return (Criteria) this;
        }

        public Criteria andRecordpersonBetween(String value1, String value2) {
            addCriterion("recordPerson between", value1, value2, "recordperson");
            return (Criteria) this;
        }

        public Criteria andRecordpersonNotBetween(String value1, String value2) {
            addCriterion("recordPerson not between", value1, value2, "recordperson");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("loginName is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("loginName is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("loginName =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("loginName <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("loginName >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("loginName >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("loginName <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("loginName <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("loginName like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("loginName not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("loginName in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("loginName not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("loginName between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("loginName not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("loginTime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("loginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Date value) {
            addCriterion("loginTime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Date value) {
            addCriterion("loginTime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Date value) {
            addCriterion("loginTime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loginTime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Date value) {
            addCriterion("loginTime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("loginTime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Date> values) {
            addCriterion("loginTime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Date> values) {
            addCriterion("loginTime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Date value1, Date value2) {
            addCriterion("loginTime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("loginTime not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeIsNull() {
            addCriterion("logoutTime is null");
            return (Criteria) this;
        }

        public Criteria andLogouttimeIsNotNull() {
            addCriterion("logoutTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogouttimeEqualTo(Date value) {
            addCriterion("logoutTime =", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeNotEqualTo(Date value) {
            addCriterion("logoutTime <>", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeGreaterThan(Date value) {
            addCriterion("logoutTime >", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logoutTime >=", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeLessThan(Date value) {
            addCriterion("logoutTime <", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeLessThanOrEqualTo(Date value) {
            addCriterion("logoutTime <=", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeIn(List<Date> values) {
            addCriterion("logoutTime in", values, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeNotIn(List<Date> values) {
            addCriterion("logoutTime not in", values, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeBetween(Date value1, Date value2) {
            addCriterion("logoutTime between", value1, value2, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeNotBetween(Date value1, Date value2) {
            addCriterion("logoutTime not between", value1, value2, "logouttime");
            return (Criteria) this;
        }

        public Criteria andUserprotocolIsNull() {
            addCriterion("userProtocol is null");
            return (Criteria) this;
        }

        public Criteria andUserprotocolIsNotNull() {
            addCriterion("userProtocol is not null");
            return (Criteria) this;
        }

        public Criteria andUserprotocolEqualTo(Integer value) {
            addCriterion("userProtocol =", value, "userprotocol");
            return (Criteria) this;
        }

        public Criteria andUserprotocolNotEqualTo(Integer value) {
            addCriterion("userProtocol <>", value, "userprotocol");
            return (Criteria) this;
        }

        public Criteria andUserprotocolGreaterThan(Integer value) {
            addCriterion("userProtocol >", value, "userprotocol");
            return (Criteria) this;
        }

        public Criteria andUserprotocolGreaterThanOrEqualTo(Integer value) {
            addCriterion("userProtocol >=", value, "userprotocol");
            return (Criteria) this;
        }

        public Criteria andUserprotocolLessThan(Integer value) {
            addCriterion("userProtocol <", value, "userprotocol");
            return (Criteria) this;
        }

        public Criteria andUserprotocolLessThanOrEqualTo(Integer value) {
            addCriterion("userProtocol <=", value, "userprotocol");
            return (Criteria) this;
        }

        public Criteria andUserprotocolIn(List<Integer> values) {
            addCriterion("userProtocol in", values, "userprotocol");
            return (Criteria) this;
        }

        public Criteria andUserprotocolNotIn(List<Integer> values) {
            addCriterion("userProtocol not in", values, "userprotocol");
            return (Criteria) this;
        }

        public Criteria andUserprotocolBetween(Integer value1, Integer value2) {
            addCriterion("userProtocol between", value1, value2, "userprotocol");
            return (Criteria) this;
        }

        public Criteria andUserprotocolNotBetween(Integer value1, Integer value2) {
            addCriterion("userProtocol not between", value1, value2, "userprotocol");
            return (Criteria) this;
        }

        public Criteria andVercodeIsNull() {
            addCriterion("verCode is null");
            return (Criteria) this;
        }

        public Criteria andVercodeIsNotNull() {
            addCriterion("verCode is not null");
            return (Criteria) this;
        }

        public Criteria andVercodeEqualTo(String value) {
            addCriterion("verCode =", value, "vercode");
            return (Criteria) this;
        }

        public Criteria andVercodeNotEqualTo(String value) {
            addCriterion("verCode <>", value, "vercode");
            return (Criteria) this;
        }

        public Criteria andVercodeGreaterThan(String value) {
            addCriterion("verCode >", value, "vercode");
            return (Criteria) this;
        }

        public Criteria andVercodeGreaterThanOrEqualTo(String value) {
            addCriterion("verCode >=", value, "vercode");
            return (Criteria) this;
        }

        public Criteria andVercodeLessThan(String value) {
            addCriterion("verCode <", value, "vercode");
            return (Criteria) this;
        }

        public Criteria andVercodeLessThanOrEqualTo(String value) {
            addCriterion("verCode <=", value, "vercode");
            return (Criteria) this;
        }

        public Criteria andVercodeLike(String value) {
            addCriterion("verCode like", value, "vercode");
            return (Criteria) this;
        }

        public Criteria andVercodeNotLike(String value) {
            addCriterion("verCode not like", value, "vercode");
            return (Criteria) this;
        }

        public Criteria andVercodeIn(List<String> values) {
            addCriterion("verCode in", values, "vercode");
            return (Criteria) this;
        }

        public Criteria andVercodeNotIn(List<String> values) {
            addCriterion("verCode not in", values, "vercode");
            return (Criteria) this;
        }

        public Criteria andVercodeBetween(String value1, String value2) {
            addCriterion("verCode between", value1, value2, "vercode");
            return (Criteria) this;
        }

        public Criteria andVercodeNotBetween(String value1, String value2) {
            addCriterion("verCode not between", value1, value2, "vercode");
            return (Criteria) this;
        }

        public Criteria andEffecttimeIsNull() {
            addCriterion("effectTime is null");
            return (Criteria) this;
        }

        public Criteria andEffecttimeIsNotNull() {
            addCriterion("effectTime is not null");
            return (Criteria) this;
        }

        public Criteria andEffecttimeEqualTo(Date value) {
            addCriterion("effectTime =", value, "effecttime");
            return (Criteria) this;
        }

        public Criteria andEffecttimeNotEqualTo(Date value) {
            addCriterion("effectTime <>", value, "effecttime");
            return (Criteria) this;
        }

        public Criteria andEffecttimeGreaterThan(Date value) {
            addCriterion("effectTime >", value, "effecttime");
            return (Criteria) this;
        }

        public Criteria andEffecttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("effectTime >=", value, "effecttime");
            return (Criteria) this;
        }

        public Criteria andEffecttimeLessThan(Date value) {
            addCriterion("effectTime <", value, "effecttime");
            return (Criteria) this;
        }

        public Criteria andEffecttimeLessThanOrEqualTo(Date value) {
            addCriterion("effectTime <=", value, "effecttime");
            return (Criteria) this;
        }

        public Criteria andEffecttimeIn(List<Date> values) {
            addCriterion("effectTime in", values, "effecttime");
            return (Criteria) this;
        }

        public Criteria andEffecttimeNotIn(List<Date> values) {
            addCriterion("effectTime not in", values, "effecttime");
            return (Criteria) this;
        }

        public Criteria andEffecttimeBetween(Date value1, Date value2) {
            addCriterion("effectTime between", value1, value2, "effecttime");
            return (Criteria) this;
        }

        public Criteria andEffecttimeNotBetween(Date value1, Date value2) {
            addCriterion("effectTime not between", value1, value2, "effecttime");
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