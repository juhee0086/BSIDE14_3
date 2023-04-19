package com.bside.BSIDE.user.persistence;

import com.bside.BSIDE.user.domain.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SignUpMapper {
    int duplicateCheck(String eml);
    void createMember(UserDto userDto);
}
