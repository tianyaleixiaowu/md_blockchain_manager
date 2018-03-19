package com.mindata.blockmanager.bean;

import com.mindata.blockmanager.model.Member;

import java.util.List;

/**
 * @author wuweifeng wrote on 2018/3/19.
 */
public class MemberData extends BaseData {
    private List<Member> members;

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
