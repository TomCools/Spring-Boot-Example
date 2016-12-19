package be.tomcools;

import be.tomcools.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
@EnableDiscoveryClient
@SpringBootApplication
public class AccountServiceStarter {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceStarter.class, args);
    }

    @Bean
    CommandLineRunner onStartup(AccountRepository repository) {
        return (String... args) -> {
            repository.save(new Account("Tom", "Cools"));
            repository.save(new Account("Silke", "Henderickx"));
            repository.save(new Account("Robby", "Decosemaeker"));

            System.out.println("All Accounts added");
            repository.findAll().forEach(System.out::println);
        };
    }
}
