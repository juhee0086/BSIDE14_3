package com.bside.BSIDE.user.controller;

import com.bside.BSIDE.user.dto.UserDto;
import com.bside.BSIDE.user.service.SignUpService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
*
* SignUpController
*
* @author Kang juhee
* @version 1.0.0
* 작성일: 2023-04-13
**/
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class SignUpController {

    private final SignUpService signUpService;

    @ApiOperation(value = "이메일 중복체크", notes = "String eml")
    @PostMapping("/duplicate-check")
    public ResponseEntity<?> duplicateCheck(@RequestBody String eml) throws Exception {
        log.info("eml: {}", eml);
        Map<String, Object> dupli = signUpService.duplicateCheck(eml);

        return new ResponseEntity<>(dupli, HttpStatus.CONFLICT);
    }

    @ApiOperation(value = "회원가입", notes = "Model: UserDto")
    @PostMapping("/sign-up")
    public ResponseEntity<?> signUp(@RequestBody UserDto userDto) throws Exception {
        log.debug("userDto: {}", String.valueOf(userDto));
        Map<String, Object> result = new HashMap<>();
        signUpService.createMember(userDto);
        result.put("resultMsg", "회원가입이 완료되었습니다.");
        return new ResponseEntity<>(result, HttpStatus.OK);

    }

}
