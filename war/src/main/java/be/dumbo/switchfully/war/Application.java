package be.dumbo.switchfully.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "be.dumbo.switchfully")
public class Application {


    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}
