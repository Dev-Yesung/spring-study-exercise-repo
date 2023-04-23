package spring5.chap04.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring5.chap04.service.MemberInfoPrinter;
import spring5.chap04.service.MemberListPrinter;
import spring5.chap04.service.MemberPrinter;
import spring5.chap04.service.MemberSummaryPrinter;
import spring5.chap04.service.VersionPrinter;
import spring5.chap04.repository.MemberDao;
import spring5.chap04.service.ChangePasswordService;
import spring5.chap04.service.MemberRegisterService;

@Configuration
public class AppCtx {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    @Qualifier("printer")
    public MemberPrinter memberPrinter1() {
        return new MemberPrinter();
    }

    @Bean
    public MemberSummaryPrinter memberPrinter2() {
        return new MemberSummaryPrinter();
    }

    @Bean
    public MemberRegisterService memberRegSvc() {
        return new MemberRegisterService();
    }

    @Bean
    public ChangePasswordService changePwdSvc() {
        return new ChangePasswordService();
    }

//    @Bean
//    public MemberPrinter memberPrinter() {
//        return new MemberPrinter();
//    }

    @Bean
    public MemberListPrinter listPrinter() {
        return new MemberListPrinter();
    }

    @Bean
    public MemberInfoPrinter infoPrinter() {
        MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
        infoPrinter.setPrinter(memberPrinter2());
        return infoPrinter;
    }

    @Bean
    public VersionPrinter versionPrinter() {
        VersionPrinter versionPrinter = new VersionPrinter();
        versionPrinter.setMajorVersion(5);
        versionPrinter.setMinorVersion(0);
        return versionPrinter;
    }
}
