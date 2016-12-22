package be.tomcools.core.api.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

public class LoggingFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(LoggingFilter.class);

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
        return true; //always run for logging
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Principal principal = request.getUserPrincipal();

        log.info(String.format("%s request to %s for user %s", request.getMethod(), request.getRequestURL().toString(), principal.getName()));

        return null;
    }
}
