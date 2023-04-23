package com.bside.BSIDE.user.service;

import com.bside.BSIDE.user.domain.UserDto;
import com.bside.BSIDE.user.persistence.SignUpMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@RequiredArgsConstructor
@Service("SignUpServiceImpl")
public class SignUpServiceImpl implements SignUpService{
    private final SignUpMapper signUpMapper;

    @Override
    public int duplicateCheck(String eml) throws Exception {
        int result = 1;
        result = signUpMapper.duplicateCheck(eml);
        return result;
    }

    @Override
    public void createMember(UserDto userDto) throws Exception {
         /*
        Todo: 추후 sns 로그인 추가 필요
         */
        // password 암호화
//        String password = passwordEncoder.encode(userDto.getPassword());
        userDto.setPassword(userDto.getPassword());
        // 회원가입
        signUpMapper.createMember(userDto);
    }

    @Override
    public Map<String, Object> selectMember(String eml) throws Exception {
        Map<String, Object> reslt = signUpMapper.selectMember(eml);
        return reslt;
    }
}
