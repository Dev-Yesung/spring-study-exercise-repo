package spring5.chap05.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring5.chap05.repository.MemberDao;
import spring5.chap05.service.MemberPrinter;

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
