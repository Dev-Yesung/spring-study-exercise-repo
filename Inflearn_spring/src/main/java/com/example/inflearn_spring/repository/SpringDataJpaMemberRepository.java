package com.example.inflearn_spring.repository;

import com.example.inflearn_spring.domain.Member;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>,
        MemberRepository {

    @Override
    Optional<Member> findByName(String name);
}
