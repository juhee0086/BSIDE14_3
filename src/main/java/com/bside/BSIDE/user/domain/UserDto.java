package com.bside.BSIDE.user.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    @Email(message = "올바른 이메일 주소를 입력해주세요.")
	@Schema(description = "이메일", nullable = false)
    private String eml;

	@Schema(description = "사용자 이름", nullable = false)
    private String usrNm;

	@Schema(description = "사용자 비밀번호")
    private String password;

    @Schema(description = "SNS 타입", defaultValue = "N", allowableValues = {"N", "Y"})
    private String snsClsCd;

    @Schema(description = "SNS 토큰")
    private String snsToken;

    @Schema(description = "성별구분")
    private String gndrClsCd;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Schema(description = "생년월일", example = "yyyyMMdd", maxLength = 8)
    private String brdt;

    @Schema(description = "계정 생성일자")
    private String joinDtm;

    @Schema(description = "최종 로그인 일자")
    private String lastLgnDtm;

    @Schema(description = "계정 수정일자")
    private String updateDtm;

    @Schema(description = "탈퇴일자")
    private String whdwlDtm;

}
