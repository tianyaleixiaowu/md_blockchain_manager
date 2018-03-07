package com.mindata.blockmanager.manager;

import com.mindata.blockmanager.repository.MemberGroupRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
@Component
public class MemberGroupManager {
    @Resource
    private MemberGroupRepository memberGroupRepository;
}
