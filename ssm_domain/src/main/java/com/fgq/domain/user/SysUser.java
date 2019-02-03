package com.fgq.domain.user;

import com.fgq.domain.organ.SysOrgan;

import java.io.Serializable;
import java.util.Date;


public class SysUser implements Serializable {

    private Long id;

    private String login_name;

    private String login_pwd;

    private Long default_organ_id;

    private Date cjsj;

    //一对一
    private SysOrgan organ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getLogin_pwd() {
        return login_pwd;
    }

    public void setLogin_pwd(String login_pwd) {
        this.login_pwd = login_pwd;
    }

    public Long getDefault_organ_id() {
        return default_organ_id;
    }

    public void setDefault_organ_id(Long default_organ_id) {
        this.default_organ_id = default_organ_id;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public SysOrgan getOrgan() {
        return organ;
    }

    public void setOrgan(SysOrgan organ) {
        this.organ = organ;
    }
}
