package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.MorseService;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/morse")
public class MorseController {

    @Autowired
    MorseService morseService;

    @GetMapping("/converter/{morse}")
    public ResponseEntity<Map<String, Object>> converterMorse(@PathVariable(value = "morse") String morse) {
        return ResponseEntity.ok(Map.of("morse", morseService.converterParaCaracter(morse)));
    }
}
