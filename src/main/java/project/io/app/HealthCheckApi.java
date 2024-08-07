package project.io.app;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckApi {

    @GetMapping("/api/health-check")
    public ResponseEntity<String> ok() {
        return ResponseEntity.ok("OK");
    }
}
