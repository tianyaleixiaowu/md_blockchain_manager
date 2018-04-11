package com.mindata.blockmanager.repository;

import com.mindata.blockmanager.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface PermissionRepository extends JpaRepository<Permission, Long> {
    /**
     * 查询某个group的所有权限
     * @param groupId
     * 联盟链id
     * @return
     * 权限集合
     */
    List<Permission> findByGroupId(String groupId);

}
