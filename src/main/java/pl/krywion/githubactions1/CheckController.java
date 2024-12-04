package pl.krywion.githubactions1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {


    @GetMapping("/check")
    public String check() {
        return "Application Works!";
    }
}
