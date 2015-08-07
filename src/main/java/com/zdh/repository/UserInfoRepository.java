package com.zdh.repository;

import com.zdh.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhangdh-a
 * @description TODO
 * @created 15-8-7.
 */
public interface UserInfoRepository extends JpaRepository<UserInfoEntity,Integer> {
}
