package spring5.chap04.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppCtx.class})
public class AppConfImport {

}
