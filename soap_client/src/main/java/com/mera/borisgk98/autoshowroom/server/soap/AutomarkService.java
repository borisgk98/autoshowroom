package com.mera.borisgk98.autoshowroom.server.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Generated;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-05-24T02:15:00.774+03:00
 * Generated source version: 3.3.1
 *
 */
@WebServiceClient(name = "automarkService",
                  wsdlLocation = "http://localhost:8080/services/automark?wsdl",
                  targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.774+03:00", comments = "Apache CXF 3.3.1")
public class AutomarkService extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.774+03:00")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.774+03:00")
    public final static QName SERVICE = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "automarkService");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.774+03:00")
    public final static QName AutomarkServicePort = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "automarkServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/services/automark?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AutomarkService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/services/automark?wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.774+03:00")
    public AutomarkService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.774+03:00")
    public AutomarkService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.774+03:00")
    public AutomarkService() {
        super(WSDL_LOCATION, SERVICE);
    }





    /**
     *
     * @return
     *     returns AutoMarkWebService
     */
    @WebEndpoint(name = "automarkServicePort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.774+03:00")
    public AutoMarkWebService getAutomarkServicePort() {
        return super.getPort(AutomarkServicePort, AutoMarkWebService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AutoMarkWebService
     */
    @WebEndpoint(name = "automarkServicePort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.774+03:00")
    public AutoMarkWebService getAutomarkServicePort(WebServiceFeature... features) {
        return super.getPort(AutomarkServicePort, AutoMarkWebService.class, features);
    }

}
