/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.athena;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Athena2ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("accessKey", java.lang.String.class);
        map.put("amazonAthenaClient", software.amazon.awssdk.services.athena.AthenaClient.class);
        map.put("autoDiscoverClient", boolean.class);
        map.put("configuration", org.apache.camel.component.aws2.athena.Athena2Configuration.class);
        map.put("database", java.lang.String.class);
        map.put("delay", long.class);
        map.put("encryptionOption", software.amazon.awssdk.services.athena.model.EncryptionOption.class);
        map.put("includeTrace", boolean.class);
        map.put("initialDelay", long.class);
        map.put("kmsKey", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("maxAttempts", int.class);
        map.put("maxResults", java.lang.Integer.class);
        map.put("nextToken", java.lang.String.class);
        map.put("operation", org.apache.camel.component.aws2.athena.Athena2Operations.class);
        map.put("outputLocation", java.lang.String.class);
        map.put("outputType", org.apache.camel.component.aws2.athena.Athena2OutputType.class);
        map.put("proxyHost", java.lang.String.class);
        map.put("proxyPort", java.lang.Integer.class);
        map.put("proxyProtocol", software.amazon.awssdk.core.Protocol.class);
        map.put("queryExecutionId", java.lang.String.class);
        map.put("queryString", java.lang.String.class);
        map.put("region", java.lang.String.class);
        map.put("resetWaitTimeoutOnRetry", boolean.class);
        map.put("retry", java.lang.String.class);
        map.put("secretKey", java.lang.String.class);
        map.put("waitTimeout", long.class);
        map.put("workGroup", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("clientRequestToken", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    private org.apache.camel.component.aws2.athena.Athena2Configuration getOrCreateConfiguration(Athena2Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws2.athena.Athena2Configuration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Athena2Component target = (Athena2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonathenaclient":
        case "amazonAthenaClient": getOrCreateConfiguration(target).setAmazonAthenaClient(property(camelContext, software.amazon.awssdk.services.athena.AthenaClient.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": getOrCreateConfiguration(target).setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clientrequesttoken":
        case "clientRequestToken": getOrCreateConfiguration(target).setClientRequestToken(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws2.athena.Athena2Configuration.class, value)); return true;
        case "database": getOrCreateConfiguration(target).setDatabase(property(camelContext, java.lang.String.class, value)); return true;
        case "delay": getOrCreateConfiguration(target).setDelay(property(camelContext, long.class, value)); return true;
        case "encryptionoption":
        case "encryptionOption": getOrCreateConfiguration(target).setEncryptionOption(property(camelContext, software.amazon.awssdk.services.athena.model.EncryptionOption.class, value)); return true;
        case "includetrace":
        case "includeTrace": getOrCreateConfiguration(target).setIncludeTrace(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": getOrCreateConfiguration(target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "kmskey":
        case "kmsKey": getOrCreateConfiguration(target).setKmsKey(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxattempts":
        case "maxAttempts": getOrCreateConfiguration(target).setMaxAttempts(property(camelContext, int.class, value)); return true;
        case "maxresults":
        case "maxResults": getOrCreateConfiguration(target).setMaxResults(property(camelContext, java.lang.Integer.class, value)); return true;
        case "nexttoken":
        case "nextToken": getOrCreateConfiguration(target).setNextToken(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.aws2.athena.Athena2Operations.class, value)); return true;
        case "outputlocation":
        case "outputLocation": getOrCreateConfiguration(target).setOutputLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "outputtype":
        case "outputType": getOrCreateConfiguration(target).setOutputType(property(camelContext, org.apache.camel.component.aws2.athena.Athena2OutputType.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "queryexecutionid":
        case "queryExecutionId": getOrCreateConfiguration(target).setQueryExecutionId(property(camelContext, java.lang.String.class, value)); return true;
        case "querystring":
        case "queryString": getOrCreateConfiguration(target).setQueryString(property(camelContext, java.lang.String.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "resetwaittimeoutonretry":
        case "resetWaitTimeoutOnRetry": getOrCreateConfiguration(target).setResetWaitTimeoutOnRetry(property(camelContext, boolean.class, value)); return true;
        case "retry": getOrCreateConfiguration(target).setRetry(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "waittimeout":
        case "waitTimeout": getOrCreateConfiguration(target).setWaitTimeout(property(camelContext, long.class, value)); return true;
        case "workgroup":
        case "workGroup": getOrCreateConfiguration(target).setWorkGroup(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Athena2Component target = (Athena2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "amazonathenaclient":
        case "amazonAthenaClient": return getOrCreateConfiguration(target).getAmazonAthenaClient();
        case "autodiscoverclient":
        case "autoDiscoverClient": return getOrCreateConfiguration(target).isAutoDiscoverClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "clientrequesttoken":
        case "clientRequestToken": return getOrCreateConfiguration(target).getClientRequestToken();
        case "configuration": return target.getConfiguration();
        case "database": return getOrCreateConfiguration(target).getDatabase();
        case "delay": return getOrCreateConfiguration(target).getDelay();
        case "encryptionoption":
        case "encryptionOption": return getOrCreateConfiguration(target).getEncryptionOption();
        case "includetrace":
        case "includeTrace": return getOrCreateConfiguration(target).isIncludeTrace();
        case "initialdelay":
        case "initialDelay": return getOrCreateConfiguration(target).getInitialDelay();
        case "kmskey":
        case "kmsKey": return getOrCreateConfiguration(target).getKmsKey();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxattempts":
        case "maxAttempts": return getOrCreateConfiguration(target).getMaxAttempts();
        case "maxresults":
        case "maxResults": return getOrCreateConfiguration(target).getMaxResults();
        case "nexttoken":
        case "nextToken": return getOrCreateConfiguration(target).getNextToken();
        case "operation": return getOrCreateConfiguration(target).getOperation();
        case "outputlocation":
        case "outputLocation": return getOrCreateConfiguration(target).getOutputLocation();
        case "outputtype":
        case "outputType": return getOrCreateConfiguration(target).getOutputType();
        case "proxyhost":
        case "proxyHost": return getOrCreateConfiguration(target).getProxyHost();
        case "proxyport":
        case "proxyPort": return getOrCreateConfiguration(target).getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return getOrCreateConfiguration(target).getProxyProtocol();
        case "queryexecutionid":
        case "queryExecutionId": return getOrCreateConfiguration(target).getQueryExecutionId();
        case "querystring":
        case "queryString": return getOrCreateConfiguration(target).getQueryString();
        case "region": return getOrCreateConfiguration(target).getRegion();
        case "resetwaittimeoutonretry":
        case "resetWaitTimeoutOnRetry": return getOrCreateConfiguration(target).isResetWaitTimeoutOnRetry();
        case "retry": return getOrCreateConfiguration(target).getRetry();
        case "secretkey":
        case "secretKey": return getOrCreateConfiguration(target).getSecretKey();
        case "waittimeout":
        case "waitTimeout": return getOrCreateConfiguration(target).getWaitTimeout();
        case "workgroup":
        case "workGroup": return getOrCreateConfiguration(target).getWorkGroup();
        default: return null;
        }
    }
}

