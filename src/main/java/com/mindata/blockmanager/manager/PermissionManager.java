package com.mindata.blockmanager.manager;

import com.mindata.blockmanager.bean.PermissionData;
import com.mindata.blockmanager.model.Permission;
import com.mindata.blockmanager.repository.PermissionRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wuweifeng wrote on 2018/4/10.
 */
@Service
public class PermissionManager {
    @Resource
    private PermissionRepository permissionRepository;
    @Resource
    private MemberManager memberManager;

    /**
     * 查询某个联盟内的所有权限
     *
     * @param memberName
     *         memberName
     * @return PermissionData
     */
    public PermissionData findGroupPermission(String memberName) {
        PermissionData permissionData = new PermissionData();
        String groupId = memberManager.findGroupId(memberName);
        permissionData.setPermissions(findPermission(groupId));
        permissionData.setCode(0);
        return permissionData;
    }

    private List<Permission> findPermission(String groupId) {
        return permissionRepository.findByGroupId(groupId);
    }
}
