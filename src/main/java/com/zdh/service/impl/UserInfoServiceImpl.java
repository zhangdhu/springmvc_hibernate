package com.zdh.service.impl;

import com.zdh.entity.UserInfoEntity;
import com.zdh.repository.UserInfoRepository;
import com.zdh.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhangdh-a
 * @description TODO
 * @created 15-8-7.
 */
@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoRepository userInfoRepository;
    public UserInfoEntity save(UserInfoEntity userInfoEntity){
        return userInfoRepository.save(userInfoEntity);
    }

}
