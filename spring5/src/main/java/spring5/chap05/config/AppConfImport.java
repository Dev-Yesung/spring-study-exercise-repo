package spring5.chap05.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppCtx.class})
public class AppConfImport {

}
