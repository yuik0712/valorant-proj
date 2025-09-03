package com.proj.common.exception;

// 비즈니스 규칙 위반 시 발생하는 예외 (도메인 로직 검증 실패 시에도 사용)
public class BusinessRuleException extends RuntimeException {
    public BusinessRuleException(String message) {
        super(message);
    }
}
