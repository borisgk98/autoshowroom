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
 * 2019-05-27T14:33:35.154+03:00
 * Generated source version: 3.3.1
 *
 */
@WebServiceClient(name = "automodelService",
                  wsdlLocation = "http://localhost:8080/services/automodel?wsdl",
                  targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.154+03:00", comments = "Apache CXF 3.3.1")
public class AutomodelService extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.154+03:00")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.154+03:00")
    public final static QName SERVICE = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "automodelService");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.154+03:00")
    public final static QName AutomodelServicePort = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "automodelServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/services/automodel?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AutomodelService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/services/automodel?wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.154+03:00")
    public AutomodelService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.154+03:00")
    public AutomodelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.154+03:00")
    public AutomodelService() {
        super(WSDL_LOCATION, SERVICE);
    }





    /**
     *
     * @return
     *     returns AutoModelWebService
     */
    @WebEndpoint(name = "automodelServicePort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.154+03:00")
    public AutoModelWebService getAutomodelServicePort() {
        return super.getPort(AutomodelServicePort, AutoModelWebService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AutoModelWebService
     */
    @WebEndpoint(name = "automodelServicePort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.154+03:00")
    public AutoModelWebService getAutomodelServicePort(WebServiceFeature... features) {
        return super.getPort(AutomodelServicePort, AutoModelWebService.class, features);
    }

}
