package com.orlando.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-10-06T10:34:52.228-05:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "RetrieveStatesServiceImplService",
                  wsdlLocation = "http://localhost:8080/cxfSoap/RetrieveStatesService?wsdl",
                  targetNamespace = "http://ws.orlando.com/")
public class RetrieveStatesServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.orlando.com/", "RetrieveStatesServiceImplService");
    public final static QName RetrieveStatesServiceImplPort = new QName("http://ws.orlando.com/", "RetrieveStatesServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/cxfSoap/RetrieveStatesService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RetrieveStatesServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/cxfSoap/RetrieveStatesService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RetrieveStatesServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RetrieveStatesServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RetrieveStatesServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public RetrieveStatesServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RetrieveStatesServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RetrieveStatesServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns RetrieveStatesService
     */
    @WebEndpoint(name = "RetrieveStatesServiceImplPort")
    public RetrieveStatesService getRetrieveStatesServiceImplPort() {
        return super.getPort(RetrieveStatesServiceImplPort, RetrieveStatesService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RetrieveStatesService
     */
    @WebEndpoint(name = "RetrieveStatesServiceImplPort")
    public RetrieveStatesService getRetrieveStatesServiceImplPort(WebServiceFeature... features) {
        return super.getPort(RetrieveStatesServiceImplPort, RetrieveStatesService.class, features);
    }

}
