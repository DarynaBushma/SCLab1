package org.example.sclab1;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthz")
public class HealthController {

    @GetMapping("/live")
    public ResponseEntity<Map<String, String>> livenessCheck() {
        Map<String, String> response = new LinkedHashMap<>();
        response.put("status", "alive");
        response.put("timestamp", Instant.now().truncatedTo(ChronoUnit.SECONDS).toString());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/ready")
    public ResponseEntity<Map<String, String>> readinessCheck() {
        Map<String, String> response = new LinkedHashMap<>();
        response.put("status", "ready");
        response.put("database", "not_connected_yet");
        response.put("timestamp", Instant.now().truncatedTo(ChronoUnit.SECONDS).toString());
        return ResponseEntity.ok(response);
    }
}