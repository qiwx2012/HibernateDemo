package com.qiwx.entities;

import javax.persistence.*;

@Entity
@Table(name = "department2",uniqueConstraints = {@UniqueConstraint(columnNames = {"DEPT_ID"})})
public class DepartMent2 {
    private Integer deptId;
    private String deptName;

    public DepartMent2(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
    public DepartMent2() {
    }

    @Id
    @Column(name = "DEPT_ID")
    public Integer getDeptId() {
        return deptId;
    }
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
    @Column(name = "DEPT_NAME", nullable = false)
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


}
