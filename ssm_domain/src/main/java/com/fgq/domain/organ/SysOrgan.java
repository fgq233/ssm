package com.fgq.domain.organ;

import com.fgq.domain.user.SysUser;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class SysOrgan implements Serializable {

    private Long id;

    private String jgmc;

    private Date cjsj;

    private List<SysUser> userList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJgmc() {
        return jgmc;
    }

    public void setJgmc(String jgmc) {
        this.jgmc = jgmc;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public List<SysUser> getUserList() {
        return userList;
    }

    public void setUserList(List<SysUser> userList) {
        this.userList = userList;
    }
}
