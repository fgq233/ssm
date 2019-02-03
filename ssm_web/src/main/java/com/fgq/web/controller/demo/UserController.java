package com.fgq.web.controller.demo;

import com.fgq.domain.user.SysUser;
import com.fgq.domain.user.UserEx;
import com.fgq.service.organ.IOrganService;
import com.fgq.service.user.IUserService;
import com.fgq.util.data.AjaxReturn;
import com.fgq.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private IOrganService organService;
    @Autowired
    private IUserService userService;


    @RequestMapping("/findUserByName")
    public String findUserByName(Model model, String userName){
        model.addAttribute("user",userService.findUserByName(userName));
        return "demo/userDetail";
    }


    @RequestMapping("/findUserLikeName")
    public String findUserLikeName(Model model, String userName){
        model.addAttribute("user",userService.findUserLikeName(userName));
        return "demo/userDetail";
    }


    @RequestMapping("/addUserPage")
    public String addUser(Model model){
        model.addAttribute("organList",organService.getAllOrgan());
        return "demo/addUser";
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public AjaxReturn addUser(SysUser user){
        userService.addUser(user);
        return new AjaxReturn(true, user.getId());
    }


    @RequestMapping("/deleteUser")
    @ResponseBody
    public AjaxReturn deleteUser(Long id){
        userService.deleteUser(id);
        return new AjaxReturn(true);
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public AjaxReturn updateUser(SysUser user){
        userService.updateUser(user);
        return new AjaxReturn(true);
    }

    @RequestMapping("/getUserByIds1")
    public String getUserByIds1(Model model){
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(3L);
        ids.add(11L);
        ids.add(12L);
        ids.add(666L);
        UserEx ex = new UserEx();
        ex.setIds(ids);
        model.addAttribute("userList", userService.findUserbyIds1(ex));
        return "demo/userList";
    }

    @RequestMapping("/getUserByIds2")
    public String getUserByIds2(Model model){
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(3L);
        ids.add(11L);
        ids.add(12L);
        ids.add(666L);
        model.addAttribute("userList", userService.findUserbyIds2(ids));
        return "demo/userList";
    }

    @RequestMapping("/getUsers")
    public String getUsers(Model model){
        model.addAttribute("userList", userService.getUses());
        return "demo/userList";
    }


    @RequestMapping("/getOrganUsers")
    public String getOrganUsers(Model model){
        model.addAttribute("organList", userService.getOrganUsers());
        return "demo/organUsers";
    }
}
