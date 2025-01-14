package com.codesoom.assignment.application;

import com.codesoom.assignment.domain.User;

/**
 * 토큰 기반 사용자 인증에 대한 비지니스 로직을 처리한다
 * <p>
 * All Known Implementing Classes:
 * @see JwtAuthService
 * </p>
 */
public interface TokenAuthService {
    /**
     * 사용자 인증에 필요한 정보를 받아서 문자열 타입의 토큰으로 반환한다
     * <p>
     * @param email 사용자 이메일 정보
     * @param password 사용자 비밀번호 정보
     * @return 문자열 타입의 토큰
     * </p>
     */
    String login(String email, String password);
}
