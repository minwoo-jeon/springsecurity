package com.example.springsecurity.repository;


import com.example.springsecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
        // -> jpaRepostTory 인터페이스 상속받으면 기본 crud 메서드가 자동으로 생성
        // @Repository 설정 필요없음,  * 조회는 없어서 만들어줘야함
    UserEntity findByUsername(String name);

    boolean existsByUsername(String username);
}
