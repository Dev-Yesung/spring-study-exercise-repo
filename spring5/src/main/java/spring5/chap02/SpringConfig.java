package spring5.chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Greeter greeter() {
        Greeter greeter = new Greeter();
        greeter.setFormat("%s, 안녕하세요!");
        return greeter;
    }

    @Bean
    public Greeter anotherGreeter() {
        Greeter greeter = new Greeter();
        greeter.setFormat("%s, 안녕하세요!");
        return greeter;
    }

}
