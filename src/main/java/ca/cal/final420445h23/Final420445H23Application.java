package ca.cal.final420445h23;

import ca.cal.final420445h23.services.DeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Final420445H23Application {

    @Autowired
    public static DeService deService;

    public static void main(String[] args) {
        SpringApplication.run(Final420445H23Application.class, args);
    }

}
