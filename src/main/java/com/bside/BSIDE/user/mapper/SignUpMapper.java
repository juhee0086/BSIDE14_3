package com.bside.BSIDE.user.mapper;

import com.bside.BSIDE.user.dto.UserDto;

public interface SignUpMapper {
    int duplicateCheck(String eml);
    void createMember(UserDto userDto);
}
