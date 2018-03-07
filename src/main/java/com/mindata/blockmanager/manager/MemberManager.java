package com.mindata.blockmanager.manager;

import com.mindata.blockmanager.model.Member;
import com.mindata.blockmanager.repository.MemberRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
@Component
public class MemberManager {
    @Resource
    private MemberRepository memberRepository;

    public int checkIdAndIp(String name, String id, String ip) {
        Member member = memberRepository.findByName(name);
        //客户不存在
        if (member == null) {
            return -1;
        } else if (!member.getMemberId().equals(id)) {
            //id错误
            return -2;
        } else if (!member.getIp().equals(ip)) {
            //ip错误
            return -3;
        }
        return 0;
    }
}
