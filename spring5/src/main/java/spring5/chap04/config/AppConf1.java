package spring5.chap04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring5.chap04.service.MemberPrinter;
import spring5.chap04.repository.MemberDao;

@Configuration
public class AppConf1 {
    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberPrinter memberPrinter() {
        return new MemberPrinter();
    }
}
