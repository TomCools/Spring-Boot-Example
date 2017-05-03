package be.tomcools.core.api.zuul;

import be.tomcools.core.api.helpers.Sleeper;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import java.util.Random;

public class BackdownFilter extends ZuulFilter {
    final static Random RAND = new Random();

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        String deviceType = RequestContext.getCurrentContext()
                .getZuulRequestHeaders()
                .getOrDefault("deviceType", "unknown");

        return "unrulyDeviceType".equalsIgnoreCase(deviceType);
    }

    @Override
    public Object run() {
        Sleeper.sleep(RAND.nextInt(20000));
        return null;
    }
}
