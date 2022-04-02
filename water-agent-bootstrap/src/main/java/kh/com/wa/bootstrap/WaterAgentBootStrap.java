package kh.com.wa.bootstrap;

import kh.com.wa.rest.WaterAgentRestConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({WaterAgentRestConfiguration.class})
public class WaterAgentBootStrap {
    public static void main(String[] args) {
        SpringApplication.run(WaterAgentBootStrap.class, args);
    }
}
