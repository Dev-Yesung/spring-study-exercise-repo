package spring5.chap03.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConf1.class})
public class AppConfImport {

}
