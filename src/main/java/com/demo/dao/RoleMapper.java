package com.demo.dao;

import com.demo.domain.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xiaozhao
 * @date 2018/8/6上午10:28
 */
@Mapper
public interface RoleMapper {
    /**
     * 查询所有角色
     *
     * @return
     */
    List<Role> queryAll();
}
