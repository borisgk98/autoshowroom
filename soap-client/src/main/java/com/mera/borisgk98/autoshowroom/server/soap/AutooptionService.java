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
 * 2019-05-31T12:27:37.880+03:00
 * Generated source version: 3.3.1
 *
 */
@WebServiceClient(name = "autooptionService",
                  wsdlLocation = "http://localhost:8080/services/autooption?wsdl",
                  targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:37.880+03:00", comments = "Apache CXF 3.3.1")
public class AutooptionService extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:37.880+03:00")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:37.880+03:00")
    public final static QName SERVICE = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "autooptionService");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:37.880+03:00")
    public final static QName AutooptionServicePort = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "autooptionServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/services/autooption?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AutooptionService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/services/autooption?wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:37.880+03:00")
    public AutooptionService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:37.880+03:00")
    public AutooptionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:37.880+03:00")
    public AutooptionService() {
        super(WSDL_LOCATION, SERVICE);
    }





    /**
     *
     * @return
     *     returns AutoOptionWebService
     */
    @WebEndpoint(name = "autooptionServicePort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:37.880+03:00")
    public AutoOptionWebService getAutooptionServicePort() {
        return super.getPort(AutooptionServicePort, AutoOptionWebService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AutoOptionWebService
     */
    @WebEndpoint(name = "autooptionServicePort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:37.880+03:00")
    public AutoOptionWebService getAutooptionServicePort(WebServiceFeature... features) {
        return super.getPort(AutooptionServicePort, AutoOptionWebService.class, features);
    }

}
