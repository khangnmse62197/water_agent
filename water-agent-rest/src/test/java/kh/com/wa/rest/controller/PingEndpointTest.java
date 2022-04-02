package kh.com.wa.rest.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class PingEndpointTest {

    @InjectMocks
    private PingEndpoint pingEndpoint;

    @Test
    void test_ping_end_point() {
        // When
        ResponseEntity<String> pong = pingEndpoint.ping();

        // Then
        assertThat(pong).isNotNull();
        assertThat(pong.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(pong.getBody()).isEqualTo("pong");
    }
}