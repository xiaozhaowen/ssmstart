package com.demo.service;

import com.demo.dao.RoleMapper;
import com.demo.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaozhao
 * @date 2018/7/20下午4:38
 */
@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public List<Role> queryAll() {
        return roleMapper.queryAll();
    }
}
