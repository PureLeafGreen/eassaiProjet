package ca.cal.final420445h23.controller;

import ca.cal.final420445h23.modeles.De;
import ca.cal.final420445h23.services.DeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class DeController {

    final private DeService deService;

    public DeController(DeService deService) {
        this.deService = deService;
    }

    @PostMapping("/getvalue/{nombredeface}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<De> addNewDe(@PathVariable("nombredeface") int nombredeface) {
        return deService.addNewDe(nombredeface).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/historyList")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<De> getAll() {
        return deService.getAll();
    }
}
