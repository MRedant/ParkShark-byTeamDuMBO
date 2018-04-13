package be.dumbo.switchfully.parkshark.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "be.dumbo.switchfully.parkshark")
@EnableTransactionManagement
@EntityScan(basePackages = "be.dumbo.switchfully.parkshark")
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
