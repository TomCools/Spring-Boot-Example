package be.tomcools.core.api;

import be.tomcools.core.api.zuul.LoggingFilter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class WebshopCoreApiStarter {

    public static void main(String[] args) {
        SpringApplication.run(WebshopCoreApiStarter.class, args);
    }

    @Bean
    CommandLineRunner onStartup() {
        return (String[] args) -> System.out.println("I'm starting! :-)");
    }

    @Bean
    LoggingFilter loggingFilter() {
        return new LoggingFilter();
    }

}