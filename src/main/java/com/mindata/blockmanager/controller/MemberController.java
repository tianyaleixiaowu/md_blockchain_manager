package com.mindata.blockmanager.controller;

import com.mindata.blockmanager.manager.MemberManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource
    private MemberManager memberManager;

    @GetMapping
    public Object checkId(String name, String memberId, String ip) {
        return memberManager.checkIdAndIp(name, memberId, ip);
    }
}
