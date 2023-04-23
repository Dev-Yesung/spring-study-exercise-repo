package spring5.chap06.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import spring5.chap06.Client;
import spring5.chap06.Client2;
import spring5.chap06.repository.MemberDao;
import spring5.chap06.service.MemberPrinter;
import spring5.chap06.service.MemberSummaryPrinter;
import spring5.chap06.service.VersionPrinter;

@Configuration
@ComponentScan(basePackages = {"spring5.chap06"},
        excludeFilters = @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MemberDao.class))
public class AppCtx {

//    @Bean
//    public MemberDao memberDao() {
//        return new MemberDao();
//    }

    @Bean
    public Client client() {
        Client client = new Client();
        client.setHost("YoSong");
        return client;
    }

    @Bean(initMethod = "connect", destroyMethod = "close")
    public Client2 client2() {
        Client2 client = new Client2();
        client.setHost("YoSong");
        return client;
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

//    @Bean
//    public MemberRegisterService memberRegSvc() {
//        return new MemberRegisterService();
//    }

//    @Bean
//    public ChangePasswordService changePwdSvc() {
//        return new ChangePasswordService();
//    }

//    @Bean
//    public MemberPrinter memberPrinter() {
//        return new MemberPrinter();
//    }

//    @Bean
//    public MemberListPrinter listPrinter() {
//        return new MemberListPrinter();
//    }

//    @Bean
//    public MemberInfoPrinter infoPrinter() {
//        MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
//        infoPrinter.setPrinter(memberPrinter2());
//        return infoPrinter;
//    }

    @Bean
    public VersionPrinter versionPrinter() {
        VersionPrinter versionPrinter = new VersionPrinter();
        versionPrinter.setMajorVersion(5);
        versionPrinter.setMinorVersion(0);
        return versionPrinter;
    }
}
