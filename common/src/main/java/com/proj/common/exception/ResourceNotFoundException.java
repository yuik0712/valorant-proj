package com.proj.common.exception;

// 리소스를 찾을 수 없을 때 발생하는 예외 (404 상태 코드와 연동)
public class ResourceNotFoundException extends BaseException {
    public ResourceNotFoundException(String message) {
        super(ErrorCode.NOT_FOUND, message);
    }
}