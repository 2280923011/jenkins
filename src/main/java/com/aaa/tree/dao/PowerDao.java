package com.aaa.tree.dao;

import com.aaa.tree.entity.Node;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PowerDao {

    /**
     * 权限列表查询
     * @return
     */
    @Select("select id, name as label, iconcls as iconClass, url, parentid pid from tb_power")
    List<Node> getList();
}
