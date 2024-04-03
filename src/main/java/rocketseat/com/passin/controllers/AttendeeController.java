package rocketseat.com.passin.controllers;

import jakarta.persistence.Entity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendees")
public class AttendeeController {
    @GetMapping
    public ResponseEntity<String> getTest(){
        return ResponseEntity.ok("sucesso");
    }
}
