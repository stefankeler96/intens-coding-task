package intens.api.codingtask.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingTaskController {
    @RequestMapping("/test/{a}")
    public ResponseEntity<String> getTest(@PathVariable("a") String a) {
        String message = "a=" + a;

        return ResponseEntity.ok().body(message);
    }
}
