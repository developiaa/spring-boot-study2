package hello.autoconfig.selector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig2 {

    @Bean
    public HelloBean2 helloBean2() {
        return new HelloBean2();
    }
}
