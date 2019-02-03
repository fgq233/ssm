package com.fgq.dao.link;

import com.fgq.domain.organ.SysOrgan;
import com.fgq.domain.user.SysUser;

import java.util.List;

public interface LinkeMapper {

    List<SysUser> getUses();

    List<SysOrgan> getOrganUsers();
}
