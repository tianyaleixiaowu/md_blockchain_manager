package com.mindata.blockmanager.model;

import com.mindata.blockmanager.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 联盟链，多个节点组成一个group，一个group为一个联盟链
 * @author wuweifeng wrote on 2018/3/5.
 */
@Entity
@Table(name = "member_group")
public class MemberGroup extends BaseEntity {
    private String name;
    /**
     * 设置一个业务id
     */
    private String groupId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", groupId='" + groupId + '\'' +
                '}';
    }
}
