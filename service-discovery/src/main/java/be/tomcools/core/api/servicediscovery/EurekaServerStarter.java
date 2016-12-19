package be.tomcools.core.api.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by tomco on 18/12/2016.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerStarter {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStarter.class, args);
    }
}
