package kh.com.wa.rest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/")
public class PingEndpoint {
    @GetMapping("ping")
    public void ping() {
        LOG.info("Ping endpoint reached");
    }
}
