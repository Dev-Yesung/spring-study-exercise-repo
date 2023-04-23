package com.example.inflearn_spring;

import com.example.inflearn_spring.aop.TimeTraceAop;
import com.example.inflearn_spring.repository.MemberRepository;
import com.example.inflearn_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    @Bean
//    public TimeTraceAop timeTraceApp() {
//       return new TimeTraceAop();
//    }
}
