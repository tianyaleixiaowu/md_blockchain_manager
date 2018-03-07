package com.mindata.blockmanager.repository;

import com.mindata.blockmanager.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByName(String name);
}
