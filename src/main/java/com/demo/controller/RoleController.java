package com.demo.controller;

import com.demo.domain.Role;
import com.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xiaozhao
 * @date 2018/8/6上午10:30
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Role> findAll() {
        return roleService.queryAll();
    }
}
