package vn.com.ping.ping_store_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class PingStoreApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PingStoreApiApplication.class, args);
    }

}
