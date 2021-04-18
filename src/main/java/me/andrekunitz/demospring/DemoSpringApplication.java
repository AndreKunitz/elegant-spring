package me.andrekunitz.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringApplication.class, args);
    }

}
