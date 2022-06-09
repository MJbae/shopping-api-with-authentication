package com.codesoom.assignment.auth;

import java.security.Key;

/**
 * 해쉬 알고리즘이 적용된 비밀키를 반환한다
 * <p>
 * All Known Extending Classes:
 * JwtKey
 * </p>
 */
public interface SecretKey {
    /**
     * 해쉬 알고리즘이 적용된 비밀키를 반환한다
     * <p>
     * @return Key 타입의 해쉬화된 비밀키
     * </p>
     */
    Key hashed();
}
