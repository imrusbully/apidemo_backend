package com.demo.common.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("api/v1/health")
    public Map<String, Object> health() {
        return Map.of(
                "status", "UP",
                "service", "api-testing-demo-api",
                "timestamp", Instant.now()
        );
    }

}
