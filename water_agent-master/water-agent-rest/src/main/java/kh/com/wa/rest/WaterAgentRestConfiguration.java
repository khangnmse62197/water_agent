package kh.com.wa.rest;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "kh.com.wa")
@Configuration
@EnableJpaRepositories(basePackages = "kh.com.wa.rest.repo")

public class WaterAgentRestConfiguration {

}
