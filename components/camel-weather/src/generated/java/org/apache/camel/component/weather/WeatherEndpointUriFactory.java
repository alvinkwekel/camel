/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.weather;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class WeatherEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":name";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(43);
        set.add("name");
        set.add("appid");
        set.add("headerName");
        set.add("language");
        set.add("mode");
        set.add("period");
        set.add("units");
        set.add("weatherApi");
        set.add("bridgeErrorHandler");
        set.add("sendEmptyMessageWhenIdle");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("pollStrategy");
        set.add("lazyStartProducer");
        set.add("basicPropertyBinding");
        set.add("geoLocationProvider");
        set.add("httpClient");
        set.add("synchronous");
        set.add("cnt");
        set.add("ids");
        set.add("lat");
        set.add("location");
        set.add("lon");
        set.add("rightLon");
        set.add("topLat");
        set.add("zip");
        set.add("zoom");
        set.add("backoffErrorThreshold");
        set.add("backoffIdleThreshold");
        set.add("backoffMultiplier");
        set.add("delay");
        set.add("greedy");
        set.add("initialDelay");
        set.add("repeatCount");
        set.add("runLoggingLevel");
        set.add("scheduledExecutorService");
        set.add("scheduler");
        set.add("schedulerProperties");
        set.add("startScheduler");
        set.add("timeUnit");
        set.add("useFixedDelay");
        set.add("geolocationAccessKey");
        set.add("geolocationRequestHostIP");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "weather".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "name", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

