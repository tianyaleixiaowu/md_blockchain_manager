package com.mindata.blockmanager.model;

import com.mindata.blockmanager.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 联盟的成员
 * @author wuweifeng wrote on 2018/3/5.
 */
@Entity
@Table(name = "member")
public class Member extends BaseEntity {
    /**
     * 节点id，用于校验该客户是否合法，客户端启动时需要带着该值。一个公司可能有多个appId，相当于多个服务器节点
     */
    private String appId;
    /**
     * 成员名
     */
    private String name;
    /**
     * ip（可不设置，由该成员客户端启动后自行检测）
     */
    private String ip;
    /**
     * 属于哪个联盟链，groupId
     */
    private String groupId;

    @Override
    public String toString() {
        return "Member{" +
                "appId='" + appId + '\'' +
                ", name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", groupId=" + groupId +
                '}';
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
