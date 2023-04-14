package com.bside.BSIDE.user.service;

import com.bside.BSIDE.user.dto.UserDto;
import com.bside.BSIDE.user.mapper.SignUpMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@RequiredArgsConstructor
@Service("SignUpServiceImpl")
public class SignUpServiceImpl implements SignUpService{
    private final SignUpMapper signUpMapper;

    @Override
    public Map<String, Object> duplicateCheck(String eml) throws Exception {
        return null;
    }

    @Override
    public void createMember(UserDto userDto) throws Exception {
         /*
        Todo:
         이메일 유효검사
         추후 sns 로그인 추가 필요
         */
        // password 암호화
//        String password = passwordEncoder.encode(userDto.getPassword());
        userDto.setPassword(userDto.getPassword());
        // 회원가입
        signUpMapper.createMember(userDto);
    }
}
