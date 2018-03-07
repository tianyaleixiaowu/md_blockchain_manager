package com.mindata.blockmanager.repository;

import com.mindata.blockmanager.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByName(String name);
}
