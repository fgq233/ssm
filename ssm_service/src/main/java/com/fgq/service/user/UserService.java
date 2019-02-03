package com.fgq.service.user;

import com.fgq.dao.demo.UserMapper;
import com.fgq.dao.link.LinkeMapper;
import com.fgq.domain.organ.SysOrgan;
import com.fgq.domain.user.SysUser;
import com.fgq.domain.user.UserEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService  implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private LinkeMapper linkeMapper;

    @Override
    public SysUser findUserByName(String userName) {
        return userMapper.findUserByName(userName);
    }

    @Override
    public SysUser findUserLikeName(String userName) {
        return userMapper.findUserLikeName(userName);
    }

    @Override
    public void addUser(SysUser user) {
        userMapper.addUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userMapper.deleteUser(id);
    }

    @Override
    public void updateUser(SysUser user) {
        userMapper.updateUser(user);
    }

    @Override
    public List<SysUser> findUserbyIds1(UserEx userEx) {
        return userMapper.findUserbyIds1(userEx);
    }

    @Override
    public List<SysUser> findUserbyIds2(List<Long> ids) {
        return userMapper.findUserbyIds2(ids);
    }

    @Override
    public List<SysUser> getUses() {
        return linkeMapper.getUses();
    }

    @Override
    public List<SysOrgan> getOrganUsers() {
        return linkeMapper.getOrganUsers();
    }
}
