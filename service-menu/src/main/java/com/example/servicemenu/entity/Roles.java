package com.example.servicemenu.entity;

import java.io.Serializable;
import java.util.Date;

public class Roles implements Serializable {
    private Integer id;

    private String rolename;

    private Date recorddate;

    private String recordperson;

    private String roletype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    public String getRecordperson() {
        return recordperson;
    }

    public void setRecordperson(String recordperson) {
        this.recordperson = recordperson == null ? null : recordperson.trim();
    }

    public String getRoletype() {
        return roletype;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype == null ? null : roletype.trim();
    }
}