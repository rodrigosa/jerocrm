package br.com.jero.crm.jerocrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JerocrmApplication {

    public static void main(String[] args) {

    	SpringApplication.run(JerocrmApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Home Page";
    }



}
