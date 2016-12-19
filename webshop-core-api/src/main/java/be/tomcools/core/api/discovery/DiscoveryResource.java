package be.tomcools.core.api.discovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tomco on 19/12/2016.
 */
@RestController
class DiscoveryResource {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/service-instances")
    public List<String> serviceInstances() {
        return this.discoveryClient.getServices();
    }

    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }
}
