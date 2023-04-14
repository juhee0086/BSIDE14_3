package com.bside.BSIDE.user.service;

import com.bside.BSIDE.user.dto.UserDto;

import java.util.Map;

public interface SignUpService {

    // 이메일 중복체크
    Map<String, Object> duplicateCheck(String eml) throws Exception;
    // 회원가입
    void createMember(UserDto userDto) throws Exception;

}
