package com.sparta.beckendproject.repository;


import java.util.Optional;

import com.sparta.beckendproject.domain.Member;
import com.sparta.beckendproject.domain.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
  Optional<RefreshToken> findByMember(Member member);
}
