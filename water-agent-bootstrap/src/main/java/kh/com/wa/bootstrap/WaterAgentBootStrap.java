package kh.com.wa.bootstrap;

import kh.com.wa.application.WaterAgentApplicationConfiguration;
import kh.com.wa.data.jpa.WaterAgentDataJPAConfiguration;
import kh.com.wa.rest.WaterAgentRestConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value = {WaterAgentRestConfiguration.class, WaterAgentDataJPAConfiguration.class, WaterAgentApplicationConfiguration.class})
public class WaterAgentBootStrap {
    public static void main(String[] args) {
        SpringApplication.run(WaterAgentBootStrap.class, args);
    }
}
