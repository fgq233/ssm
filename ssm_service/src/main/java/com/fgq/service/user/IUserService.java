package com.fgq.service.user;

import com.fgq.domain.organ.SysOrgan;
import com.fgq.domain.user.SysUser;
import com.fgq.domain.user.UserEx;

import java.util.List;

public interface IUserService {

    SysUser findUserByName(String userName);

    SysUser findUserLikeName(String userName);

    void addUser(SysUser user);

    void deleteUser(Long id);

    void updateUser(SysUser user);

    List<SysUser> findUserbyIds1(UserEx userEx);

    List<SysUser> findUserbyIds2(List<Long> ids);

    List<SysUser> getUses();

    List<SysOrgan> getOrganUsers();
}
