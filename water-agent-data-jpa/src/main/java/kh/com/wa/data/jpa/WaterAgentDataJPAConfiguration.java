package kh.com.wa.data.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"kh.com.wa.data.jpa.repository"})
@EntityScan(basePackages = {"kh.com.wa.data.jpa.entity"})
@ComponentScan(basePackages = {"kh.com.wa.data.jpa.repository"})
public class WaterAgentDataJPAConfiguration {
}
