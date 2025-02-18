package com.yorijori.foodcode.jpa.repository;
 
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yorijori.foodcode.jpa.entity.UserInfo;


@Repository
public interface MemberRepository extends JpaRepository<UserInfo, Long> {
    UserInfo findByUserIdAndPass(String user_id, String pass);
    UserInfo findByKakaoID(String kakaoID);
    
    
    

}