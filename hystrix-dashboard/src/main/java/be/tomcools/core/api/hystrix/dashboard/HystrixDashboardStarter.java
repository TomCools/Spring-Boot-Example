package be.tomcools.core.api.hystrix.dashboard; /**
 * Created by tomco on 18/12/2016.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboardStarter {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardStarter.class, args);
    }
}
