package co.edu.uan.sofeng.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public String name;

    @GetMapping("/")
    public String index() {
        return "Welcome to Spring Boot!";

    }

    @GetMapping("/sayhello")
    public String sayHello(@RequestParam(defaultValue = " world") String name) {
        if (name == null) {
            return "Hello world";
        } else {
            return "hello" + name;
        }
    }
}
