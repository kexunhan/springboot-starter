package cn.kolmap.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kxhan
 * @createTime 2020/12/02
 */
@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(HelloProterties.class)
public class HelloServiceConfiguration {

    @Autowired
    private HelloProterties helloProterties;

    @Bean
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setHelloProterties(helloProterties);
        return helloService;
    }
}
