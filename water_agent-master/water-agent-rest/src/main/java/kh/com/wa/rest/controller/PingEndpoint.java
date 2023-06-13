package kh.com.wa.rest.controller;

import kh.com.wa.rest.dto.TestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api")
public class PingEndpoint {
    @GetMapping("/ping")
    @CrossOrigin
    public ResponseEntity<TestDTO> ping() {
        LOG.info("Ping endpoint reached");
        return ResponseEntity.ok(new TestDTO("pong"));
    }
}
