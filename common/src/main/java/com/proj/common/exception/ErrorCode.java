package com.proj.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

// 시스템 전체 에러 코드 정의 & 각 에러에 http 상태 코드와 메시지 할당
@Getter
public enum ErrorCode {
    // 도메인별 에러 그룹화
    // 공통 에러
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "Bad request"),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "Unauthorized"),
    FORBIDDEN(HttpStatus.FORBIDDEN, "Forbidden"),
    NOT_FOUND(HttpStatus.NOT_FOUND, "Resource not found"),

    // 회원 관련 에러
    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, "Member not found"),
    DUPLICATE_NICKNAME(HttpStatus.CONFLICT, "Nickname already exists"),
    INVALID_TIER(HttpStatus.BAD_REQUEST, "Invalid tier value"),

    // 팀 관련 에러
    TEAM_NOT_FOUND(HttpStatus.NOT_FOUND, "Team not found"),
    TEAM_FULL(HttpStatus.CONFLICT, "Team is already full"),
    INVALID_SERVER_CODE(HttpStatus.BAD_REQUEST, "Invalid server code"),
    NOT_TEAM_LEADER(HttpStatus.FORBIDDEN, "Only team leader can perform this action"),

    // 보안 관련 에러
    INVALID_TOKEN(HttpStatus.UNAUTHORIZED, "Invalid authentication token"),
    TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "Authentication token expired"),
    ACCESS_DENIED(HttpStatus.FORBIDDEN, "Access denied");

    private final HttpStatus httpStatus;
    private final String message;

    ErrorCode(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }
}